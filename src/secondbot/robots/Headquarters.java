package secondbot.robots;

import battlecode.common.*;
import secondbot.coordination.*;

public class Headquarters extends Building {

	public Headquarters(RobotController rc) {
		super(rc);
		// TODO Auto-generated constructor stub
	}

	RobotType nextManaBuild = RobotType.LAUNCHER;
	RobotType nextAdamBuild = RobotType.CARRIER;
	RobotType nextElixBuild = RobotType.BOOSTER;

	@Override
	public void runTurn() throws GameActionException {
		if (rc.getRoundNum() > 500) {
			rc.resign();
		}

		while (tryBuildRobot())
			;

		// Draw the minimap
		/*
		 * for (int x = 2; x < mapWidth; x += 5) {
		 * for (int y = 2; y < mapHeight; y += 5) {
		 * int chunk = minimap.getChunk(minimap.getChunkIndex(x, y));
		 * if ((chunk & Minimap.ENEMY_BIT) != 0) {
		 * rc.setIndicatorLine(new MapLocation(x - 2, y - 2), new MapLocation(x + 2, y -
		 * 2), 255, 0, 0);
		 * rc.setIndicatorLine(new MapLocation(x + 2, y - 2), new MapLocation(x + 2, y +
		 * 2), 255, 0, 0);
		 * rc.setIndicatorLine(new MapLocation(x + 2, y + 2), new MapLocation(x - 2, y +
		 * 2), 255, 0, 0);
		 * rc.setIndicatorLine(new MapLocation(x - 2, y + 2), new MapLocation(x - 2, y -
		 * 2), 255, 0, 0);
		 * }
		 * if ((chunk & Minimap.WELL_BIT) != 0) {
		 * // System.out.println("Marking well");
		 * rc.setIndicatorLine(new MapLocation(x - 1, y - 1), new MapLocation(x + 1, y -
		 * 1), 0, 0, 255);
		 * rc.setIndicatorLine(new MapLocation(x + 1, y - 1), new MapLocation(x + 1, y +
		 * 1), 0, 0, 255);
		 * rc.setIndicatorLine(new MapLocation(x + 1, y + 1), new MapLocation(x - 1, y +
		 * 1), 0, 0, 255);
		 * rc.setIndicatorLine(new MapLocation(x - 1, y + 1), new MapLocation(x - 1, y -
		 * 1), 0, 0, 255);
		 * }
		 * }
		 * }
		 */

	}

	private boolean tryBuildRobot() throws GameActionException {
		RobotType buildType;
		int mana = rc.getResourceAmount(ResourceType.MANA);
		int adam = rc.getResourceAmount(ResourceType.ADAMANTIUM);
		int elix = rc.getResourceAmount(ResourceType.ELIXIR);

		if (mana >= nextManaBuild.buildCostMana && adam >= nextManaBuild.buildCostAdamantium) {
			buildType = nextManaBuild;
		} else if (adam >= nextAdamBuild.buildCostAdamantium && mana >= nextAdamBuild.buildCostMana) {
			buildType = nextAdamBuild;
		} else {
			buildType = nextElixBuild;
		}

		for (Direction direction : Direction.allDirections()) {
			MapLocation buildLocation = rc.getLocation().add(direction);
			if (rc.canBuildRobot(buildType, buildLocation)) {
				rc.buildRobot(buildType, buildLocation);
				updateBuildOrder(buildType);
				return true;
			}
		}
		return false;
	}

	private void updateBuildOrder(RobotType buildType) {
		if (buildType == nextManaBuild) {
			int r = rng.nextInt(10);
			switch (r) {
				case 0:
					nextManaBuild = RobotType.AMPLIFIER;
					break;
				default:
					nextManaBuild = RobotType.LAUNCHER;
			}
		}
		if (buildType == nextAdamBuild) {
			int r = rng.nextInt(10);
			switch (r) {
				case 0:
					nextAdamBuild = RobotType.AMPLIFIER;
					break;
				default:
					nextAdamBuild = RobotType.CARRIER;
			}
		}
		if (buildType == nextElixBuild) {
			int r = rng.nextInt(2);
			switch (r) {
				case 0:
					nextElixBuild = RobotType.DESTABILIZER;
					break;
				default:
					nextElixBuild = RobotType.BOOSTER;
			}
		}
	}
}
