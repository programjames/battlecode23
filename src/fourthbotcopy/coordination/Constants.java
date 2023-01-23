package fourthbotcopy.coordination;

import battlecode.common.*;

public final class Constants {
	public final static Direction[] NONZERO_DIRECTIONS = { Direction.EAST, Direction.NORTH, Direction.WEST,
			Direction.SOUTH,
			Direction.SOUTHEAST, Direction.NORTHEAST, Direction.NORTHWEST, Direction.SOUTHWEST };

	public static final int RUNAWAY_CARRY_LIMIT = 20; // limit of weight carriers should carry when running away. They
														// should attack if they are at or above this
	public static final int CAPTURE_ISLAND_ROUND = 300; // Don't worry about capturing islands before then.
	public static final int UPGRADE_ROUND = 150; // Don't worry about capturing islands before then.
}
