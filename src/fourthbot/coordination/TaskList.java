package fourthbot.coordination;

import battlecode.common.*;

public class TaskList {


    public static final int TASK_BITS = 0b11;
	public static final int CHUNK_BITS = 0b1111111100;
    public static final int ROUND_BITS = 0b1111110000000000;
	RobotController rc;

	public TaskList(RobotController rc) {
		this.rc = rc;
	}

	public int getNextTaskBits(Task taskType) throws GameActionException {
		int taskBits;
		switch(taskType) {
			case ATTACK: taskBits = 1; break;
			case DEFEND: taskBits = 2; break;
			case MINE: taskBits = 3; break;
			default: taskBits = -1;
		}
		int soonestRound = Integer.MAX_VALUE;
		int currentRound = rc.getRoundNum();
		int bits = -1;
		for(int i=56; i < 64; i++) {
			int b = rc.readSharedArray(i);
			if((b & TASK_BITS) == taskBits) {
				int r = b >> 5;
				if (r >= currentRound && r < soonestRound) {
					soonestRound = r;
					bits = b;
				}
			}
		}
		return bits;
	}

	public Task getTaskType(int bits) {
		switch(bits & TASK_BITS) {
			case 1: return Task.ATTACK;
			case 2: return Task.DEFEND;
			case 3: return Task.MINE;
			default: return null;
		}
	}

	public MapLocation getTaskPosition(int bits) {
		return Minimap.getChunkCenter((bits & CHUNK_BITS) >> 2);
	}

	public int getTaskChunk(int bits) {
		return (bits & CHUNK_BITS) >> 2;
	}

	public int getTaskRound(int bits) {
		return (bits & ROUND_BITS) >> 5;
	}

	public void addTaskAttack(MapLocation pos, int convergeRound) throws GameActionException {
		convergeRound >>= 5;
		int currentRound = rc.getRoundNum() >> 5;
		int index = indexToOverride(convergeRound, currentRound);
		if (index == -1) return; // Other tasks have higher priority.
		int chunk = Minimap.getChunkIndex(pos);
		rc.writeSharedArray(index, (convergeRound << 10) | (chunk << 2) | 1);
	}

	public void addTaskDefend(MapLocation pos) throws GameActionException {
		int round = rc.getRoundNum() >> 5;
		int index = indexToOverride(round, round);
		if (index == -1) return; // Other tasks have higher priority.
		int chunk = Minimap.getChunkIndex(pos);
		rc.writeSharedArray(index, (round << 10) | (chunk << 2) | 2);
	}

	public void addTaskMine(MapLocation pos) throws GameActionException {
		int round = rc.getRoundNum();
		int index = indexToOverride(round, round);
		if (index == -1) return; // Other tasks have higher priority.
		int chunk = Minimap.getChunkIndex(pos);
		rc.writeSharedArray(index, (round << 10) | (chunk << 2) | 3);
	}

	private int indexToOverride(int round, int currentRound) throws GameActionException {
		// Index to override.
		// Overrides if round < (task's round), if none found returns -1.
		for(int i=56; i < 64; i++) {
			int b = rc.readSharedArray(i);
			int r = b >> 10;
			if((b & TASK_BITS) == 0 || r < currentRound || r > round) {
				return i;
			}
		}
		return -1;
	}
}