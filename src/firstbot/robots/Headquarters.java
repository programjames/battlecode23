package firstbot.robots;

import battlecode.common.*;

public class Headquarters extends Building {

	public Headquarters(RobotController rc) {
		super(rc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void runTurn() throws GameActionException {
		for (Direction direction : Direction.allDirections()) {
			MapLocation buildLocation = rc.getLocation().add(direction);
			if (rc.canBuildRobot(RobotType.CARRIER, buildLocation)) {
				rc.buildRobot(RobotType.CARRIER, buildLocation);
			}
		}

		// Draw the minimap
		//for (int x = 2; x < mapWidth; x += 5) {
		//	for (int y = 2; y < mapHeight; y += 5) {
		//		int chunk = minimap.getChunk(minimap.getChunkIndex(x, y));
		//		if ((chunk & Minimap.ENEMY_BIT) != 0) {
		//			rc.setIndicatorLine(new MapLocation(x - 2, y - 2), new MapLocation(x + 2, y - 2), 255, 0, 0);
		//			rc.setIndicatorLine(new MapLocation(x + 2, y - 2), new MapLocation(x + 2, y + 2), 255, 0, 0);
		//			rc.setIndicatorLine(new MapLocation(x + 2, y + 2), new MapLocation(x - 2, y + 2), 255, 0, 0);
		//			rc.setIndicatorLine(new MapLocation(x - 2, y + 2), new MapLocation(x - 2, y - 2), 255, 0, 0);
		//		}
		//		if ((chunk & Minimap.WELL_BIT) != 0) {
		//			System.out.println("Marking well");
		//			rc.setIndicatorLine(new MapLocation(x - 1, y - 1), new MapLocation(x + 1, y - 1), 0, 0, 255);
		//			rc.setIndicatorLine(new MapLocation(x + 1, y - 1), new MapLocation(x + 1, y + 1), 0, 0, 255);
		//			rc.setIndicatorLine(new MapLocation(x + 1, y + 1), new MapLocation(x - 1, y + 1), 0, 0, 255);
		//			rc.setIndicatorLine(new MapLocation(x - 1, y + 1), new MapLocation(x - 1, y - 1), 0, 0, 255);
		//		}
		//	}
		//}
	}
}
