package firstbot.robots;

import battlecode.common.*;
import firstbot.coordination.*;
import firstbot.navigation.*;

public class Launcher extends Unit {

	Navigator navigator;

	public Launcher(RobotController rc) {
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
		navigator.needToPrepareMove = true;

		if (mode == Mode.FIND_ENEMY) {
			if (enemies.length > 0) { // Found an enemy!
				mode = Mode.ATTACK;
			} else {
				navigator.setDestination(enemyGoalLocation());
			}
		} else if (enemies.length == 0) { // Need to go find more enemies.
			mode = Mode.FIND_ENEMY;
			navigator.setDestination(enemyGoalLocation());
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
						launcherAttack();
						break;

					case RETREAT:
						launcherRetreat();
						break;

					default:
						break;
				}
				break;
			default:
				break;
		}

	}

	public void launcherAttack() throws GameActionException {
		RobotInfo enemy = null;
		int dist = Integer.MAX_VALUE;
		for (RobotInfo r : enemies) {
			if (r.location.distanceSquaredTo(pos) < dist) {
				dist = r.location.distanceSquaredTo(pos);
				enemy = r;
			}
		}

		if (enemy == null)
			return;

		if (rc.getActionCooldownTurns() <= GameConstants.COOLDOWN_LIMIT && !rc.canAttack(enemy.location)) {
			// Move in for the kill mwahahaha
			navigator.setDestination(enemy.location);
			navigator.move();
		}

		while (rc.canAttack(enemy.location)) {
			rc.attack(enemy.location);
		}

		// Run away so they don't hit us!
		MapLocation loc = runAwayLocation();
		navigator.fuzzyMoveTo(loc, 2);
		navigator.fuzzyMoveTo(loc, 2);
	}

	public void launcherRetreat() throws GameActionException {
		// Haha yeah right. We're no chickens.
	}

	public MapLocation runAwayLocation() throws GameActionException {
		int dx = 0;
		int dy = 0;
		for (RobotInfo robot : enemies) {
			switch (robot.type) {
				case LAUNCHER:
				case DESTABILIZER:
					dx += pos.x - robot.location.x;
					dy += pos.y - robot.location.y;
					break;
				default:
			}
		}
		return pos.translate(dx, dy);
	}

	public MapLocation enemyGoalLocation() throws GameActionException {
		// Moving towards this goal should bring you closer to the enemy.
		int chunk = MinimapInfo.nearestEnemyChunk(minimap.getChunkIndex(pos), minimap.getChunks());
		if (chunk != -1) {
			// move to the nearest enemy chunk
			return minimap.getChunkCenter(chunk);
		} else {
			// spread out
			int dx = 0;
			int dy = 0;
			for (RobotInfo robot : rc.senseNearbyRobots(-1, myTeam)) {
				switch (robot.type) {
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - robot.location.x;
						dy += pos.y - robot.location.y;
						break;
					default:
				}
			}
			return pos.translate(dx, dy);
		}
	}
}
