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
				chunk = tasklist.getTaskChunk(bits);
				MapLocation dest = Minimap.getChunkCenter(chunk);
				int roundsLeft = tasklist.getTaskRound(bits) - rc.getRoundNum(); // Number of rounds before convergence
				if (Math.pow(roundsLeft / 2, 2) >= pos.distanceSquaredTo(dest)) { // Magic constants, you can try to find better ones.
					mode = Mode.STAY_STILL;
				} else {
					navigator.setDestination(dest);
				}
			} else {
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

	@Override
	public void runTurn() throws GameActionException {
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
						encircle(navigator);
						attack();
						break;

					case RETREAT:
						attack();
						retreat(navigator);
						attack();
						break;

					case STAY_STILL:
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