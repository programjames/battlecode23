package firstbot.navigation;

import battlecode.common.*;
import firstbot.robots.Robot;

public class BugNavigator extends Navigator {
	private Direction wallDirection = null;
	private MapLocation wallLocation = null;
	boolean wallIsTemporary = false; // for walls made out of robots
	boolean rotateRight = false;

	public BugNavigator(Robot robot, RobotController rc) {
		super(robot, rc);
	}

	@Override
	public void setDestination(MapLocation destination) {
		this.destination = destination;
		wallDirection = null;
		wallLocation = null;
	}

	@Override
	public boolean move() throws GameActionException {
		if (rc.getMovementCooldownTurns() >= 10) {
			//rc.setIndicatorString("Too high cooldown to move");
			return false; // Can't move at all because of high cooldown
		}

		// Check if we should stop bugging
		if (wallLocation != null) {
			// System.out.println("Wall is in direction " + wallDirection + " and in position " + wallLocation + ", rotateRight = " + rotateRight);
			if (robot.pos.distanceSquaredTo(destination) < wallLocation.distanceSquaredTo(destination)) {
				if (wallIsTemporary) {
					// We should stop bugging around temporary walls as soon as we get closer than
					// we started
					// This is to avoid robots bugging around each other all the the time
					wallDirection = null;
					wallLocation = null;
				} else {
					// Do an additional check that we have passed the line between the original wall
					// and the destination
					if (rotateRight != clockwiseOrNot(robot.pos, wallLocation, destination)) {
						wallDirection = null;
						wallLocation = null;
					}
				}
			}
		}

		if (wallLocation == null) {
			Direction directionToMove = robot.pos.directionTo(destination);
			if (rc.canMove(directionToMove)) {
				rc.move(directionToMove);
				lastMoveDirection = directionToMove;
				robot.pos = rc.getLocation();
				return true;
			}

			// uh oh, we hit a wall
			wallDirection = directionToMove;
			wallLocation = robot.pos.add(directionToMove);
			wallIsTemporary = rc.canSenseRobotAtLocation(wallLocation);

			rotateRight = clockwiseOrNot(robot.pos, wallLocation, destination);
		}

		Direction direction = wallDirection;
		if (rc.canMove(direction)) {
			// Our wall disappeared!
			wallDirection = null;
			wallLocation = null;
			rc.move(direction);
			lastMoveDirection = direction;
			robot.pos = rc.getLocation();
			return true;
		}

		if (rotateRight) {
			direction = wallDirection.rotateRight();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.rotateLeft().rotateLeft();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateRight();
			if (rc.canMove(direction)) {
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateRight();
			if (rc.canMove(direction)) {
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateRight();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.rotateRight().rotateRight();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateRight();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.rotateRight().rotateRight();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateRight();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.opposite();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateRight();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.opposite();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			return false;
		} else {
			direction = wallDirection.rotateLeft();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.rotateRight().rotateRight();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateLeft();
			if (rc.canMove(direction)) {
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateLeft();
			if (rc.canMove(direction)) {
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateLeft();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.rotateLeft().rotateLeft();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateLeft();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.rotateLeft().rotateLeft();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateLeft();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.opposite();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			direction = direction.rotateLeft();
			if (rc.canMove(direction)) {
				wallDirection = wallDirection.opposite();
				rc.move(direction);
				lastMoveDirection = direction;
				robot.pos = rc.getLocation();
				return true;
			}
			return false;
		}
	}

	private boolean clockwiseOrNot(MapLocation origin, MapLocation vector1, MapLocation vector2) {
		return (vector1.x - origin.x) * (vector2.y - origin.y) > (vector1.y - origin.y) * (vector2.x - origin.x);
	}

}
