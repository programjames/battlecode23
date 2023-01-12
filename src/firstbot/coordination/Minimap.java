package firstbot.coordination;

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

	int[] chunks = new int[144];
	int[] updateTimes = new int[36]; // When were pairs of integers last updated?
										// array shows?
	int[] remoteUpdateTimes = new int[36];

	RobotController rc;

	public Minimap(RobotController rc) {
		this.rc = rc;
	}

	public int getChunkIndex(MapLocation location) {
		/*
		 * Get the chunk that a given location is in.
		 */
		return (location.x / 5 * 7 + location.y / 5 * 60) % 144;
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
		chunks[index] |= 0b0001;
		updateTimes[index / 4] = rc.getRoundNum() / 8;
	}
	
	public void markWell(WellInfo well) {
		/*
		 * Mark a well on the minimap
		 */
		int index = getChunkIndex(well.getMapLocation());
		chunks[index] |= 0b0010;
		updateTimes[index / 4] = rc.getRoundNum() / 8;
	}
	
	public void markClear(MapLocation location) {
		/*
		 * Mark that there are no enemies in a given chunk
		 */
		int index = getChunkIndex(location);
		chunks[index] &= 0b1110;
		updateTimes[index / 4] = rc.getRoundNum() / 8;
	}
	
	public void setChunk(int chunkIndex, int value) {
		/*
		 * Set a chunk to the given value. Value should be an integer between 0 and 15,
		 * inclusive. If `Value` is NOT in this range, things could get seriously messed
		 * up.
		 */

		chunks[chunkIndex] = value;
		updateTimes[chunkIndex / 4] = rc.getRoundNum() / 8;
	}

	@Override
	public void push() throws GameActionException {
		if (!rc.canWriteSharedArray(0, 0)) {
			// debug statement
			System.out.println("Tried writing to the shared array when unable to");
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
			}
			if (updateTimes[right] > remoteUpdateTimes[right]) {
				// We have extra info on some chunks
				writeOut(right);
				update |= updateTimes[right];
			}
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
		int out = chunks[4 * index + 3] + chunks[4 * index + 2] << 4 + chunks[4 * index + 1] << 8
				+ chunks[4 * index] << 12;
		rc.writeSharedArray(18 + index, out);
	}

}
