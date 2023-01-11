package firstbot.robots;

import battlecode.common.*;
import java.util.Random;

public abstract class Robot {
	public RobotController rc;
	public RobotType type;
	public Team myTeam;
	public MapLocation pos;
	public Random rng;

	public Robot(RobotController rc) {
		this.rc = rc;
		this.type = rc.getType();
		this.myTeam = rc.getTeam();
	}

	public void setup() {
		/*
		 * What should we run one time at the very beginning on the first turn? This
		 * might include things like making a navigator, creating a random seed, etc.
		 * 
		 * The job of this is to set everything up; the job of public Robot() is just to
		 * create the robot class.
		 */
		pos = rc.getLocation();
		rng = new Random(rc.getID() ^ 12353);
		
	}

	public void beginTurn() {
		/*
		 * Actions to take before you start moving and attacking, like sensing and
		 * processing messages
		 */
	}

	public abstract void runTurn() throws GameActionException; // Actions to take like moving and attacking

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
			try {
				beginTurn();
				runTurn();
				useFreeComputation();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				Clock.yield();
			}
		}
	}
}
