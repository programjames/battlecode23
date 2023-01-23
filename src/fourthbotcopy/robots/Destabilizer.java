package fourthbotcopy.robots;

import battlecode.common.*;
import fourthbotcopy.coordination.*;
import fourthbotcopy.navigation.*;


public class Destabilizer extends Unit {

	Navigator navigator;

	public Destabilizer(RobotController rc) {
		super(rc);
	}

	@Override
	public void setup() {
		super.setup();
		navigator = new Navigator(this, rc);

		job = Job.ATTACK_ENEMY;
		mode = Mode.FIND_ENEMY;
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
						destablizeAttack();
						break;

					case ATTACK:
						destablizeAttack();
						skirt(navigator);
						destablizeAttack();
						break;

					case RETREAT:
						destablizeAttack();
						retreat(navigator);
						destablizeAttack();
						break;

					default:
						break;
				}
				break;
			default:
				break;
		}
	}

	private void destablizeAttack() throws GameActionException {
		if (enemies.length == 0 || rc.getActionCooldownTurns() >= GameConstants.COOLDOWN_LIMIT) return;

		RobotInfo[] enemiesToAttack = rc.senseNearbyRobots(type.actionRadiusSquared, enemyTeam);
		if (enemiesToAttack.length == 0) return;

		for(RobotInfo r : enemiesToAttack) {
			if(rc.canAttack(r.location)) {
				rc.attack(r.location);
				return;
			}
		}


		// int x = 0, y = 0;
		// for(RobotInfo r : enemies) {
		// 	x += r.location.x;
		// 	y += r.location.y;
		// }

		// MapLocation attackLocation = new MapLocation(x / enemies.length, y / enemies.length);
		// RobotInfo[] enemiesToAttack = rc.senseNearbyRobots(attackLocation, 5, enemyTeam);
		// for(RobotInfo r : enemiesToAttack) {
		// 	if(rc.canAttack(r.location)) {
		// 		rc.attack(r.location);
		// 		return;
		// 	}
		// }
	}
}
