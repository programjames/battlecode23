# Game constants
radius = 20 #int(input("What is the radius squared? "))
directions = [(-1, 0), (-1, 1), (0, 1), (1, 1), (1, 0), (1, -1), (0, -1), (-1, -1)] # clockwise from WEST
dict_dirs = {(-1, 0): "WEST", (-1, 1): "NORTHWEST", (0, 1): "NORTH", (1, 1): "NORTHEAST",
(1, 0):"EAST", (1, -1): "SOUTHEAST", (0, -1): "SOUTH", (-1, -1): "SOUTHWEST"}

# Get locations
r = 1 + int(radius**0.5)
locs = set((x, y) for x in range(-r, 1+r) for y in range(-r,1+r) if x**2 + y**2 <= radius)

# Assign numbers to each location
numbers = dict()
for i, (x, y) in enumerate(sorted(locs)):
    numbers[(x, y)] = i
    numbers[i] = (x, y)

# Create neighbor graph
neighbors = dict()
for x, y in locs:
    neighbors[(x, y)] = []
    for dx, dy in directions:
        if (x + dx, y + dy) in locs:
            neighbors[(x, y)].append((x+dx, y+dy))

def neighbor_nums(n):
    x, y = numbers[n]
    return [numbers[(a, b)] for a, b in neighbors[(x, y)]]

def taxicab(x, y):
    return max(abs(x), abs(y))

# Pathfinding variables
def cost_vars(num, public_static=False):
    s = ""
    if public_static:
        return f"public static int[] costs = new int[{num+1}];"
    else:
        vars = "\n".join(s + f"costs[{n}] = {1100*taxicab(*numbers[n])};" for n in range(num))
        vars += "\n" + s + f"costs[{num}] = Integer.MAX_VALUE;"
        return vars

def checked_vars(num, public_static=False):
    s = ""
    if public_static:
        s = "public static boolean "
    vars = "\n".join(s + f"toCheck{n} = false;" for n in range(num))
    return vars

#######################
### Encode Function ###
#######################

def encode(num):
    xs = set(x for x, y in locs)
    func = f"public static int encode(int x, int y) {{ switch(x) {{"
    for x in sorted(xs):
        ys = [y for z, y in locs if x == z]
        s = f"\n case {x}:\n"
        if len(ys) == 1:
            s += f"return {numbers[(x, ys[0])]};"
        else:
            s += f"\nswitch(y) {{"
            for y in sorted(ys):
                s += f"\ncase {y}: return {numbers[(x, y)]};"
            s += f"\n}}"
        func += s
    func += f"\ndefault: return {num};}}}}"
    return func

def decode(num):
    xs = set(x for x, y in locs)
    func = f"public static int[] decode(int encoded) {{ switch(encoded) {{"
    for n in range(num):
        func += f"case {n}: return new int[] {{ {numbers[n][0]}, {numbers[n][1]} }};"
    func += f"\ndefault: return new int[] {{ 0, 0 }};}}}}"
    return func


######################
### Reset Function ###
######################

"""
public static void reset(RobotController rc) throws GameActionException {
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
            cooldowns[encoded] = (int) (cooldown * info.getCooldownMultiplier(myTeam));
            currents[encoded] = info.getCurrentDirection();
            toCheck[encoded] = rc.senseRobotAtLocation(loc) == null;
        } else {
            cooldowns[encoded] = 100000;
        }
    }
}
"""

def get_to_check(num):
    func = """public static boolean getToCheck(int encoded) {
        switch(encoded) {
            """
    for n in range(num):
        func += f"\ncase {n}: return toCheck{n};"
    func += "default:return false;}}"
    return func

def set_to_check(num):
    func = """public static void setToCheck(int encoded) {
        switch(encoded) {
            """
    for n in range(num):
        func += f"\ncase {n}: toCheck{n} = true; break;"
    func += "default:}}"
    return func

def set_checked(num):
    func = """public static void setChecked(int encoded) {
        switch(encoded) {
            """
    for n in range(num):
        func += f"\ncase {n}: toCheck{n} = false; break;"
    func += "default:}}"
    return func

def actual_cooldown(num):
    return """public static int actualCooldown(RobotController rc) {
        RobotType type = rc.getType();
        if (type == RobotType.CARRIER) {
            return (int) (GameConstants.CARRIER_MOVEMENT_INTERCEPT
                    + GameConstants.CARRIER_MOVEMENT_SLOPE * rc.getWeight());
        } else {
            return type.movementCooldown;
        }
    }"""

def reset(num):
    func = f"""public static void reset(RobotController rc, MapLocation goalLocation) throws GameActionException{{
        color = 0;
        MapLocation startLocation = rc.getLocation();
        int startLocationX = startLocation.x;
        int startLocationY = startLocation.y;
        Team myTeam = rc.getTeam();
        int cooldown = actualCooldown(rc);

        dest = new boolean[121];

        int dx = goalLocation.x - startLocationX;
        int dy = goalLocation.y - startLocationY;
        while(dx > 64 || dx < -64 || dy > 64 || dy < -64) {{
            dx /= 2;
            dy /= 2;
        }}
        int[] diff;
        if (rc.senseMapInfo(startLocation).hasCloud()) {{
            addNearestSmall(dx, dy);
            diff = nearestSmall(dx, dy);
        }} else {{
            addNearest(dx, dy);
            diff = nearest(dx, dy);
        }}
        MapLocation nearLocation = startLocation.translate(diff[0], diff[1]);

        queueHead = 0;

        {checked_vars(num)}
        {cost_vars(num)}

        MapInfo[] infos = rc.senseNearbyMapInfos(nearLocation, 1+nearLocation.distanceSquaredTo(startLocation));

        MapInfo info;
        int encoded;
        switch(infos.length) {{
            default:
            """
    s = """
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMultiplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }"""
    for n in range(num, 0, -1):
        func += f"\ncase {n}:\ninfo = infos[{n-1}];" + s
    
    func +=f"""case 0:
    }}
}}"""
    return func

def add_destinations(num):
    return """public static void addDestinations(int[][] diffs) {
        for (int[] d : diffs) {
            dest[encode(d[0], d[1])] = true;
        }
    }"""

#########################
### Dijkstra Function ###
#########################

def move_with_current(num):
    func = """public static int moveWithCurrent(int encoded) {
        switch(encoded) {"""
    for n in range(num):
        func += f"""
        case {n}:
            if(currents[{n}] == null) {{return -1;}}
            switch(currents[{n}]) {{"""
        for (dx, dy), dir in dict_dirs.items():
            x = numbers[n][0] + dx
            y = numbers[n][1] + dy
            if (x, y) in numbers:
                func += f"""
                case {dir}: return {numbers[(x, y)]};"""
        func += "\ndefault:}"
    func += "\ndefault: return -1;}}"
    return func

def translate_dir(num):
    func = """public static int translateDir(int encoded, Direction dir) {
        switch(encoded) {"""
    for n in range(num):
        func += f"""
        case {n}:
            switch(dir) {{"""
        for (dx, dy), dir in dict_dirs.items():
            x = numbers[n][0] + dx
            y = numbers[n][1] + dy
            if (x, y) in numbers:
                func += f"""
                case {dir}: return {numbers[(x, y)]};"""
        func += "\ndefault:}"
    func += "\ndefault: return -1;}}"
    return func

def dijkstra_sub(num, n_range, id):
    func = f"""public static int dijkstraSub{id}(RobotController rc, int n) {{"""
    func += f"""int cost; switch(n) {{"""
    for n in n_range:
        func += f"""case {n}:
        cost=costs[{n}];"""
        for m in neighbor_nums(n):
            dx = numbers[m][0] - numbers[n][0]
            dy = numbers[m][1] - numbers[n][1]
            d = f"Direction.{dict_dirs[(dx, dy)]}"
            func += f"""if(toCheck{m}){{//debugPoint({m}, rc);
                if(currents[{m}]!=Direction.CENTER&&cost%10+cooldowns[{m}]>9) {{
                    if (cost%10>0&&cooldowns[{m}]<10&&currents[{n}]==Direction.CENTER) {{
                        costs[{m}] = cooldowns[{m}]+(cost+9)/10*10;
                        dirs[{m}] = {d};
                        wait[{m}] = true;
                        currented[{m}] = null;
                        setChecked({m});

                        if (dest[{m}]) return {m};

                        addToQueue({m});
                    }}
                    //debugPoint({m}, rc);
                    int currentTile = moveWithCurrent({m});
                    if (getToCheck(currentTile)) {{
                        costs[currentTile] = cost + cooldowns[{m}];
                        dirs[currentTile] = currents[{m}];
                        currented[currentTile] = {d};
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }}
                }} else {{
                    costs[{m}] = cost + cooldowns[{m}];
                    dirs[{m}] = {d};
                    currented[{m}] = null;
                    wait[{m}] = false;
                    setChecked({m});

                    if (dest[{m}]) return {m};

                    addToQueue({m});
                }}
            }}
            """
        func += "break;"
    func += f"""
        }}
    return -1;
    }}
    """
    return func

def dijkstra(num):
    func = f"""public static int dijkstra(RobotController rc) {{
        int cost = rc.getMovementCooldownTurns();
        if (cost >= 10) {{
            return -1;
        }}

        costs[{numbers[(0, 0)]}] = cost;
        addToQueue({numbers[(0, 0)]});
        toCheck{numbers[(0, 0)]} = false;

        int currentTile;

        while(queueHead > 0) {{
            int ret;
            switch(popFromQueue()) {{
                """
    groups = 5
    start = ""
    for i in range(groups+1):
        n_range = range(num // groups * i, min(num, num // groups * (i+1)))
        start += dijkstra_sub(num, n_range, i)
        for n in n_range:
            func += f"case {n}: ret = dijkstraSub{i}(rc, {n});\nbreak;\n"
    func += f"default: ret=-1;"
    func += "} if (ret >= 0) return ret; } return -1; }"
    func = start + func

    # func = func.replace("\n", "")
    # func = func.replace("\t", "")
    # for i in range(100):
    #     func = func.replace("  ", " ")
    # for c in r"(){}[]-+/%*=!;":
    #     func = func.replace(" "+c, c)
    #     func = func.replace(c+" ", c)
    
    return func

def reconstruct_path(num):
    return f"""public static Direction[] reconstructPath(int dest) {{
        if (dest == -1) {{
            return null;
        }}

        int start = {numbers[(0, 0)]};
        Direction[] path = new Direction[100];
        int i = 0;
        while (dest != start) {{
            Direction dir = dirs[dest];
            if (currented[dest] == null || currents[translateDir(dest, dir.opposite())] == Direction.CENTER) {{
                path[i] = dir;
                if (wait[dest]) {{
                    i++;
                    path[i] = Direction.CENTER;
                }}
            }} else {{
                path[i] = currented[dest];
                if (wait[dest]) {{
                    i++;
                    path[i] = Direction.CENTER;
                }}
                dest = translateDir(dest, currented[dest].opposite());
            }}

            i++;
            dest = translateDir(dest, dir.opposite());
        }}

        // fix order of path
        Direction[] ordered = new Direction[i];
        for (int j = i; --j >= 0;) {{
            ordered[j] = path[i - j - 1];
        }}
        return ordered;
    }}
    """

#######################
### Queue Functions ###
#######################


# number of elements in queue
queue_length = len(locs)

# variable generator
def queue_vars(num, public_static=False):
    s = ""
    if public_static:
        s = "public static int "
    
    vars = s + "queueHead = 0;\n"
    vars += "\n".join(s + f"queue{n} = {num};" for n in range(num))
    return vars
    

# binary tree helpers
def left(n):
    return 2 * n + 1
def right(n):
    return 2 * n + 2
def parent(n):
    return (n - 1) // 2

# addToQueue generator
"""
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
"""

def add_nest(n):
    if n == 0:
        return "queue0 = n;"
    return f"""if(costs[queue{parent(n)}] > cost) {{
        queue{n} = queue{parent(n)};
        {add_nest(parent(n))}
    }} else {{
        queue{n} = n;
    }}"""

def queue_add(num):
    s = f"""public static void addToQueue(int n) {{
    int cost = costs[n];
    switch(queueHead) {{"""
    for n in range(num):
        s += f"""\ncase {n}:
    {add_nest(n)}
    break;"""
    s += f"""\ndefault:
    {add_nest(num - 1)}
    break;"""
    s += f"}}queueHead++;}}"
    return s

# Pop from queue
"""
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
"""

def pop_nest(root, num):
    if(left(root) >= num):
        return f"queue{root} = replace;"
    return f"""    if(costs[queue{left(root)}] < costs[queue{right(root)}]) {{
        if(costs[queue{left(root)}] < replaceCost) {{
            queue{root} = queue{left(root)};
            {pop_nest(left(root), num)}
        }} else {{
            queue{root} = replace;
        }}
    }} else {{
        if(costs[queue{right(root)}] < replaceCost) {{
            queue{root} = queue{right(root)};
            {pop_nest(right(root), num)}
        }} else {{
            queue{root} = replace;
        }}
    }}
    """

def queue_pop(num):
    func = """public static int popFromQueue() {
    int index = queue0;
    queueHead--;
    int replace, replaceCost;
    switch (queueHead) {"""
    for n in range(num):
        func += f"""
        case {n}: 
            replace = queue{n};
            replaceCost = costs[queue{n}];
            queue0 = {num};
            break;"""
    func += f"""
        default:
			replace = queue{num-1};
			replaceCost = costs[queue{num-1}];
			queue{num-1} = {num};"""
    func += "}"
    func += pop_nest(0, num) + "return index;\n}"
    return func

########################################
### Nearest taxicab distance to goal ###
########################################

def nearest_sub(x, id):
    func = f"""public static void addNearestSub{id}(int y) {{
        switch (y) {{
            """
    for y in range(-64, 65):
        func += f"""
        case {y}:"""
        best_val = 1000000
        best = []
        for dx, dy in locs:
            t = taxicab(x - dx, y - dy)
            if t < best_val:
                best_val = t
                best = [(dx, dy)]
            elif t == best_val:
                best.append((dx, dy))
        
        for dx, dy in best:
            func += f"""dest[{numbers[(dx, dy)]}]=true; toCheck{numbers[(dx, dy)]}=true;"""
        func += "break;"
    func += f"default:}}}}"
    return func

def nearest_sub_small(x, id):
    func = f"""public static void addNearestSubSmall{id}(int y) {{
        switch (y) {{
            """
    for y in range(-64, 65):
        func += f"""
        case {y}:"""
        best_val = 1000000
        best = []
        for dx, dy in locs:
            if dx**2 + dy**2 > 4:
                continue
            t = taxicab(x - dx, y - dy)
            if t < best_val:
                best_val = t
                best = [(dx, dy)]
            elif t == best_val:
                best.append((dx, dy))
        for dx, dy in best:
            func += f"""dest[{numbers[(dx, dy)]}]=true; toCheck{numbers[(dx, dy)]}=true;"""
        func += "break;"
    func += f"default:}}}}"
    return func

def nearest(num):
    func = ""
    for i, x in enumerate(range(-64, 65)):
        func += nearest_sub(x, i)
    func += f"""public static void addNearest(int x, int y) {{
        switch(x) {{
        """
    for i, x in enumerate(range(-64, 65)):
        func += f"""
        case {x}: addNearestSub{i}(y); break;"""
    func += f"default:}}}}"
    return func

def nearest_small(num):
    func = ""
    for i, x in enumerate(range(-64, 65)):
        func += nearest_sub_small(x, i)
    func += f"""public static void addNearestSmall(int x, int y) {{
        switch(x) {{
        """
    for i, x in enumerate(range(-64, 65)):
        func += f"""
        case {x}: addNearestSubSmall{i}(y); break;"""
    func += f"default:}}}}"
    return func

####################################
### Nearest r^2 distance to goal ###
####################################

def radius_squared(x, y):
    return x**2 + y**2

def single_nearest_sub(x, id):
    func = f"""public static int[] nearestSub{id}(int y) {{
        switch (y) {{
            """
    for y in range(-64, 65):
        func += f"""
        case {y}:"""
        best_val = 1000000
        best = None
        for dx, dy in locs:
            t = radius_squared(x - dx, y - dy)
            if t < best_val:
                best_val = t
                best = (dx, dy)
        func += f"""return new int[] {{ {best[0]}, {best[1]} }};"""
    func += f"\ndefault: return new int[] {{ 0, 0 }};}}}}"
    return func

def single_nearest_sub_small(x, id):
    func = f"""public static int[] nearestSubSmall{id}(int y) {{
        switch (y) {{
            """
    for y in range(-64, 65):
        func += f"""
        case {y}:"""
        best_val = 1000000
        best = None
        for dx, dy in locs:
            if radius_squared(dx, dy)>4:
                continue
            t = radius_squared(x - dx, y - dy)
            if t < best_val:
                best_val = t
                best = (dx, dy)
        func += f"""return new int[] {{ {best[0]}, {best[1]} }};"""
    func += f"\ndefault: return new int[] {{ 0, 0 }};}}}}"
    return func

def single_nearest(num):
    func = ""
    for i, x in enumerate(range(-64, 65)):
        func += single_nearest_sub(x, i)
    func += f"""public static int[] nearest(int x, int y) {{
        switch(x) {{
        """
    for i, x in enumerate(range(-64, 65)):
        func += f"""
        case {x}: return nearestSub{i}(y);"""
    func += f"\ndefault: return new int[] {{ 0, 0 }};}}}}"
    return func

def single_nearest_small(num):
    func = ""
    for i, x in enumerate(range(-64, 65)):
        func += single_nearest_sub_small(x, i)
    func += f"""public static int[] nearestSmall(int x, int y) {{
        switch(x) {{
        """
    for i, x in enumerate(range(-64, 65)):
        func += f"""
        case {x}: return nearestSubSmall{i}(y);"""
    func += f"\ndefault: return new int[] {{ 0, 0 }};}}}}"
    return func



#### Debugging
def debug_point(num):
    return """public static void debugPoint(int enc, RobotController rc) {
        int[] diff = decode(enc);
        rc.setIndicatorDot(rc.getLocation().translate(diff[0], diff[1]), color, color, color);
        color += 10;
    }"""

###########################
### Putting it together ###
###########################

def all_together(num, package_name):
    class_string = f"""package {package_name};

import battlecode.common.*;
public class Pather {{
    public static int color = 0;
    public static int[] cooldowns = new int[{num}];
    public static Direction[] currents = new Direction[{num}];
    public static Direction[] currented = new Direction[{num}];
    public static boolean[] dest = new boolean[{num}];
    public static Direction[] dirs = new Direction[{num}];
    public static boolean[] wait = new boolean[{num}];

    {cost_vars(num, public_static=True)}
    {checked_vars(num, public_static=True)}

    {queue_vars(num, public_static=True)}
    """

    for method in [encode, add_destinations, get_to_check, set_to_check, set_checked, actual_cooldown, nearest, nearest_small, single_nearest, single_nearest_small, reset, move_with_current, translate_dir, dijkstra, reconstruct_path, queue_add, queue_pop, decode, debug_point]:
        class_string += method(num)
    return class_string + "}"

print(all_together(len(locs), "firstbot.navigation"))