package secondbot.robots;

import battlecode.common.*;
import secondbot.navigation.*;
import secondbot.coordination.*;

public abstract class Unit extends Robot {

	Job job;
	Mode mode;

	@Override
	public void setup() {
		super.setup();
	}

	public Unit(RobotController rc) {
		super(rc);
	}
	
	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		pos = rc.getLocation();
	}
	
	@Override
	public abstract void runTurn() throws GameActionException;

	public MapLocation runAwayLocation() throws GameActionException {
		int dx = 0;
		int dy = 0;
		for (RobotInfo robot : enemies) {
			switch (robot.type) {
				case LAUNCHER:
				case DESTABILIZER:
				case CARRIER:
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
			for (RobotInfo robot : friends) {
				dx += pos.x - robot.location.x;
				dy += pos.y - robot.location.y;
			}
			return pos.translate(dx, dy);
		}
	}

	public void attack(Navigator navigator) throws GameActionException {
		RobotInfo enemy = null;
		int dist = Integer.MAX_VALUE;
		int health = Integer.MAX_VALUE;
		for (RobotInfo r : enemies) {
			if(r.type == RobotType.HEADQUARTERS) {
				continue;
			}
			int d = r.location.distanceSquaredTo(pos);
			if ((r.health < health && d <= type.actionRadiusSquared) || (d > type.actionRadiusSquared && d < dist) ) {
				// Prey on the close, weak units.
				dist = d;
				health = r.health;
				enemy = r;
			}
		}

		if (enemy == null)
			return;

		if (rc.getActionCooldownTurns() <= GameConstants.COOLDOWN_LIMIT && !rc.canAttack(enemy.location)) {
			// Move in for the kill mwahahaha
			navigator.move(enemy.location);
		}

		while (rc.canAttack(enemy.location)) {
			rc.attack(enemy.location);
		}

		// Run away so they don't hit us!
		MapLocation loc = runAwayLocation();
		navigator.fuzzyMoveTo(loc, 4);
		navigator.fuzzyMoveTo(loc, 4);
	}

	public void retreat(Navigator navigator) throws GameActionException {
		MapLocation loc = runAwayLocation();
		navigator.fuzzyMoveTo(loc, 4);
		navigator.fuzzyMoveTo(loc, 4);
	}
}
