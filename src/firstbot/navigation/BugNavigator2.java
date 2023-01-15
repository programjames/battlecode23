package firstbot.navigation;

import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;
import firstbot.robots.Carrier;

public class BugNavigator2 extends BugNavigator {
	public Carrier carrier;
	MapLocation randomGoal = null;

	public BugNavigator2(Carrier carrier, RobotController rc) {
		super(carrier, rc);
		this.carrier = carrier;
	}

	@Override
	public boolean move() throws GameActionException {
		boolean moved = false;
		moved |= super.move();
		carrier.lookAround();
		moved |= super.move();
		carrier.lookAround();
		moved |= super.move();
		carrier.lookAround();
		moved |= super.move();
		carrier.lookAround();
		return moved;
	}
	
	public void navigateToWell() throws GameActionException {
		/*
		 * Navigate to a well to collect resources
		 */
		carrier.lookAround();
		if (carrier.myWellLocation == null) {
			if (randomGoal == null) {
				randomGoal = new MapLocation(carrier.rng.nextInt(carrier.mapWidth),
						carrier.rng.nextInt(carrier.mapHeight));
				setDestination(randomGoal);
			} else if (carrier.pos.distanceSquaredTo(randomGoal) < 11) {
				randomGoal = new MapLocation(carrier.rng.nextInt(carrier.mapWidth),
						carrier.rng.nextInt(carrier.mapHeight));
				setDestination(randomGoal);
			}
			move();
		} else {
			if (destination != carrier.myWellLocation) {
				setDestination(carrier.myWellLocation);
			}
			move();
		}
		rc.setIndicatorDot(destination, 0, 0, 255);
	}

	public void navigateToHQ() throws GameActionException {
		/*
		 * Navigate to a headquarters to deposit resources
		 */
		carrier.lookAround();
		if (carrier.myHQLocation == null) {
			if (randomGoal == null) {
				randomGoal = new MapLocation(carrier.rng.nextInt(carrier.mapWidth),
						carrier.rng.nextInt(carrier.mapHeight));
				setDestination(randomGoal);
			} else if (carrier.pos.distanceSquaredTo(randomGoal) < 11) {
				randomGoal = new MapLocation(carrier.rng.nextInt(carrier.mapWidth),
						carrier.rng.nextInt(carrier.mapHeight));
				setDestination(randomGoal);
			}
			move();
		} else {
			if (destination != carrier.myHQLocation) {
				setDestination(carrier.myHQLocation);
			}
			move();
		}
		rc.setIndicatorDot(destination, 255, 255, 0);
	}

}
