package firstbot.navigation;

import battlecode.common.*;
import firstbot.robots.*;
import firstbot.coordination.Constants;

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
	public boolean needToPrepareMove = false;

	// VARIABLES FOR BUG NAVIGATION
	private Direction wallDirection = null;
	private MapLocation wallLocation = null;
	boolean wallIsTemporary = false; // for walls made out of robots
	boolean rotateRight = false;
	boolean currentlyBugging = false;

	public Navigator(Robot robot, RobotController rc) {
		this.rc = rc;
		this.robot = robot;
	}

	public void setDestination(MapLocation destination) {
		this.destination = destination;
		wallDirection = null;
		wallLocation = null;
		currentlyBugging = false;
	}

	public void prepareMove(MapLocation destination) throws GameActionException {
		robot.pos = rc.getLocation();
		Pather.reset(rc, destination);
		int localDestination = Pather.dijkstra(rc);
		path = Pather.reconstructPath(localDestination);
		pathIndex = 0;
	}

	public boolean move() throws GameActionException {
		/*
		 * Move towards the destination
		 */
		
		if (rc.getMovementCooldownTurns() >= 10) {
			return false; // Can't move at all because of high cooldown
		}

		int freeSquares = 0;
		if (rc.canMove(Direction.EAST)) freeSquares++;
		if (rc.canMove(Direction.NORTH)) freeSquares++;
		if (rc.canMove(Direction.WEST)) freeSquares++;
		if (rc.canMove(Direction.SOUTH)) freeSquares++;
		if (rc.canMove(Direction.NORTHEAST)) freeSquares++;
		if (rc.canMove(Direction.NORTHWEST)) freeSquares++;
		if (rc.canMove(Direction.SOUTHWEST)) freeSquares++;
		if (rc.canMove(Direction.SOUTHEAST)) freeSquares++;

		
		// Check if we should be bugging or not
		if (currentlyBugging && freeSquares >= 5 && wallLocation == null) {
			currentlyBugging = false;
		}

		if (!currentlyBugging && freeSquares <= 3) {
			currentlyBugging = true;
		}

		if (currentlyBugging) {
			return bugMove();
		}

		if (needToPrepareMove && destination != robot.pos) {
			prepareMove(destination);
			needToPrepareMove = false;
		}
		Direction directionToMove;
		if (path == null || pathIndex == path.length) {
			directionToMove = getFuzzyMoveDirection();
		} else {
			directionToMove = path[pathIndex];
			pathIndex++;
		}

		if (directionToMove != Direction.CENTER && rc.canMove(directionToMove)) {
			rc.move(directionToMove);
			robot.pos = rc.getLocation();
			lastMoveDirection = directionToMove;
			return true;
		}
		return false;
	}

	public boolean move(MapLocation destination) throws GameActionException {
		/*
		 * Move towards the provided destination.
		 * 
		 * NOTE: THIS DOES NOT HAVE LONG TERM MEMORY ON DESTINATIONS,
		 * SO IT'S ONLY REALLY USEFUL FOR CLOSE/TEMPORARY GOALS.
		 */
		
		if (rc.getMovementCooldownTurns() >= 10) {
			//rc.setIndicatorString("Too high cooldown to move");
			return false; // Can't move at all because of high cooldown
		}

		if (needToPrepareMove && destination != robot.pos) {
			prepareMove(destination);
			needToPrepareMove = false;
		}
		Direction directionToMove;
		if (path == null || pathIndex == path.length) {
			directionToMove = getFuzzyMoveDirection(destination, 2);
		} else {
			directionToMove = path[pathIndex];
			pathIndex++;
		}

		if (directionToMove != Direction.CENTER && rc.canMove(directionToMove)) {
			rc.move(directionToMove);
			robot.pos = rc.getLocation();
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
		Direction moveDir = getFuzzyMoveDirection(movLoc, fuzziness);
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
		return getFuzzyMoveDirection(destination, fuzziness);
	}

	public Direction getFuzzyMoveDirection(MapLocation movLoc, int fuzziness) {
		/*
		 * Return the direction that points closest to movLoc that we can
		 * legally move to.
		 */
		Direction direction = robot.pos.directionTo(movLoc);
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

	public boolean bugMove() throws GameActionException {
		// Check if we should stop bugging
		if (wallLocation != null) {
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
