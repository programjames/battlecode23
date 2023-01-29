# Game constants
radius = 9 #int(input("What is the radius squared? "))
# directions = [(-1, 0), (-1, 1), (0, 1), (1, 1), (1, 0), (1, -1), (0, -1), (-1, -1)] # clockwise from WEST
directions = [(-1, 0), (0, 1), (1, 0), (0, -1), (1, -1), (-1, -1), (-1, 1), (1, 1)] # More direct
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

# BFS variables
def checked_vars(num, public_static=False):
    s = ""
    if public_static:
        s = "public static boolean "
    vars = "\n".join(s + f"toCheck{n} = true;" for n in range(num))
    return vars

#########################
### BFS Function      ###
#########################

def bfs(num):
    func = f"""public static boolean bfs(RobotController rc, RobotType buildType, MapLocation goalLocation) throws GameActionException {{
        if (rc.getActionCooldownTurns() >= 10) {{
            return false;
        }}

        queueLeft = 0;
        queueRight = 0;
        {checked_vars(num)}

        MapLocation startLocation = rc.getLocation();

        int dx = goalLocation.x - startLocation.x;
        int dy = goalLocation.y - startLocation.y;
        while(dx > 64 || dx < -64 || dy > 64 || dy < -64) {{
            dx /= 2;
            dy /= 2;
        }}

        if (rc.senseCloud(startLocation)) {{
            addNearestSmall(dx, dy);
        }} else {{
            addNearest(dx, dy);
        }}

        while(queueRight > queueLeft) {{
            switch(popFromQueue()) {{
                """
    for n in range(num):
        func += f"""case {n}:
            toCheck{n} = false;
            if (rc.canBuildRobot(buildType, startLocation.translate({numbers[n][0]}, {numbers[n][1]}))) {{
                rc.buildRobot(buildType, startLocation.translate({numbers[n][0]}, {numbers[n][1]}));
                return true;
            }}
        """
        for m in neighbor_nums(n):
            x, y = numbers[m]
            func += f"""if (toCheck{m}) {{
                addToQueue({m});
            }}"""
        func += "break;"
    
    func += f"default: continue;"
    func += f"}} }} return false; }}"
    
    return func

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
    
    vars = f"{s}queueLeft = 0;\n {s}queueRight = 0;\n"
    vars += "\n".join(s + f"queue{n} = {num};" for n in range(num))
    return vars

def queue_add(num):
    s = f"""public static void addToQueue(int n) {{
    switch(queueRight++) {{"""
    for n in range(num):
        s += f"""\ncase {n}:
    queue{n} = n;
    break;"""
    s += f"""\ndefault:
    break;"""
    s += f"}}}}"
    return s

# Pop from queue

def queue_pop(num):
    s = f"""public static int popFromQueue() {{
    switch(queueLeft++) {{"""
    for n in range(num):
        s += f"""\ncase {n}:
    return queue{n};"""
    s += f"""\ndefault:
    return -1;"""
    s += f"}}}}"
    return s

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
            func += f"""addToQueue({numbers[(dx, dy)]});"""
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
            func += f"""addToQueue({numbers[(dx, dy)]});"""
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

###########################
### Putting it together ###
###########################

def all_together(num, package_name):
    class_string = f"""package {package_name};

import battlecode.common.*;
public class HqBuilder {{
    public static int color = 0;
    public static int[] cooldowns = new int[{num}];
    public static Direction[] currents = new Direction[{num}];
    public static Direction[] currented = new Direction[{num}];
    public static boolean[] dest = new boolean[{num}];
    public static Direction[] dirs = new Direction[{num}];
    public static boolean[] wait = new boolean[{num}];

    {checked_vars(num, public_static=True)}
    {queue_vars(num, public_static=True)}
    """

    for method in [bfs, queue_add, queue_pop, nearest, nearest_small]:
        class_string += method(num)
    return class_string + "}"

print(all_together(len(locs), "fourthbot.coordination"))