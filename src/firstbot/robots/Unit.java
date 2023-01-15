package firstbot.robots;

import battlecode.common.*;
import firstbot.navigation.*;
import firstbot.coordination.*;

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
}
