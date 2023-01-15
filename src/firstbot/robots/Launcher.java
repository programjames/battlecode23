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
						navigator.move();
						navigator.move();
						break;

					case ATTACK:
						launcherAttack();
						break;

					case RETREAT:
						launcherRetreat();
						break;

					default:
						break;
				}
				break;
			default:
				break;
		}

	}

	private void launcherAttack() throws GameActionException {
		RobotInfo enemy = null;
		int dist = Integer.MAX_VALUE;
		int health = Integer.MAX_VALUE;
		for (RobotInfo r : enemies) {
			if(r.type == RobotType.HEADQUARTERS) {
				continue;
			}
			int d = r.location.distanceSquaredTo(pos);
			if ((r.health < health && d <= type.actionRadiusSquared) || (d > type.actionRadiusSquared && d < dist) ) {
				// Prey on the close, weak units.
				dist = d;
				health = r.health;
				enemy = r;
			}
		}

		if (enemy == null)
			return;

		if (rc.getActionCooldownTurns() <= GameConstants.COOLDOWN_LIMIT && !rc.canAttack(enemy.location)) {
			// Move in for the kill mwahahaha
			navigator.setDestination(enemy.location);
			navigator.move();
		}

		while (rc.canAttack(enemy.location)) {
			rc.attack(enemy.location);
		}

		// Run away so they don't hit us!
		MapLocation loc = runAwayLocation();
		navigator.fuzzyMoveTo(loc, 2);
		navigator.fuzzyMoveTo(loc, 2);
	}

	private void launcherRetreat() throws GameActionException {
		MapLocation loc = runAwayLocation();
		navigator.fuzzyMoveTo(loc, 2);
		navigator.fuzzyMoveTo(loc, 2);
	}
}
