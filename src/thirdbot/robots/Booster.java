package thirdbot.robots;

import battlecode.common.*;
import thirdbot.coordination.*;
import thirdbot.navigation.*;

public class Booster extends Unit {

	Navigator navigator;

	public Booster(RobotController rc) {
		super(rc);
	}

	@Override
	public void setup() {
		super.setup();
		navigator = new Navigator(this, rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();
		navigator.needToPrepareMove = true;
	}

	@Override
	public void runTurn() throws GameActionException {
		if(rc.canBoost()) {
			rc.boost();
		}
		MapLocation loc = boosterMoveLocation();
		navigator.move(loc);
		navigator.move(loc);
	}

    private MapLocation boosterMoveLocation() throws GameActionException {
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
        }case 0: } switch(friends.length) { default:case 69: switch(friends[68].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[68].location));
        }case 68: switch(friends[67].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[67].location));
        }case 67: switch(friends[66].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[66].location));
        }case 66: switch(friends[65].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[65].location));
        }case 65: switch(friends[64].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[64].location));
        }case 64: switch(friends[63].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[63].location));
        }case 63: switch(friends[62].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[62].location));
        }case 62: switch(friends[61].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[61].location));
        }case 61: switch(friends[60].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[60].location));
        }case 60: switch(friends[59].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[59].location));
        }case 59: switch(friends[58].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[58].location));
        }case 58: switch(friends[57].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[57].location));
        }case 57: switch(friends[56].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[56].location));
        }case 56: switch(friends[55].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[55].location));
        }case 55: switch(friends[54].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[54].location));
        }case 54: switch(friends[53].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[53].location));
        }case 53: switch(friends[52].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[52].location));
        }case 52: switch(friends[51].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[51].location));
        }case 51: switch(friends[50].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[50].location));
        }case 50: switch(friends[49].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[49].location));
        }case 49: switch(friends[48].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[48].location));
        }case 48: switch(friends[47].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[47].location));
        }case 47: switch(friends[46].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[46].location));
        }case 46: switch(friends[45].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[45].location));
        }case 45: switch(friends[44].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[44].location));
        }case 44: switch(friends[43].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[43].location));
        }case 43: switch(friends[42].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[42].location));
        }case 42: switch(friends[41].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[41].location));
        }case 41: switch(friends[40].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[40].location));
        }case 40: switch(friends[39].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[39].location));
        }case 39: switch(friends[38].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[38].location));
        }case 38: switch(friends[37].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[37].location));
        }case 37: switch(friends[36].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[36].location));
        }case 36: switch(friends[35].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[35].location));
        }case 35: switch(friends[34].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[34].location));
        }case 34: switch(friends[33].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[33].location));
        }case 33: switch(friends[32].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[32].location));
        }case 32: switch(friends[31].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[31].location));
        }case 31: switch(friends[30].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[30].location));
        }case 30: switch(friends[29].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[29].location));
        }case 29: switch(friends[28].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[28].location));
        }case 28: switch(friends[27].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[27].location));
        }case 27: switch(friends[26].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[26].location));
        }case 26: switch(friends[25].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[25].location));
        }case 25: switch(friends[24].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[24].location));
        }case 24: switch(friends[23].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[23].location));
        }case 23: switch(friends[22].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[22].location));
        }case 22: switch(friends[21].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[21].location));
        }case 21: switch(friends[20].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[20].location));
        }case 20: switch(friends[19].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[19].location));
        }case 19: switch(friends[18].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[18].location));
        }case 18: switch(friends[17].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[17].location));
        }case 17: switch(friends[16].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[16].location));
        }case 16: switch(friends[15].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[15].location));
        }case 15: switch(friends[14].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[14].location));
        }case 14: switch(friends[13].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[13].location));
        }case 13: switch(friends[12].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[12].location));
        }case 12: switch(friends[11].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[11].location));
        }case 11: switch(friends[10].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[10].location));
        }case 10: switch(friends[9].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[9].location));
        }case 9: switch(friends[8].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[8].location));
        }case 8: switch(friends[7].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[7].location));
        }case 7: switch(friends[6].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[6].location));
        }case 6: switch(friends[5].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[5].location));
        }case 5: switch(friends[4].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[4].location));
        }case 4: switch(friends[3].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[3].location));
        }case 3: switch(friends[2].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[2].location));
        }case 2: switch(friends[1].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[1].location));
        }case 1: switch(friends[0].type) {case HEADQUARTERS: break; default: loc = loc.add(loc.directionTo(friends[0].location));
        }case 0: } return loc;}

}