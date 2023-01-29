
    package fourthbot.coordination;

    import battlecode.common.*;
    
    public final class HqBuilder {
    
public static boolean buildTowards(RobotController rc, RobotType buildType, MapLocation pos, MapLocation location) throws GameActionException {
		/*
		 * Try to build a robot of type RobotType as close to the given location as
		 * possible.
		 * Return true if successful.
		 * 
		 * Note: If we are under attack (i.e. can see enemy units, we instead build as
		 * close to our HQ
		 * as possible for added protection)
		 */
		// First, check that we have the required resources
		if (rc.getResourceAmount(ResourceType.ADAMANTIUM) < buildType.getBuildCost(ResourceType.ADAMANTIUM)) {
			return false;
		}
		if (rc.getResourceAmount(ResourceType.MANA) < buildType.getBuildCost(ResourceType.MANA)) {
			return false;
		}
		if (rc.getResourceAmount(ResourceType.ELIXIR) < buildType.getBuildCost(ResourceType.ELIXIR)) {
			return false;
		}

		int dx = location.x - pos.x;
		int dy = location.y - pos.y;
		dx = Math.min(Math.max(dx, -3), 3);
		dy = Math.min(Math.max(dy, -3), 3);
        
		switch (dy) {
case -3:
switch (dx) {
case -3:
return buildRobotNear_N3_N3(rc, pos, buildType);
case -2:
return buildRobotNear_N2_N3(rc, pos, buildType);
case -1:
return buildRobotNear_N1_N3(rc, pos, buildType);
case 1:
return buildRobotNear_1_N3(rc, pos, buildType);
case 2:
return buildRobotNear_2_N3(rc, pos, buildType);
case 3:
return buildRobotNear_3_N3(rc, pos, buildType);
case 0:
default:
return buildRobotNear_0_N3(rc, pos, buildType);
}
case -2:
switch (dx) {
case -3:
return buildRobotNear_N3_N2(rc, pos, buildType);
case -2:
return buildRobotNear_N2_N2(rc, pos, buildType);
case -1:
return buildRobotNear_N1_N2(rc, pos, buildType);
case 1:
return buildRobotNear_1_N2(rc, pos, buildType);
case 2:
return buildRobotNear_2_N2(rc, pos, buildType);
case 3:
return buildRobotNear_3_N2(rc, pos, buildType);
case 0:
default:
return buildRobotNear_0_N2(rc, pos, buildType);
}
case -1:
switch (dx) {
case -3:
return buildRobotNear_N3_N1(rc, pos, buildType);
case -2:
return buildRobotNear_N2_N1(rc, pos, buildType);
case -1:
return buildRobotNear_N1_N1(rc, pos, buildType);
case 1:
return buildRobotNear_1_N1(rc, pos, buildType);
case 2:
return buildRobotNear_2_N1(rc, pos, buildType);
case 3:
return buildRobotNear_3_N1(rc, pos, buildType);
case 0:
default:
return buildRobotNear_0_N1(rc, pos, buildType);
}
case 1:
switch (dx) {
case -3:
return buildRobotNear_N3_1(rc, pos, buildType);
case -2:
return buildRobotNear_N2_1(rc, pos, buildType);
case -1:
return buildRobotNear_N1_1(rc, pos, buildType);
case 1:
return buildRobotNear_1_1(rc, pos, buildType);
case 2:
return buildRobotNear_2_1(rc, pos, buildType);
case 3:
return buildRobotNear_3_1(rc, pos, buildType);
case 0:
default:
return buildRobotNear_0_1(rc, pos, buildType);
}
case 2:
switch (dx) {
case -3:
return buildRobotNear_N3_2(rc, pos, buildType);
case -2:
return buildRobotNear_N2_2(rc, pos, buildType);
case -1:
return buildRobotNear_N1_2(rc, pos, buildType);
case 1:
return buildRobotNear_1_2(rc, pos, buildType);
case 2:
return buildRobotNear_2_2(rc, pos, buildType);
case 3:
return buildRobotNear_3_2(rc, pos, buildType);
case 0:
default:
return buildRobotNear_0_2(rc, pos, buildType);
}
case 3:
switch (dx) {
case -3:
return buildRobotNear_N3_3(rc, pos, buildType);
case -2:
return buildRobotNear_N2_3(rc, pos, buildType);
case -1:
return buildRobotNear_N1_3(rc, pos, buildType);
case 1:
return buildRobotNear_1_3(rc, pos, buildType);
case 2:
return buildRobotNear_2_3(rc, pos, buildType);
case 3:
return buildRobotNear_3_3(rc, pos, buildType);
case 0:
default:
return buildRobotNear_0_3(rc, pos, buildType);
}
case 0:
default:
switch (dx) {
case -3:
return buildRobotNear_N3_0(rc, pos, buildType);
case -2:
return buildRobotNear_N2_0(rc, pos, buildType);
case -1:
return buildRobotNear_N1_0(rc, pos, buildType);
case 1:
return buildRobotNear_1_0(rc, pos, buildType);
case 2:
return buildRobotNear_2_0(rc, pos, buildType);
case 3:
return buildRobotNear_3_0(rc, pos, buildType);
case 0:
default:
return buildRobotNear_0_0(rc, pos, buildType);
}
}
}
public static boolean buildRobotNear_N3_N3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N2_N3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N1_N3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_0_N3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_1_N3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_2_N3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_3_N3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N3_N2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N2_N2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N1_N2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_0_N2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_1_N2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_2_N2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_3_N2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N3_N1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N2_N1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N1_N1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_0_N1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_1_N1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_2_N1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_3_N1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N3_0(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N2_0(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N1_0(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_0_0(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_1_0(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_2_0(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_3_0(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N3_1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N2_1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N1_1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_0_1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_1_1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_2_1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_3_1(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N3_2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N2_2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N1_2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_0_2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_1_2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_2_2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_3_2(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N3_3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N2_3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_N1_3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_0_3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_1_3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_2_3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
public static boolean buildRobotNear_3_3(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {
        MapLocation buildLocation;

        buildLocation = pos.translate(2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -1);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-1, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-3, 0);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(0, -3);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        

        buildLocation = pos.translate(-2, -2);
        if (rc.canBuildRobot(buildType, buildLocation)) {
            rc.buildRobot(buildType, buildLocation);
            return true;
        }
        
return false;
}
}
