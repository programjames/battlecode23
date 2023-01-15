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

	MapLocation randomGoal = null;

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

	@Override
	public boolean move() throws GameActionException {
		/*
		 * Override to use our special moveSingle() and to look around after moving
		 */
		boolean moved = false;
		moved |= moveSingle();
		carrier.lookAround();
		moved |= moveSingle();
		carrier.lookAround();
		moved |= moveSingle();
		carrier.lookAround();
		moved |= moveSingle();
		carrier.lookAround();
		return moved;
	}

	public boolean moveSingle() throws GameActionException {
		/*
		 * Basically the same as the super() except that if it can't move because the
		 * location is occupied, it does a fuzzy move instead. This is to get around
		 * blockages at mining locations.
		 */
		rc.setIndicatorDot(carrier.pos, 255, 255, 0);
		Direction directionToMove;
		if (path == null || pathIndex == path.length) {
			directionToMove = getFuzzyMoveDirection();
			System.out.println("Started at fuzzy");
		} else {
			directionToMove = path[pathIndex];
			pathIndex++;
			if (directionToMove == lastMoveDirection.opposite()) {
				directionToMove = getFuzzyMoveDirection();
				System.out.println("Switched to fuzzy");
				pathIndex = path.length;
			}
		}
		System.out.println(directionToMove);

		if (directionToMove != Direction.CENTER) {
			if (rc.canMove(directionToMove)) {
				rc.move(directionToMove);
				carrier.pos = rc.getLocation();
				lastMoveDirection = directionToMove;
				return true;
			} else if (rc.isLocationOccupied(carrier.pos.add(directionToMove))) {
				// Critical difference between this and super.move()
				return fuzzyMoveTo(destination, 3); // Extra fuzziness when location blocked to especially avoid
													// blockages
			}
		}
		return false;
	}
}
