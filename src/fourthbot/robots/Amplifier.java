package fourthbot.robots;

import battlecode.common.*;
import fourthbot.coordination.*;
import fourthbot.navigation.*;

public class Amplifier extends Unit {

	Navigator navigator;

	public Amplifier(RobotController rc) {
		super(rc);
		// TODO Auto-generated constructor stub
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
		navigator.needToPrepareMove = false;

		if (noDangerousEnemies) {
			mode = Mode.FIND_ENEMY;
			int myChunk = Minimap.getChunkIndex(pos);
			int chunk = -1;
			chunk = MinimapInfo.nearestEnemyChunk(myChunk, minimap.getChunks());
			if (chunk == -1 && rc.getRoundNum() >= Constants.CAPTURE_ISLAND_ROUND) {
				chunk = MinimapInfo.nearestUnfriendlyIslandChunk(myChunk, minimap.getChunks());
			}
			if (chunk == -1) {
				navigator.setDestination(new MapLocation(mapWidth / 2, mapHeight / 2));
			} else {
				navigator.setDestination(Minimap.getChunkCenter(chunk));
			}
		} else {
			mode = Mode.RETREAT;
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
