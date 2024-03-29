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
