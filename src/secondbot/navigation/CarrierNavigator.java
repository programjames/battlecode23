package secondbot.navigation;

import battlecode.common.*;
import secondbot.robots.*;

public class CarrierNavigator extends Navigator {
	/*
	 * A special Navigator just for Carriers!
	 * 
	 * Reasons for this: Carriers have to keep track of things like where wells and
	 * HQs are that ordinary robots don't. It's wasteful for every robot to have to
	 * do this, which is why the Carriers have their own Navigator
	 */

	Carrier carrier;

	public MapLocation randomGoal = null;

	public CarrierNavigator(Carrier carrier, RobotController rc) {
		super(carrier, rc);
		this.carrier = carrier;
	}

	public void navigateToWell() throws GameActionException {
		/*
		 * Navigate to a well to collect resources
		 */
		carrier.lookAround();
		if (carrier.myWellLocation == null) {
			if (randomGoal == null) {
				randomGoal = carrier.getRandomWell();
				if (randomGoal == null) {
					// We still don't know have a goal--maybe there are no known wells?
					// So, set a completely random goal
					randomGoal = new MapLocation(carrier.rng.nextInt(carrier.mapWidth),
							carrier.rng.nextInt(carrier.mapHeight));
				}
				setDestination(randomGoal);
			} else if (carrier.pos.distanceSquaredTo(randomGoal) < 11) {
				// We already have a random goal, but there wasn't anything there!
				// This is kind of a fallback option, so let's not trust the getRandomWell()
				// too much and instead just go to somewhere completely random.
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
		// rc.setIndicatorDot(destination, 0, 0, 255);
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
		// rc.setIndicatorDot(destination, 255, 255, 0);
	}

	@Override
	public boolean move() throws GameActionException {
		/*
		 * Override to use our special moveSingle() and to look around after moving
		 */
		// System.out.println("CALLING ON MOVE");
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
}
