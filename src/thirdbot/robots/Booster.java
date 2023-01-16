package thirdbot.robots;

import battlecode.common.*;
import thirdbot.coordination.*;
import thirdbot.navigation.*;

public class Booster extends Unit {

	Navigator navigator;

	public Booster(RobotController rc) {
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
		} else {
			mode = Mode.RETREAT;
		}
	}

	@Override
	public void runTurn() throws GameActionException {
		if(rc.canBoost()) {
			rc.boost();
		}
		switch (job) {
			case ATTACK_ENEMY:
				switch (mode) {
					case FIND_ENEMY: // move to our enemy goal location
						navigator.move();
						navigator.move();
						break;

					case RETREAT:
						retreat(navigator);
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
