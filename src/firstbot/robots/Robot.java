package firstbot.robots;

import battlecode.common.*;
import firstbot.coordination.*;

import java.util.Random;

public abstract class Robot {
	public RobotController rc;
	public RobotType type;
	public Team myTeam, enemyTeam;
	public MapLocation pos;
	public Random rng;
	public Minimap minimap;
	public RobotInfo[] enemies;
	public int mapWidth, mapHeight;

	public Robot(RobotController rc) {
		this.rc = rc;
		type = rc.getType();
		myTeam = rc.getTeam();
		enemyTeam = myTeam.opponent();
		mapWidth = rc.getMapWidth();
		mapHeight = rc.getMapHeight();
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
		minimap = new Minimap(rc);
	}

	public void beginTurn() throws GameActionException {
		/*
		 * Actions to take before you start moving and attacking, like sensing and
		 * processing messages
		 */
		// Sense enemies
		enemies = rc.senseNearbyRobots(-1, enemyTeam);
		
		minimap.pull();
		// Update the minimap with enemies & visible squares
		if (enemies.length == 0) {
			minimap.markClear(pos);
		} else {
			for (RobotInfo enemy : enemies) {
				minimap.markEnemy(enemy);
			}
		}
	}

	public abstract void runTurn() throws GameActionException; // Actions to take like moving and attacking

	public void useFreeComputation() {
		/*
		 * Use the remaining free computation we have to help other robots out!
		 * 
		 * Example: Distributed BFS
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
