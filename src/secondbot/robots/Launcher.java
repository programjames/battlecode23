package secondbot.robots;

import battlecode.common.*;
import secondbot.coordination.*;
import secondbot.navigation.*;

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
			mode = Mode.FIND_ENEMY;
			if (rc.getRoundNum() >= Constants.CAPTURE_ISLAND_ROUND) {
				int myChunk = minimap.getChunkIndex(pos);
				int chunk = MinimapInfo.nearestUnclaimedIslandChunk(myChunk, minimap.getChunks());
				if (chunk != -1) {
					navigator.setDestination(minimap.getChunkCenter(chunk));
				} else {
					navigator.setDestination(new MapLocation(mapWidth / 2, mapHeight / 2));
				}
			} else {
				navigator.setDestination(new MapLocation(mapWidth / 2, mapHeight / 2));
			}
		} else if (threatLevel > allyStrength) {
			mode = Mode.RETREAT;
		} else {
			mode = Mode.ATTACK;
		}
	}

	@Override
	public void runTurn() throws GameActionException {
		switch (job) {
			case ATTACK_ENEMY:
				switch (mode) {
					case FIND_ENEMY: // move to our enemy goal location
						navigator.move();
						navigator.move();
						break;

					case ATTACK:
						attack();
						if (enemies.length > friends.length) {
							encircle(navigator);
						} else {
							skirt(navigator);
						}
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
