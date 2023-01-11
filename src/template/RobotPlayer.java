package template;

import battlecode.common.*;
import template.robots.*;

public strictfp class RobotPlayer {
	public static void run(RobotController rc) throws GameActionException {
		Robot robot;
		switch (rc.getType()) {
		case AMPLIFIER:
			robot = new Amplifier(rc);
			break;
		case BOOSTER:
			robot = new Booster(rc);
			break;
		case CARRIER:
			robot = new Carrier(rc);
			break;
		case DESTABILIZER:
			robot = new Destabilizer(rc);
			break;
		case HEADQUARTERS:
			robot = new Headquarters(rc);
			break;
		case LAUNCHER:
			robot = new Launcher(rc);
			break;
		default:
			throw new IllegalArgumentException("The robot controller has an unknown type!");
		}

		robot.run();
	}
}