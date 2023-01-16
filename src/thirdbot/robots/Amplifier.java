package thirdbot.robots;

import battlecode.common.*;
import thirdbot.coordination.*;
import thirdbot.navigation.*;

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
			MapLocation loc = safeSpreadOutLocation();
			navigator.move(loc);
		}
	}
}
