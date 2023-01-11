package template;

import battlecode.common.RobotController;

public abstract class Unit extends Robot {
	public Unit(RobotController rc) {
		super(rc);
	}
	
	@Override
	abstract void mainloop();
}
