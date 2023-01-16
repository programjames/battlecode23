package secondbot.robots;

import battlecode.common.*;
import secondbot.coordination.*;

import java.util.Random;

public abstract class Robot {
	public RobotController rc;
	public RobotType type;
	public Team myTeam, enemyTeam;
	public MapLocation pos;
	public Random rng;
	public Minimap minimap;
	public RobotInfo[] enemies;
	public RobotInfo[] friends;
	public int mapWidth, mapHeight;
	public int visionRadius;
	public boolean noDangerousEnemies;
	
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
		friends = rc.senseNearbyRobots(-1, myTeam);
		visionRadius = rc.senseMapInfo(rc.getLocation()).hasCloud() ? GameConstants.CLOUD_VISION_RADIUS_SQUARED
				: type.visionRadiusSquared;

		minimap.pull();

		noDangerousEnemies = true;
		enemyLoop: for(RobotInfo enemy : enemies) {
			switch(enemy.type) {
				case AMPLIFIER:
				case HEADQUARTERS:
				break;
				default:
				noDangerousEnemies = false;
				break enemyLoop;
			}
		}

		
		// Update the minimap with enemies & visible squares
		if (noDangerousEnemies) {
			minimap.markClear(pos);
		} else {
			MinimapInfo.markEnemies(minimap, enemies);
		}
	}

	public abstract void runTurn() throws GameActionException; // Actions to take like moving and attacking

	public void endTurn() throws GameActionException {
		// Look for nearby wells to update our minimap
		// This isn't critical, and probably most relevant at the end of the turn so we
		// put it in endTurn

		if (Clock.getBytecodesLeft() > 1500) { // so we don't run out of bytecode
			WellInfo[] nearbyWells = rc.senseNearbyWells();
			for (WellInfo well : nearbyWells) {
				minimap.markWell(well);
			}

			if (rc.canWriteSharedArray(0, 0)) {
				// If we can write, then push our updates to the shared array
				minimap.push();
				// rc.setIndicatorString("Just pushed to minimap!");
			} // else {
				// rc.setIndicatorString("Can't push to minimap!");
				// }
		}
		if (Clock.getBytecodesLeft() > 1500) {
			int[] islands = rc.senseNearbyIslands();
			for(int island : islands) {
				Team islandTeam = rc.senseTeamOccupyingIsland(island);
				MapLocation islandLoc = rc.senseNearbyIslandLocations(island)[0];
				minimap.markIsland(islandLoc, islandTeam, myTeam);
			}
		}
	}

	public void run() {
		setup();

		while (true) {
			try {
				beginTurn();
				runTurn();
				endTurn();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				Clock.yield();
			}
		}
	}
}
