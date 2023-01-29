package fourthbot.robots;

import battlecode.common.*;
import fourthbot.coordination.*;
import fourthbot.navigation.*;

public class Carrier extends Unit {

	int ad; // amount of adamantium we're carrying
	int mn; // amount of mana we're carrying
	int ex; // amount of elixir we're carrying
	Anchor anchor; // the anchor we're carrying
	int totalResources; // total amount of resources we're carrying
	int totalCarryWeight; // total weight of everything we're carrying

	CarrierNavigator navigator;

	public MapLocation myWellLocation = null; // MapLocation of the well this carrier frequents
	public MapLocation wellToUpgrade = null; // MapLocation of the well this carrier will upgrade with resources from
												// myWellLocation
	public MapLocation wellToAvoid = null;
	public MapLocation myHQLocation = null; // MapLocation of the HQ this carrier frequents

	public MapLocation corner = null;

	public Carrier(RobotController rc) {
		super(rc);
	}

	@Override
	public void setup() {
		super.setup();
		job = Job.GATHER_RESOURCES;
		mode = Mode.FIND_RESOURCES;
		navigator = new CarrierNavigator(this, rc);

		// myWellLocation = new MapLocation(rng.nextInt(mapWidth),
		// rng.nextInt(mapHeight)); // Set temporarily to a random location -- this will
		// be corrected next turn
	}

	@Override
	public void setup2() {
		myWellLocation = getRandomWell(); // When starting off, go towards a random well
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		navigator.needToPrepareMove = true;

		ad = rc.getResourceAmount(ResourceType.ADAMANTIUM);
		mn = rc.getResourceAmount(ResourceType.MANA);
		ex = rc.getResourceAmount(ResourceType.ELIXIR);
		anchor = rc.getAnchor();

		// See if we should move wells to get mana instead of adamantium.
		// Should move to mana wells more at the beginning of the game.
		if (myWellLocation != null && rc.canSenseLocation(myWellLocation)) {
			WellInfo myWell = rc.senseWell(myWellLocation);
			if (myWell != null && myWell.getResourceType() == ResourceType.ADAMANTIUM) {
				// See how many friendly carriers are around our well.
				int numCarriers = 0;
				for (RobotInfo r : rc.senseNearbyRobots(myWellLocation, 4, myTeam)) {
					if (r.type == RobotType.CARRIER)
						numCarriers++;
				}
				if (numCarriers > rc.getRoundNum() / 20) {
					// See if there are mana/elixir wells we can switch to.
					findWell: {
						for (WellInfo well : rc.senseNearbyWells()) {
							if (well.getResourceType() != ResourceType.ADAMANTIUM) {
								wellToAvoid = myWellLocation;
								myWellLocation = well.getMapLocation();
								break findWell;
							}
						}
						// Otherwise, move to minimap other well.
						int myChunk = Minimap.getChunkIndex(pos);
						int chunk = MinimapInfo.nearestWellChunkOther(myChunk, minimap.getChunks());
						if (chunk != -1) {
							wellToAvoid = myWellLocation;
							myWellLocation = Minimap.getChunkCenter(chunk);
						}
					}
				}
			}
		}

		totalResources = ad + mn + ex;
		totalCarryWeight = totalResources + (anchor == null ? 0 : 40);

		if (job == Job.ATTACK_ENEMY) {
			if (noDangerousEnemies) {
				mode = Mode.FIND_ENEMY;
			} else if (threatLevel > 2 * allyStrength) {
				mode = Mode.RETREAT;
			} else {
				mode = Mode.ATTACK;
			}

			if (mode == Mode.FIND_ENEMY) {
				int myChunk = Minimap.getChunkIndex(pos);
				int chunk = -1;
				int bits = tasklist.getNextTaskBits(Task.ATTACK);
				if (bits != -1) {
					int roundsLeft = tasklist.getTaskRound(bits) - rc.getRoundNum(); // Number of rounds before
																						// convergence.
					chunk = tasklist.getTaskChunk(bits);
					MapLocation dest = Minimap.getChunkCenter(chunk);
					if (Math.pow(roundsLeft / 2, 2) >= pos.distanceSquaredTo(dest)) { // Magic constants, you can try to
																						// find better ones.
						mode = Mode.STAY_STILL;
					} else if (Math.pow(Math.min(10, roundsLeft), 2) >= pos.distanceSquaredTo(dest)) {
						navigator.setDestination(dest);
						rc.setIndicatorLine(pos, dest, 255, 255, 255);
					} else {
						bits = -1; // Task is too far to deal with.
					}
				}

				if (bits == -1) {
					chunk = MinimapInfo.nearestEnemyChunk(myChunk, minimap.getChunks());
					if (chunk == -1) {
						if (rc.getRoundNum() >= Constants.CAPTURE_ISLAND_ROUND) {
							chunk = MinimapInfo.nearestUnfriendlyIslandChunk(myChunk, minimap.getChunks());
						} else {
							chunk = MinimapInfo.nearestUnclaimedIslandChunk(myChunk, minimap.getChunks());
						}
					}
					if (chunk == -1) {
						navigator.setDestination(new MapLocation(mapWidth / 2, mapHeight / 2));
					} else {
						navigator.setDestination(Minimap.getChunkCenter(chunk));
					}
				}
			}
		}

		if (myWellLocation != null) {
			if (rc.canSenseLocation(myWellLocation) && rc.senseWell(myWellLocation) == null) {
				WellInfo[] nearbyWells = rc.senseNearbyWells();
				if (nearbyWells.length == 0) {
					myWellLocation = null;
				} else {
					MapLocation closestWell = null;
					int closestDistance = Integer.MAX_VALUE;
					for (WellInfo well : nearbyWells) {
						MapLocation wellLocation = well.getMapLocation();
						if (wellLocation == wellToAvoid) {
							continue;
						}
						if (myWellLocation.distanceSquaredTo(wellLocation) < closestDistance) {
							closestWell = wellLocation;
							closestDistance = myWellLocation.distanceSquaredTo(wellLocation);
						}
					}
					myWellLocation = closestWell;
				}
			}
		}

		// Determine what job we should be doing. NOTE: THIS SHOULDN'T CHANGE OFTEN.
		tryTakeAnchor();
		findBestJob();
	}

	@Override
	public void runTurn() throws GameActionException {
		/*
		 * The place where the main decisions are made
		 */

		/*
		 * GATHER RESOURCES & DEPOSIT THEM Every turn, the carrier should try to pick up
		 * and deposite resources if it can. We're going to do this before and after
		 * moving (because it might move to a spot where it can pick up resources or
		 * deposit and we can shave off an otherwise wasted turn). See end of round for
		 * same command
		 * 
		 * TODO: Take it into account that we DO NOT want to deposit resources or
		 * gather them if we're under attack
		 */
		switch (mode) {
			case IN_DANGER:
				if (totalResources >= Constants.RUNAWAY_CARRY_LIMIT) {
					break;
				}
			default:
				switch (job) {
					case UPGRADE_WELL:
						if (totalCarryWeight >= 40) {
							while (depositToNearbyWell() | pickupFromNearbyWell() | depositToNearbyHQ())
								;
						} else {
							while (pickupFromNearbyWell() | depositToNearbyWell() | depositToNearbyHQ())
								;
						}
						break;
					default:
						if (totalCarryWeight >= 40) {
							while (pickupFromNearbyWell() | depositToNearbyHQ())
								;
						} else {
							while (pickupFromNearbyWell() | depositToNearbyHQ())
								; // single | is intentional so both are attempted
						}
				}
				break;
		}

		switch (job) {
			case ATTACK_ENEMY:
				switch (mode) {
					case FIND_ENEMY: // move to our enemy goal location
						navigator.move();
						navigator.move();
						attack();
						break;

					case ATTACK:
						attack();
						// encircle(navigator);
						while (pickupFromNearbyWell())
							;
						retreat(navigator);
						while (pickupFromNearbyWell())
							;
						attack();
						break;

					case RETREAT:
						attack();
						while (pickupFromNearbyWell())
							;
						retreat(navigator);
						while (pickupFromNearbyWell())
							;
						attack();
						break;

					case STAY_STILL:
						break;

					default:
						break;
				}
				break;
			case DEPLOY_ANCHOR:
				deployAnchor();
				break;
			case GATHER_RESOURCES:
			case UPGRADE_WELL:
				switch (mode) {
					case FIND_RESOURCES:
					case GOTO_RESOURCES:
						navigator.navigateToWell();
						break;
					case GOTO_HQ:
						navigator.navigateToHQ();
						break;
					case DRAW_RESOURCES_FROM_WELL:
						drawResourcesFromWell();
						break;
					case GIVE_HQ_RESOURCES:
						giveHQResources();
						break;
					case GIVE_WELL_RESOURCES:
						giveWellResources();
						break;
					case IN_DANGER:
						dangerLevels();
						break;
					default:
						break;
				}
				break;
			default:
				break;
		}

		switch (mode) {
			case IN_DANGER:
				if (totalResources >= Constants.RUNAWAY_CARRY_LIMIT) {
					break;
				}
			default:
				switch (job) {
					case UPGRADE_WELL:
						if (totalCarryWeight >= 40) {
							while (depositToNearbyWell() | pickupFromNearbyWell() | depositToNearbyHQ())
								;
						} else {
							while (pickupFromNearbyWell() | depositToNearbyWell() | depositToNearbyHQ())
								;
						}
						break;
					default:
						if (totalCarryWeight >= 40) {
							while (pickupFromNearbyWell() | depositToNearbyHQ())
								;
						} else {
							while (pickupFromNearbyWell() | depositToNearbyHQ())
								; // single | is intentional so both are attempted
						}
				}
				break;
		}
	}

	private void deployAnchor() throws GameActionException {
		if (rc.canPlaceAnchor() && rc.senseTeamOccupyingIsland(rc.senseIsland(pos)) != myTeam) {
			rc.placeAnchor();
			return;
		}

		// Find nearest unoccupied island location.
		int[] nearbyIslands = rc.senseNearbyIslands();
		MapLocation placeLocation = null;
		int dist = Integer.MAX_VALUE;
		if (nearbyIslands.length != 0) {
			for (int island : nearbyIslands) {
				if (rc.senseAnchor(island) == null) {
					MapLocation[] locs = rc.senseNearbyIslandLocations(island);
					for (MapLocation loc : locs) {
						if (loc.distanceSquaredTo(pos) < dist) {
							dist = loc.distanceSquaredTo(pos);
							placeLocation = loc;
						}
					}
				}
			}
		}

		if (placeLocation != null) {
			navigator.move(placeLocation);
		} else {
			int myChunk = Minimap.getChunkIndex(pos);
			int chunk = MinimapInfo.nearestUnclaimedIslandChunk(myChunk, minimap.getChunks());
			if (chunk != -1) {
				navigator.setDestination(Minimap.getChunkCenter(chunk));
				navigator.move();
			} else {
				if (rc.canSenseLocation(navigator.destination)) {
					switch (rng.nextInt(4)) {
						case 0:
							corner = new MapLocation(0, 0);
							break;
						case 1:
							corner = new MapLocation(mapWidth - 1, 0);
							break;
						case 2:
							corner = new MapLocation(mapWidth - 1, mapHeight - 1);
							break;
						default:
							corner = new MapLocation(0, mapHeight - 1);
							break;
					}
					navigator.setDestination(corner);
				}

				navigator.move(corner);
			}
		}
	}

	private void tryTakeAnchor() throws GameActionException {
		if (myHQLocation == null)
			return;

		if (rc.canTakeAnchor(myHQLocation, Anchor.ACCELERATING)) {
			rc.takeAnchor(myHQLocation, Anchor.ACCELERATING);
			anchor = Anchor.ACCELERATING;
		}
		if (rc.canTakeAnchor(myHQLocation, Anchor.STANDARD)) {
			rc.takeAnchor(myHQLocation, Anchor.STANDARD);
			anchor = Anchor.STANDARD;
		}
	}

	private void dangerLevels() throws GameActionException {
		if (totalResources >= Constants.RUNAWAY_CARRY_LIMIT) {
			attack();
			encircle(navigator);
		} else {
			retreat(navigator);
		}
	}

	private void giveHQResources() throws GameActionException {
		/*
		 * This tries to dart in and out from around an HQ to draw the most possible
		 * resources from it.
		 * This is very similar to drawResourcesFromWell, but it doesn't try to move
		 * onto the HQ
		 * 
		 * How it works:
		 * 1. If we're on top of the well, never move--you might block another robot
		 * from moving into
		 * the spot we just moved to!
		 * 2. If we're next to the well and the top of the well is open, move to that
		 * top! This lets
		 * a new robot take our place on the side.
		 * 3. If we're by the side and we can move out and then back in on the next
		 * turn, do so. This
		 * lets a new robot take our place in the interim. Maybe they can even move back
		 * out themselves!
		 * 4. If we're two away from the well, try to move to move in. This will let us
		 * mine on our turn.
		 * 5. If we're two away and can't move in, try to position ourselves so we can
		 * move in in the future.
		 * If there are no empty spots, this means moving as close as possible--i.e.
		 * along the "sides" of
		 * the 5x5 square. Doing so gives us the most options for moving inward in the
		 * future.
		 */

		switch (pos.distanceSquaredTo(myHQLocation)) {
			case 0:
				// We're on top of the HQ, which should be impossible...
				return;
			case 1:
			case 2:
				// We're adjacent to the HQ

				// Try to dart back out
				for (Direction direction : Constants.NONZERO_DIRECTIONS) {
					MapLocation moveLoc = pos.add(direction);
					if (rc.canMove(direction)
							&& rc.getMovementCooldownTurns()
									+ rc.senseMapInfo(moveLoc).getCooldownMultiplier(myTeam) < 20) {
						// We have enough movement cooldown to come back on the next turn, so let's dart
						// out.
						rc.move(direction);
						pos = rc.getLocation();
						return;
					}
				}
				return;

			case 3:
				// Shouldn't be possible, but whatever
			case 4:
			case 5:
			case 6:
				// Also shouldn't be possible
			case 7:
				// Also shouldn't be possible
			case 8:
				// All of these are a distance of 2 from the HQ
				// Try to move as close as possible
				Direction directionToMove = pos.directionTo(myHQLocation);
				if (rc.canMove(directionToMove)) {
					rc.move(directionToMove);
					pos = rc.getLocation();
				} else {
					navigator.navigateToHQ();
				}
			default:
				// This should probably never be called, but just in case...
				navigator.navigateToHQ();
		}
	}

	private void giveWellResources() throws GameActionException {
		/*
		 * This tries to dart in and out from around an HQ to draw the most possible
		 * resources from it.
		 * This is very similar to drawResourcesFromWell, but it doesn't try to move
		 * onto the HQ
		 * 
		 * How it works:
		 * 1. If we're on top of the well, never move--you might block another robot
		 * from moving into
		 * the spot we just moved to!
		 * 2. If we're next to the well and the top of the well is open, move to that
		 * top! This lets
		 * a new robot take our place on the side.
		 * 3. If we're by the side and we can move out and then back in on the next
		 * turn, do so. This
		 * lets a new robot take our place in the interim. Maybe they can even move back
		 * out themselves!
		 * 4. If we're two away from the well, try to move to move in. This will let us
		 * mine on our turn.
		 * 5. If we're two away and can't move in, try to position ourselves so we can
		 * move in in the future.
		 * If there are no empty spots, this means moving as close as possible--i.e.
		 * along the "sides" of
		 * the 5x5 square. Doing so gives us the most options for moving inward in the
		 * future.
		 */

		switch (pos.distanceSquaredTo(myWellLocation)) {
			case 0:
				// We're on top of the well
				return;
			case 1:
			case 2:
				// We're adjacent to the well

				// Try to dart back out
				for (Direction direction : Constants.NONZERO_DIRECTIONS) {
					MapLocation moveLoc = pos.add(direction);
					if (rc.canMove(direction)
							&& rc.getMovementCooldownTurns()
									+ rc.senseMapInfo(moveLoc).getCooldownMultiplier(myTeam) < 20) {
						// We have enough movement cooldown to come back on the next turn, so let's dart
						// out.
						rc.move(direction);
						pos = rc.getLocation();
						return;
					}
				}
				return;

			case 3:
				// Shouldn't be possible, but whatever
			case 4:
			case 5:
			case 6:
				// Also shouldn't be possible
			case 7:
				// Also shouldn't be possible
			case 8:
				// All of these are a distance of 2 from the HQ
				// Try to move as close as possible
				Direction directionToMove = pos.directionTo(myWellLocation);
				if (rc.canMove(directionToMove)) {
					rc.move(directionToMove);
					pos = rc.getLocation();
				} else {
					navigator.navigateToWell();
				}
			default:
				// This should probably never be called, but just in case...
				navigator.navigateToWell();
		}
	}

	private void drawResourcesFromWell() throws GameActionException {
		/*
		 * This tries to dart in and out from a well to draw the most possible resources
		 * from it
		 * 
		 * How it works:
		 * 1. If we're on top of the well, never move--you might block another robot
		 * from moving into
		 * the spot we just moved to!
		 * 2. If we're next to the well and the top of the well is open, move to that
		 * top! This lets
		 * a new robot take our place on the side.
		 * 3. If we're by the side and we can move out and then back in on the next
		 * turn, do so. This
		 * lets a new robot take our place in the interim. Maybe they can even move back
		 * out themselves!
		 * 4. If we're two away from the well, try to move to move in. This will let us
		 * mine on our turn.
		 * 5. If we're two away and can't move in, try to position ourselves so we can
		 * move in in the future.
		 * If there are no empty spots, this means moving as close as possible--i.e.
		 * along the "sides" of
		 * the 5x5 square. Doing so gives us the most options for moving inward in the
		 * future.
		 */

		switch (pos.distanceSquaredTo(myWellLocation)) {
			case 0:
				// We're on top of the well
				return;
			case 1:
			case 2:
				// We're adjacent to the well

				// Check if well is open, and if so move onto it
				if (!rc.isLocationOccupied(myWellLocation)) {
					Direction moveDir = pos.directionTo(myWellLocation);
					if (rc.canMove(moveDir)) {
						rc.move(moveDir);
						pos = rc.getLocation();
						return;
					}
				}

				// Try to dart back out
				Direction direction = myWellLocation.directionTo(pos);
				MapLocation moveLoc = pos.add(direction);
				if (rc.canMove(direction) && rc.getMovementCooldownTurns()
						+ rc.senseMapInfo(moveLoc).getCooldownMultiplier(myTeam) < 20) {
					// We have enough action to come back on the next turn, so let's dart out.
					rc.move(direction);
					pos = rc.getLocation();
					return;
				}

				direction = direction.rotateRight();
				moveLoc = pos.add(direction);
				if (rc.canMove(direction) && rc.getMovementCooldownTurns()
						+ rc.senseMapInfo(moveLoc).getCooldownMultiplier(myTeam) < 20) {
					// We have enough action to come back on the next turn, so let's dart out.
					rc.move(direction);
					pos = rc.getLocation();
					return;
				}

				direction = direction.rotateLeft().rotateLeft();
				moveLoc = pos.add(direction);
				if (rc.canMove(direction) && rc.getMovementCooldownTurns()
						+ rc.senseMapInfo(moveLoc).getCooldownMultiplier(myTeam) < 20) {
					// We have enough action to come back on the next turn, so let's dart out.
					rc.move(direction);
					pos = rc.getLocation();
					return;
				}
				return;

			case 3:
				// Shouldn't be possible, but whatever
			case 4:
			case 5:
			case 6:
				// Also shouldn't be possible
			case 7:
				// Also shouldn't be possible
			case 8:
				// All of these are a distance of 2 from the well
				// Try to move as close as possible

				Direction directionToMove = pos.directionTo(myWellLocation);
				if (rc.canMove(directionToMove)) {
					rc.move(directionToMove);
					pos = rc.getLocation();
				} else {
					navigator.navigateToWell();
				}
			default:
				// This should probably never be called, but just in case...
				navigator.navigateToWell();
		}
	}

	public void lookAround() throws GameActionException {
		/*
		 * Use your senses to detect a well or HQ
		 */

		if (myWellLocation == null) {
			int closestDistance = Integer.MAX_VALUE;
			for (WellInfo well : rc.senseNearbyWells()) {
				MapLocation wellLocation = well.getMapLocation();
				if (wellLocation == wellToAvoid) {
					continue;
				}
				if (pos.distanceSquaredTo(wellLocation) < closestDistance) {
					myWellLocation = wellLocation;
					closestDistance = pos.distanceSquaredTo(wellLocation);
				}
			}
		}

		if (myHQLocation == null) {
			int closestDistance = Integer.MAX_VALUE;
			for (RobotInfo robot : rc.senseNearbyRobots(-1, myTeam)) {
				if (robot.type != RobotType.HEADQUARTERS) {
					continue;
				}
				MapLocation hqLocation = robot.location;
				if (pos.distanceSquaredTo(hqLocation) < closestDistance) {
					myHQLocation = hqLocation;
					closestDistance = pos.distanceSquaredTo(hqLocation);
				}
			}
		}
	}

	public boolean nearMyHQ() {
		/*
		 * Are we within 8 units of our saved HQ position?
		 */
		return myHQLocation != null && myHQLocation.distanceSquaredTo(pos) <= 8;
	}

	public boolean nearMyWell() {
		/*
		 * Are we within 8 units of our saved well position?
		 */
		return myWellLocation != null && myWellLocation.distanceSquaredTo(pos) <= 8;
	}

	private boolean pickupFromNearbyWell() throws GameActionException {
		/*
		 * If possible, pick up resources from a nearby well
		 * 
		 * Return true if we pick up resources and false otherwise.
		 */
		if (!rc.isActionReady())
			return false; // can't take actions

		if (totalCarryWeight >= 40)
			return false; // already full

		WellInfo[] nearbyWells = rc.senseNearbyWells(pos, 2); // get adjacent wells
		if (nearbyWells.length == 0)
			return false; // there are no wells

		/*
		 * Determine the best well to extract from. The ranking right now is the
		 * following: 1. Upgraded adamantium or mana well 2. Elixir well 3. Normal
		 * adamantium or mana well
		 */

		WellInfo bestWell = nearbyWells[0];
		for (WellInfo well : nearbyWells) {
			if (well.isUpgraded()) {
				bestWell = well;
				break;
			}
			if (well.getResourceType() == ResourceType.ELIXIR) {
				bestWell = well;
			}
		}

		// Pick up as much as we can
		int amountToCollect = Math.min(40 - totalCarryWeight, bestWell.getRate());
		MapLocation wellLocation = bestWell.getMapLocation();

		rc.collectResource(wellLocation, amountToCollect);
		totalCarryWeight += amountToCollect;
		totalResources += amountToCollect;
		switch (bestWell.getResourceType()) {
			case ADAMANTIUM:
				ad += amountToCollect;
				break;
			case ELIXIR:
				ex += amountToCollect;
				break;
			case MANA:
				mn += amountToCollect;
				break;
			default:
				break;
		}
		return true;
	}

	private boolean depositToNearbyHQ() throws GameActionException {
		/*
		 * If possible, deposit resources to a nearby headquarters
		 */
		if (!rc.isActionReady())
			return false; // can't take actions
		if (totalResources <= 0)
			return false; // No resources to deposit

		/*
		 * Determine the best HQ to deposit to. Right now it's basically random.
		 */
		RobotInfo[] nearbyRobots = rc.senseNearbyRobots(pos, 2, myTeam);
		RobotInfo bestHQ = null;
		for (RobotInfo robot : nearbyRobots) {
			if (robot.type != RobotType.HEADQUARTERS)
				continue;
			if (bestHQ == null) {
				bestHQ = robot;
				continue;
			}
			if (rng.nextBoolean()) {
				bestHQ = robot;
				continue;
			}
		}

		if (bestHQ == null)
			return false; // No nearby HQs

		/*
		 * Choose which resource to deposit. Right now this is whichever resource we
		 * have the most of.
		 */
		ResourceType bestType = (ad > mn ? (ad > ex ? ResourceType.ADAMANTIUM : ResourceType.ELIXIR)
				: (mn > ex ? ResourceType.MANA : ResourceType.ELIXIR));

		MapLocation hqLocation = bestHQ.location;
		switch (bestType) {
			case ADAMANTIUM:
				rc.transferResource(hqLocation, bestType, ad);
				totalResources -= ad;
				totalCarryWeight -= ad;
				ad = 0;
				return true;
			case ELIXIR:
				rc.transferResource(hqLocation, bestType, ex);
				totalResources -= ex;
				totalCarryWeight -= ex;
				ex = 0;
				return true;
			case MANA:
				rc.transferResource(hqLocation, bestType, mn);
				totalResources -= mn;
				totalCarryWeight -= mn;
				mn = 0;
				return true;
			default:
				return false;
		}
	}

	private boolean depositToNearbyWell() throws GameActionException {
		/*
		 * If possible, deposit resources to a nearby headquarters
		 */
		if (!rc.isActionReady())
			return false; // can't take actions
		if (mn + ex <= 0)
			return false; // No mana or elixir to deposit

		/*
		 * Determine the best well to deposit to. Right now it's basically random.
		 */
		WellInfo[] nearbyWells = rc.senseNearbyWells(pos, 2);
		WellInfo bestWell = null;
		if (mn == 0) {
			for (WellInfo well : nearbyWells) {
				if (well.isUpgraded())
					continue;
				if (well.getResourceType() == ResourceType.ELIXIR) {
					bestWell = well;
					break;
				}
			}
		} else {
			for (WellInfo well : nearbyWells) {
				if (well.isUpgraded())
					continue;
				if (well.getResourceType() == ResourceType.ADAMANTIUM) {
					bestWell = well;
					break;
				}
				bestWell = well;
			}
		}
		if (bestWell == null)
			return false; // No nearby wells

		/*
		 * Choose which resource to deposit. Right now this is whichever resource we
		 * have the most of.
		 */

		MapLocation wellLocation = bestWell.getMapLocation();
		int t;
		switch (bestWell.getResourceType()) {
			case ELIXIR:
				t = Math.min(ex, GameConstants.UPGRADE_WELL_AMOUNT - bestWell.getResource(ResourceType.ELIXIR));
				if (t <= 0)
					return false;
				rc.transferResource(wellLocation, ResourceType.ELIXIR, t);
				totalResources -= t;
				totalCarryWeight -= t;
				ex -= t;
				return true;
			case ADAMANTIUM:
				t = Math.min(mn, GameConstants.UPGRADE_TO_ELIXIR - bestWell.getResource(ResourceType.MANA));
				if (t <= 0)
					return false;
				rc.transferResource(wellLocation, ResourceType.MANA, t);
				totalResources -= t;
				totalCarryWeight -= t;
				mn -= t;
				return true;
			case MANA:
				t = Math.min(mn, GameConstants.UPGRADE_WELL_AMOUNT - bestWell.getResource(ResourceType.MANA));
				if (t <= 0)
					return false;
				rc.transferResource(wellLocation, ResourceType.MANA, t);
				totalResources -= t;
				totalCarryWeight -= t;
				mn -= t;
				return true;
			default:
				return false;
		}
	}

	private void findBestJob() throws GameActionException {
		/*
		 * Determine what job/mode we should be doing. Jobs can be things like scouting,
		 * gathering resources, deploying an anchor etc. Modes should be more specific,
		 * like moving to resources, drawing resources from well, etc.
		 * 
		 * JOBS SHOULD NOT CHANGE OFTEN. Think of jobs as high level things that take
		 * >20 rounds to complete. It should be something like scouting out the enemy,
		 * or gathering resources, etc. Jobs should not be something like "run away" or
		 * "path to this location". Those are too low level and temporary.
		 * 
		 * Jobs should also be relatively unit specific. You don't ask a Carrier to
		 * "support troops" or a Booster to "deploy an anchor".
		 */

		if (rc.getAnchor() != null) {
			job = Job.DEPLOY_ANCHOR;
		}

		if (rc.getRoundNum() % 100 == 10) {
			if (rng.nextDouble() >= 7.0 / (1.0 + nearbyCarriers)) {
				job = Job.ATTACK_ENEMY;
				mode = Mode.FIND_ENEMY;
			}
		}

		switch (job) {
			case ATTACK_ENEMY:
				// If you're job is to attack the enemy, you're suicidal and will always attack
				// the enemy until you die
				break;
			case DEPLOY_ANCHOR:
				if (rc.getAnchor() != null)
					break;
			default:
				job = Job.GATHER_RESOURCES;
			case GATHER_RESOURCES:
				if (totalCarryWeight == 0 && myHQLocation != null && rc.canSenseLocation(myHQLocation)) {
					RobotInfo hq = rc.senseRobotAtLocation(myHQLocation);
					int hqMn = hq.getResourceAmount(ResourceType.MANA);
					int hqAd = hq.getResourceAmount(ResourceType.ADAMANTIUM);
					if (hqMn + hqAd > 150 || (rc.getRoundNum() >= Constants.UPGRADE_ROUND && rng.nextDouble() < 0.4)) {
						// The HQ has plenty of resources, so let's focus on
						// upgrading wells instead of gathering more resources
						// System.out.println("SWITCHED JOB to upgrade well");
						job = Job.UPGRADE_WELL;
						// Upgrade a well (but go back to our well to start with--we switch back and
						// forth between the two):
						wellToUpgrade = myWellLocation;
						if (rng.nextDouble() < 0.5) {
							myWellLocation = getRandomWellOther();
						}
						mode = Mode.GOTO_RESOURCES;
						break;
					}
				}
				if (threatLevel > 2) {
					mode = Mode.IN_DANGER;
				}
				switch (mode) {
					case IN_DANGER:
						if (threatLevel <= 2) {
							mode = Mode.GOTO_RESOURCES;
						} else {
							break;
						}
					case FIND_RESOURCES:
					case GOTO_RESOURCES:
					case DRAW_RESOURCES_FROM_WELL:
						if (totalCarryWeight >= 40 || (totalCarryWeight >= 25 && rc.getRoundNum() < 100)) {
							mode = Mode.GOTO_HQ;
							if (nearbyCarriers >= 12) {
								// Our current well is crowded. Next time, go to a new well (maybe)
								switchWell();
							}
						} else {
							mode = nearMyWell() ? Mode.DRAW_RESOURCES_FROM_WELL : Mode.GOTO_RESOURCES;
						}
						break;
					case GOTO_HQ:
					case GIVE_HQ_RESOURCES:
						if (totalCarryWeight <= 0) {
							// We've transferred everything we have, so go out and
							// gather more resources!
							if (navigator != null && myWellLocation != null) {
								mode = Mode.GOTO_RESOURCES;
							} else {
								mode = Mode.FIND_RESOURCES;
							}
						} else {
							mode = nearMyHQ() ? Mode.GIVE_HQ_RESOURCES : Mode.GOTO_HQ;
						}
						break;
					default:
						// System.out.println("DEFAULT2 My mode is " + mode + " and my job is " + job);
						if (totalCarryWeight <= 0) {
							if (navigator != null && myWellLocation != null) {
								mode = Mode.GOTO_RESOURCES;
							} else {
								mode = Mode.FIND_RESOURCES;
							}
						} else if (myWellLocation == null) {
							mode = Mode.GOTO_HQ;
						} else if (myHQLocation == null
								|| myWellLocation.distanceSquaredTo(pos) < myHQLocation.distanceSquaredTo(pos)) {
							mode = Mode.GOTO_RESOURCES;
						} else {
							mode = Mode.GOTO_HQ;
						}
						break;
				}
				break;
			case UPGRADE_WELL:
				// System.out.println("Upgrade well selection");
				// rc.setIndicatorDot(myWellLocation, 0, 0, 0);
				// rc.setIndicatorDot(wellToUpgrade, 255, 255, 0);
				if (threatLevel > 2) {
					mode = Mode.IN_DANGER;
				}
				switch (mode) {
					case IN_DANGER:
						if (threatLevel <= 2) {
							mode = Mode.GOTO_RESOURCES;
						} else {
							break;
						}
					case FIND_RESOURCES:
					case GOTO_RESOURCES:
					case DRAW_RESOURCES_FROM_WELL:
					case GIVE_WELL_RESOURCES:
						if (myWellLocation != null && rc.canSenseLocation(myWellLocation)) {
							WellInfo well = rc.senseWell(myWellLocation);
							if (well.isUpgraded()) {
								job = Job.GATHER_RESOURCES;
								mode = Mode.GOTO_HQ;
								break;
							}
						}
						if (totalCarryWeight >= 40) {
							// Switch wells to go to
							MapLocation temp = myWellLocation;
							myWellLocation = wellToUpgrade;
							wellToUpgrade = temp;
							if (ad > 0) {
								mode = Mode.GOTO_HQ;
							} else {
								mode = Mode.GOTO_RESOURCES;
							}
						} else {
							mode = nearMyWell() ? Mode.DRAW_RESOURCES_FROM_WELL : Mode.GOTO_RESOURCES;
						}
						break;
					case GOTO_HQ:
					case GIVE_HQ_RESOURCES:
						if (totalCarryWeight <= 0) {
							// We've transferred everything we have, so go out and
							// gather more resources!
							if (navigator != null && myWellLocation != null) {
								mode = Mode.GOTO_RESOURCES;
							} else {
								mode = Mode.FIND_RESOURCES;
							}
						} else {
							mode = nearMyHQ() ? Mode.GIVE_HQ_RESOURCES : Mode.GOTO_HQ;
						}
						break;
					default:
						// System.out.println("I'm in mode " + mode + " and job " + job);
						job = Job.GATHER_RESOURCES;
						mode = Mode.GOTO_RESOURCES;
						break;
				}
				break;
		}
	}

	private void switchWell() {
		switchWell(0.2);
	}

	private void switchWell(double probability) {
		/*
		 * Switch what well we're mining from to some random other well (if available)
		 * with the given probability.
		 */
		if (rng.nextDouble() >= probability)
			return; // randomness failed

		wellToAvoid = myWellLocation;
		myWellLocation = null;
		int myChunk = Minimap.getChunkIndex(pos);
		int nearestWellChunk = MinimapInfo.nearestWellChunkOther(myChunk, minimap.getChunks());
		if (nearestWellChunk != myChunk) {
			navigator.randomGoal = Minimap.getChunkCenter(nearestWellChunk);
		} else {
			navigator.randomGoal = null;
		}
	}

	public MapLocation getRandomWell() {
		/*
		 * Return a MapLocation close to a random nearby well.
		 * If we don't know of ANY nearby wells, then return null.
		 */
		MapLocation randomNearbyLoc = rc.getLocation().translate(rng.nextInt(21) - 10, rng.nextInt(21) - 10);
		// Try a few more times if not on the map
		if (!onTheMap(randomNearbyLoc))
			randomNearbyLoc = rc.getLocation().translate(rng.nextInt(21) - 10, rng.nextInt(21) - 10);
		if (!onTheMap(randomNearbyLoc))
			randomNearbyLoc = rc.getLocation().translate(rng.nextInt(21) - 10, rng.nextInt(21) - 10);
		if (!onTheMap(randomNearbyLoc))
			return null; // Didn't work too many times. Returns null.
		int chunk = Minimap.getChunkIndex(randomNearbyLoc);
		int nearestWellChunk = MinimapInfo.nearestWellChunk(chunk, minimap.getChunks());
		if (nearestWellChunk == -1) {
			return null;
		}
		MapLocation nearbyCenter = Minimap.getChunkCenter(nearestWellChunk);
		return nearbyCenter;
	}

	public MapLocation getRandomWellOther() {
		/*
		 * Like switchWell, it tries to return a well other than the one we currently
		 * are at
		 */

		int chunk = Minimap.getChunkIndex(pos);
		int nearestWellChunk = MinimapInfo.nearestWellChunkOther(chunk, minimap.getChunks());
		if (nearestWellChunk == -1) {
			return null;
		}
		MapLocation nearbyCenter = Minimap.getChunkCenter(nearestWellChunk);
		return nearbyCenter;
	}
}
