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

	public Direction[] path;
	public int pathIndex = 0;

	public Navigator(Robot robot, RobotController rc) {
		this.rc = rc;
		this.robot = robot;
	}

	public void setDestination(MapLocation destination) {
		this.destination = destination;
	}

	public void prepareMove() throws GameActionException {
		Pather.reset(rc, destination);
		int localDestination = Pather.dijkstra(rc);
		path = Pather.reconstructPath(localDestination);
		pathIndex = 0;
	}

	public boolean move() throws GameActionException {
		/*
		 * Move towards the destination
		 */

		Direction directionToMove;
		if (path == null || pathIndex == path.length) {
			directionToMove = getFuzzyMoveDirection();
		} else {
			directionToMove = path[pathIndex];
			pathIndex++;
		}

		if (directionToMove != Direction.CENTER && rc.canMove(directionToMove)) {
			rc.move(directionToMove);
			lastMoveDirection = directionToMove;
			return true;
		}
		return false;
	}

	public boolean fuzzyMoveTo(MapLocation movLoc) throws GameActionException {
		// Try to move to the moveLoc using a single fuzzy move.
		return fuzzyMoveTo(movLoc, 2);
	}

	public boolean fuzzyMoveTo(MapLocation movLoc, int fuzziness) throws GameActionException {
		// Try to move to the moveLoc using a single fuzzy move.
		Direction moveDir = getFuzzyMoveDirection(fuzziness);
		if (moveDir == Direction.CENTER || !rc.canMove(moveDir)) {
			return false; // Couldn't move
		}
		rc.move(moveDir);
		robot.pos = rc.getLocation();
		return true;
	}

	public Direction getFuzzyMoveDirection() {
		return getFuzzyMoveDirection(2);
	}

	public Direction getFuzzyMoveDirection(int fuzziness) {
		/*
		 * Return the direction that points closest to our destination that we can
		 * legally move to.
		 */
		Direction direction = robot.pos.directionTo(destination);
		Direction dirRight = direction;
		Direction dirLeft = direction;
		switch (fuzziness) {
		case 0:
			if (rc.canMove(direction)) {
				return direction;
			}
			return Direction.CENTER;
		case 1:
			if (rc.canMove(direction)) {
				return direction;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				return dirLeft;
			}
			return Direction.CENTER;
		case 2:
			if (rc.canMove(direction)) {
				return direction;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				return dirLeft;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				if (dirRight == lastMoveDirection.opposite()) {
					return dirLeft.rotateLeft();
				}
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				if (dirLeft == lastMoveDirection.opposite()) {
					return dirRight;
				}
				return dirLeft;
			}
			return Direction.CENTER;
		case 3:
			if (rc.canMove(direction)) {
				return direction;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				return dirLeft;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				if (dirRight == lastMoveDirection.opposite()) {
					return dirLeft.rotateLeft();
				}
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				if (dirLeft == lastMoveDirection.opposite()) {
					return dirRight;
				}
				return dirLeft;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				return dirLeft;
			}
			return Direction.CENTER;
		case 4:
		default:
			if (rc.canMove(direction)) {
				return direction;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				return dirLeft;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				if (dirRight == lastMoveDirection.opposite()) {
					return dirLeft.rotateLeft();
				}
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				if (dirLeft == lastMoveDirection.opposite()) {
					return dirRight;
				}
				return dirLeft;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				return dirLeft;
			}
			dirRight = dirRight.rotateRight();
			if (rc.canMove(dirRight)) {
				return dirRight;
			}
			dirLeft = dirLeft.rotateLeft();
			if (rc.canMove(dirLeft)) {
				return dirLeft;
			}
			return Direction.CENTER;
		}
	}

}
