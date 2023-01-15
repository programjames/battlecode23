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

s = f"""package firstbot.coordination;

/* Finds out specific info about the minimap given the chunks array.
 * Current methods:
 * - nearestEnemyChunk(int chunkIndex) // Finds the nearest chunk with an enemy given your location's chunk index. Returns -1 if no known enemy chunks.
*/

import battlecode.common.*;

public class MinimapInfo {{
    {make_nearest_enemy_chunk()}
}}"""

print(s)
