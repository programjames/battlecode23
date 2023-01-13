package firstbot.robots;

import battlecode.common.*;

public abstract class Unit extends Robot {
	public Unit(RobotController rc) {
		super(rc);
	}
	
	@Override
	public void beginTurn() throws GameActionException {
		pos = rc.getLocation();
	}
	
	@Override
	public abstract void runTurn() throws GameActionException;
}
