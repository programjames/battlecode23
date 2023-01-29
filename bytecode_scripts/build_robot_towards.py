ALL_POSITIONS = [(dx, dy) for dx in range(-3, 4) for dy in range(-3, 4) if dx ** 2 + dy ** 2 <= 9 and dx**2 + dy**2 > 0]

def build_robot_near(dx, dy):
    """
    Return the helper function for trying to build a robot given the specific diff
    of (dx, dy).
    """
    sdx = str(dx).replace("-", "N")
    sdy = str(dy).replace("-", "N")
    
    parts = [f"""
    public static boolean buildRobotNear_{sdx}_{sdy}(RobotController rc, MapLocation pos, RobotType buildType)  throws GameActionException {{
        MapLocation buildLocation;
    """.strip()]
    positions = sorted(ALL_POSITIONS, key=lambda d: (d[0] - dx) ** 2 + (d[1] - dy) ** 2)
    for x, y in positions:
        parts.append(f"""
        buildLocation = pos.translate({x}, {y});
        if (rc.canBuildRobot(buildType, buildLocation)) {{
            rc.buildRobot(buildType, buildLocation);
            return true;
        }}
        """)
    parts.append("return false;")
    parts.append("}")

    return "\n".join(parts).strip()


def make_build_robot():
    parts = [
        """public static boolean buildTowards(RobotController rc, RobotType buildType, MapLocation pos, MapLocation location) throws GameActionException {
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
        
		switch (dy) {"""
    ]


    for dy in [-3, -2, -1, 1, 2, 3, 0]:
        parts.append(f"case {dy}:")
        if dy == 0:
            parts.append("default:")
        parts.append("switch (dx) {")
        for dx in [-3, -2, -1, 1, 2, 3, 0]:
            parts.append(f"case {dx}:")
            if dx == 0:
                parts.append("default:")
            sdx = str(dx).replace("-", "N")
            sdy = str(dy).replace("-", "N")
            parts.append(f"return buildRobotNear_{sdx}_{sdy}(rc, pos, buildType);");
        parts.append("}")
    parts.append("}")
    parts.append("}")

    for dy in range(-3, 4):
        for dx in range(-3, 4):
            parts.append(build_robot_near(dx, dy))

    return "\n".join(parts)

def make_file():
    parts = ["""
    package fourthbot.coordination;

    import battlecode.common.*;
    
    public final class HqBuilder {
    """]
    parts.append(make_build_robot())
    parts.append("}")
    return "\n".join(parts)

print(make_file())