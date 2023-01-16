package secondbot.robots;

import battlecode.common.*;
import secondbot.coordination.*;
import secondbot.navigation.*;


public class Booster extends Unit {

	Navigator navigator;

	public Booster(RobotController rc) {
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
		navigator.needToPrepareMove = true;
	}

	@Override
	public void runTurn() throws GameActionException {
		// TODO Write this!

	}
}
