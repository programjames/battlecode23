package secondbot.robots;

import battlecode.common.*;
import secondbot.navigation.*;
import secondbot.coordination.*;

public abstract class Unit extends Robot {

	Job job;
	Mode mode;

	@Override
	public void setup() {
		super.setup();
	}

	public Unit(RobotController rc) {
		super(rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		pos = rc.getLocation();
	}

	@Override
	public abstract void runTurn() throws GameActionException;

	public MapLocation enemyGoalLocation() throws GameActionException {
		// Moving towards this goal should bring you closer to the enemy.
		int chunk = MinimapInfo.nearestEnemyChunk(minimap.getChunkIndex(pos), minimap.getChunks());
		if (chunk != -1) {
			// move to the nearest enemy chunk
			return minimap.getChunkCenter(chunk);
		} else {
			return safeSpreadOutLocation();
		}
	}

	public void attack(Navigator navigator) throws GameActionException {
		RobotInfo enemy = null;
		int dist = Integer.MAX_VALUE;
		int health = Integer.MAX_VALUE;
		for (RobotInfo r : enemies) {
			if (r.type == RobotType.HEADQUARTERS) {
				continue;
			}
			int d = r.location.distanceSquaredTo(pos);
			if ((r.health < health && d <= type.actionRadiusSquared) || (d > type.actionRadiusSquared && d < dist)) {
				// Prey on the close, weak units.
				dist = d;
				health = r.health;
				enemy = r;
			}
		}

		if (enemy == null)
			return;

		if (rc.getActionCooldownTurns() <= GameConstants.COOLDOWN_LIMIT && !rc.canAttack(enemy.location)) {
			// Move in for the kill mwahahaha
			navigator.move(enemy.location);
		}

		while (rc.canAttack(enemy.location)) {
			rc.attack(enemy.location);
		}

		// Run away so they don't hit us!
		MapLocation loc = runAwayLocation();
		navigator.fuzzyMoveTo(loc, 4);
		navigator.fuzzyMoveTo(loc, 4);
	}

	public void retreat(Navigator navigator) throws GameActionException {
		MapLocation loc = runAwayLocation();
		navigator.fuzzyMoveTo(loc, 4);
		navigator.fuzzyMoveTo(loc, 4);
	}

	// Spreads out from friendly units while remaining near boosters and launchers.
	public MapLocation safeSpreadOutLocation() {
		int dx = 0;
		int dy = 0;
		switch (friends.length) {
			default:
			case 69:
				switch (friends[68].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[68].location.x;
						dy += pos.y - friends[68].location.y;
					default:
						dx -= pos.x - friends[68].location.x;
						dy -= pos.y - friends[68].location.y;
				}
			case 68:
				switch (friends[67].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[67].location.x;
						dy += pos.y - friends[67].location.y;
					default:
						dx -= pos.x - friends[67].location.x;
						dy -= pos.y - friends[67].location.y;
				}
			case 67:
				switch (friends[66].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[66].location.x;
						dy += pos.y - friends[66].location.y;
					default:
						dx -= pos.x - friends[66].location.x;
						dy -= pos.y - friends[66].location.y;
				}
			case 66:
				switch (friends[65].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[65].location.x;
						dy += pos.y - friends[65].location.y;
					default:
						dx -= pos.x - friends[65].location.x;
						dy -= pos.y - friends[65].location.y;
				}
			case 65:
				switch (friends[64].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[64].location.x;
						dy += pos.y - friends[64].location.y;
					default:
						dx -= pos.x - friends[64].location.x;
						dy -= pos.y - friends[64].location.y;
				}
			case 64:
				switch (friends[63].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[63].location.x;
						dy += pos.y - friends[63].location.y;
					default:
						dx -= pos.x - friends[63].location.x;
						dy -= pos.y - friends[63].location.y;
				}
			case 63:
				switch (friends[62].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[62].location.x;
						dy += pos.y - friends[62].location.y;
					default:
						dx -= pos.x - friends[62].location.x;
						dy -= pos.y - friends[62].location.y;
				}
			case 62:
				switch (friends[61].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[61].location.x;
						dy += pos.y - friends[61].location.y;
					default:
						dx -= pos.x - friends[61].location.x;
						dy -= pos.y - friends[61].location.y;
				}
			case 61:
				switch (friends[60].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[60].location.x;
						dy += pos.y - friends[60].location.y;
					default:
						dx -= pos.x - friends[60].location.x;
						dy -= pos.y - friends[60].location.y;
				}
			case 60:
				switch (friends[59].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[59].location.x;
						dy += pos.y - friends[59].location.y;
					default:
						dx -= pos.x - friends[59].location.x;
						dy -= pos.y - friends[59].location.y;
				}
			case 59:
				switch (friends[58].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[58].location.x;
						dy += pos.y - friends[58].location.y;
					default:
						dx -= pos.x - friends[58].location.x;
						dy -= pos.y - friends[58].location.y;
				}
			case 58:
				switch (friends[57].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[57].location.x;
						dy += pos.y - friends[57].location.y;
					default:
						dx -= pos.x - friends[57].location.x;
						dy -= pos.y - friends[57].location.y;
				}
			case 57:
				switch (friends[56].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[56].location.x;
						dy += pos.y - friends[56].location.y;
					default:
						dx -= pos.x - friends[56].location.x;
						dy -= pos.y - friends[56].location.y;
				}
			case 56:
				switch (friends[55].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[55].location.x;
						dy += pos.y - friends[55].location.y;
					default:
						dx -= pos.x - friends[55].location.x;
						dy -= pos.y - friends[55].location.y;
				}
			case 55:
				switch (friends[54].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[54].location.x;
						dy += pos.y - friends[54].location.y;
					default:
						dx -= pos.x - friends[54].location.x;
						dy -= pos.y - friends[54].location.y;
				}
			case 54:
				switch (friends[53].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[53].location.x;
						dy += pos.y - friends[53].location.y;
					default:
						dx -= pos.x - friends[53].location.x;
						dy -= pos.y - friends[53].location.y;
				}
			case 53:
				switch (friends[52].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[52].location.x;
						dy += pos.y - friends[52].location.y;
					default:
						dx -= pos.x - friends[52].location.x;
						dy -= pos.y - friends[52].location.y;
				}
			case 52:
				switch (friends[51].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[51].location.x;
						dy += pos.y - friends[51].location.y;
					default:
						dx -= pos.x - friends[51].location.x;
						dy -= pos.y - friends[51].location.y;
				}
			case 51:
				switch (friends[50].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[50].location.x;
						dy += pos.y - friends[50].location.y;
					default:
						dx -= pos.x - friends[50].location.x;
						dy -= pos.y - friends[50].location.y;
				}
			case 50:
				switch (friends[49].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[49].location.x;
						dy += pos.y - friends[49].location.y;
					default:
						dx -= pos.x - friends[49].location.x;
						dy -= pos.y - friends[49].location.y;
				}
			case 49:
				switch (friends[48].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[48].location.x;
						dy += pos.y - friends[48].location.y;
					default:
						dx -= pos.x - friends[48].location.x;
						dy -= pos.y - friends[48].location.y;
				}
			case 48:
				switch (friends[47].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[47].location.x;
						dy += pos.y - friends[47].location.y;
					default:
						dx -= pos.x - friends[47].location.x;
						dy -= pos.y - friends[47].location.y;
				}
			case 47:
				switch (friends[46].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[46].location.x;
						dy += pos.y - friends[46].location.y;
					default:
						dx -= pos.x - friends[46].location.x;
						dy -= pos.y - friends[46].location.y;
				}
			case 46:
				switch (friends[45].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[45].location.x;
						dy += pos.y - friends[45].location.y;
					default:
						dx -= pos.x - friends[45].location.x;
						dy -= pos.y - friends[45].location.y;
				}
			case 45:
				switch (friends[44].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[44].location.x;
						dy += pos.y - friends[44].location.y;
					default:
						dx -= pos.x - friends[44].location.x;
						dy -= pos.y - friends[44].location.y;
				}
			case 44:
				switch (friends[43].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[43].location.x;
						dy += pos.y - friends[43].location.y;
					default:
						dx -= pos.x - friends[43].location.x;
						dy -= pos.y - friends[43].location.y;
				}
			case 43:
				switch (friends[42].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[42].location.x;
						dy += pos.y - friends[42].location.y;
					default:
						dx -= pos.x - friends[42].location.x;
						dy -= pos.y - friends[42].location.y;
				}
			case 42:
				switch (friends[41].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[41].location.x;
						dy += pos.y - friends[41].location.y;
					default:
						dx -= pos.x - friends[41].location.x;
						dy -= pos.y - friends[41].location.y;
				}
			case 41:
				switch (friends[40].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[40].location.x;
						dy += pos.y - friends[40].location.y;
					default:
						dx -= pos.x - friends[40].location.x;
						dy -= pos.y - friends[40].location.y;
				}
			case 40:
				switch (friends[39].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[39].location.x;
						dy += pos.y - friends[39].location.y;
					default:
						dx -= pos.x - friends[39].location.x;
						dy -= pos.y - friends[39].location.y;
				}
			case 39:
				switch (friends[38].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[38].location.x;
						dy += pos.y - friends[38].location.y;
					default:
						dx -= pos.x - friends[38].location.x;
						dy -= pos.y - friends[38].location.y;
				}
			case 38:
				switch (friends[37].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[37].location.x;
						dy += pos.y - friends[37].location.y;
					default:
						dx -= pos.x - friends[37].location.x;
						dy -= pos.y - friends[37].location.y;
				}
			case 37:
				switch (friends[36].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[36].location.x;
						dy += pos.y - friends[36].location.y;
					default:
						dx -= pos.x - friends[36].location.x;
						dy -= pos.y - friends[36].location.y;
				}
			case 36:
				switch (friends[35].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[35].location.x;
						dy += pos.y - friends[35].location.y;
					default:
						dx -= pos.x - friends[35].location.x;
						dy -= pos.y - friends[35].location.y;
				}
			case 35:
				switch (friends[34].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[34].location.x;
						dy += pos.y - friends[34].location.y;
					default:
						dx -= pos.x - friends[34].location.x;
						dy -= pos.y - friends[34].location.y;
				}
			case 34:
				switch (friends[33].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[33].location.x;
						dy += pos.y - friends[33].location.y;
					default:
						dx -= pos.x - friends[33].location.x;
						dy -= pos.y - friends[33].location.y;
				}
			case 33:
				switch (friends[32].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[32].location.x;
						dy += pos.y - friends[32].location.y;
					default:
						dx -= pos.x - friends[32].location.x;
						dy -= pos.y - friends[32].location.y;
				}
			case 32:
				switch (friends[31].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[31].location.x;
						dy += pos.y - friends[31].location.y;
					default:
						dx -= pos.x - friends[31].location.x;
						dy -= pos.y - friends[31].location.y;
				}
			case 31:
				switch (friends[30].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[30].location.x;
						dy += pos.y - friends[30].location.y;
					default:
						dx -= pos.x - friends[30].location.x;
						dy -= pos.y - friends[30].location.y;
				}
			case 30:
				switch (friends[29].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[29].location.x;
						dy += pos.y - friends[29].location.y;
					default:
						dx -= pos.x - friends[29].location.x;
						dy -= pos.y - friends[29].location.y;
				}
			case 29:
				switch (friends[28].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[28].location.x;
						dy += pos.y - friends[28].location.y;
					default:
						dx -= pos.x - friends[28].location.x;
						dy -= pos.y - friends[28].location.y;
				}
			case 28:
				switch (friends[27].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[27].location.x;
						dy += pos.y - friends[27].location.y;
					default:
						dx -= pos.x - friends[27].location.x;
						dy -= pos.y - friends[27].location.y;
				}
			case 27:
				switch (friends[26].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[26].location.x;
						dy += pos.y - friends[26].location.y;
					default:
						dx -= pos.x - friends[26].location.x;
						dy -= pos.y - friends[26].location.y;
				}
			case 26:
				switch (friends[25].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[25].location.x;
						dy += pos.y - friends[25].location.y;
					default:
						dx -= pos.x - friends[25].location.x;
						dy -= pos.y - friends[25].location.y;
				}
			case 25:
				switch (friends[24].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[24].location.x;
						dy += pos.y - friends[24].location.y;
					default:
						dx -= pos.x - friends[24].location.x;
						dy -= pos.y - friends[24].location.y;
				}
			case 24:
				switch (friends[23].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[23].location.x;
						dy += pos.y - friends[23].location.y;
					default:
						dx -= pos.x - friends[23].location.x;
						dy -= pos.y - friends[23].location.y;
				}
			case 23:
				switch (friends[22].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[22].location.x;
						dy += pos.y - friends[22].location.y;
					default:
						dx -= pos.x - friends[22].location.x;
						dy -= pos.y - friends[22].location.y;
				}
			case 22:
				switch (friends[21].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[21].location.x;
						dy += pos.y - friends[21].location.y;
					default:
						dx -= pos.x - friends[21].location.x;
						dy -= pos.y - friends[21].location.y;
				}
			case 21:
				switch (friends[20].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[20].location.x;
						dy += pos.y - friends[20].location.y;
					default:
						dx -= pos.x - friends[20].location.x;
						dy -= pos.y - friends[20].location.y;
				}
			case 20:
				switch (friends[19].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[19].location.x;
						dy += pos.y - friends[19].location.y;
					default:
						dx -= pos.x - friends[19].location.x;
						dy -= pos.y - friends[19].location.y;
				}
			case 19:
				switch (friends[18].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[18].location.x;
						dy += pos.y - friends[18].location.y;
					default:
						dx -= pos.x - friends[18].location.x;
						dy -= pos.y - friends[18].location.y;
				}
			case 18:
				switch (friends[17].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[17].location.x;
						dy += pos.y - friends[17].location.y;
					default:
						dx -= pos.x - friends[17].location.x;
						dy -= pos.y - friends[17].location.y;
				}
			case 17:
				switch (friends[16].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[16].location.x;
						dy += pos.y - friends[16].location.y;
					default:
						dx -= pos.x - friends[16].location.x;
						dy -= pos.y - friends[16].location.y;
				}
			case 16:
				switch (friends[15].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[15].location.x;
						dy += pos.y - friends[15].location.y;
					default:
						dx -= pos.x - friends[15].location.x;
						dy -= pos.y - friends[15].location.y;
				}
			case 15:
				switch (friends[14].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[14].location.x;
						dy += pos.y - friends[14].location.y;
					default:
						dx -= pos.x - friends[14].location.x;
						dy -= pos.y - friends[14].location.y;
				}
			case 14:
				switch (friends[13].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[13].location.x;
						dy += pos.y - friends[13].location.y;
					default:
						dx -= pos.x - friends[13].location.x;
						dy -= pos.y - friends[13].location.y;
				}
			case 13:
				switch (friends[12].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[12].location.x;
						dy += pos.y - friends[12].location.y;
					default:
						dx -= pos.x - friends[12].location.x;
						dy -= pos.y - friends[12].location.y;
				}
			case 12:
				switch (friends[11].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[11].location.x;
						dy += pos.y - friends[11].location.y;
					default:
						dx -= pos.x - friends[11].location.x;
						dy -= pos.y - friends[11].location.y;
				}
			case 11:
				switch (friends[10].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[10].location.x;
						dy += pos.y - friends[10].location.y;
					default:
						dx -= pos.x - friends[10].location.x;
						dy -= pos.y - friends[10].location.y;
				}
			case 10:
				switch (friends[9].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[9].location.x;
						dy += pos.y - friends[9].location.y;
					default:
						dx -= pos.x - friends[9].location.x;
						dy -= pos.y - friends[9].location.y;
				}
			case 9:
				switch (friends[8].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[8].location.x;
						dy += pos.y - friends[8].location.y;
					default:
						dx -= pos.x - friends[8].location.x;
						dy -= pos.y - friends[8].location.y;
				}
			case 8:
				switch (friends[7].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[7].location.x;
						dy += pos.y - friends[7].location.y;
					default:
						dx -= pos.x - friends[7].location.x;
						dy -= pos.y - friends[7].location.y;
				}
			case 7:
				switch (friends[6].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[6].location.x;
						dy += pos.y - friends[6].location.y;
					default:
						dx -= pos.x - friends[6].location.x;
						dy -= pos.y - friends[6].location.y;
				}
			case 6:
				switch (friends[5].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[5].location.x;
						dy += pos.y - friends[5].location.y;
					default:
						dx -= pos.x - friends[5].location.x;
						dy -= pos.y - friends[5].location.y;
				}
			case 5:
				switch (friends[4].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[4].location.x;
						dy += pos.y - friends[4].location.y;
					default:
						dx -= pos.x - friends[4].location.x;
						dy -= pos.y - friends[4].location.y;
				}
			case 4:
				switch (friends[3].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[3].location.x;
						dy += pos.y - friends[3].location.y;
					default:
						dx -= pos.x - friends[3].location.x;
						dy -= pos.y - friends[3].location.y;
				}
			case 3:
				switch (friends[2].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[2].location.x;
						dy += pos.y - friends[2].location.y;
					default:
						dx -= pos.x - friends[2].location.x;
						dy -= pos.y - friends[2].location.y;
				}
			case 2:
				switch (friends[1].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[1].location.x;
						dy += pos.y - friends[1].location.y;
					default:
						dx -= pos.x - friends[1].location.x;
						dy -= pos.y - friends[1].location.y;
				}
			case 1:
				switch (friends[0].type) {
					case LAUNCHER:
					case BOOSTER:
						dx += pos.x - friends[0].location.x;
						dy += pos.y - friends[0].location.y;
					default:
						dx -= pos.x - friends[0].location.x;
						dy -= pos.y - friends[0].location.y;
				}
			case 0:
		}
		return pos.translate(dx, dy);
	}

	public MapLocation runAwayLocation() {
		int dx = 0;
		int dy = 0;
		switch (enemies.length) {
			default:
			case 69:
				switch (enemies[68].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[68].location.x;
						dy += pos.y - enemies[68].location.y;
					default:
				}
			case 68:
				switch (enemies[67].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[67].location.x;
						dy += pos.y - enemies[67].location.y;
					default:
				}
			case 67:
				switch (enemies[66].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[66].location.x;
						dy += pos.y - enemies[66].location.y;
					default:
				}
			case 66:
				switch (enemies[65].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[65].location.x;
						dy += pos.y - enemies[65].location.y;
					default:
				}
			case 65:
				switch (enemies[64].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[64].location.x;
						dy += pos.y - enemies[64].location.y;
					default:
				}
			case 64:
				switch (enemies[63].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[63].location.x;
						dy += pos.y - enemies[63].location.y;
					default:
				}
			case 63:
				switch (enemies[62].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[62].location.x;
						dy += pos.y - enemies[62].location.y;
					default:
				}
			case 62:
				switch (enemies[61].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[61].location.x;
						dy += pos.y - enemies[61].location.y;
					default:
				}
			case 61:
				switch (enemies[60].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[60].location.x;
						dy += pos.y - enemies[60].location.y;
					default:
				}
			case 60:
				switch (enemies[59].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[59].location.x;
						dy += pos.y - enemies[59].location.y;
					default:
				}
			case 59:
				switch (enemies[58].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[58].location.x;
						dy += pos.y - enemies[58].location.y;
					default:
				}
			case 58:
				switch (enemies[57].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[57].location.x;
						dy += pos.y - enemies[57].location.y;
					default:
				}
			case 57:
				switch (enemies[56].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[56].location.x;
						dy += pos.y - enemies[56].location.y;
					default:
				}
			case 56:
				switch (enemies[55].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[55].location.x;
						dy += pos.y - enemies[55].location.y;
					default:
				}
			case 55:
				switch (enemies[54].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[54].location.x;
						dy += pos.y - enemies[54].location.y;
					default:
				}
			case 54:
				switch (enemies[53].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[53].location.x;
						dy += pos.y - enemies[53].location.y;
					default:
				}
			case 53:
				switch (enemies[52].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[52].location.x;
						dy += pos.y - enemies[52].location.y;
					default:
				}
			case 52:
				switch (enemies[51].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[51].location.x;
						dy += pos.y - enemies[51].location.y;
					default:
				}
			case 51:
				switch (enemies[50].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[50].location.x;
						dy += pos.y - enemies[50].location.y;
					default:
				}
			case 50:
				switch (enemies[49].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[49].location.x;
						dy += pos.y - enemies[49].location.y;
					default:
				}
			case 49:
				switch (enemies[48].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[48].location.x;
						dy += pos.y - enemies[48].location.y;
					default:
				}
			case 48:
				switch (enemies[47].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[47].location.x;
						dy += pos.y - enemies[47].location.y;
					default:
				}
			case 47:
				switch (enemies[46].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[46].location.x;
						dy += pos.y - enemies[46].location.y;
					default:
				}
			case 46:
				switch (enemies[45].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[45].location.x;
						dy += pos.y - enemies[45].location.y;
					default:
				}
			case 45:
				switch (enemies[44].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[44].location.x;
						dy += pos.y - enemies[44].location.y;
					default:
				}
			case 44:
				switch (enemies[43].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[43].location.x;
						dy += pos.y - enemies[43].location.y;
					default:
				}
			case 43:
				switch (enemies[42].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[42].location.x;
						dy += pos.y - enemies[42].location.y;
					default:
				}
			case 42:
				switch (enemies[41].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[41].location.x;
						dy += pos.y - enemies[41].location.y;
					default:
				}
			case 41:
				switch (enemies[40].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[40].location.x;
						dy += pos.y - enemies[40].location.y;
					default:
				}
			case 40:
				switch (enemies[39].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[39].location.x;
						dy += pos.y - enemies[39].location.y;
					default:
				}
			case 39:
				switch (enemies[38].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[38].location.x;
						dy += pos.y - enemies[38].location.y;
					default:
				}
			case 38:
				switch (enemies[37].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[37].location.x;
						dy += pos.y - enemies[37].location.y;
					default:
				}
			case 37:
				switch (enemies[36].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[36].location.x;
						dy += pos.y - enemies[36].location.y;
					default:
				}
			case 36:
				switch (enemies[35].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[35].location.x;
						dy += pos.y - enemies[35].location.y;
					default:
				}
			case 35:
				switch (enemies[34].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[34].location.x;
						dy += pos.y - enemies[34].location.y;
					default:
				}
			case 34:
				switch (enemies[33].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[33].location.x;
						dy += pos.y - enemies[33].location.y;
					default:
				}
			case 33:
				switch (enemies[32].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[32].location.x;
						dy += pos.y - enemies[32].location.y;
					default:
				}
			case 32:
				switch (enemies[31].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[31].location.x;
						dy += pos.y - enemies[31].location.y;
					default:
				}
			case 31:
				switch (enemies[30].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[30].location.x;
						dy += pos.y - enemies[30].location.y;
					default:
				}
			case 30:
				switch (enemies[29].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[29].location.x;
						dy += pos.y - enemies[29].location.y;
					default:
				}
			case 29:
				switch (enemies[28].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[28].location.x;
						dy += pos.y - enemies[28].location.y;
					default:
				}
			case 28:
				switch (enemies[27].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[27].location.x;
						dy += pos.y - enemies[27].location.y;
					default:
				}
			case 27:
				switch (enemies[26].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[26].location.x;
						dy += pos.y - enemies[26].location.y;
					default:
				}
			case 26:
				switch (enemies[25].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[25].location.x;
						dy += pos.y - enemies[25].location.y;
					default:
				}
			case 25:
				switch (enemies[24].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[24].location.x;
						dy += pos.y - enemies[24].location.y;
					default:
				}
			case 24:
				switch (enemies[23].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[23].location.x;
						dy += pos.y - enemies[23].location.y;
					default:
				}
			case 23:
				switch (enemies[22].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[22].location.x;
						dy += pos.y - enemies[22].location.y;
					default:
				}
			case 22:
				switch (enemies[21].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[21].location.x;
						dy += pos.y - enemies[21].location.y;
					default:
				}
			case 21:
				switch (enemies[20].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[20].location.x;
						dy += pos.y - enemies[20].location.y;
					default:
				}
			case 20:
				switch (enemies[19].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[19].location.x;
						dy += pos.y - enemies[19].location.y;
					default:
				}
			case 19:
				switch (enemies[18].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[18].location.x;
						dy += pos.y - enemies[18].location.y;
					default:
				}
			case 18:
				switch (enemies[17].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[17].location.x;
						dy += pos.y - enemies[17].location.y;
					default:
				}
			case 17:
				switch (enemies[16].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[16].location.x;
						dy += pos.y - enemies[16].location.y;
					default:
				}
			case 16:
				switch (enemies[15].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[15].location.x;
						dy += pos.y - enemies[15].location.y;
					default:
				}
			case 15:
				switch (enemies[14].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[14].location.x;
						dy += pos.y - enemies[14].location.y;
					default:
				}
			case 14:
				switch (enemies[13].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[13].location.x;
						dy += pos.y - enemies[13].location.y;
					default:
				}
			case 13:
				switch (enemies[12].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[12].location.x;
						dy += pos.y - enemies[12].location.y;
					default:
				}
			case 12:
				switch (enemies[11].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[11].location.x;
						dy += pos.y - enemies[11].location.y;
					default:
				}
			case 11:
				switch (enemies[10].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[10].location.x;
						dy += pos.y - enemies[10].location.y;
					default:
				}
			case 10:
				switch (enemies[9].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[9].location.x;
						dy += pos.y - enemies[9].location.y;
					default:
				}
			case 9:
				switch (enemies[8].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[8].location.x;
						dy += pos.y - enemies[8].location.y;
					default:
				}
			case 8:
				switch (enemies[7].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[7].location.x;
						dy += pos.y - enemies[7].location.y;
					default:
				}
			case 7:
				switch (enemies[6].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[6].location.x;
						dy += pos.y - enemies[6].location.y;
					default:
				}
			case 6:
				switch (enemies[5].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[5].location.x;
						dy += pos.y - enemies[5].location.y;
					default:
				}
			case 5:
				switch (enemies[4].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[4].location.x;
						dy += pos.y - enemies[4].location.y;
					default:
				}
			case 4:
				switch (enemies[3].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[3].location.x;
						dy += pos.y - enemies[3].location.y;
					default:
				}
			case 3:
				switch (enemies[2].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[2].location.x;
						dy += pos.y - enemies[2].location.y;
					default:
				}
			case 2:
				switch (enemies[1].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[1].location.x;
						dy += pos.y - enemies[1].location.y;
					default:
				}
			case 1:
				switch (enemies[0].type) {
					case CARRIER:
					case LAUNCHER:
					case DESTABILIZER:
						dx += pos.x - enemies[0].location.x;
						dy += pos.y - enemies[0].location.y;
					default:
				}
			case 0:
		}
		switch (friends.length) {
			default:
			case 69:
				switch (friends[68].type) {
					case LAUNCHER:
						dx += pos.x - friends[68].location.x;
						dy += pos.y - friends[68].location.y;
					default:
				}
			case 68:
				switch (friends[67].type) {
					case LAUNCHER:
						dx += pos.x - friends[67].location.x;
						dy += pos.y - friends[67].location.y;
					default:
				}
			case 67:
				switch (friends[66].type) {
					case LAUNCHER:
						dx += pos.x - friends[66].location.x;
						dy += pos.y - friends[66].location.y;
					default:
				}
			case 66:
				switch (friends[65].type) {
					case LAUNCHER:
						dx += pos.x - friends[65].location.x;
						dy += pos.y - friends[65].location.y;
					default:
				}
			case 65:
				switch (friends[64].type) {
					case LAUNCHER:
						dx += pos.x - friends[64].location.x;
						dy += pos.y - friends[64].location.y;
					default:
				}
			case 64:
				switch (friends[63].type) {
					case LAUNCHER:
						dx += pos.x - friends[63].location.x;
						dy += pos.y - friends[63].location.y;
					default:
				}
			case 63:
				switch (friends[62].type) {
					case LAUNCHER:
						dx += pos.x - friends[62].location.x;
						dy += pos.y - friends[62].location.y;
					default:
				}
			case 62:
				switch (friends[61].type) {
					case LAUNCHER:
						dx += pos.x - friends[61].location.x;
						dy += pos.y - friends[61].location.y;
					default:
				}
			case 61:
				switch (friends[60].type) {
					case LAUNCHER:
						dx += pos.x - friends[60].location.x;
						dy += pos.y - friends[60].location.y;
					default:
				}
			case 60:
				switch (friends[59].type) {
					case LAUNCHER:
						dx += pos.x - friends[59].location.x;
						dy += pos.y - friends[59].location.y;
					default:
				}
			case 59:
				switch (friends[58].type) {
					case LAUNCHER:
						dx += pos.x - friends[58].location.x;
						dy += pos.y - friends[58].location.y;
					default:
				}
			case 58:
				switch (friends[57].type) {
					case LAUNCHER:
						dx += pos.x - friends[57].location.x;
						dy += pos.y - friends[57].location.y;
					default:
				}
			case 57:
				switch (friends[56].type) {
					case LAUNCHER:
						dx += pos.x - friends[56].location.x;
						dy += pos.y - friends[56].location.y;
					default:
				}
			case 56:
				switch (friends[55].type) {
					case LAUNCHER:
						dx += pos.x - friends[55].location.x;
						dy += pos.y - friends[55].location.y;
					default:
				}
			case 55:
				switch (friends[54].type) {
					case LAUNCHER:
						dx += pos.x - friends[54].location.x;
						dy += pos.y - friends[54].location.y;
					default:
				}
			case 54:
				switch (friends[53].type) {
					case LAUNCHER:
						dx += pos.x - friends[53].location.x;
						dy += pos.y - friends[53].location.y;
					default:
				}
			case 53:
				switch (friends[52].type) {
					case LAUNCHER:
						dx += pos.x - friends[52].location.x;
						dy += pos.y - friends[52].location.y;
					default:
				}
			case 52:
				switch (friends[51].type) {
					case LAUNCHER:
						dx += pos.x - friends[51].location.x;
						dy += pos.y - friends[51].location.y;
					default:
				}
			case 51:
				switch (friends[50].type) {
					case LAUNCHER:
						dx += pos.x - friends[50].location.x;
						dy += pos.y - friends[50].location.y;
					default:
				}
			case 50:
				switch (friends[49].type) {
					case LAUNCHER:
						dx += pos.x - friends[49].location.x;
						dy += pos.y - friends[49].location.y;
					default:
				}
			case 49:
				switch (friends[48].type) {
					case LAUNCHER:
						dx += pos.x - friends[48].location.x;
						dy += pos.y - friends[48].location.y;
					default:
				}
			case 48:
				switch (friends[47].type) {
					case LAUNCHER:
						dx += pos.x - friends[47].location.x;
						dy += pos.y - friends[47].location.y;
					default:
				}
			case 47:
				switch (friends[46].type) {
					case LAUNCHER:
						dx += pos.x - friends[46].location.x;
						dy += pos.y - friends[46].location.y;
					default:
				}
			case 46:
				switch (friends[45].type) {
					case LAUNCHER:
						dx += pos.x - friends[45].location.x;
						dy += pos.y - friends[45].location.y;
					default:
				}
			case 45:
				switch (friends[44].type) {
					case LAUNCHER:
						dx += pos.x - friends[44].location.x;
						dy += pos.y - friends[44].location.y;
					default:
				}
			case 44:
				switch (friends[43].type) {
					case LAUNCHER:
						dx += pos.x - friends[43].location.x;
						dy += pos.y - friends[43].location.y;
					default:
				}
			case 43:
				switch (friends[42].type) {
					case LAUNCHER:
						dx += pos.x - friends[42].location.x;
						dy += pos.y - friends[42].location.y;
					default:
				}
			case 42:
				switch (friends[41].type) {
					case LAUNCHER:
						dx += pos.x - friends[41].location.x;
						dy += pos.y - friends[41].location.y;
					default:
				}
			case 41:
				switch (friends[40].type) {
					case LAUNCHER:
						dx += pos.x - friends[40].location.x;
						dy += pos.y - friends[40].location.y;
					default:
				}
			case 40:
				switch (friends[39].type) {
					case LAUNCHER:
						dx += pos.x - friends[39].location.x;
						dy += pos.y - friends[39].location.y;
					default:
				}
			case 39:
				switch (friends[38].type) {
					case LAUNCHER:
						dx += pos.x - friends[38].location.x;
						dy += pos.y - friends[38].location.y;
					default:
				}
			case 38:
				switch (friends[37].type) {
					case LAUNCHER:
						dx += pos.x - friends[37].location.x;
						dy += pos.y - friends[37].location.y;
					default:
				}
			case 37:
				switch (friends[36].type) {
					case LAUNCHER:
						dx += pos.x - friends[36].location.x;
						dy += pos.y - friends[36].location.y;
					default:
				}
			case 36:
				switch (friends[35].type) {
					case LAUNCHER:
						dx += pos.x - friends[35].location.x;
						dy += pos.y - friends[35].location.y;
					default:
				}
			case 35:
				switch (friends[34].type) {
					case LAUNCHER:
						dx += pos.x - friends[34].location.x;
						dy += pos.y - friends[34].location.y;
					default:
				}
			case 34:
				switch (friends[33].type) {
					case LAUNCHER:
						dx += pos.x - friends[33].location.x;
						dy += pos.y - friends[33].location.y;
					default:
				}
			case 33:
				switch (friends[32].type) {
					case LAUNCHER:
						dx += pos.x - friends[32].location.x;
						dy += pos.y - friends[32].location.y;
					default:
				}
			case 32:
				switch (friends[31].type) {
					case LAUNCHER:
						dx += pos.x - friends[31].location.x;
						dy += pos.y - friends[31].location.y;
					default:
				}
			case 31:
				switch (friends[30].type) {
					case LAUNCHER:
						dx += pos.x - friends[30].location.x;
						dy += pos.y - friends[30].location.y;
					default:
				}
			case 30:
				switch (friends[29].type) {
					case LAUNCHER:
						dx += pos.x - friends[29].location.x;
						dy += pos.y - friends[29].location.y;
					default:
				}
			case 29:
				switch (friends[28].type) {
					case LAUNCHER:
						dx += pos.x - friends[28].location.x;
						dy += pos.y - friends[28].location.y;
					default:
				}
			case 28:
				switch (friends[27].type) {
					case LAUNCHER:
						dx += pos.x - friends[27].location.x;
						dy += pos.y - friends[27].location.y;
					default:
				}
			case 27:
				switch (friends[26].type) {
					case LAUNCHER:
						dx += pos.x - friends[26].location.x;
						dy += pos.y - friends[26].location.y;
					default:
				}
			case 26:
				switch (friends[25].type) {
					case LAUNCHER:
						dx += pos.x - friends[25].location.x;
						dy += pos.y - friends[25].location.y;
					default:
				}
			case 25:
				switch (friends[24].type) {
					case LAUNCHER:
						dx += pos.x - friends[24].location.x;
						dy += pos.y - friends[24].location.y;
					default:
				}
			case 24:
				switch (friends[23].type) {
					case LAUNCHER:
						dx += pos.x - friends[23].location.x;
						dy += pos.y - friends[23].location.y;
					default:
				}
			case 23:
				switch (friends[22].type) {
					case LAUNCHER:
						dx += pos.x - friends[22].location.x;
						dy += pos.y - friends[22].location.y;
					default:
				}
			case 22:
				switch (friends[21].type) {
					case LAUNCHER:
						dx += pos.x - friends[21].location.x;
						dy += pos.y - friends[21].location.y;
					default:
				}
			case 21:
				switch (friends[20].type) {
					case LAUNCHER:
						dx += pos.x - friends[20].location.x;
						dy += pos.y - friends[20].location.y;
					default:
				}
			case 20:
				switch (friends[19].type) {
					case LAUNCHER:
						dx += pos.x - friends[19].location.x;
						dy += pos.y - friends[19].location.y;
					default:
				}
			case 19:
				switch (friends[18].type) {
					case LAUNCHER:
						dx += pos.x - friends[18].location.x;
						dy += pos.y - friends[18].location.y;
					default:
				}
			case 18:
				switch (friends[17].type) {
					case LAUNCHER:
						dx += pos.x - friends[17].location.x;
						dy += pos.y - friends[17].location.y;
					default:
				}
			case 17:
				switch (friends[16].type) {
					case LAUNCHER:
						dx += pos.x - friends[16].location.x;
						dy += pos.y - friends[16].location.y;
					default:
				}
			case 16:
				switch (friends[15].type) {
					case LAUNCHER:
						dx += pos.x - friends[15].location.x;
						dy += pos.y - friends[15].location.y;
					default:
				}
			case 15:
				switch (friends[14].type) {
					case LAUNCHER:
						dx += pos.x - friends[14].location.x;
						dy += pos.y - friends[14].location.y;
					default:
				}
			case 14:
				switch (friends[13].type) {
					case LAUNCHER:
						dx += pos.x - friends[13].location.x;
						dy += pos.y - friends[13].location.y;
					default:
				}
			case 13:
				switch (friends[12].type) {
					case LAUNCHER:
						dx += pos.x - friends[12].location.x;
						dy += pos.y - friends[12].location.y;
					default:
				}
			case 12:
				switch (friends[11].type) {
					case LAUNCHER:
						dx += pos.x - friends[11].location.x;
						dy += pos.y - friends[11].location.y;
					default:
				}
			case 11:
				switch (friends[10].type) {
					case LAUNCHER:
						dx += pos.x - friends[10].location.x;
						dy += pos.y - friends[10].location.y;
					default:
				}
			case 10:
				switch (friends[9].type) {
					case LAUNCHER:
						dx += pos.x - friends[9].location.x;
						dy += pos.y - friends[9].location.y;
					default:
				}
			case 9:
				switch (friends[8].type) {
					case LAUNCHER:
						dx += pos.x - friends[8].location.x;
						dy += pos.y - friends[8].location.y;
					default:
				}
			case 8:
				switch (friends[7].type) {
					case LAUNCHER:
						dx += pos.x - friends[7].location.x;
						dy += pos.y - friends[7].location.y;
					default:
				}
			case 7:
				switch (friends[6].type) {
					case LAUNCHER:
						dx += pos.x - friends[6].location.x;
						dy += pos.y - friends[6].location.y;
					default:
				}
			case 6:
				switch (friends[5].type) {
					case LAUNCHER:
						dx += pos.x - friends[5].location.x;
						dy += pos.y - friends[5].location.y;
					default:
				}
			case 5:
				switch (friends[4].type) {
					case LAUNCHER:
						dx += pos.x - friends[4].location.x;
						dy += pos.y - friends[4].location.y;
					default:
				}
			case 4:
				switch (friends[3].type) {
					case LAUNCHER:
						dx += pos.x - friends[3].location.x;
						dy += pos.y - friends[3].location.y;
					default:
				}
			case 3:
				switch (friends[2].type) {
					case LAUNCHER:
						dx += pos.x - friends[2].location.x;
						dy += pos.y - friends[2].location.y;
					default:
				}
			case 2:
				switch (friends[1].type) {
					case LAUNCHER:
						dx += pos.x - friends[1].location.x;
						dy += pos.y - friends[1].location.y;
					default:
				}
			case 1:
				switch (friends[0].type) {
					case LAUNCHER:
						dx += pos.x - friends[0].location.x;
						dy += pos.y - friends[0].location.y;
					default:
				}
			case 0:
		}
		return pos.translate(dx, dy);
	}
}
