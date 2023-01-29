package fourthbot.robots;

import battlecode.common.*;
import fourthbot.coordination.*;
import fourthbot.navigation.*;

public class Launcher extends Unit {

	Navigator navigator;

	public Launcher(RobotController rc) {
		super(rc);
	}

	@Override
	public void setup() {
		super.setup();
		job = Job.ATTACK_ENEMY;
		mode = Mode.FIND_ENEMY;
		navigator = new Navigator(this, rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		navigator.needToPrepareMove = true;

		if (noDangerousEnemies) {
			// Only if we're not healing.
			if (mode != Mode.HEAL || rc.getHealth() == type.health) {
				mode = Mode.FIND_ENEMY;
			}
		} else if (threatLevel > 0) {
			mode = Mode.RETREAT;
		} else {
			mode = Mode.ATTACK;
		}

		if (mode == Mode.HEAL || rc.getHealth() <= type.health / 3) {
			// See if we own any islands we can heal at.
			int healIsland = -1;
			for (int island : rc.senseNearbyIslands()) {
				if(rc.senseTeamOccupyingIsland(island) == myTeam) {
					healIsland = island;
					break;
				}
			}
			if (healIsland != -1) {
				MapLocation healLoc = null;
				for (MapLocation loc : rc.senseNearbyIslandLocations(healIsland)) {
					if (loc == pos) continue; // Alternate between tiles on an island so that other units can get in and heal.

					if (healLoc == null || pos.distanceSquaredTo(loc) < pos.distanceSquaredTo(healLoc)) {
						healLoc = loc;
					}
				}
				navigator.setDestination(healLoc);
				mode = Mode.HEAL;
			} else {
				int myChunk = Minimap.getChunkIndex(pos);
				int chunk = MinimapInfo.nearestFriendlyIslandChunk(myChunk, minimap.getChunks());
				if (chunk != -1) {
					navigator.setDestination(Minimap.getChunkCenter(chunk));
					mode = Mode.HEAL;
				}
			}
		}

		if (mode == Mode.FIND_ENEMY) {
			int myChunk = Minimap.getChunkIndex(pos);
			int chunk = -1;
			int bits = tasklist.getNextTaskBits(Task.ATTACK);
			if (bits != -1) {
				int roundsLeft = tasklist.getTaskRound(bits) - rc.getRoundNum(); // Number of rounds before convergence.
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
					navigator.setDestinationPreserveBugNav(Minimap.getChunkCenter(chunk));
				}
			}
		}
	}

	@Override
	public void runTurn() throws GameActionException {
		switch (job) {
			case ATTACK_ENEMY:
				switch (mode) {
					case FIND_ENEMY: // move to our enemy goal location
						navigator.move();
						attack();
						navigator.move();
						attack();
						break;

					case ATTACK:
						attack();
						// Move towards center of enemies.
						int centerX = 0, centerY = 0;
						for (RobotInfo r : enemies) {
							centerX += r.location.x;
							centerY += r.location.y;
						}
						if (enemies.length > 0) {
							MapLocation center = new MapLocation(Math.round(centerX / (float)enemies.length), Math.round(centerY / (float)enemies.length));
							navigator.setDestination(center);
							navigator.move();
							attack();
						}
						break;

					case RETREAT:
						attack();
						retreat(navigator);
						attack();
						break;

					case STAY_STILL:
						break;
					
					case HEAL:
						attack();
						navigator.move();
						attack();
						navigator.move();
						attack();

					default:
						break;
				}
				break;
			default:
				break;
		}

	}
}