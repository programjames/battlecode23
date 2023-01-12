// This is the version of Pather.java before bytecode optimizing and unrolling.

package pathing;

import battlecode.common.*;

public final class PatherTemplate {

    // TODO: Replace these with integers.
    public static final int RADIUS_SQUARED = 20;
    public static final int RADIUS = 5; // furthest (not squared) radius you can see + 1
    public static final int BOX_SIZE = 2 * RADIUS + 1;
    public static final int NUM_LOCATIONS = BOX_SIZE * BOX_SIZE;
    public static final int[][] VISION_DIFFS = { { -4, -1 }, { -4, 0 }, { -4, 1 }, { -3, -3 }, { -3, -2 }, { -3, -1 },
            { -3, 0 }, { -3, 1 }, { -3, 2 }, { -3, 3 }, { -2, -3 }, { -2, -2 }, { -2, -1 }, { -2, 0 }, { -2, 1 },
            { -2, 2 }, { -2, 3 }, { -1, -4 }, { -1, -3 }, { -1, -2 }, { -1, -1 }, { -1, 0 }, { -1, 1 }, { -1, 2 },
            { -1, 3 }, { -1, 4 }, { 0, -4 }, { 0, -3 }, { 0, -2 }, { 0, -1 }, { 0, 0 }, { 0, 1 }, { 0, 2 }, { 0, 3 },
            { 0, 4 }, { 1, -4 }, { 1, -3 }, { 1, -2 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, { 1, 2 }, { 1, 3 }, { 1, 4 },
            { 2, -3 }, { 2, -2 }, { 2, -1 }, { 2, 0 }, { 2, 1 }, { 2, 2 }, { 2, 3 }, { 3, -3 }, { 3, -2 }, { 3, -1 },
            { 3, 0 }, { 3, 1 }, { 3, 2 }, { 3, 3 }, { 4, -1 }, { 4, 0 }, { 4, 1 } };

    // Pathfinding variables
    public static int[] costs = new int[NUM_LOCATIONS];
    public static int[] cooldowns = new int[NUM_LOCATIONS]; // how much added cooldown on this location?
    public static boolean[] checked = new boolean[NUM_LOCATIONS]; // have we checked this location in our Dijkstra?
    public static Direction[] currents = new Direction[NUM_LOCATIONS]; // current directions
    public static Direction[] currented = new Direction[NUM_LOCATIONS]; // if it got pushed here by a current, what was
                                                                        // the direction moved before that?
    public static boolean[] dest = new boolean[NUM_LOCATIONS]; // is this place a destination?
    public static Direction[] dirs = new Direction[NUM_LOCATIONS]; // direction we moved to get here.
    public static boolean[] wait = new boolean[NUM_LOCATIONS]; // did it need a wait to get here?

    // Queue variables
    public static int[] queue = new int[NUM_LOCATIONS];
    public static int endOfQueue = 1;

    // Debugging variables
    public static int color;

    static {
        for (int dy = -RADIUS; dy < 1 + RADIUS; dy++) {
            for (int dx = -RADIUS; dx < 1 + RADIUS; dx++) {
                costs[encodeEntry(dx, dy)] = 0;
            }
        }
    }

    public static int encodeEntry(int x, int y) {
        return BOX_SIZE * y + x + RADIUS * BOX_SIZE + RADIUS;
    }

    public static int[] decodeEntry(int encodedValue) {
        return new int[] { (encodedValue % BOX_SIZE) - RADIUS,
                (encodedValue / BOX_SIZE) - RADIUS };
    }

    public static int actualCooldown(RobotController rc) {
        RobotType type = rc.getType();
        if(type == RobotType.CARRIER) {
            return (int) (GameConstants.CARRIER_MOVEMENT_INTERCEPT + GameConstants.CARRIER_MOVEMENT_SLOPE * rc.getWeight());
        } else {
            return type.movementCooldown;
        }
    }

    public static void reset(RobotController rc) throws GameActionException {
        color = 0;

        checked = new boolean[NUM_LOCATIONS];
        dest = new boolean[NUM_LOCATIONS];
        currents = new Direction[NUM_LOCATIONS];

        endOfQueue = 1;

        MapLocation startLocation = rc.getLocation();
        Team myTeam = rc.getTeam();

        int cooldown = actualCooldown(rc);

        for (MapInfo info : rc.senseNearbyMapInfos()) {
            MapLocation loc = info.getMapLocation();
            int encoded = encodeEntry(loc.x - startLocation.x, loc.y - startLocation.y);
            if (info.isPassable()) {
                cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
                currents[encoded] = info.getCurrentDirection();
            } else {
                cooldowns[encoded] = 100000;
            }
        }
    }

    public static int encodeDirection(Direction dir) {
        if (dir == null)
            return 0;
        switch (dir) {
            case EAST:
                return 1;
            case WEST:
                return -1;
            case SOUTH:
                return -BOX_SIZE;
            case NORTH:
                return BOX_SIZE;
            case SOUTHEAST:
                return 1 - BOX_SIZE;   
            case NORTHEAST:
                return 1 + BOX_SIZE;
            case SOUTHWEST:
                return -1 - BOX_SIZE;
            case NORTHWEST:
                return -1 + BOX_SIZE;
            default:
                return 0;
        }
    }

    public static void addDestinations(int[][] diffs) {
        for (int[] d : diffs) {
            dest[encodeEntry(d[0], d[1])] = true;
        }
    }

    public static boolean canSenseEncoded(int encodedValue) {
        int[] diff = decodeEntry(encodedValue);
        return diff[0] * diff[0] + diff[1] * diff[1] <= RADIUS_SQUARED;
    }

    public static void debugPoint(int enc, RobotController rc) {
        int[] diff = decodeEntry(enc);
        rc.setIndicatorDot(rc.getLocation().translate(diff[0], diff[1]), color,
        color, color);
        color += 3;
    }

    public static void debugLine(int start, int end, RobotController rc) {
        int[] diff = decodeEntry(start);
        MapLocation a = rc.getLocation().translate(diff[0], diff[1]);
        diff = decodeEntry(end);
        MapLocation b = rc.getLocation().translate(diff[0], diff[1]);
        rc.setIndicatorLine(a, b, 255, 0, 0);
    }

    public static int dijkstra(RobotController rc) {
        /*
         * Returns an encoding of the found destination, which can be plugged into
         * reconstructPath.
         * If no destination found, returns Integer.MAX_VALUE.
         */
        int cost = rc.getMovementCooldownTurns();
        if (cost >= GameConstants.COOLDOWN_LIMIT) {
            return Integer.MAX_VALUE;
        }

        MapLocation startLocation = rc.getLocation();

        int encoded = encodeEntry(0, 0);
        costs[encoded] = cost;
        addToQueue(encoded);
        checked[encoded] = true;

        int tileToCheck;
        do {
            tileToCheck = popFromQueue();
            int[] diff = decodeEntry(tileToCheck);
            int dx = diff[0];
            int dy = diff[1];
            MapLocation diffLocation = startLocation.translate(dx, dy);
            if (!rc.canSenseLocation(diffLocation))
                continue;
            if (dx != 0 && dy != 0 && rc.canSenseRobotAtLocation(diffLocation))
                continue;

            cost = costs[tileToCheck];
            for (Direction d : Direction.values()) {
                int newTile = tileToCheck + d.dx + BOX_SIZE * d.dy;
                if (canSenseEncoded(newTile) && !checked[newTile]) {
                    // Does it stop on a current?
                    if (currents[newTile] != Direction.CENTER
                            && (cost % GameConstants.COOLDOWNS_PER_TURN) + cooldowns[newTile] >= GameConstants.COOLDOWNS_PER_TURN) {
                        
                        // Could we try waiting on the previous turn?
                        if (0 < cost % GameConstants.COOLDOWNS_PER_TURN && cooldowns[newTile] < GameConstants.COOLDOWNS_PER_TURN && currents[tileToCheck] == Direction.CENTER) {
                            costs[newTile] = cooldowns[newTile] + (cost + GameConstants.COOLDOWNS_PER_TURN - 1)
                                    / GameConstants.COOLDOWNS_PER_TURN * GameConstants.COOLDOWNS_PER_TURN;
                            dirs[newTile] = d;
                            wait[newTile] = true;
                            checked[newTile] = true;
                            currented[newTile] = null;
                            addToQueue(newTile);

                            // found a destination
                            if (dest[newTile]) {
                                return newTile;
                            }
                        }

                        // Or we can ride the current
                        int currentTile = newTile + encodeDirection(currents[newTile]);
                        if (!canSenseEncoded(currentTile) || checked[currentTile]) {
                            continue;
                        }

                        costs[currentTile] = cost + cooldowns[newTile];
                        dirs[currentTile] = currents[newTile];
                        currented[currentTile] = d;
                        newTile = currentTile;
                    } else { // it isn't stopping anyway...
                        costs[newTile] = cost + cooldowns[newTile];
                        dirs[newTile] = d;
                        currented[newTile] = null;
                    }

                    wait[newTile] = false;
                    checked[newTile] = true;
                    addToQueue(newTile);

                    // found a destination
                    if (dest[newTile]) {
                        return newTile;
                    }
                }
            }
        } while (endOfQueue > 1);
        return Integer.MAX_VALUE;
    }

    public static Direction[] reconstructPath(int dest, RobotController rc) {
        if (dest == Integer.MAX_VALUE) {
            return new Direction[] { Direction.CENTER };
        }

        int start = encodeEntry(0, 0);
        Direction[] path = new Direction[100];
        int i = 0;
        while (dest != start) {
            Direction dir = dirs[dest];
            int d = encodeDirection(dir);
            if (currented[dest] == null || currents[dest - d] == Direction.CENTER) {
                path[i] = dir;
            } else {
                path[i] = currented[dest];
                d += encodeDirection(currented[dest]);
            }

            if (wait[dest]) {
                i++;
                path[i] = Direction.CENTER;
            }

            i++;
            dest -= d;
        }

        // fix order of path
        Direction[] ordered = new Direction[i];
        for (int j = i; --j >= 0;) {
            ordered[j] = path[i - j - 1];
        }
        return ordered;
    }

    public static void addToQueue(int encodedPosition) {
        int cost = costs[encodedPosition];
        int idx = endOfQueue;
        int parent = queue[idx / 2];
        // Sift up
        while (idx > 1 && cost < costs[parent]) {
            queue[idx] = parent;
            idx /= 2;
            parent = queue[idx / 2];
        }
        queue[idx] = encodedPosition;
        endOfQueue++;
    }

    // TODO: Make all variables public static for bytecode saving.
    public static int popFromQueue() {
        int topPos = queue[1];
        endOfQueue--;
        // Replace with bottom of queue
        int bottomPos = queue[endOfQueue];
        queue[1] = bottomPos;
        int cost = costs[bottomPos];

        // Sift bottom down from the top
        int bottom = 1;
        int left = 2;
        while (2 * bottom < endOfQueue) { // while bottom has a child
            left = 2 * bottom;
            int leftPos = queue[left];
            int leftCost = costs[leftPos];
            if (leftCost < cost) {
                int right = left + 1;
                if (right < endOfQueue) {
                    int rightPos = queue[right];
                    if (costs[rightPos] < leftCost) {
                        // sift to the right
                        queue[bottom] = rightPos;
                        bottom = right;
                        continue;
                    }
                }
                // sift to the left
                queue[bottom] = leftPos;
                bottom = left;
                continue;
            }
            int right = left + 1;
            if (right < endOfQueue) {
                int rightPos = queue[right];
                if (costs[rightPos] < leftCost) {
                    // sift to the right
                    queue[bottom] = rightPos;
                    bottom = right;
                    continue;
                }
            }
            break; // No more sifting needed
        }

        queue[bottom] = bottomPos;
        return topPos; // shouldn't need to return after todo is done.
    }

    public static boolean queueIsEmpty() {
        return endOfQueue == 1;
    }
}
