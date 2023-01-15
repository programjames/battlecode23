package firstbot.navigation;

import battlecode.common.*;
import firstbot.robots.*;

public class CarrierNavigator extends Navigator {
	/*
	 * A special Navigator just for Carriers!
	 * 
	 * Reasons for this: Carriers have to keep track of things like where wells and
	 * HQs are that ordinary robots don't. It's wasteful for every robot to have to
	 * do this, which is why the Carriers have their own Navigator
	 */

	Carrier carrier;

	public MapLocation myWellLocation = null; // MapLocation of the well this carrier frequents
	public MapLocation myHQLocation = null; // MapLocation of the HQ this carrier frequents
	MapLocation randomGoal = null;

	public CarrierNavigator(Carrier carrier, RobotController rc) {
		super(carrier, rc);
		this.carrier = carrier;
	}

	public void lookAround() throws GameActionException {
		/*
		 * Use your senses to detect a well or HQ
		 */

		if (myWellLocation == null) {
			int closestDistance = Integer.MAX_VALUE;
			for (WellInfo well : rc.senseNearbyWells()) {
				MapLocation wellLocation = well.getMapLocation();
				if (carrier.pos.distanceSquaredTo(wellLocation) < closestDistance) {
					myWellLocation = wellLocation;
					closestDistance = carrier.pos.distanceSquaredTo(wellLocation);
				}
			}
		}

		if (myHQLocation == null) {
			int closestDistance = Integer.MAX_VALUE;
			for (RobotInfo robot : rc.senseNearbyRobots(-1, carrier.myTeam)) {
				if (robot.type != RobotType.HEADQUARTERS) {
					continue;
				}
				MapLocation hqLocation = robot.location;
				if (carrier.pos.distanceSquaredTo(hqLocation) < closestDistance) {
					myHQLocation = hqLocation;
					closestDistance = carrier.pos.distanceSquaredTo(hqLocation);
				}
			}
		}
	}

	public void navigateToWell() throws GameActionException {
		/*
		 * Navigate to a well to collect resources
		 */
		lookAround();
		if (myWellLocation == null) {
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
			if (destination != myWellLocation) {
				setDestination(myWellLocation);
			}
			move();
		}
		rc.setIndicatorDot(destination, 0, 0, 255);
	}

	public void navigateToHQ() throws GameActionException {
		/*
		 * Navigate to a headquarters to deposit resources
		 */
		lookAround();
		if (myHQLocation == null) {
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
			if (destination != myHQLocation) {
				setDestination(myHQLocation);
			}
			move();
		}
		rc.setIndicatorDot(destination, 255, 255, 0);
	}

	@Override
	public void move() throws GameActionException {
		super.prepareMove();
		super.move();
		lookAround();
		super.move();
		lookAround();
		super.move();
		lookAround();
		super.move();
		lookAround();
	}

}
