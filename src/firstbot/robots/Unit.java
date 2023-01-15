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
}
