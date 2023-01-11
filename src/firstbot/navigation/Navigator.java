package firstbot.navigation;

import battlecode.common.*;
import firstbot.robots.*;

public class Navigator {
	/*
	 * A general purpose navigator for robots to use
	 */

	public RobotController rc;
	public Robot robot;
	public MapLocation destination; // the current destination to navigate to
	public Direction lastMoveDirection = Direction.CENTER;

	public Navigator(Robot robot, RobotController rc) {
		this.rc = rc;
		this.robot = robot;
	}

	public void setDestination(MapLocation destination) {
		this.destination = destination;
	}

	public void move() throws GameActionException {
		/*
		 * Move towards the destination
		 */
		Direction directionToMove = getFuzzyMoveDirection();
		if (directionToMove == lastMoveDirection.opposite()) {
			// We shouldn't just move opposite what we just did!
			directionToMove = lastMoveDirection;
		}
		if (directionToMove != Direction.CENTER && rc.canMove(directionToMove)) {
			rc.move(directionToMove);
			lastMoveDirection = directionToMove;
		}
	}

	private Direction getFuzzyMoveDirection() {
		/*
		 * Return the direction that points closest to
		 * our destination that we can legally move to.
		 */
		Direction bestDirection = robot.pos.directionTo(destination);
		if (rc.canMove(bestDirection)) {
			return bestDirection;
		}
		Direction right = bestDirection.rotateRight();
		if (rc.canMove(right)) {
			return right;
		}
		Direction left = bestDirection.rotateLeft();
		if (rc.canMove(left)) {
			return left;
		}
		Direction rightRight = right.rotateRight();
		if (rc.canMove(rightRight)) {
			return rightRight;
		}
		Direction leftLeft = left.rotateLeft();
		if (rc.canMove(leftLeft)) {
			return leftLeft;
		}
		return Direction.CENTER; // all other directions would only get us farther from our goal
	}

}
