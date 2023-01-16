package secondbot.robots;

import battlecode.common.*;
import secondbot.coordination.*;
import secondbot.navigation.*;

public class Carrier extends Unit {

	int ad; // amount of adamantium we're carrying
	int mn; // amount of mana we're carrying
	int ex; // amount of elixir we're carrying
	Anchor anchor; // the anchor we're carrying
	int totalResources; // total amount of resources we're carrying
	int totalCarryWeight; // total weight of everything we're carrying


	CarrierNavigator navigator;

	public MapLocation myWellLocation = null; // MapLocation of the well this carrier frequents
	public MapLocation wellToAvoid = null;
	public MapLocation myHQLocation = null; // MapLocation of the HQ this carrier frequents

	public Carrier(RobotController rc) {
		super(rc);
	}

	@Override
	public void setup() {
		super.setup();
		job = Job.GATHER_RESOURCES;
		mode = Mode.FIND_RESOURCES;
		navigator = new CarrierNavigator(this, rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		navigator.needToPrepareMove = true;

		ad = rc.getResourceAmount(ResourceType.ADAMANTIUM);
		mn = rc.getResourceAmount(ResourceType.MANA);
		ex = rc.getResourceAmount(ResourceType.ELIXIR);
		anchor = rc.getAnchor();

		totalResources = ad + mn + ex;
		totalCarryWeight = totalResources + (anchor == null ? 0 : 40);

		// Determine what job we should be doing. NOTE: THIS SHOULDN'T CHANGE OFTEN.
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
				while (depositToNearbyHQ() | pickupFromNearbyWell())
					; // single | is intentional so both are attempted
		}

		switch (job) {
			case GATHER_RESOURCES:
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
					case IN_DANGER:
						dangerLevels(); // only a true cognoscenti would understand.
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
				while (depositToNearbyHQ() | pickupFromNearbyWell())
					; // single | is intentional so both are attempted
		}
	}

	private void dangerLevels() throws GameActionException {
		if (totalResources >= Constants.RUNAWAY_CARRY_LIMIT) {
			attack(navigator);
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
							&& rc.getMovementCooldownTurns() + rc.senseCooldownMultiplier(moveLoc) < 20) {
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
				if (rc.canMove(direction) && rc.getMovementCooldownTurns() + rc.senseCooldownMultiplier(moveLoc) < 20) {
					// We have enough action to come back on the next turn, so let's dart out.
					rc.move(direction);
					pos = rc.getLocation();
					return;
				}

				direction = direction.rotateRight();
				moveLoc = pos.add(direction);
				if (rc.canMove(direction) && rc.getMovementCooldownTurns() + rc.senseCooldownMultiplier(moveLoc) < 20) {
					// We have enough action to come back on the next turn, so let's dart out.
					rc.move(direction);
					pos = rc.getLocation();
					return;
				}

				direction = direction.rotateLeft().rotateLeft();
				moveLoc = pos.add(direction);
				if (rc.canMove(direction) && rc.getMovementCooldownTurns() + rc.senseCooldownMultiplier(moveLoc) < 20) {
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
				return true;
			case ELIXIR:
				rc.transferResource(hqLocation, bestType, ex);
				return true;
			case MANA:
				rc.transferResource(hqLocation, bestType, mn);
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

		switch (job) {
			default:
				job = Job.GATHER_RESOURCES;
			case GATHER_RESOURCES:
				if (threatLevel > 0) {
					mode = Mode.IN_DANGER;
				}
				switch (mode) {
					case IN_DANGER:
						if (threatLevel == 0) {
							mode = Mode.GOTO_RESOURCES;
						} else {
							break;
						}
					case GOTO_RESOURCES:
					case DRAW_RESOURCES_FROM_WELL:
						if (totalCarryWeight >= 40) {
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
		int myChunk = minimap.getChunkIndex(pos);
		int nearestWellChunk = MinimapInfo.nearestWellChunkOther(myChunk, minimap.getChunks());
		if (nearestWellChunk != myChunk) {
			navigator.randomGoal = minimap.getChunkCenter(nearestWellChunk);
		} else {
			navigator.randomGoal = null;
		}
	}

}
