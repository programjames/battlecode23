package thirdbot.robots;

import battlecode.common.*;
import thirdbot.coordination.*;
import thirdbot.navigation.*;

public class Launcher extends Unit {

	Navigator navigator;
	MapLocation sneakLocation = null;
	MapLocation sneakLocation2 = null;

	public Launcher(RobotController rc) {
		super(rc);
	}

	@Override
	public void setup() {
		super.setup();
		if (rng.nextDouble() < 0.5) {
			job = Job.ATTACK_ENEMY;
		} else {
			// System.out.println("I'm a sneak attacker!");
			job = Job.SNEAK_ATTACK;
			pos = rc.getLocation();
			int x = pos.x;
			int y = pos.y;
			boolean left = (2 * x) < mapWidth;
			boolean top = (2 * y) < mapHeight;
			if (left != top) {
				if (mapWidth + mapHeight > 2 * x + 2 * y) {
					sneakLocation = new MapLocation(0, 0);
				} else {
					sneakLocation = new MapLocation(mapWidth - 1, mapHeight - 1);
				}
			} else {
				if (2 * x + mapHeight < 2 * y + mapWidth) {
					sneakLocation = new MapLocation(0, mapHeight - 1);
				} else {
					sneakLocation = new MapLocation(mapWidth - 1, 0);
				}
			}
			if (left) {
				if (top) {
					sneakLocation2 = new MapLocation(mapWidth - 1, mapHeight - 1);
				} else {
					sneakLocation2 = new MapLocation(mapWidth - 1, 0);
				}
			} else {
				if (top) {
					sneakLocation2 = new MapLocation(0, mapHeight - 1);
				} else {
					sneakLocation2 = new MapLocation(0, 0);
				}
			}
			// System.out.println("I plan to sneak to " + sneakLocation + " and then " +
			// sneakLocation2);
		}
		mode = Mode.FIND_ENEMY;
		navigator = new Navigator(this, rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		navigator.needToPrepareMove = true;

		if (job == Job.SNEAK_ATTACK) {
			if (sneakLocation == null || enemies.length > 0)
				job = Job.ATTACK_ENEMY;
		}

		if (noDangerousEnemies) {
			mode = Mode.FIND_ENEMY;
			if (job != Job.SNEAK_ATTACK) {
				int myChunk = minimap.getChunkIndex(pos);
				int chunk = -1;
				chunk = MinimapInfo.nearestEnemyChunk(myChunk, minimap.getChunks());
				if (chunk == -1 && rc.getRoundNum() >= Constants.CAPTURE_ISLAND_ROUND) {
					chunk = MinimapInfo.nearestUnfriendlyIslandChunk(myChunk, minimap.getChunks());
				}
				if (chunk == -1) {
					navigator.setDestination(new MapLocation(mapWidth / 2, mapHeight / 2));
				} else {
					navigator.setDestination(minimap.getChunkCenter(chunk));
				}
			}
		} else if (threatLevel > 2 * allyStrength) {
			mode = Mode.RETREAT;
		} else {
			mode = Mode.ATTACK;
		}
	}

	@Override
	public void runTurn() throws GameActionException {
		switch (job) {
			case SNEAK_ATTACK:
				if (job == Job.SNEAK_ATTACK && sneakLocation != null) {
					// System.out.println("Will be sneaking...");
					if (rc.canSenseLocation(sneakLocation)) {
						// System.out.println("Sneak updated.");
						sneakLocation = sneakLocation2;
						sneakLocation2 = null;
					}
					// System.out.println("Final steps.");
					if (sneakLocation != null) {
						// System.out.println("Made it!");
						navigator.setDestination(sneakLocation);
						navigator.move();
						navigator.move();
						attack();
						break;
					}
				}
			case ATTACK_ENEMY:
				switch (mode) {
					case FIND_ENEMY: // move to our enemy goal location
						navigator.move();
						navigator.move();
						attack();
						break;

					case ATTACK:
						attack();
						encircle(navigator);
						attack();
						break;

					case RETREAT:
						attack();
						retreat(navigator);
						attack();
						break;

					default:
						break;
				}
				break;
			default:
				break;
		}

	}
}
