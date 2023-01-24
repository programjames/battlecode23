from make_minimap_functions import xy_to_chunk

chunk_centers = dict()
for x in range(2, 60, 5):
    for y in range(2, 60, 5):
        chunk = xy_to_chunk(x, y)
        chunk_centers[chunk] = (x, y)

def r2(c1, c2):
    return (c1[0]-c2[0])**2 + (c1[1]-c2[1])**2

ENEMY_BIT = 1
def make_nearest_enemy_chunk():
    funcs = """public static int nearestEnemyChunk (int chunk, int[] chunks) {
        switch(chunk) {"""
    for id, chunk in enumerate(chunk_centers.keys()):
        funcs += f"\ncase {chunk}: return nearestEnemyChunkSub{id}(chunks);"
    funcs += f"}}\nreturn nearestEnemyChunkSub0(chunks);}}"
    for id, chunk in enumerate(chunk_centers.keys()):
        center = chunk_centers[chunk]
        chunks = sorted(chunk_centers.keys(), key=lambda c: r2(chunk_centers[c], center))
        func = f"private static int nearestEnemyChunkSub{id} (int[] chunks) {{"
        for c in chunks:
            func += f"\nif ((chunks[{c}] & {ENEMY_BIT}) == 1) return {c};"
        func += f"\nreturn -1;}}"
        funcs += "\n" + func
    return funcs


WELL_BIT = 0b10
def make_nearest_well_chunk():
    funcs = """public static int nearestWellChunk (int chunk, int[] chunks) {
        switch(chunk) {"""
    for id, chunk in enumerate(chunk_centers.keys()):
        funcs += f"\ncase {chunk}: return nearestWellChunkSub{id}(chunks);"
    funcs += f"}}\nreturn nearestWellChunkSub0(chunks);}}"
    for id, chunk in enumerate(chunk_centers.keys()):
        center = chunk_centers[chunk]
        chunks = sorted(chunk_centers.keys(), key=lambda c: r2(chunk_centers[c], center))
        func = f"private static int nearestWellChunkSub{id} (int[] chunks) {{"
        for c in chunks:
            func += f"\nif ((chunks[{c}] & {WELL_BIT}) != 0) return {c};"
        func += f"\nreturn -1;}}"
        funcs += "\n" + func
    return funcs

ENEMY_WELL_BITS = 0b11
def make_nearest_enemy_well_chunk():
    funcs = """public static int nearestEnemyWellChunk (int chunk, int[] chunks) {
        switch(chunk) {"""
    for id, chunk in enumerate(chunk_centers.keys()):
        funcs += f"\ncase {chunk}: return nearestEnemyWellChunkSub{id}(chunks);"
    funcs += f"}}\nreturn nearestEnemyWellChunkSub0(chunks);}}"
    for id, chunk in enumerate(chunk_centers.keys()):
        center = chunk_centers[chunk]
        chunks = sorted(chunk_centers.keys(), key=lambda c: r2(chunk_centers[c], center))
        func = f"private static int nearestEnemyWellChunkSub{id} (int[] chunks) {{"
        for c in chunks:
            func += f"\nif ((chunks[{c}] & {ENEMY_WELL_BITS}) == {ENEMY_WELL_BITS}) return {c};"
        func += f"\nreturn -1;}}"
        funcs += "\n" + func
    return funcs


WELL_BIT = 0b10
def make_nearest_well_chunk_other():
    funcs = """public static int nearestWellChunkOther (int chunk, int[] chunks) {
        switch(chunk) {"""
    for id, chunk in enumerate(chunk_centers.keys()):
        funcs += f"\ncase {chunk}: return nearestWellChunkOtherSub{id}(chunks);"
    funcs += f"}}\nreturn nearestWellChunkOtherSub0(chunks);}}"
    for id, chunk in enumerate(chunk_centers.keys()):
        center = chunk_centers[chunk]
        chunks = sorted(chunk_centers.keys(), key=lambda c: float('inf') if c == chunk else r2(chunk_centers[c], center))
        func = f"private static int nearestWellChunkOtherSub{id} (int[] chunks) {{"
        for c in chunks:
            func += f"\nif ((chunks[{c}] & {WELL_BIT}) != 0) return {c};"
        func += f"\nreturn -1;}}"
        funcs += "\n" + func
    return funcs

def switch_mark_enemies(i):
    s = ""
    for type in ["AMPLIFIER", "HEADQUARTERS"]:
        s += f"\ncase {type}: "
    s += "break;"
    s += f"""default:
            minimap.markEnemy(enemies[{i}]);"""
    return s

def make_mark_enemies():
    func = f"""
    // Marks enemies, ignoring amplifiers and HQs.
    public static void markEnemies(Minimap minimap, RobotInfo[] enemies) throws GameActionException {{
        int dx = 0;
        int dy = 0;
        switch(enemies.length) {{ default:
            """
    
    for i in range(68, -1, -1):
        func += f"""case {i+1}: switch(enemies[{i}].type) {{{switch_mark_enemies(i)}
        }}"""
    func += f"case 0: }} }}"
    return func

ISLAND_BITS = 0b1100
def make_nearest_unclaimed_island_chunk():
    funcs = """public static int nearestUnclaimedIslandChunk (int chunk, int[] chunks) {
        switch(chunk) {"""
    for id, chunk in enumerate(chunk_centers.keys()):
        funcs += f"\ncase {chunk}: return nearestUnclaimedIslandChunkSub{id}(chunks);"
    funcs += f"}}\nreturn nearestUnclaimedIslandChunkSub0(chunks);}}"
    for id, chunk in enumerate(chunk_centers.keys()):
        center = chunk_centers[chunk]
        chunks = sorted(chunk_centers.keys(), key=lambda c: r2(chunk_centers[c], center))
        func = f"private static int nearestUnclaimedIslandChunkSub{id} (int[] chunks) {{"
        for c in chunks:
            func += f"""\nswitch (chunks[{c}] & {ISLAND_BITS}){{
                case 0b0100: return {c};
                default:
            }}"""
        func += f"\nreturn -1;}}"
        funcs += "\n" + func
    return funcs

ISLAND_BITS = 0b1100
def make_nearest_enemy_island_chunk():
    funcs = """public static int nearestEnemyIslandChunk (int chunk, int[] chunks) {
        switch(chunk) {"""
    for id, chunk in enumerate(chunk_centers.keys()):
        funcs += f"\ncase {chunk}: return nearestEnemyIslandChunkSub{id}(chunks);"
    funcs += f"}}\nreturn nearestEnemyIslandChunkSub0(chunks);}}"
    for id, chunk in enumerate(chunk_centers.keys()):
        center = chunk_centers[chunk]
        chunks = sorted(chunk_centers.keys(), key=lambda c: r2(chunk_centers[c], center))
        func = f"private static int nearestEnemyIslandChunkSub{id} (int[] chunks) {{"
        for c in chunks:
            func += f"""\nswitch (chunks[{c}] & {ISLAND_BITS}){{
                case 0b1100: return {c};
                default:
            }}"""
        func += f"\nreturn -1;}}"
        funcs += "\n" + func
    return funcs

UNFRIENDLY_ISLAND_BIT = 0b0100
def make_nearest_unfriendly_island_chunk():
    funcs = """public static int nearestUnfriendlyIslandChunk (int chunk, int[] chunks) {
        switch(chunk) {"""
    for id, chunk in enumerate(chunk_centers.keys()):
        funcs += f"\ncase {chunk}: return nearestUnfriendlyIslandChunkSub{id}(chunks);"
    funcs += f"}}\nreturn nearestUnfriendlyIslandChunkSub0(chunks);}}"
    for id, chunk in enumerate(chunk_centers.keys()):
        center = chunk_centers[chunk]
        chunks = sorted(chunk_centers.keys(), key=lambda c: r2(chunk_centers[c], center))
        func = f"private static int nearestUnfriendlyIslandChunkSub{id} (int[] chunks) {{"
        for c in chunks:
            func += f"""if ((chunks[{c}] & {UNFRIENDLY_ISLAND_BIT}) != 0) return {c};"""
        func += f"\nreturn -1;}}"
        funcs += "\n" + func
    return funcs

FRIENDLY_ISLAND_BIT = 0b1000
def make_nearest_friendly_island_chunk():
    funcs = """public static int nearestFriendlyIslandChunk (int chunk, int[] chunks) {
        switch(chunk) {"""
    for id, chunk in enumerate(chunk_centers.keys()):
        funcs += f"\ncase {chunk}: return nearestFriendlyIslandChunkSub{id}(chunks);"
    funcs += f"}}\nreturn nearestFriendlyIslandChunkSub0(chunks);}}"
    for id, chunk in enumerate(chunk_centers.keys()):
        center = chunk_centers[chunk]
        chunks = sorted(chunk_centers.keys(), key=lambda c: r2(chunk_centers[c], center))
        func = f"private static int nearestFriendlyIslandChunkSub{id} (int[] chunks) {{"
        for c in chunks:
            func += f"""if ((chunks[{c}] & {ISLAND_BITS}) == {FRIENDLY_ISLAND_BIT}) return {c};"""
        func += f"\nreturn -1;}}"
        funcs += "\n" + func
    return funcs


s = f"""package fourthbot.coordination;

/* Finds out specific info about the minimap given the chunks array.
 * Current methods:
 * - nearestEnemyChunk(int chunk, int[] chunks) // Finds the nearest chunk with an enemy given your location's chunk index. Returns -1 if no known enemy chunks.
 * - nearestWellChunk(int chunk, int[] chunks) // Finds the nearest chunk with a well given your location's chunk index. Places your current chunk at the front of the line.
                                      // Returns -1 if no known well chunks.
 * - nearestWellChunkOther(int chunk, int[] chunks) // Finds the nearest chunk with a well given your location's chunk index. Places your current chunk at the back of the line.
                                      // Returns -1 if no known well chunks.
 * - markEnemies(Minimap minimap, RobotInfo[] enemies) // Marks enemies, ignoring amplifiers and headquarters.
 * - nearestUnclaimedIslandChunk(int chunk, int[] chunks) // Nearest island unclaimed by either team.
 * - nearestUnfriendlyIslandChunk(int chunk, int[] chunks) // Nearest island claimed by no one or the enemy.
 * - nearestEnemyIslandChunk(int chunk, int[] chunks) // Nearest island claimed by the enemy.
 * - nearestEnemyWellChunk(int chunk, int[] chunks) // Nearest well with an enemy presence.
*/

import battlecode.common.*;

public class MinimapInfo {{
    {make_nearest_enemy_chunk()}
    {make_mark_enemies()}
    {make_nearest_well_chunk()}
    {make_nearest_well_chunk_other()}
    {make_nearest_unclaimed_island_chunk()}
    {make_nearest_unfriendly_island_chunk()}
    {make_nearest_friendly_island_chunk()}
    {make_nearest_enemy_island_chunk()}
    {make_nearest_enemy_well_chunk()}
}}"""

print(s)
