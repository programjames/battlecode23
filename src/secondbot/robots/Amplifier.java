package secondbot.robots;

import battlecode.common.*;
import secondbot.coordination.*;
import secondbot.navigation.*;

public class Amplifier extends Unit {

	Navigator navigator;

	public Amplifier(RobotController rc) {
		super(rc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setup() {
		super.setup();
		navigator = new Navigator(this, rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
	}

	@Override
	public void runTurn() throws GameActionException {
		if (enemies.length > 0) {
			retreat(navigator);
		} else {
			int dx = 0;
			int dy = 0;
			for (RobotInfo robot : rc.senseNearbyRobots(-1, myTeam)) {
				switch (robot.type) {
					case AMPLIFIER:
					case HEADQUARTERS:
						dx += pos.x - robot.location.x;
						dy += pos.y - robot.location.y;
						break;
					default:
				}
			}
			MapLocation loc = pos.translate(dx, dy);
			navigator.fuzzyMoveTo(loc, 4);
		}
	}
}
