ENEMY_FIGHTERS = ["CARRIER", "LAUNCHER", "DESTABILIZER"]
FRIENDLY_FIGHTERS = ["LAUNCHER"]
TOTAL_POSSIBLE = 69

def switch_enemy_piece(i):
    s = ""
    for type in ENEMY_FIGHTERS:
        s += f"\ncase {type}: "
    s += f"""dx += pos.x - enemies[{i}].location.x;
            dy += pos.y - enemies[{i}].location.y;"""
    s += "default:"
    return s

def switch_friendly_piece(i):
    s = ""
    for type in FRIENDLY_FIGHTERS:
        s += f"\ncase {type}: "
    s += f"""dx += pos.x - friends[{i}].location.x;
            dy += pos.y - friends[{i}].location.y;"""
    s += "default:"
    return s

def run_away():
    func = f"""public MapLocation runAwayLocation() throws GameActionException {{
        int dx = 0;
        int dy = 0;
        switch(enemies.length) {{ default:
            """
    
    for i in range(TOTAL_POSSIBLE-1, -1, -1):
        func += f"""case {i+1}: switch(enemies[{i}].type) {{{switch_enemy_piece(i)}
        }}"""
    func += f"case 0: }} switch(friends.length) {{ default:"
    for i in range(TOTAL_POSSIBLE-1, -1, -1):
        func += f"""case {i+1}: switch(friends[{i}].type) {{{switch_friendly_piece(i)}
        }}"""
    func += f"case 0: }} return pos.translate(dx, dy);}}"
    return func

def switch_friendly_piece(i):
    s = ""
    for type in FRIENDLY_FIGHTERS:
        s += f"\ncase {type}: "
    s += f"""dx += pos.x - friends[{i}].location.x;
            dy += pos.y - friends[{i}].location.y;"""
    s += "default:"
    return s

def switch_spread_out_piece(i):
    s = ""
    for type in ["LAUNCHER", "BOOSTER"]:
        s += f"\ncase {type}: "
    s += f"""
            dx += pos.x - friends[{i}].location.x;
            dy += pos.y - friends[{i}].location.y;"""
    s += f"""default:
            dx -= pos.x - friends[{i}].location.x;
            dy -= pos.y - friends[{i}].location.y;"""
    return s

def spread_out():
    func = f"""
    // Spreads out from friendly units while remaining near boosters and launchers.
    public MapLocation safeSpreadOutLocation() throws GameActionException {{
        int dx = 0;
        int dy = 0;
        switch(friends.length) {{ default:
            """
    
    for i in range(TOTAL_POSSIBLE-1, -1, -1):
        func += f"""case {i+1}: switch(friends[{i}].type) {{{switch_spread_out_piece(i)}
        }}"""
    func += f"case 0: }} return pos.translate(dx, dy);}}"
    return func

print(spread_out())