package thirdbot.robots;

import battlecode.common.*;
import thirdbot.coordination.*;
import thirdbot.navigation.*;


public class Destabilizer extends Unit {

	Navigator navigator;

	public Destabilizer(RobotController rc) {
		super(rc);
	}

	@Override
	public void setup() {
		super.setup();
		navigator = new Navigator(this, rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		navigator.needToPrepareMove = true;

		if (noDangerousEnemies) {
			int chunk = -1;
			mode = Mode.FIND_ENEMY;
			if (rc.getRoundNum() >= Constants.CAPTURE_ISLAND_ROUND) {
				int myChunk = minimap.getChunkIndex(pos);
				chunk = MinimapInfo.nearestUnclaimedIslandChunk(myChunk, minimap.getChunks());
			}
			if (chunk == -1) {
				navigator.setDestination(new MapLocation(mapWidth / 2, mapHeight / 2));
			} else {
				navigator.setDestination(minimap.getChunkCenter(chunk));
			}
		} else if (!rc.isActionReady() || threatLevel > allyStrength) {
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
