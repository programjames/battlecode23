package fourthbot.robots;

import battlecode.common.*;
import fourthbot.coordination.*;

public class Headquarters extends Building {

	public Headquarters(RobotController rc) {
		super(rc);
		// TODO Auto-generated constructor stub
	}

	int ad = GameConstants.INITIAL_AD_AMOUNT;
	int mn = GameConstants.INITIAL_MN_AMOUNT;
	int ex = 0;

	private final double DECAY_RATE = 0.99;
	double adIncome = 0;
	double mnIncome = 0;
	double exIncome = 0;

	private final double ANCHOR_INCOME = 5; // build an anchor if we have at least this income/turn
	private final double AMPLIFIER_INCOME = 2.5; // build amplifiers after this income bracket

	boolean saveForAmplifier = false;

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		adIncome = DECAY_RATE * adIncome + (1 - DECAY_RATE) * (rc.getResourceAmount(ResourceType.ADAMANTIUM) - ad);
		mnIncome = DECAY_RATE * mnIncome + (1 - DECAY_RATE) * (rc.getResourceAmount(ResourceType.MANA) - mn);
		exIncome = DECAY_RATE * exIncome + (1 - DECAY_RATE) * (rc.getResourceAmount(ResourceType.ELIXIR) - ex);

		// Also updates these at the end of turn:
		ad = rc.getResourceAmount(ResourceType.ADAMANTIUM);
		mn = rc.getResourceAmount(ResourceType.MANA);
		ex = rc.getResourceAmount(ResourceType.ELIXIR);

		rc.setIndicatorString(String.format("%.2f %.2f %.2f", adIncome, mnIncome, exIncome));

		if (tasklist.getNextTaskBits(Task.ATTACK) == -1) {
			// Move units towards:
			// 1. Nearest enemy island.
			// 2. Nearest enemy well.
			int chunk = -1;
			int myChunk = Minimap.getChunkIndex(pos);

			if (chunk == -1) {
				chunk = MinimapInfo.nearestEnemyIslandChunk(myChunk, minimap.getChunks());
			}
			if (chunk == -1) {
				chunk = MinimapInfo.nearestEnemyWellChunk(myChunk, minimap.getChunks());
			}
			if (chunk != -1) {
				MapLocation attackPos = Minimap.getChunkCenter(chunk);
				tasklist.addTaskAttack(attackPos, 64 + rc.getRoundNum());
			} else if (rc.getRoundNum() == 1) {
				MapLocation attackPos = new MapLocation(mapWidth / 2, mapHeight / 2);
				tasklist.addTaskAttack(attackPos, 64 + rc.getRoundNum());
			}
		}
	}

	@Override
	public void runTurn() throws GameActionException {
		// if (rc.getRoundNum() > 50) {
		// rc.resign();
		// }

		if (exIncome >= ANCHOR_INCOME || (adIncome >= ANCHOR_INCOME && mnIncome >= ANCHOR_INCOME))
			while (tryBuildAnchor())
				;

		while (tryBuildRobot())
			;

		// Draw the minimap

		// for (int x = 2; x < mapWidth; x += 5) {
		// for (int y = 2; y < mapHeight; y += 5) {
		// int chunk = minimap.getChunk(minimap.getChunkIndex(x, y));
		// if ((chunk & Minimap.ISLAND_BITS) != 0) {
		// rc.setIndicatorLine(new MapLocation(x - 2, y - 2), new MapLocation(x + 2, y -
		// 2), 255, 255, 255);
		// rc.setIndicatorLine(new MapLocation(x + 2, y - 2), new MapLocation(x + 2, y +
		// 2), 255, 255, 255);
		// rc.setIndicatorLine(new MapLocation(x + 2, y + 2), new MapLocation(x - 2, y +
		// 2), 255, 255, 255);
		// rc.setIndicatorLine(new MapLocation(x - 2, y + 2), new MapLocation(x - 2, y -
		// 2), 255, 255, 255);
		// }
		// if ((chunk & Minimap.ENEMY_BIT) != 0) {
		// rc.setIndicatorLine(new MapLocation(x - 1, y - 1), new MapLocation(x + 1, y -
		// 1), 255, 0, 0);
		// rc.setIndicatorLine(new MapLocation(x + 1, y - 1), new MapLocation(x + 1, y +
		// 1), 255, 0, 0);
		// rc.setIndicatorLine(new MapLocation(x + 1, y + 1), new MapLocation(x - 1, y +
		// 1), 255, 0, 0);
		// rc.setIndicatorLine(new MapLocation(x - 1, y + 1), new MapLocation(x - 1, y -
		// 1), 255, 0, 0);
		// }
		// if ((chunk & Minimap.WELL_BIT) != 0) {
		// rc.setIndicatorDot(new MapLocation(x, y), 0, 0, 255);
		// }
		// }
		// }

	}

	@Override
	public void endTurn() throws GameActionException {
		super.endTurn();
		ad = rc.getResourceAmount(ResourceType.ADAMANTIUM);
		mn = rc.getResourceAmount(ResourceType.MANA);
		ex = rc.getResourceAmount(ResourceType.ELIXIR);
	}

	private boolean tryBuildAnchor() throws GameActionException {
		if (rc.canBuildAnchor(Anchor.ACCELERATING)) {
			rc.buildAnchor(Anchor.ACCELERATING);
			return true;
		}
		if (rc.canBuildAnchor(Anchor.STANDARD)) {
			rc.buildAnchor(Anchor.STANDARD);
			return true;
		}
		return false;
	}

	private boolean tryBuildRobot() throws GameActionException {

		RobotType buildType = null;

		if (exIncome < ANCHOR_INCOME && ex >= 200) {
			// Build booster/destabilizer
			buildType = rng.nextBoolean() ? RobotType.BOOSTER : RobotType.DESTABILIZER;
		} else if (adIncome >= ANCHOR_INCOME && mnIncome >= ANCHOR_INCOME) {
			// Want to build standard anchor, but okay to spend the resource we have more
			// of.
			if (adIncome >= mnIncome && ad > mn + RobotType.CARRIER.buildCostAdamantium) {
				// buildType = RobotType.CARRIER;
			} else if (mnIncome >= adIncome && mn > ad + RobotType.LAUNCHER.buildCostMana) {
				buildType = RobotType.LAUNCHER;
			}
		} else if (saveForAmplifier && ad >= RobotType.AMPLIFIER.buildCostAdamantium
				&& mn >= RobotType.AMPLIFIER.buildCostMana) {
			buildType = RobotType.AMPLIFIER;
		} else if ((!saveForAmplifier && mn >= RobotType.LAUNCHER.buildCostMana) ||
				mn >= RobotType.LAUNCHER.buildCostMana + RobotType.AMPLIFIER.buildCostMana) {
			buildType = RobotType.LAUNCHER;
		} else if ((!saveForAmplifier && ad >= RobotType.CARRIER.buildCostAdamantium) ||
				ad >= RobotType.CARRIER.buildCostAdamantium + RobotType.AMPLIFIER.buildCostAdamantium) {
			buildType = RobotType.CARRIER;
		}

		if (buildType == null)
			return false;

		for (Direction direction : Direction.allDirections()) {
			MapLocation buildLocation = rc.getLocation().add(direction);
			if (rc.canBuildRobot(buildType, buildLocation)) {
				rc.buildRobot(buildType, buildLocation);

				if (buildType == RobotType.AMPLIFIER)
					saveForAmplifier = false;

				// 20% chance of saving for an amplifier once we have a decent income.
				else if (adIncome >= AMPLIFIER_INCOME && mnIncome >= AMPLIFIER_INCOME
						&& buildType == RobotType.LAUNCHER && rng.nextInt(5) == 0) {
					saveForAmplifier = true;
				}

				return true;
			}
		}
		return false;
	}
}
