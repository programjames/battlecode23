package pathing;

import battlecode.common.*;

public class PatherTemplate {

    // Pathfinding variables

    public static int[] costs = new int[121];
    public static int[] cooldowns = new int[121]; // how much added cooldown on this location?
    public static boolean[] toCheck = new boolean[121]; // have we toCheck this location in our Dijkstra?
    public static Direction[] currents = new Direction[121]; // current directions
    public static Direction[] currented = new Direction[121]; // if it got pushed here by a current, what was
                                                              // the direction moved before that?
    public static boolean[] dest = new boolean[121]; // is this place a destination?
    public static Direction[] dirs = new Direction[121]; // direction we moved to get here.
    public static boolean[] wait = new boolean[121]; // did it need a wait to get here?

    // Queue variables
    public static int[] queue = new int[121];
    public static int endOfQueue = 1;

    // Debugging variables
    public static int color;

    public static int encodeEntry(int x, int y) {
        return 11 * y + x + 60;
    }

    public static int[] decodeEntry(int encodedValue) {
        return new int[] { (encodedValue % 11) - 5,
                (encodedValue / 11) - 5 };
    }

    public static int actualCooldown(RobotController rc) {
        RobotType type = rc.getType();
        if (type == RobotType.CARRIER) {
            return (int) (GameConstants.CARRIER_MOVEMENT_INTERCEPT
                    + GameConstants.CARRIER_MOVEMENT_SLOPE * rc.getWeight());
        } else {
            return type.movementCooldown;
        }
    }

    public static int cooldown;
    public static void reset(RobotController rc) throws GameActionException {
        color = 0;

        toCheck = new boolean[121];
        dest = new boolean[121];
        currents = new Direction[121];

        endOfQueue = 1;

        MapLocation startLocation = rc.getLocation();
        Team myTeam = rc.getTeam();

        cooldown = actualCooldown(rc);

        MapLocation loc;
        int encoded;

        for (MapInfo info : rc.senseNearbyMapInfos()) {
            loc = info.getMapLocation();
            encoded = encodeEntry(loc.x - startLocation.x, loc.y - startLocation.y);
            if (info.isPassable()) {
                cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
                currents[encoded] = info.getCurrentDirection();
                toCheck[encoded] = rc.senseRobotAtLocation(loc) == null;
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
                return -11;
            case NORTH:
                return 11;
            case SOUTHEAST:
                return -10;
            case NORTHEAST:
                return 12;
            case SOUTHWEST:
                return -12;
            case NORTHWEST:
                return 10;
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
        switch (encodedValue) {
            case 15:
            case 16:
            case 17:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 103:
            case 104:
            case 105:
                return true;
            default:
                return false;
        }
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

    // Variables used in this loop
    public static int newTile;
    public static int currentTile;
    public static int encoded;
    public static int tileToCheck;
    public static int cost;

    public static int dijkstra(RobotController rc) {
        /*
         * Returns an encoding of the found destination, which can be plugged into
         * reconstructPath.
         * If no destination found, returns Integer.MAX_VALUE.
         */
        cost = rc.getMovementCooldownTurns();
        if (cost >= GameConstants.COOLDOWN_LIMIT) {
            return Integer.MAX_VALUE;
        }

        MapLocation startLocation = rc.getLocation();

        encoded = encodeEntry(0, 0);
        costs[encoded] = cost;
        addToQueue(encoded);
        toCheck[encoded] = false;

        do {
            int b = Clock.getBytecodeNum();
            tileToCheck = popFromQueue();
            System.out.println(Clock.getBytecodeNum() - b);

            cost = costs[tileToCheck];
            for (Direction d : Direction.values()) {
                newTile = tileToCheck + d.dx + 11 * d.dy;
                if (canSenseEncoded(newTile) && toCheck[newTile]) {
                    // Does it stop on a current?
                    
                    if (currents[newTile] != Direction.CENTER
                            && (cost % 10) + cooldowns[newTile] >= 10) {
                        // Could we try waiting on the previous turn?
                        if (cost % 10 > 0 && cooldowns[newTile] < 10 && currents[tileToCheck] == Direction.CENTER) {
                            costs[newTile] = cooldowns[newTile] + (cost + 9) / 10 * 10;
                            dirs[newTile] = d;
                            wait[newTile] = true;
                            currented[newTile] = null;
                            toCheck[newTile] = false;

                            // found a destination
                            if (dest[newTile]) {
                                return newTile;
                            }

                            addToQueue(newTile);
                        }

                        // Or we can ride the current
                        currentTile = newTile + encodeDirection(currents[newTile]);
                        if (!canSenseEncoded(currentTile) || !toCheck[currentTile]) {
                            continue;
                        }
                        costs[currentTile] = cost + cooldowns[newTile];
                        dirs[currentTile] = currents[newTile];
                        currented[currentTile] = d;
                        wait[currentTile] = false;
                        toCheck[currentTile] = false;

                        // found a destination?
                        if (dest[currentTile]) {
                            return currentTile;
                        }

                        addToQueue(currentTile);
                    } else { // it isn't stopping on a current
                        costs[newTile] = cost + cooldowns[newTile];
                        dirs[newTile] = d;
                        currented[newTile] = null;
                        wait[newTile] = false;
                        toCheck[newTile] = false;

                        // found a destination?
                        if (dest[newTile]) {
                            return newTile;
                        }

                        addToQueue(newTile);
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
            debugPoint(dest, rc);
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
