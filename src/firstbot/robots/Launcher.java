package firstbot.robots;

import battlecode.common.*;
import firstbot.coordination.*;
import firstbot.navigation.*;

public class Launcher extends Unit {

	Navigator navigator;

	public Launcher(RobotController rc) {
		super(rc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setup() {
		super.setup();
		job = Job.ATTACK_ENEMY;
		mode = Mode.FIND_ENEMY;
		navigator = new Navigator(this, rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		navigator.needToPrepareMove = true;
		
		if(enemies.length == 0) {
			mode = Mode.FIND_ENEMY;
			navigator.setDestination(enemyGoalLocation());
		} else if (enemies.length > friends.length) {
			mode = Mode.RETREAT;
		} else {
			mode = Mode.ATTACK;
		}
	}

	@Override
	public void runTurn() throws GameActionException {
		switch (job) {
			case ATTACK_ENEMY:
				switch (mode) {
					case FIND_ENEMY: // move to our enemy goal location
						navigator.move(enemyGoalLocation());
						navigator.move(enemyGoalLocation());
						break;

					case ATTACK:
						attack(navigator);
						break;

					case RETREAT:
						retreat(navigator);
						break;

					default:
						break;
				}
				break;
			default:
				break;
		}

	}
}
