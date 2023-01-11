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
	}
}
