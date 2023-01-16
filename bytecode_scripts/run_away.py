ENEMY_FIGHTERS = ["CARRIER", "LAUNCHER", "DESTABILIZER"]
FRIENDLY_FIGHTERS = ["LAUNCHER"]
TOTAL_POSSIBLE = 69

def switch_enemy_piece(i):
    s = ""
    for type in ENEMY_FIGHTERS:
        s += f"\ncase {type}: "
    s += f"""
            loc = loc.add(enemies[{i}].location.directionTo(loc));"""
    s += "default:"
    return s

def switch_friendly_piece(i):
    s = ""
    for type in FRIENDLY_FIGHTERS:
        s += f"\ncase {type}: "
    s += f"""
            loc = loc.add(loc.directionTo(friends[{i}].location));"""
    s += "default:"
    return s

def run_away():
    func = f"""public MapLocation runAwayLocation() throws GameActionException {{
        MapLocation loc = pos;
        switch(enemies.length) {{ default:
            """
    
    for i in range(TOTAL_POSSIBLE-1, -1, -1):
        func += f"""case {i+1}: switch(enemies[{i}].type) {{{switch_enemy_piece(i)}
        }}"""
    func += f"case 0: }} switch(friends.length) {{ default:"
    for i in range(TOTAL_POSSIBLE-1, -1, -1):
        func += f"""case {i+1}: switch(friends[{i}].type) {{{switch_friendly_piece(i)}
        }}"""
    func += f"case 0: }} return loc;}}"
    return func

def switch_friendly_piece2(i):
    return f"case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[{i}].location));"

def booster_move_location():
    func = f"""private MapLocation boosterMoveLocation() throws GameActionException {{
        MapLocation loc = pos;
        switch(enemies.length) {{ default:
            """
    
    for i in range(TOTAL_POSSIBLE-1, -1, -1):
        func += f"""case {i+1}: switch(enemies[{i}].type) {{{switch_enemy_piece(i)}
        }}"""
    func += f"case 0: }} switch(friends.length) {{ default:"
    for i in range(TOTAL_POSSIBLE-1, -1, -1):
        func += f"""case {i+1}: switch(friends[{i}].type) {{{switch_friendly_piece2(i)}
        }}"""
    func += f"case 0: }} return loc;}}"
    return func

def switch_spread_out_piece(i):
    s = ""
    for type in ["BOOSTER", "LAUNCHER", "CARRIER"]:
        s += f"\ncase {type}: "
    s += f"""
            loc = loc.add(loc.directionTo(friends[{i}].location));"""
    s += f"""default:
            loc = loc.add(friends[{i}].location.directionTo(loc));"""
    return s

def spread_out():
    func = f"""
    // Spreads out from friendly units while remaining near boosters, launchers and carriers.
    public MapLocation safeSpreadOutLocation() throws GameActionException {{
        MapLocation loc = pos;
        switch(friends.length) {{ default:
            """
    
    for i in range(TOTAL_POSSIBLE-1, -1, -1):
        func += f"""case {i+1}: switch(friends[{i}].type) {{{switch_spread_out_piece(i)}
        }}"""
    func += f"case 0: }} return loc;}}"
    return func

print(booster_move_location())