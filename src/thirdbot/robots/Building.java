package secondbot.robots;

import battlecode.common.*;

public abstract class Building extends Robot {

	public Building(RobotController rc) {
		super(rc);
	}

	@Override
	public abstract void runTurn() throws GameActionException;
}
