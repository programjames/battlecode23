package fourthbot.coordination;

import battlecode.common.*;

public class Minimap implements Module {
	/*
	 * The Minimap is a shrunk view of the entire map. Every block in the minimap
	 * represents a 5x5 chunk in the real map. Each block is encoded as 4 bits in
	 * shared memory. These bits, in order from most significant to least, are 1.
	 * I'm not sure? Maybe to mark an enemy HQ? 2. Does the chunk have an amplifier,
	 * friendly HQ, or anchored island? I.e. can we communicate on this chunk? 3.
	 * Does the chunk have a well? 4. Does the chunk have an enemy unit?
	 * 
	 * At most (60 / 5) * (60 / 5) * 4 = 576 bits are needed to store the entire
	 * minimap.
	 * 
	 * The 144 chunks are broken down into groups of 4 each that are updated
	 * together. The minimap occupies the first 36 integers of the shared array.\
	 * 
	 * The next 9 integers of the shared array are further used to track changes:
	 * They keep track of when groups of chunks were last updated.
	 */

	public static final int WELL_BIT = 0b0010;
	public static final int ENEMY_BIT = 0b0001;
	public static final int ISLAND_BITS = 0b1100; // 00 = no island, 01 = unoccupied, 10 = my island, 11 = enemy island

	int[] chunks = new int[144];
	int[] updateTimes = new int[36]; // When were the groups of chunks last updated?
	int[] remoteUpdateTimes = new int[36];

	RobotController rc;

	public Minimap(RobotController rc) {
		this.rc = rc;
	}

	public static MapLocation getChunkCenter(int index) {
		/*
		 * Given a chunk's index, return the MapLocation at the center of that chunk
		 */
		switch (index) {
		case 0: return new MapLocation(2, 2);  
		case 1: return new MapLocation(27, 7); 
		case 2: return new MapLocation(52, 12);
		case 3: return new MapLocation(17, 22);
		case 4: return new MapLocation(42, 27);
		case 5: return new MapLocation(7, 37); 
		case 6: return new MapLocation(32, 42);
		case 7: return new MapLocation(57, 47);
		case 8: return new MapLocation(22, 57);
		case 9: return new MapLocation(47, 2); 
		case 10: return new MapLocation(12, 12);
		case 11: return new MapLocation(37, 17);
		case 12: return new MapLocation(2, 27);
		case 13: return new MapLocation(27, 32);
		case 14: return new MapLocation(52, 37);
		case 15: return new MapLocation(17, 47);
		case 16: return new MapLocation(42, 52);
		case 17: return new MapLocation(7, 2);
		case 18: return new MapLocation(32, 7);
		case 19: return new MapLocation(57, 12);
		case 20: return new MapLocation(22, 22);
		case 21: return new MapLocation(47, 27);
		case 22: return new MapLocation(12, 37);
		case 23: return new MapLocation(37, 42);
		case 24: return new MapLocation(2, 52);
		case 25: return new MapLocation(27, 57);
		case 26: return new MapLocation(52, 2);
		case 27: return new MapLocation(17, 12);
		case 28: return new MapLocation(42, 17);
		case 29: return new MapLocation(7, 27);
		case 30: return new MapLocation(32, 32);
		case 31: return new MapLocation(57, 37);
		case 32: return new MapLocation(22, 47);
		case 33: return new MapLocation(47, 52);
		case 34: return new MapLocation(12, 2);
		case 35: return new MapLocation(37, 7);
		case 36: return new MapLocation(2, 17);
		case 37: return new MapLocation(27, 22);
		case 38: return new MapLocation(52, 27);
		case 39: return new MapLocation(17, 37);
		case 40: return new MapLocation(42, 42);
		case 41: return new MapLocation(7, 52);
		case 42: return new MapLocation(32, 57);
		case 43: return new MapLocation(57, 2);
		case 44: return new MapLocation(22, 12);
		case 45: return new MapLocation(47, 17);
		case 46: return new MapLocation(12, 27);
		case 47: return new MapLocation(37, 32);
		case 48: return new MapLocation(2, 42);
		case 49: return new MapLocation(27, 47);
		case 50: return new MapLocation(52, 52);
		case 51: return new MapLocation(17, 2);
		case 52: return new MapLocation(42, 7);
		case 53: return new MapLocation(7, 17);
		case 54: return new MapLocation(32, 22);
		case 55: return new MapLocation(57, 27);
		case 56: return new MapLocation(22, 37);
		case 57: return new MapLocation(47, 42);
		case 58: return new MapLocation(12, 52);
		case 59: return new MapLocation(37, 57);
		case 60: return new MapLocation(2, 7);
		case 61: return new MapLocation(27, 12);
		case 62: return new MapLocation(52, 17);
		case 63: return new MapLocation(17, 27);
		case 64: return new MapLocation(42, 32);
		case 65: return new MapLocation(7, 42);
		case 66: return new MapLocation(32, 47);
		case 67: return new MapLocation(57, 52);
		case 68: return new MapLocation(22, 2);
		case 69: return new MapLocation(47, 7);
		case 70: return new MapLocation(12, 17);
		case 71: return new MapLocation(37, 22);
		case 72: return new MapLocation(2, 32);
		case 73: return new MapLocation(27, 37);
		case 74: return new MapLocation(52, 42);
		case 75: return new MapLocation(17, 52);
		case 76: return new MapLocation(42, 57);
		case 77: return new MapLocation(7, 7);
		case 78: return new MapLocation(32, 12);
		case 79: return new MapLocation(57, 17);
		case 80: return new MapLocation(22, 27);
		case 81: return new MapLocation(47, 32);
		case 82: return new MapLocation(12, 42);
		case 83: return new MapLocation(37, 47);
		case 84: return new MapLocation(2, 57);
		case 85: return new MapLocation(27, 2);
		case 86: return new MapLocation(52, 7);
		case 87: return new MapLocation(17, 17);
		case 88: return new MapLocation(42, 22);
		case 89: return new MapLocation(7, 32);
		case 90: return new MapLocation(32, 37);
		case 91: return new MapLocation(57, 42);
		case 92: return new MapLocation(22, 52);
		case 93: return new MapLocation(47, 57);
		case 94: return new MapLocation(12, 7);
		case 95: return new MapLocation(37, 12);
		case 96: return new MapLocation(2, 22);
		case 97: return new MapLocation(27, 27);
		case 98: return new MapLocation(52, 32);
		case 99: return new MapLocation(17, 42);
		case 100: return new MapLocation(42, 47);
		case 101: return new MapLocation(7, 57);
		case 102: return new MapLocation(32, 2);
		case 103: return new MapLocation(57, 7);
		case 104: return new MapLocation(22, 17);
		case 105: return new MapLocation(47, 22);
		case 106: return new MapLocation(12, 32);
		case 107: return new MapLocation(37, 37);
		case 108: return new MapLocation(2, 47);
		case 109: return new MapLocation(27, 52);
		case 110: return new MapLocation(52, 57);
		case 111: return new MapLocation(17, 7);
		case 112: return new MapLocation(42, 12);
		case 113: return new MapLocation(7, 22);
		case 114: return new MapLocation(32, 27);
		case 115: return new MapLocation(57, 32);
		case 116: return new MapLocation(22, 42);
		case 117: return new MapLocation(47, 47);
		case 118: return new MapLocation(12, 57);
		case 119: return new MapLocation(37, 2);
		case 120: return new MapLocation(2, 12);
		case 121: return new MapLocation(27, 17);
		case 122: return new MapLocation(52, 22);
		case 123: return new MapLocation(17, 32);
		case 124: return new MapLocation(42, 37);
		case 125: return new MapLocation(7, 47);
		case 126: return new MapLocation(32, 52);
		case 127: return new MapLocation(57, 57);
		case 128: return new MapLocation(22, 7);
		case 129: return new MapLocation(47, 12);
		case 130: return new MapLocation(12, 22);
		case 131: return new MapLocation(37, 27);
		case 132: return new MapLocation(2, 37);
		case 133: return new MapLocation(27, 42);
		case 134: return new MapLocation(52, 47);
		case 135: return new MapLocation(17, 57);
		case 136: return new MapLocation(42, 2);
		case 137: return new MapLocation(7, 12);
		case 138: return new MapLocation(32, 17);
		case 139: return new MapLocation(57, 22);
		case 140: return new MapLocation(22, 32);
		case 141: return new MapLocation(47, 37);
		case 142: return new MapLocation(12, 47);
		case 143: return new MapLocation(37, 52);
		default: return null;}
	}

	public int[] getChunks() {
		return chunks;
	}

	public static int getChunkIndex(MapLocation location) {
		/*
		 * Get the chunk that a given location is in.
		 */
		return (location.x / 5 * 17 + location.y / 5 * 60) % 144;
	}

	public static int getChunkIndex(int x, int y) {
		return (x / 5 * 17 + y / 5 * 60) % 144;
	}

	public boolean hasEnemy(int chunkIndex) {
		return (chunks[chunkIndex] & ENEMY_BIT) == 1;
	}

	public int getChunk(int chunkIndex) {
		return chunks[chunkIndex];
	}

	public boolean isChunkVisible(int chunkIndex) {
		/*
		 * Is the chunk currently visible to an ally unit?
		 * 
		 * This uses the update times to test if the chunk has recently been updated
		 * (hence is probably visible)
		 */
		return updateTimes[chunkIndex / 4] > rc.getRoundNum() / 8 - 2;
	}

	public void markEnemy(RobotInfo enemy) {
		/*
		 * Mark an enemy on the minimap
		 */
		int index = getChunkIndex(enemy.location);
		if ((chunks[index] & ENEMY_BIT) == 0) {
			chunks[index] |= ENEMY_BIT;
			updateTimes[index / 4] = 1 + rc.getRoundNum() / 8;
		}
	}

	public void markEnemyLocation(MapLocation location) {
		/*
		 * Mark an enemy on the minimap
		 */
		int index = getChunkIndex(location);
		if ((chunks[index] & ENEMY_BIT) == 0) {
			chunks[index] |= ENEMY_BIT;
			updateTimes[index / 4] = 1 + rc.getRoundNum() / 8;
		}
	}

	public void markWell(WellInfo well) {
		/*
		 * Mark a well on the minimap
		 */
		int index = getChunkIndex(well.getMapLocation());
		if ((chunks[index] & WELL_BIT) == 0) {
			chunks[index] |= WELL_BIT;
			updateTimes[index / 4] = 1 + rc.getRoundNum() / 8;
		}
	}

	public void markIsland(MapLocation loc, Team team, Team myTeam) {
		/*
		 * Mark an island on the minimap
		 */
		int index = getChunkIndex(loc);
		int updateBits;
		if(team == Team.NEUTRAL || team == null) {
			updateBits = 0b0100;
		} else if(team == myTeam) {
			updateBits = 0b1000;
		} else {
			updateBits = 0b1100;
		}
		if ((chunks[index] & ISLAND_BITS) != updateBits) {
			chunks[index] &= 0b0011;
			chunks[index] |= updateBits;
			updateTimes[index / 4] = 1 + rc.getRoundNum() / 8;
		}
	}

	public void markClear(MapLocation location) {
		/*
		 * Mark that there are no enemies in a given chunk
		 */
		int index = getChunkIndex(location);
		if ((chunks[index] & ENEMY_BIT) != 0) {
			chunks[index] &= 0b1110;
			updateTimes[index / 4] = 1 + rc.getRoundNum() / 8;
		}
	}

	public void setChunk(int chunkIndex, int value) {
		/*
		 * Set a chunk to the given value. Value should be an integer between 0 and 15,
		 * inclusive. If `Value` is NOT in this range, things could get seriously messed
		 * up.
		 */
		if (chunks[chunkIndex] != value) {
			chunks[chunkIndex] = value;
			updateTimes[chunkIndex / 4] = 1 + rc.getRoundNum() / 8;
		}
	}

	@Override
	public void push() throws GameActionException {
		if (!rc.canWriteSharedArray(0, 0)) {
			// debug statement
			//System.out.println("Tried writing to the shared array when unable to");
			return; // We can't write so do nothing
		}
		for (int i = 0; i < 18; i++) {
			int left = 2 * i;
			int right = left + 1;
			int update = 0;
			if (updateTimes[left] > remoteUpdateTimes[left]) {
				// We have extra info on some chunks
				writeOut(left);
				update |= updateTimes[left] << 8;
			} else {
				update |= remoteUpdateTimes[left];
			}
			if (updateTimes[right] > remoteUpdateTimes[right]) {
				// We have extra info on some chunks
				writeOut(right);
				update |= updateTimes[right];
			} else {
				update |= remoteUpdateTimes[right];
			}
			if (update > 0) {
				rc.writeSharedArray(i, update);
			}
		}
	}
	
	public void pushIgnoreTimes() throws GameActionException {
		if (!rc.canWriteSharedArray(0, 0)) {
			// debug statement
			//System.out.println("Tried writing to the shared array when unable to");
			return; // We can't write so do nothing
		}
		for (int i = 0; i < 18; i++) {
			int left = 2 * i;
			int right = left + 1;
			int update = 0;
			writeOut(left);
			update |= updateTimes[left] << 8;
		
			writeOut(right);
			update |= updateTimes[right];
			
			if (update > 0) {
				rc.writeSharedArray(i, update);
			}
		}
	}

	@Override
	public void pull() throws GameActionException {
		int read;
		int leftUpdate, rightUpdate;
		for (int i = 0; i < 18; i++) {
			read = rc.readSharedArray(i);
			rightUpdate = read & 0b11111111;
			leftUpdate = (read >> 8) & 0b11111111;
			remoteUpdateTimes[2 * i] = leftUpdate;
			remoteUpdateTimes[2 * i + 1] = rightUpdate;
			if (leftUpdate > updateTimes[2 * i]) {
				updateTimes[2 * i] = rightUpdate;
				readIn(2 * i);
			}
			if (rightUpdate > updateTimes[2 * i + 1]) {
				updateTimes[2 * i + 1] = rightUpdate;
				readIn(2 * i + 1);
			}
		}
	}

	private void readIn(int index) throws GameActionException {
		int in = rc.readSharedArray(18 + index);
		chunks[4 * index + 3] = in & 0b1111;
		chunks[4 * index + 2] = (in >> 4) & 0b1111;
		chunks[4 * index + 1] = (in >> 8) & 0b1111;
		chunks[4 * index] = (in >> 12) & 0b1111;
	}

	private void writeOut(int index) throws GameActionException {
		int out = (chunks[4 * index + 3]) | (chunks[4 * index + 2] << 4) | (chunks[4 * index + 1] << 8)
				| (chunks[4 * index] << 12);
		// System.out.println(out + ", " + chunks[4 * index] + ", " + chunks[4 * index +
		// 1] + ", " + chunks[4 * index + 2] + ", " + chunks[4 * index + 3]);

		rc.writeSharedArray(18 + index, out);
		
		// System.out.println("Wrote to the index " + (18 + index));
		// MapLocation center1 = getChunkCenter(4 * index + 3);
		// System.out.println("Updates to " + center1 + " now " + chunks[4 * index + 3]);
		// rc.setIndicatorDot(center1, 0, 255, 255);
		// MapLocation center2 = getChunkCenter(4 * index + 2);
		// System.out.println("Updates to " + center2 + " now " + chunks[4 * index + 2]);
		// rc.setIndicatorDot(center2, 0, 255, 255);
		// MapLocation center3 = getChunkCenter(4 * index + 1);
		// System.out.println("Updates to " + center3 + " now " + chunks[4 * index + 1]);
		// rc.setIndicatorDot(center3, 0, 255, 255);
		// MapLocation center4 = getChunkCenter(4 * index);
		// System.out.println("Updates to " + center4 + " now " + chunks[4 * index]);
		// rc.setIndicatorDot(center4, 0, 255, 255);

	}

}
