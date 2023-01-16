package thirdbot.robots;

import battlecode.common.*;
import thirdbot.coordination.*;

public class Headquarters extends Building {

	public Headquarters(RobotController rc) {
		super(rc);
		// TODO Auto-generated constructor stub
	}

	RobotType nextManaBuild = RobotType.LAUNCHER;
	RobotType nextAdamBuild = RobotType.CARRIER;
	RobotType nextElixBuild = RobotType.BOOSTER;
	boolean buildAnchor = false;

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();

		if (!noDangerousEnemies) {
			buildAnchor = false;
			nextManaBuild = RobotType.LAUNCHER;
		}
	}

	@Override
	public void runTurn() throws GameActionException {
		// if (rc.getRoundNum() > 500) {
		// 	rc.resign();
		// }

		if (buildAnchor) {
			tryBuildAnchor();
		}
		// (very rarely could build an anchor and still be able to build a robot)
		if (!buildAnchor) {
			while (tryBuildRobot())
				;
		}

		// Draw the minimap

		// for (int x = 2; x < mapWidth; x += 5) {
		// 	for (int y = 2; y < mapHeight; y += 5) {
		// 		int chunk = minimap.getChunk(minimap.getChunkIndex(x, y));
		// 		if ((chunk & Minimap.ISLAND_BITS) != 0) {
		// 			rc.setIndicatorLine(new MapLocation(x - 2, y - 2), new MapLocation(x + 2, y -
		// 					2), 255, 255, 255);
		// 			rc.setIndicatorLine(new MapLocation(x + 2, y - 2), new MapLocation(x + 2, y +
		// 					2), 255, 255, 255);
		// 			rc.setIndicatorLine(new MapLocation(x + 2, y + 2), new MapLocation(x - 2, y +
		// 					2), 255, 255, 255);
		// 			rc.setIndicatorLine(new MapLocation(x - 2, y + 2), new MapLocation(x - 2, y -
		// 					2), 255, 255, 255);
		// 		}
		// 		if ((chunk & Minimap.ENEMY_BIT) != 0) {
		// 			rc.setIndicatorLine(new MapLocation(x - 1, y - 1), new MapLocation(x + 1, y -
		// 					1), 255, 0, 0);
		// 			rc.setIndicatorLine(new MapLocation(x + 1, y - 1), new MapLocation(x + 1, y +
		// 					1), 255, 0, 0);
		// 			rc.setIndicatorLine(new MapLocation(x + 1, y + 1), new MapLocation(x - 1, y +
		// 					1), 255, 0, 0);
		// 			rc.setIndicatorLine(new MapLocation(x - 1, y + 1), new MapLocation(x - 1, y -
		// 					1), 255, 0, 0);
		// 		}
		// 		if ((chunk & Minimap.WELL_BIT) != 0) {
		// 			rc.setIndicatorDot(new MapLocation(x, y), 0, 0, 255);
		// 		}
		// 	}
		// }

	}

	private boolean tryBuildAnchor() throws GameActionException {
		if (rc.canBuildAnchor(Anchor.ACCELERATING)) {
			rc.buildAnchor(Anchor.ACCELERATING);
			buildAnchor = false;
			return true;
		}
		if (rc.canBuildAnchor(Anchor.STANDARD)) {
			rc.buildAnchor(Anchor.STANDARD);
			buildAnchor = false;
			return true;
		}
		return false;
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
		} else if (elix >= nextElixBuild.buildCostElixir) {
			buildType = nextElixBuild;
		} else if (mana >= nextAdamBuild.buildCostMana + RobotType.LAUNCHER.buildCostMana) {
			buildType = RobotType.LAUNCHER;
		} else if (adam >= nextManaBuild.buildCostAdamantium + RobotType.CARRIER.buildCostAdamantium) {
			buildType = RobotType.CARRIER;
		} else {
			// nothing to build
			return false;
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
		if (rc.getRoundNum() > Constants.CAPTURE_ISLAND_ROUND && rng.nextInt(50) == 0) {
			buildAnchor = true;
		}
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
