package template;

import battlecode.common.RobotController;

public abstract class Building extends Robot {

	public Building(RobotController rc) {
		super(rc);
	}

	@Override
	abstract void mainloop();
}
