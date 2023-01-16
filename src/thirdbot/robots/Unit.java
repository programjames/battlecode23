package thirdbot.robots;

import battlecode.common.*;
import thirdbot.navigation.*;
import thirdbot.coordination.*;

public abstract class Unit extends Robot {

	Job job;
	Mode mode;

	// Stuff useful for determining attack micro (like should we run or charge in?)
	RobotInfo[] closeFriends = null;
	int nearbyCarriers;
	int threatLevel; // How dangerous are the enemies we're facing? Right now each carrier gives
						// threat level 1, other enemy units give threat levels of 4.
	int allyStrength; // How strong are the units within a radius of 10? Uses same calculations as
						// threatLevel (except carriers only count if they have enough resources)

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

		// Calculate the strength of our nearby units (for attacking)
		closeFriends = rc.senseNearbyRobots(10, myTeam);
		countUpNearbyStrengths();
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

		if (rc.getActionCooldownTurns() <= GameConstants.COOLDOWN_LIMIT && !rc.canAttack(enemy.location)
				&& shouldCloseIn()) {
			// Move in for the kill mwahahaha
			navigator.move(enemy.location);
		}

		while (rc.canAttack(enemy.location)) {
			rc.attack(enemy.location);
		}
	}

	public void retreat(Navigator navigator) throws GameActionException {
		MapLocation loc = runAwayLocation();
		navigator.fuzzyMoveTo(loc, 4);
		navigator.fuzzyMoveTo(loc, 4);
	}

	
    
   
    // Spreads out from friendly units while remaining near boosters, launchers and carriers.
	public boolean shouldCloseIn() {
		/*
		 * If we're in attack mode, should we close in for the kill, or should we stay
		 * still/run away?
		 */
		return allyStrength > threatLevel; // Maybe should be overrided in subclasses
	}

	private void countUpNearbyStrengths() {
		/*
		 * This is a helper function for beginTurn(). It unrolls a few loops that are
		 * used
		 * to count up things like the number of nearby carriers, the strength of nearby
		 * allies,
		 * and the threat level of enemies.
		 */
		RobotInfo r;
		nearbyCarriers = 0;
		allyStrength = 0;
		switch (closeFriends.length) {
			default:
			case 110:
				r = closeFriends[109];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 109:
				r = closeFriends[108];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 108:
				r = closeFriends[107];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 107:
				r = closeFriends[106];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 106:
				r = closeFriends[105];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 105:
				r = closeFriends[104];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 104:
				r = closeFriends[103];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 103:
				r = closeFriends[102];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 102:
				r = closeFriends[101];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 101:
				r = closeFriends[100];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 100:
				r = closeFriends[99];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 99:
				r = closeFriends[98];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 98:
				r = closeFriends[97];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 97:
				r = closeFriends[96];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 96:
				r = closeFriends[95];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 95:
				r = closeFriends[94];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 94:
				r = closeFriends[93];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 93:
				r = closeFriends[92];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 92:
				r = closeFriends[91];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 91:
				r = closeFriends[90];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 90:
				r = closeFriends[89];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 89:
				r = closeFriends[88];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 88:
				r = closeFriends[87];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 87:
				r = closeFriends[86];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 86:
				r = closeFriends[85];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 85:
				r = closeFriends[84];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 84:
				r = closeFriends[83];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 83:
				r = closeFriends[82];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 82:
				r = closeFriends[81];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 81:
				r = closeFriends[80];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 80:
				r = closeFriends[79];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 79:
				r = closeFriends[78];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 78:
				r = closeFriends[77];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 77:
				r = closeFriends[76];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 76:
				r = closeFriends[75];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 75:
				r = closeFriends[74];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 74:
				r = closeFriends[73];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 73:
				r = closeFriends[72];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 72:
				r = closeFriends[71];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 71:
				r = closeFriends[70];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 70:
				r = closeFriends[69];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 69:
				r = closeFriends[68];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 68:
				r = closeFriends[67];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 67:
				r = closeFriends[66];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 66:
				r = closeFriends[65];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 65:
				r = closeFriends[64];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 64:
				r = closeFriends[63];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 63:
				r = closeFriends[62];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 62:
				r = closeFriends[61];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 61:
				r = closeFriends[60];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 60:
				r = closeFriends[59];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 59:
				r = closeFriends[58];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 58:
				r = closeFriends[57];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 57:
				r = closeFriends[56];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 56:
				r = closeFriends[55];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 55:
				r = closeFriends[54];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 54:
				r = closeFriends[53];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 53:
				r = closeFriends[52];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 52:
				r = closeFriends[51];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 51:
				r = closeFriends[50];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 50:
				r = closeFriends[49];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 49:
				r = closeFriends[48];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 48:
				r = closeFriends[47];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 47:
				r = closeFriends[46];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 46:
				r = closeFriends[45];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 45:
				r = closeFriends[44];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 44:
				r = closeFriends[43];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 43:
				r = closeFriends[42];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 42:
				r = closeFriends[41];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 41:
				r = closeFriends[40];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 40:
				r = closeFriends[39];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 39:
				r = closeFriends[38];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 38:
				r = closeFriends[37];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 37:
				r = closeFriends[36];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 36:
				r = closeFriends[35];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 35:
				r = closeFriends[34];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 34:
				r = closeFriends[33];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 33:
				r = closeFriends[32];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 32:
				r = closeFriends[31];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 31:
				r = closeFriends[30];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 30:
				r = closeFriends[29];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 29:
				r = closeFriends[28];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 28:
				r = closeFriends[27];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 27:
				r = closeFriends[26];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 26:
				r = closeFriends[25];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 25:
				r = closeFriends[24];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 24:
				r = closeFriends[23];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 23:
				r = closeFriends[22];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 22:
				r = closeFriends[21];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 21:
				r = closeFriends[20];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 20:
				r = closeFriends[19];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 19:
				r = closeFriends[18];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 18:
				r = closeFriends[17];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 17:
				r = closeFriends[16];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 16:
				r = closeFriends[15];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 15:
				r = closeFriends[14];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 14:
				r = closeFriends[13];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 13:
				r = closeFriends[12];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 12:
				r = closeFriends[11];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 11:
				r = closeFriends[10];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 10:
				r = closeFriends[9];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 9:
				r = closeFriends[8];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 8:
				r = closeFriends[7];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 7:
				r = closeFriends[6];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 6:
				r = closeFriends[5];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 5:
				r = closeFriends[4];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 4:
				r = closeFriends[3];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 3:
				r = closeFriends[2];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 2:
				r = closeFriends[1];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 1:
				r = closeFriends[0];
				switch (r.type) {
					case BOOSTER:
						allyStrength += 5;
						break;
					case CARRIER:
						nearbyCarriers++;
						if (r.getResourceAmount(ResourceType.ADAMANTIUM)
								+ r.getResourceAmount(ResourceType.MANA) >= 20) {
							allyStrength += 2;
						}
						break;
					case DESTABILIZER:
						allyStrength += 8;
						break;
					case LAUNCHER:
						allyStrength += 7;
						break;
					default:
						break;
				}
			case 0:
				break;
		}
		threatLevel = 0;
		switch (enemies.length) {
			default:
			case 110:
				r = enemies[109];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 109:
				r = enemies[108];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 108:
				r = enemies[107];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 107:
				r = enemies[106];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 106:
				r = enemies[105];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 105:
				r = enemies[104];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 104:
				r = enemies[103];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 103:
				r = enemies[102];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 102:
				r = enemies[101];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 101:
				r = enemies[100];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 100:
				r = enemies[99];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 99:
				r = enemies[98];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 98:
				r = enemies[97];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 97:
				r = enemies[96];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 96:
				r = enemies[95];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 95:
				r = enemies[94];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 94:
				r = enemies[93];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 93:
				r = enemies[92];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 92:
				r = enemies[91];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 91:
				r = enemies[90];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 90:
				r = enemies[89];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 89:
				r = enemies[88];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 88:
				r = enemies[87];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 87:
				r = enemies[86];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 86:
				r = enemies[85];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 85:
				r = enemies[84];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 84:
				r = enemies[83];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 83:
				r = enemies[82];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 82:
				r = enemies[81];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 81:
				r = enemies[80];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 80:
				r = enemies[79];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 79:
				r = enemies[78];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 78:
				r = enemies[77];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 77:
				r = enemies[76];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 76:
				r = enemies[75];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 75:
				r = enemies[74];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 74:
				r = enemies[73];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 73:
				r = enemies[72];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 72:
				r = enemies[71];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 71:
				r = enemies[70];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 70:
				r = enemies[69];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 69:
				r = enemies[68];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 68:
				r = enemies[67];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 67:
				r = enemies[66];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 66:
				r = enemies[65];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 65:
				r = enemies[64];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 64:
				r = enemies[63];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 63:
				r = enemies[62];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 62:
				r = enemies[61];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 61:
				r = enemies[60];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 60:
				r = enemies[59];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 59:
				r = enemies[58];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 58:
				r = enemies[57];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 57:
				r = enemies[56];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 56:
				r = enemies[55];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 55:
				r = enemies[54];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 54:
				r = enemies[53];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 53:
				r = enemies[52];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 52:
				r = enemies[51];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 51:
				r = enemies[50];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 50:
				r = enemies[49];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 49:
				r = enemies[48];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 48:
				r = enemies[47];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 47:
				r = enemies[46];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 46:
				r = enemies[45];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 45:
				r = enemies[44];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 44:
				r = enemies[43];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 43:
				r = enemies[42];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 42:
				r = enemies[41];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 41:
				r = enemies[40];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 40:
				r = enemies[39];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 39:
				r = enemies[38];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 38:
				r = enemies[37];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 37:
				r = enemies[36];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 36:
				r = enemies[35];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 35:
				r = enemies[34];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 34:
				r = enemies[33];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 33:
				r = enemies[32];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 32:
				r = enemies[31];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 31:
				r = enemies[30];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 30:
				r = enemies[29];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 29:
				r = enemies[28];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 28:
				r = enemies[27];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 27:
				r = enemies[26];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 26:
				r = enemies[25];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 25:
				r = enemies[24];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 24:
				r = enemies[23];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 23:
				r = enemies[22];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 22:
				r = enemies[21];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 21:
				r = enemies[20];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 20:
				r = enemies[19];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 19:
				r = enemies[18];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 18:
				r = enemies[17];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 17:
				r = enemies[16];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 16:
				r = enemies[15];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 15:
				r = enemies[14];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 14:
				r = enemies[13];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 13:
				r = enemies[12];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 12:
				r = enemies[11];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 11:
				r = enemies[10];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 10:
				r = enemies[9];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 9:
				r = enemies[8];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 8:
				r = enemies[7];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 7:
				r = enemies[6];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 6:
				r = enemies[5];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 5:
				r = enemies[4];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 4:
				r = enemies[3];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 3:
				r = enemies[2];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 2:
				r = enemies[1];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 1:
				r = enemies[0];
				if (threatLevel >= 20) {
					break;
				}
				switch (r.type) {
					case CARRIER:
						threatLevel += 2;
						break;
					case AMPLIFIER:
						break;
					case BOOSTER:
						threatLevel += 5;
						break;
					case LAUNCHER:
						threatLevel += 7;
						break;
					case DESTABILIZER:
						threatLevel += 8;
						break;
					case HEADQUARTERS:
						break;
					default:
						break;
				}
			case 0:
				break;
		}
	}

    public MapLocation safeSpreadOutLocation() throws GameActionException {
        MapLocation loc = pos;
        switch(friends.length) { default:
            case 69: switch(friends[68].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[68].location));default:
            loc = loc.add(friends[68].location.directionTo(loc));
        }case 68: switch(friends[67].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[67].location));default:
            loc = loc.add(friends[67].location.directionTo(loc));
        }case 67: switch(friends[66].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[66].location));default:
            loc = loc.add(friends[66].location.directionTo(loc));
        }case 66: switch(friends[65].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[65].location));default:
            loc = loc.add(friends[65].location.directionTo(loc));
        }case 65: switch(friends[64].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[64].location));default:
            loc = loc.add(friends[64].location.directionTo(loc));
        }case 64: switch(friends[63].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[63].location));default:
            loc = loc.add(friends[63].location.directionTo(loc));
        }case 63: switch(friends[62].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[62].location));default:
            loc = loc.add(friends[62].location.directionTo(loc));
        }case 62: switch(friends[61].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[61].location));default:
            loc = loc.add(friends[61].location.directionTo(loc));
        }case 61: switch(friends[60].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[60].location));default:
            loc = loc.add(friends[60].location.directionTo(loc));
        }case 60: switch(friends[59].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[59].location));default:
            loc = loc.add(friends[59].location.directionTo(loc));
        }case 59: switch(friends[58].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[58].location));default:
            loc = loc.add(friends[58].location.directionTo(loc));
        }case 58: switch(friends[57].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[57].location));default:
            loc = loc.add(friends[57].location.directionTo(loc));
        }case 57: switch(friends[56].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[56].location));default:
            loc = loc.add(friends[56].location.directionTo(loc));
        }case 56: switch(friends[55].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[55].location));default:
            loc = loc.add(friends[55].location.directionTo(loc));
        }case 55: switch(friends[54].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[54].location));default:
            loc = loc.add(friends[54].location.directionTo(loc));
        }case 54: switch(friends[53].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[53].location));default:
            loc = loc.add(friends[53].location.directionTo(loc));
        }case 53: switch(friends[52].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[52].location));default:
            loc = loc.add(friends[52].location.directionTo(loc));
        }case 52: switch(friends[51].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[51].location));default:
            loc = loc.add(friends[51].location.directionTo(loc));
        }case 51: switch(friends[50].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[50].location));default:
            loc = loc.add(friends[50].location.directionTo(loc));
        }case 50: switch(friends[49].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[49].location));default:
            loc = loc.add(friends[49].location.directionTo(loc));
        }case 49: switch(friends[48].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[48].location));default:
            loc = loc.add(friends[48].location.directionTo(loc));
        }case 48: switch(friends[47].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[47].location));default:
            loc = loc.add(friends[47].location.directionTo(loc));
        }case 47: switch(friends[46].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[46].location));default:
            loc = loc.add(friends[46].location.directionTo(loc));
        }case 46: switch(friends[45].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[45].location));default:
            loc = loc.add(friends[45].location.directionTo(loc));
        }case 45: switch(friends[44].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[44].location));default:
            loc = loc.add(friends[44].location.directionTo(loc));
        }case 44: switch(friends[43].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[43].location));default:
            loc = loc.add(friends[43].location.directionTo(loc));
        }case 43: switch(friends[42].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[42].location));default:
            loc = loc.add(friends[42].location.directionTo(loc));
        }case 42: switch(friends[41].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[41].location));default:
            loc = loc.add(friends[41].location.directionTo(loc));
        }case 41: switch(friends[40].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[40].location));default:
            loc = loc.add(friends[40].location.directionTo(loc));
        }case 40: switch(friends[39].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[39].location));default:
            loc = loc.add(friends[39].location.directionTo(loc));
        }case 39: switch(friends[38].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[38].location));default:
            loc = loc.add(friends[38].location.directionTo(loc));
        }case 38: switch(friends[37].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[37].location));default:
            loc = loc.add(friends[37].location.directionTo(loc));
        }case 37: switch(friends[36].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[36].location));default:
            loc = loc.add(friends[36].location.directionTo(loc));
        }case 36: switch(friends[35].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[35].location));default:
            loc = loc.add(friends[35].location.directionTo(loc));
        }case 35: switch(friends[34].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[34].location));default:
            loc = loc.add(friends[34].location.directionTo(loc));
        }case 34: switch(friends[33].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[33].location));default:
            loc = loc.add(friends[33].location.directionTo(loc));
        }case 33: switch(friends[32].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[32].location));default:
            loc = loc.add(friends[32].location.directionTo(loc));
        }case 32: switch(friends[31].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[31].location));default:
            loc = loc.add(friends[31].location.directionTo(loc));
        }case 31: switch(friends[30].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[30].location));default:
            loc = loc.add(friends[30].location.directionTo(loc));
        }case 30: switch(friends[29].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[29].location));default:
            loc = loc.add(friends[29].location.directionTo(loc));
        }case 29: switch(friends[28].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[28].location));default:
            loc = loc.add(friends[28].location.directionTo(loc));
        }case 28: switch(friends[27].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[27].location));default:
            loc = loc.add(friends[27].location.directionTo(loc));
        }case 27: switch(friends[26].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[26].location));default:
            loc = loc.add(friends[26].location.directionTo(loc));
        }case 26: switch(friends[25].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[25].location));default:
            loc = loc.add(friends[25].location.directionTo(loc));
        }case 25: switch(friends[24].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[24].location));default:
            loc = loc.add(friends[24].location.directionTo(loc));
        }case 24: switch(friends[23].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[23].location));default:
            loc = loc.add(friends[23].location.directionTo(loc));
        }case 23: switch(friends[22].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[22].location));default:
            loc = loc.add(friends[22].location.directionTo(loc));
        }case 22: switch(friends[21].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[21].location));default:
            loc = loc.add(friends[21].location.directionTo(loc));
        }case 21: switch(friends[20].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[20].location));default:
            loc = loc.add(friends[20].location.directionTo(loc));
        }case 20: switch(friends[19].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[19].location));default:
            loc = loc.add(friends[19].location.directionTo(loc));
        }case 19: switch(friends[18].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[18].location));default:
            loc = loc.add(friends[18].location.directionTo(loc));
        }case 18: switch(friends[17].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[17].location));default:
            loc = loc.add(friends[17].location.directionTo(loc));
        }case 17: switch(friends[16].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[16].location));default:
            loc = loc.add(friends[16].location.directionTo(loc));
        }case 16: switch(friends[15].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[15].location));default:
            loc = loc.add(friends[15].location.directionTo(loc));
        }case 15: switch(friends[14].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[14].location));default:
            loc = loc.add(friends[14].location.directionTo(loc));
        }case 14: switch(friends[13].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[13].location));default:
            loc = loc.add(friends[13].location.directionTo(loc));
        }case 13: switch(friends[12].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[12].location));default:
            loc = loc.add(friends[12].location.directionTo(loc));
        }case 12: switch(friends[11].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[11].location));default:
            loc = loc.add(friends[11].location.directionTo(loc));
        }case 11: switch(friends[10].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[10].location));default:
            loc = loc.add(friends[10].location.directionTo(loc));
        }case 10: switch(friends[9].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[9].location));default:
            loc = loc.add(friends[9].location.directionTo(loc));
        }case 9: switch(friends[8].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[8].location));default:
            loc = loc.add(friends[8].location.directionTo(loc));
        }case 8: switch(friends[7].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[7].location));default:
            loc = loc.add(friends[7].location.directionTo(loc));
        }case 7: switch(friends[6].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[6].location));default:
            loc = loc.add(friends[6].location.directionTo(loc));
        }case 6: switch(friends[5].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[5].location));default:
            loc = loc.add(friends[5].location.directionTo(loc));
        }case 5: switch(friends[4].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[4].location));default:
            loc = loc.add(friends[4].location.directionTo(loc));
        }case 4: switch(friends[3].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[3].location));default:
            loc = loc.add(friends[3].location.directionTo(loc));
        }case 3: switch(friends[2].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[2].location));default:
            loc = loc.add(friends[2].location.directionTo(loc));
        }case 2: switch(friends[1].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[1].location));default:
            loc = loc.add(friends[1].location.directionTo(loc));
        }case 1: switch(friends[0].type) {
case BOOSTER: 
case LAUNCHER: 
case CARRIER: 
            loc = loc.add(loc.directionTo(friends[0].location));default:
            loc = loc.add(friends[0].location.directionTo(loc));
        }case 0: } return loc;}
		
	public MapLocation runAwayLocation() throws GameActionException {
			MapLocation loc = pos;
			switch(enemies.length) { default:
				case 69: switch(enemies[68].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[68].location.directionTo(loc));default:
			}case 68: switch(enemies[67].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[67].location.directionTo(loc));default:
			}case 67: switch(enemies[66].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[66].location.directionTo(loc));default:
			}case 66: switch(enemies[65].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[65].location.directionTo(loc));default:
			}case 65: switch(enemies[64].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[64].location.directionTo(loc));default:
			}case 64: switch(enemies[63].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[63].location.directionTo(loc));default:
			}case 63: switch(enemies[62].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[62].location.directionTo(loc));default:
			}case 62: switch(enemies[61].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[61].location.directionTo(loc));default:
			}case 61: switch(enemies[60].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[60].location.directionTo(loc));default:
			}case 60: switch(enemies[59].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[59].location.directionTo(loc));default:
			}case 59: switch(enemies[58].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[58].location.directionTo(loc));default:
			}case 58: switch(enemies[57].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[57].location.directionTo(loc));default:
			}case 57: switch(enemies[56].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[56].location.directionTo(loc));default:
			}case 56: switch(enemies[55].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[55].location.directionTo(loc));default:
			}case 55: switch(enemies[54].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[54].location.directionTo(loc));default:
			}case 54: switch(enemies[53].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[53].location.directionTo(loc));default:
			}case 53: switch(enemies[52].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[52].location.directionTo(loc));default:
			}case 52: switch(enemies[51].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[51].location.directionTo(loc));default:
			}case 51: switch(enemies[50].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[50].location.directionTo(loc));default:
			}case 50: switch(enemies[49].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[49].location.directionTo(loc));default:
			}case 49: switch(enemies[48].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[48].location.directionTo(loc));default:
			}case 48: switch(enemies[47].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[47].location.directionTo(loc));default:
			}case 47: switch(enemies[46].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[46].location.directionTo(loc));default:
			}case 46: switch(enemies[45].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[45].location.directionTo(loc));default:
			}case 45: switch(enemies[44].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[44].location.directionTo(loc));default:
			}case 44: switch(enemies[43].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[43].location.directionTo(loc));default:
			}case 43: switch(enemies[42].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[42].location.directionTo(loc));default:
			}case 42: switch(enemies[41].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[41].location.directionTo(loc));default:
			}case 41: switch(enemies[40].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[40].location.directionTo(loc));default:
			}case 40: switch(enemies[39].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[39].location.directionTo(loc));default:
			}case 39: switch(enemies[38].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[38].location.directionTo(loc));default:
			}case 38: switch(enemies[37].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[37].location.directionTo(loc));default:
			}case 37: switch(enemies[36].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[36].location.directionTo(loc));default:
			}case 36: switch(enemies[35].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[35].location.directionTo(loc));default:
			}case 35: switch(enemies[34].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[34].location.directionTo(loc));default:
			}case 34: switch(enemies[33].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[33].location.directionTo(loc));default:
			}case 33: switch(enemies[32].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[32].location.directionTo(loc));default:
			}case 32: switch(enemies[31].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[31].location.directionTo(loc));default:
			}case 31: switch(enemies[30].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[30].location.directionTo(loc));default:
			}case 30: switch(enemies[29].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[29].location.directionTo(loc));default:
			}case 29: switch(enemies[28].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[28].location.directionTo(loc));default:
			}case 28: switch(enemies[27].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[27].location.directionTo(loc));default:
			}case 27: switch(enemies[26].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[26].location.directionTo(loc));default:
			}case 26: switch(enemies[25].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[25].location.directionTo(loc));default:
			}case 25: switch(enemies[24].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[24].location.directionTo(loc));default:
			}case 24: switch(enemies[23].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[23].location.directionTo(loc));default:
			}case 23: switch(enemies[22].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[22].location.directionTo(loc));default:
			}case 22: switch(enemies[21].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[21].location.directionTo(loc));default:
			}case 21: switch(enemies[20].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[20].location.directionTo(loc));default:
			}case 20: switch(enemies[19].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[19].location.directionTo(loc));default:
			}case 19: switch(enemies[18].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[18].location.directionTo(loc));default:
			}case 18: switch(enemies[17].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[17].location.directionTo(loc));default:
			}case 17: switch(enemies[16].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[16].location.directionTo(loc));default:
			}case 16: switch(enemies[15].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[15].location.directionTo(loc));default:
			}case 15: switch(enemies[14].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[14].location.directionTo(loc));default:
			}case 14: switch(enemies[13].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[13].location.directionTo(loc));default:
			}case 13: switch(enemies[12].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[12].location.directionTo(loc));default:
			}case 12: switch(enemies[11].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[11].location.directionTo(loc));default:
			}case 11: switch(enemies[10].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[10].location.directionTo(loc));default:
			}case 10: switch(enemies[9].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[9].location.directionTo(loc));default:
			}case 9: switch(enemies[8].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[8].location.directionTo(loc));default:
			}case 8: switch(enemies[7].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[7].location.directionTo(loc));default:
			}case 7: switch(enemies[6].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[6].location.directionTo(loc));default:
			}case 6: switch(enemies[5].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[5].location.directionTo(loc));default:
			}case 5: switch(enemies[4].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[4].location.directionTo(loc));default:
			}case 4: switch(enemies[3].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[3].location.directionTo(loc));default:
			}case 3: switch(enemies[2].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[2].location.directionTo(loc));default:
			}case 2: switch(enemies[1].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[1].location.directionTo(loc));default:
			}case 1: switch(enemies[0].type) {
	case CARRIER: 
	case LAUNCHER: 
	case DESTABILIZER: 
				loc = loc.add(enemies[0].location.directionTo(loc));default:
			}case 0: } switch(friends.length) { default:case 69: switch(friends[68].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[68].location));default:
			}case 68: switch(friends[67].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[67].location));default:
			}case 67: switch(friends[66].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[66].location));default:
			}case 66: switch(friends[65].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[65].location));default:
			}case 65: switch(friends[64].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[64].location));default:
			}case 64: switch(friends[63].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[63].location));default:
			}case 63: switch(friends[62].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[62].location));default:
			}case 62: switch(friends[61].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[61].location));default:
			}case 61: switch(friends[60].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[60].location));default:
			}case 60: switch(friends[59].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[59].location));default:
			}case 59: switch(friends[58].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[58].location));default:
			}case 58: switch(friends[57].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[57].location));default:
			}case 57: switch(friends[56].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[56].location));default:
			}case 56: switch(friends[55].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[55].location));default:
			}case 55: switch(friends[54].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[54].location));default:
			}case 54: switch(friends[53].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[53].location));default:
			}case 53: switch(friends[52].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[52].location));default:
			}case 52: switch(friends[51].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[51].location));default:
			}case 51: switch(friends[50].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[50].location));default:
			}case 50: switch(friends[49].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[49].location));default:
			}case 49: switch(friends[48].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[48].location));default:
			}case 48: switch(friends[47].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[47].location));default:
			}case 47: switch(friends[46].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[46].location));default:
			}case 46: switch(friends[45].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[45].location));default:
			}case 45: switch(friends[44].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[44].location));default:
			}case 44: switch(friends[43].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[43].location));default:
			}case 43: switch(friends[42].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[42].location));default:
			}case 42: switch(friends[41].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[41].location));default:
			}case 41: switch(friends[40].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[40].location));default:
			}case 40: switch(friends[39].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[39].location));default:
			}case 39: switch(friends[38].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[38].location));default:
			}case 38: switch(friends[37].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[37].location));default:
			}case 37: switch(friends[36].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[36].location));default:
			}case 36: switch(friends[35].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[35].location));default:
			}case 35: switch(friends[34].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[34].location));default:
			}case 34: switch(friends[33].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[33].location));default:
			}case 33: switch(friends[32].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[32].location));default:
			}case 32: switch(friends[31].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[31].location));default:
			}case 31: switch(friends[30].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[30].location));default:
			}case 30: switch(friends[29].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[29].location));default:
			}case 29: switch(friends[28].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[28].location));default:
			}case 28: switch(friends[27].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[27].location));default:
			}case 27: switch(friends[26].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[26].location));default:
			}case 26: switch(friends[25].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[25].location));default:
			}case 25: switch(friends[24].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[24].location));default:
			}case 24: switch(friends[23].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[23].location));default:
			}case 23: switch(friends[22].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[22].location));default:
			}case 22: switch(friends[21].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[21].location));default:
			}case 21: switch(friends[20].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[20].location));default:
			}case 20: switch(friends[19].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[19].location));default:
			}case 19: switch(friends[18].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[18].location));default:
			}case 18: switch(friends[17].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[17].location));default:
			}case 17: switch(friends[16].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[16].location));default:
			}case 16: switch(friends[15].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[15].location));default:
			}case 15: switch(friends[14].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[14].location));default:
			}case 14: switch(friends[13].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[13].location));default:
			}case 13: switch(friends[12].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[12].location));default:
			}case 12: switch(friends[11].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[11].location));default:
			}case 11: switch(friends[10].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[10].location));default:
			}case 10: switch(friends[9].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[9].location));default:
			}case 9: switch(friends[8].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[8].location));default:
			}case 8: switch(friends[7].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[7].location));default:
			}case 7: switch(friends[6].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[6].location));default:
			}case 6: switch(friends[5].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[5].location));default:
			}case 5: switch(friends[4].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[4].location));default:
			}case 4: switch(friends[3].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[3].location));default:
			}case 3: switch(friends[2].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[2].location));default:
			}case 2: switch(friends[1].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[1].location));default:
			}case 1: switch(friends[0].type) {
	case LAUNCHER: 
				loc = loc.add(loc.directionTo(friends[0].location));default:
			}case 0: } return loc;}
	
}
