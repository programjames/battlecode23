package template;

import battlecode.common.Clock;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;
import battlecode.common.RobotType;

public abstract class Robot {
	public RobotController rc;
	public RobotType type;
	public MapLocation pos;

	public Robot(RobotController rc) {
		this.rc = rc;
		this.type = rc.getType();
		this.pos = rc.getLocation();
	}

	public void setup() {

	}

	abstract void mainloop();

	public void useFreeComputation() {
		/*
		 * Use the remaining free computation we have to help other robots calculate
		 * things!
		 * 
		 * Example: Distributed BFS would be neat.
		 */
	}

	public void run() {
		setup();
		while (true) {
			mainloop();
			useFreeComputation();
			Clock.yield();
		}
	}
}
