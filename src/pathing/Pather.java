package pathing;

import battlecode.common.*;
public class Pather {
    public static int color = 0;
    public static int[] cooldowns = new int[69];
    public static Direction[] currents = new Direction[69];
    public static Direction[] currented = new Direction[69];
    public static boolean[] dest = new boolean[69];
    public static Direction[] dirs = new Direction[69];
    public static boolean[] wait = new boolean[69];

    public static int[] costs = new int[70];
    public static boolean toCheck0 = false;
public static boolean toCheck1 = false;
public static boolean toCheck2 = false;
public static boolean toCheck3 = false;
public static boolean toCheck4 = false;
public static boolean toCheck5 = false;
public static boolean toCheck6 = false;
public static boolean toCheck7 = false;
public static boolean toCheck8 = false;
public static boolean toCheck9 = false;
public static boolean toCheck10 = false;
public static boolean toCheck11 = false;
public static boolean toCheck12 = false;
public static boolean toCheck13 = false;
public static boolean toCheck14 = false;
public static boolean toCheck15 = false;
public static boolean toCheck16 = false;
public static boolean toCheck17 = false;
public static boolean toCheck18 = false;
public static boolean toCheck19 = false;
public static boolean toCheck20 = false;
public static boolean toCheck21 = false;
public static boolean toCheck22 = false;
public static boolean toCheck23 = false;
public static boolean toCheck24 = false;
public static boolean toCheck25 = false;
public static boolean toCheck26 = false;
public static boolean toCheck27 = false;
public static boolean toCheck28 = false;
public static boolean toCheck29 = false;
public static boolean toCheck30 = false;
public static boolean toCheck31 = false;
public static boolean toCheck32 = false;
public static boolean toCheck33 = false;
public static boolean toCheck34 = false;
public static boolean toCheck35 = false;
public static boolean toCheck36 = false;
public static boolean toCheck37 = false;
public static boolean toCheck38 = false;
public static boolean toCheck39 = false;
public static boolean toCheck40 = false;
public static boolean toCheck41 = false;
public static boolean toCheck42 = false;
public static boolean toCheck43 = false;
public static boolean toCheck44 = false;
public static boolean toCheck45 = false;
public static boolean toCheck46 = false;
public static boolean toCheck47 = false;
public static boolean toCheck48 = false;
public static boolean toCheck49 = false;
public static boolean toCheck50 = false;
public static boolean toCheck51 = false;
public static boolean toCheck52 = false;
public static boolean toCheck53 = false;
public static boolean toCheck54 = false;
public static boolean toCheck55 = false;
public static boolean toCheck56 = false;
public static boolean toCheck57 = false;
public static boolean toCheck58 = false;
public static boolean toCheck59 = false;
public static boolean toCheck60 = false;
public static boolean toCheck61 = false;
public static boolean toCheck62 = false;
public static boolean toCheck63 = false;
public static boolean toCheck64 = false;
public static boolean toCheck65 = false;
public static boolean toCheck66 = false;
public static boolean toCheck67 = false;
public static boolean toCheck68 = false;

    public static int queueHead = 0;
public static int queue0 = 69;
public static int queue1 = 69;
public static int queue2 = 69;
public static int queue3 = 69;
public static int queue4 = 69;
public static int queue5 = 69;
public static int queue6 = 69;
public static int queue7 = 69;
public static int queue8 = 69;
public static int queue9 = 69;
public static int queue10 = 69;
public static int queue11 = 69;
public static int queue12 = 69;
public static int queue13 = 69;
public static int queue14 = 69;
public static int queue15 = 69;
public static int queue16 = 69;
public static int queue17 = 69;
public static int queue18 = 69;
public static int queue19 = 69;
public static int queue20 = 69;
public static int queue21 = 69;
public static int queue22 = 69;
public static int queue23 = 69;
public static int queue24 = 69;
public static int queue25 = 69;
public static int queue26 = 69;
public static int queue27 = 69;
public static int queue28 = 69;
public static int queue29 = 69;
public static int queue30 = 69;
public static int queue31 = 69;
public static int queue32 = 69;
public static int queue33 = 69;
public static int queue34 = 69;
public static int queue35 = 69;
public static int queue36 = 69;
public static int queue37 = 69;
public static int queue38 = 69;
public static int queue39 = 69;
public static int queue40 = 69;
public static int queue41 = 69;
public static int queue42 = 69;
public static int queue43 = 69;
public static int queue44 = 69;
public static int queue45 = 69;
public static int queue46 = 69;
public static int queue47 = 69;
public static int queue48 = 69;
public static int queue49 = 69;
public static int queue50 = 69;
public static int queue51 = 69;
public static int queue52 = 69;
public static int queue53 = 69;
public static int queue54 = 69;
public static int queue55 = 69;
public static int queue56 = 69;
public static int queue57 = 69;
public static int queue58 = 69;
public static int queue59 = 69;
public static int queue60 = 69;
public static int queue61 = 69;
public static int queue62 = 69;
public static int queue63 = 69;
public static int queue64 = 69;
public static int queue65 = 69;
public static int queue66 = 69;
public static int queue67 = 69;
public static int queue68 = 69;
    public static int encode(int x, int y) { switch(x) {
 case -4:

switch(y) {
case -2: return 0;
case -1: return 1;
case 0: return 2;
case 1: return 3;
case 2: return 4;
}
 case -3:

switch(y) {
case -3: return 5;
case -2: return 6;
case -1: return 7;
case 0: return 8;
case 1: return 9;
case 2: return 10;
case 3: return 11;
}
 case -2:

switch(y) {
case -4: return 12;
case -3: return 13;
case -2: return 14;
case -1: return 15;
case 0: return 16;
case 1: return 17;
case 2: return 18;
case 3: return 19;
case 4: return 20;
}
 case -1:

switch(y) {
case -4: return 21;
case -3: return 22;
case -2: return 23;
case -1: return 24;
case 0: return 25;
case 1: return 26;
case 2: return 27;
case 3: return 28;
case 4: return 29;
}
 case 0:

switch(y) {
case -4: return 30;
case -3: return 31;
case -2: return 32;
case -1: return 33;
case 0: return 34;
case 1: return 35;
case 2: return 36;
case 3: return 37;
case 4: return 38;
}
 case 1:

switch(y) {
case -4: return 39;
case -3: return 40;
case -2: return 41;
case -1: return 42;
case 0: return 43;
case 1: return 44;
case 2: return 45;
case 3: return 46;
case 4: return 47;
}
 case 2:

switch(y) {
case -4: return 48;
case -3: return 49;
case -2: return 50;
case -1: return 51;
case 0: return 52;
case 1: return 53;
case 2: return 54;
case 3: return 55;
case 4: return 56;
}
 case 3:

switch(y) {
case -3: return 57;
case -2: return 58;
case -1: return 59;
case 0: return 60;
case 1: return 61;
case 2: return 62;
case 3: return 63;
}
 case 4:

switch(y) {
case -2: return 64;
case -1: return 65;
case 0: return 66;
case 1: return 67;
case 2: return 68;
}
default: return 69;}}public static void addDestinations(int[][] diffs) {
        for (int[] d : diffs) {
            dest[encode(d[0], d[1])] = true;
        }
    }public static boolean getToCheck(int encoded) {
        switch(encoded) {
            
case 0: return toCheck0;
case 1: return toCheck1;
case 2: return toCheck2;
case 3: return toCheck3;
case 4: return toCheck4;
case 5: return toCheck5;
case 6: return toCheck6;
case 7: return toCheck7;
case 8: return toCheck8;
case 9: return toCheck9;
case 10: return toCheck10;
case 11: return toCheck11;
case 12: return toCheck12;
case 13: return toCheck13;
case 14: return toCheck14;
case 15: return toCheck15;
case 16: return toCheck16;
case 17: return toCheck17;
case 18: return toCheck18;
case 19: return toCheck19;
case 20: return toCheck20;
case 21: return toCheck21;
case 22: return toCheck22;
case 23: return toCheck23;
case 24: return toCheck24;
case 25: return toCheck25;
case 26: return toCheck26;
case 27: return toCheck27;
case 28: return toCheck28;
case 29: return toCheck29;
case 30: return toCheck30;
case 31: return toCheck31;
case 32: return toCheck32;
case 33: return toCheck33;
case 34: return toCheck34;
case 35: return toCheck35;
case 36: return toCheck36;
case 37: return toCheck37;
case 38: return toCheck38;
case 39: return toCheck39;
case 40: return toCheck40;
case 41: return toCheck41;
case 42: return toCheck42;
case 43: return toCheck43;
case 44: return toCheck44;
case 45: return toCheck45;
case 46: return toCheck46;
case 47: return toCheck47;
case 48: return toCheck48;
case 49: return toCheck49;
case 50: return toCheck50;
case 51: return toCheck51;
case 52: return toCheck52;
case 53: return toCheck53;
case 54: return toCheck54;
case 55: return toCheck55;
case 56: return toCheck56;
case 57: return toCheck57;
case 58: return toCheck58;
case 59: return toCheck59;
case 60: return toCheck60;
case 61: return toCheck61;
case 62: return toCheck62;
case 63: return toCheck63;
case 64: return toCheck64;
case 65: return toCheck65;
case 66: return toCheck66;
case 67: return toCheck67;
case 68: return toCheck68;default:return false;}}public static void setToCheck(int encoded) {
        switch(encoded) {
            
case 0: toCheck0 = true; break;
case 1: toCheck1 = true; break;
case 2: toCheck2 = true; break;
case 3: toCheck3 = true; break;
case 4: toCheck4 = true; break;
case 5: toCheck5 = true; break;
case 6: toCheck6 = true; break;
case 7: toCheck7 = true; break;
case 8: toCheck8 = true; break;
case 9: toCheck9 = true; break;
case 10: toCheck10 = true; break;
case 11: toCheck11 = true; break;
case 12: toCheck12 = true; break;
case 13: toCheck13 = true; break;
case 14: toCheck14 = true; break;
case 15: toCheck15 = true; break;
case 16: toCheck16 = true; break;
case 17: toCheck17 = true; break;
case 18: toCheck18 = true; break;
case 19: toCheck19 = true; break;
case 20: toCheck20 = true; break;
case 21: toCheck21 = true; break;
case 22: toCheck22 = true; break;
case 23: toCheck23 = true; break;
case 24: toCheck24 = true; break;
case 25: toCheck25 = true; break;
case 26: toCheck26 = true; break;
case 27: toCheck27 = true; break;
case 28: toCheck28 = true; break;
case 29: toCheck29 = true; break;
case 30: toCheck30 = true; break;
case 31: toCheck31 = true; break;
case 32: toCheck32 = true; break;
case 33: toCheck33 = true; break;
case 34: toCheck34 = true; break;
case 35: toCheck35 = true; break;
case 36: toCheck36 = true; break;
case 37: toCheck37 = true; break;
case 38: toCheck38 = true; break;
case 39: toCheck39 = true; break;
case 40: toCheck40 = true; break;
case 41: toCheck41 = true; break;
case 42: toCheck42 = true; break;
case 43: toCheck43 = true; break;
case 44: toCheck44 = true; break;
case 45: toCheck45 = true; break;
case 46: toCheck46 = true; break;
case 47: toCheck47 = true; break;
case 48: toCheck48 = true; break;
case 49: toCheck49 = true; break;
case 50: toCheck50 = true; break;
case 51: toCheck51 = true; break;
case 52: toCheck52 = true; break;
case 53: toCheck53 = true; break;
case 54: toCheck54 = true; break;
case 55: toCheck55 = true; break;
case 56: toCheck56 = true; break;
case 57: toCheck57 = true; break;
case 58: toCheck58 = true; break;
case 59: toCheck59 = true; break;
case 60: toCheck60 = true; break;
case 61: toCheck61 = true; break;
case 62: toCheck62 = true; break;
case 63: toCheck63 = true; break;
case 64: toCheck64 = true; break;
case 65: toCheck65 = true; break;
case 66: toCheck66 = true; break;
case 67: toCheck67 = true; break;
case 68: toCheck68 = true; break;default:}}public static void setChecked(int encoded) {
        switch(encoded) {
            
case 0: toCheck0 = false; break;
case 1: toCheck1 = false; break;
case 2: toCheck2 = false; break;
case 3: toCheck3 = false; break;
case 4: toCheck4 = false; break;
case 5: toCheck5 = false; break;
case 6: toCheck6 = false; break;
case 7: toCheck7 = false; break;
case 8: toCheck8 = false; break;
case 9: toCheck9 = false; break;
case 10: toCheck10 = false; break;
case 11: toCheck11 = false; break;
case 12: toCheck12 = false; break;
case 13: toCheck13 = false; break;
case 14: toCheck14 = false; break;
case 15: toCheck15 = false; break;
case 16: toCheck16 = false; break;
case 17: toCheck17 = false; break;
case 18: toCheck18 = false; break;
case 19: toCheck19 = false; break;
case 20: toCheck20 = false; break;
case 21: toCheck21 = false; break;
case 22: toCheck22 = false; break;
case 23: toCheck23 = false; break;
case 24: toCheck24 = false; break;
case 25: toCheck25 = false; break;
case 26: toCheck26 = false; break;
case 27: toCheck27 = false; break;
case 28: toCheck28 = false; break;
case 29: toCheck29 = false; break;
case 30: toCheck30 = false; break;
case 31: toCheck31 = false; break;
case 32: toCheck32 = false; break;
case 33: toCheck33 = false; break;
case 34: toCheck34 = false; break;
case 35: toCheck35 = false; break;
case 36: toCheck36 = false; break;
case 37: toCheck37 = false; break;
case 38: toCheck38 = false; break;
case 39: toCheck39 = false; break;
case 40: toCheck40 = false; break;
case 41: toCheck41 = false; break;
case 42: toCheck42 = false; break;
case 43: toCheck43 = false; break;
case 44: toCheck44 = false; break;
case 45: toCheck45 = false; break;
case 46: toCheck46 = false; break;
case 47: toCheck47 = false; break;
case 48: toCheck48 = false; break;
case 49: toCheck49 = false; break;
case 50: toCheck50 = false; break;
case 51: toCheck51 = false; break;
case 52: toCheck52 = false; break;
case 53: toCheck53 = false; break;
case 54: toCheck54 = false; break;
case 55: toCheck55 = false; break;
case 56: toCheck56 = false; break;
case 57: toCheck57 = false; break;
case 58: toCheck58 = false; break;
case 59: toCheck59 = false; break;
case 60: toCheck60 = false; break;
case 61: toCheck61 = false; break;
case 62: toCheck62 = false; break;
case 63: toCheck63 = false; break;
case 64: toCheck64 = false; break;
case 65: toCheck65 = false; break;
case 66: toCheck66 = false; break;
case 67: toCheck67 = false; break;
case 68: toCheck68 = false; break;default:}}public static int actualCooldown(RobotController rc) {
        RobotType type = rc.getType();
        if (type == RobotType.CARRIER) {
            return (int) (GameConstants.CARRIER_MOVEMENT_INTERCEPT
                    + GameConstants.CARRIER_MOVEMENT_SLOPE * rc.getWeight());
        } else {
            return type.movementCooldown;
        }
    }public static void reset(RobotController rc, MapLocation goalLocation) throws GameActionException{
        color = 0;
        MapLocation startLocation = rc.getLocation();
        int startLocationX = startLocation.x;
        int startLocationY = startLocation.y;
        Team myTeam = rc.getTeam();
        int cooldown = actualCooldown(rc);

        dest = new boolean[121];
        dest[encode(goalLocation.x-startLocationX, goalLocation.y-startLocationY)] = true;
        queueHead = 0;

        toCheck0 = false;
toCheck1 = false;
toCheck2 = false;
toCheck3 = false;
toCheck4 = false;
toCheck5 = false;
toCheck6 = false;
toCheck7 = false;
toCheck8 = false;
toCheck9 = false;
toCheck10 = false;
toCheck11 = false;
toCheck12 = false;
toCheck13 = false;
toCheck14 = false;
toCheck15 = false;
toCheck16 = false;
toCheck17 = false;
toCheck18 = false;
toCheck19 = false;
toCheck20 = false;
toCheck21 = false;
toCheck22 = false;
toCheck23 = false;
toCheck24 = false;
toCheck25 = false;
toCheck26 = false;
toCheck27 = false;
toCheck28 = false;
toCheck29 = false;
toCheck30 = false;
toCheck31 = false;
toCheck32 = false;
toCheck33 = false;
toCheck34 = false;
toCheck35 = false;
toCheck36 = false;
toCheck37 = false;
toCheck38 = false;
toCheck39 = false;
toCheck40 = false;
toCheck41 = false;
toCheck42 = false;
toCheck43 = false;
toCheck44 = false;
toCheck45 = false;
toCheck46 = false;
toCheck47 = false;
toCheck48 = false;
toCheck49 = false;
toCheck50 = false;
toCheck51 = false;
toCheck52 = false;
toCheck53 = false;
toCheck54 = false;
toCheck55 = false;
toCheck56 = false;
toCheck57 = false;
toCheck58 = false;
toCheck59 = false;
toCheck60 = false;
toCheck61 = false;
toCheck62 = false;
toCheck63 = false;
toCheck64 = false;
toCheck65 = false;
toCheck66 = false;
toCheck67 = false;
toCheck68 = false;
        costs[0] = 4400;
costs[1] = 4400;
costs[2] = 4400;
costs[3] = 4400;
costs[4] = 4400;
costs[5] = 3300;
costs[6] = 3300;
costs[7] = 3300;
costs[8] = 3300;
costs[9] = 3300;
costs[10] = 3300;
costs[11] = 3300;
costs[12] = 4400;
costs[13] = 3300;
costs[14] = 2200;
costs[15] = 2200;
costs[16] = 2200;
costs[17] = 2200;
costs[18] = 2200;
costs[19] = 3300;
costs[20] = 4400;
costs[21] = 4400;
costs[22] = 3300;
costs[23] = 2200;
costs[24] = 1100;
costs[25] = 1100;
costs[26] = 1100;
costs[27] = 2200;
costs[28] = 3300;
costs[29] = 4400;
costs[30] = 4400;
costs[31] = 3300;
costs[32] = 2200;
costs[33] = 1100;
costs[34] = 0;
costs[35] = 1100;
costs[36] = 2200;
costs[37] = 3300;
costs[38] = 4400;
costs[39] = 4400;
costs[40] = 3300;
costs[41] = 2200;
costs[42] = 1100;
costs[43] = 1100;
costs[44] = 1100;
costs[45] = 2200;
costs[46] = 3300;
costs[47] = 4400;
costs[48] = 4400;
costs[49] = 3300;
costs[50] = 2200;
costs[51] = 2200;
costs[52] = 2200;
costs[53] = 2200;
costs[54] = 2200;
costs[55] = 3300;
costs[56] = 4400;
costs[57] = 3300;
costs[58] = 3300;
costs[59] = 3300;
costs[60] = 3300;
costs[61] = 3300;
costs[62] = 3300;
costs[63] = 3300;
costs[64] = 4400;
costs[65] = 4400;
costs[66] = 4400;
costs[67] = 4400;
costs[68] = 4400;
costs[69] = Integer.MAX_VALUE;

        MapInfo[] infos = rc.senseNearbyMapInfos(goalLocation, goalLocation.distanceSquaredTo(startLocation));
        MapInfo info;
        int encoded;
        switch(infos.length) {
            default:
            
case 69:
info = infos[68];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 68:
info = infos[67];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 67:
info = infos[66];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 66:
info = infos[65];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 65:
info = infos[64];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 64:
info = infos[63];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 63:
info = infos[62];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 62:
info = infos[61];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 61:
info = infos[60];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 60:
info = infos[59];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 59:
info = infos[58];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 58:
info = infos[57];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 57:
info = infos[56];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 56:
info = infos[55];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 55:
info = infos[54];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 54:
info = infos[53];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 53:
info = infos[52];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 52:
info = infos[51];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 51:
info = infos[50];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 50:
info = infos[49];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 49:
info = infos[48];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 48:
info = infos[47];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 47:
info = infos[46];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 46:
info = infos[45];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 45:
info = infos[44];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 44:
info = infos[43];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 43:
info = infos[42];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 42:
info = infos[41];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 41:
info = infos[40];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 40:
info = infos[39];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 39:
info = infos[38];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 38:
info = infos[37];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 37:
info = infos[36];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 36:
info = infos[35];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 35:
info = infos[34];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 34:
info = infos[33];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 33:
info = infos[32];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 32:
info = infos[31];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 31:
info = infos[30];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 30:
info = infos[29];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 29:
info = infos[28];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 28:
info = infos[27];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 27:
info = infos[26];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 26:
info = infos[25];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 25:
info = infos[24];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 24:
info = infos[23];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 23:
info = infos[22];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 22:
info = infos[21];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 21:
info = infos[20];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 20:
info = infos[19];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 19:
info = infos[18];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 18:
info = infos[17];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 17:
info = infos[16];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 16:
info = infos[15];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 15:
info = infos[14];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 14:
info = infos[13];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 13:
info = infos[12];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 12:
info = infos[11];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 11:
info = infos[10];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 10:
info = infos[9];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 9:
info = infos[8];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 8:
info = infos[7];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 7:
info = infos[6];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 6:
info = infos[5];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 5:
info = infos[4];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 4:
info = infos[3];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 3:
info = infos[2];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 2:
info = infos[1];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }
case 1:
info = infos[0];
    if (info.isPassable() && rc.senseRobotAtLocation(info.getMapLocation()) == null) {
        encoded = encode(info.getMapLocation().x - startLocationX, info.getMapLocation().y - startLocationY);
        cooldowns[encoded] = (int) (cooldown * info.getCooldownMuliplier(myTeam));
        currents[encoded] = info.getCurrentDirection();
        setToCheck(encoded);
    }case 0:
    }
}public static int moveWithCurrent(int encoded) {
        switch(encoded) {
        case 0:
            switch(currents[0]) {
                case NORTH: return 1;
                case NORTHEAST: return 7;
                case EAST: return 6;
                case SOUTHEAST: return 5;
default:}
        case 1:
            switch(currents[1]) {
                case NORTH: return 2;
                case NORTHEAST: return 8;
                case EAST: return 7;
                case SOUTHEAST: return 6;
                case SOUTH: return 0;
default:}
        case 2:
            switch(currents[2]) {
                case NORTH: return 3;
                case NORTHEAST: return 9;
                case EAST: return 8;
                case SOUTHEAST: return 7;
                case SOUTH: return 1;
default:}
        case 3:
            switch(currents[3]) {
                case NORTH: return 4;
                case NORTHEAST: return 10;
                case EAST: return 9;
                case SOUTHEAST: return 8;
                case SOUTH: return 2;
default:}
        case 4:
            switch(currents[4]) {
                case NORTHEAST: return 11;
                case EAST: return 10;
                case SOUTHEAST: return 9;
                case SOUTH: return 3;
default:}
        case 5:
            switch(currents[5]) {
                case NORTHWEST: return 0;
                case NORTH: return 6;
                case NORTHEAST: return 14;
                case EAST: return 13;
                case SOUTHEAST: return 12;
default:}
        case 6:
            switch(currents[6]) {
                case WEST: return 0;
                case NORTHWEST: return 1;
                case NORTH: return 7;
                case NORTHEAST: return 15;
                case EAST: return 14;
                case SOUTHEAST: return 13;
                case SOUTH: return 5;
default:}
        case 7:
            switch(currents[7]) {
                case WEST: return 1;
                case NORTHWEST: return 2;
                case NORTH: return 8;
                case NORTHEAST: return 16;
                case EAST: return 15;
                case SOUTHEAST: return 14;
                case SOUTH: return 6;
                case SOUTHWEST: return 0;
default:}
        case 8:
            switch(currents[8]) {
                case WEST: return 2;
                case NORTHWEST: return 3;
                case NORTH: return 9;
                case NORTHEAST: return 17;
                case EAST: return 16;
                case SOUTHEAST: return 15;
                case SOUTH: return 7;
                case SOUTHWEST: return 1;
default:}
        case 9:
            switch(currents[9]) {
                case WEST: return 3;
                case NORTHWEST: return 4;
                case NORTH: return 10;
                case NORTHEAST: return 18;
                case EAST: return 17;
                case SOUTHEAST: return 16;
                case SOUTH: return 8;
                case SOUTHWEST: return 2;
default:}
        case 10:
            switch(currents[10]) {
                case WEST: return 4;
                case NORTH: return 11;
                case NORTHEAST: return 19;
                case EAST: return 18;
                case SOUTHEAST: return 17;
                case SOUTH: return 9;
                case SOUTHWEST: return 3;
default:}
        case 11:
            switch(currents[11]) {
                case NORTHEAST: return 20;
                case EAST: return 19;
                case SOUTHEAST: return 18;
                case SOUTH: return 10;
                case SOUTHWEST: return 4;
default:}
        case 12:
            switch(currents[12]) {
                case NORTHWEST: return 5;
                case NORTH: return 13;
                case NORTHEAST: return 22;
                case EAST: return 21;
default:}
        case 13:
            switch(currents[13]) {
                case WEST: return 5;
                case NORTHWEST: return 6;
                case NORTH: return 14;
                case NORTHEAST: return 23;
                case EAST: return 22;
                case SOUTHEAST: return 21;
                case SOUTH: return 12;
default:}
        case 14:
            switch(currents[14]) {
                case WEST: return 6;
                case NORTHWEST: return 7;
                case NORTH: return 15;
                case NORTHEAST: return 24;
                case EAST: return 23;
                case SOUTHEAST: return 22;
                case SOUTH: return 13;
                case SOUTHWEST: return 5;
default:}
        case 15:
            switch(currents[15]) {
                case WEST: return 7;
                case NORTHWEST: return 8;
                case NORTH: return 16;
                case NORTHEAST: return 25;
                case EAST: return 24;
                case SOUTHEAST: return 23;
                case SOUTH: return 14;
                case SOUTHWEST: return 6;
default:}
        case 16:
            switch(currents[16]) {
                case WEST: return 8;
                case NORTHWEST: return 9;
                case NORTH: return 17;
                case NORTHEAST: return 26;
                case EAST: return 25;
                case SOUTHEAST: return 24;
                case SOUTH: return 15;
                case SOUTHWEST: return 7;
default:}
        case 17:
            switch(currents[17]) {
                case WEST: return 9;
                case NORTHWEST: return 10;
                case NORTH: return 18;
                case NORTHEAST: return 27;
                case EAST: return 26;
                case SOUTHEAST: return 25;
                case SOUTH: return 16;
                case SOUTHWEST: return 8;
default:}
        case 18:
            switch(currents[18]) {
                case WEST: return 10;
                case NORTHWEST: return 11;
                case NORTH: return 19;
                case NORTHEAST: return 28;
                case EAST: return 27;
                case SOUTHEAST: return 26;
                case SOUTH: return 17;
                case SOUTHWEST: return 9;
default:}
        case 19:
            switch(currents[19]) {
                case WEST: return 11;
                case NORTH: return 20;
                case NORTHEAST: return 29;
                case EAST: return 28;
                case SOUTHEAST: return 27;
                case SOUTH: return 18;
                case SOUTHWEST: return 10;
default:}
        case 20:
            switch(currents[20]) {
                case EAST: return 29;
                case SOUTHEAST: return 28;
                case SOUTH: return 19;
                case SOUTHWEST: return 11;
default:}
        case 21:
            switch(currents[21]) {
                case WEST: return 12;
                case NORTHWEST: return 13;
                case NORTH: return 22;
                case NORTHEAST: return 31;
                case EAST: return 30;
default:}
        case 22:
            switch(currents[22]) {
                case WEST: return 13;
                case NORTHWEST: return 14;
                case NORTH: return 23;
                case NORTHEAST: return 32;
                case EAST: return 31;
                case SOUTHEAST: return 30;
                case SOUTH: return 21;
                case SOUTHWEST: return 12;
default:}
        case 23:
            switch(currents[23]) {
                case WEST: return 14;
                case NORTHWEST: return 15;
                case NORTH: return 24;
                case NORTHEAST: return 33;
                case EAST: return 32;
                case SOUTHEAST: return 31;
                case SOUTH: return 22;
                case SOUTHWEST: return 13;
default:}
        case 24:
            switch(currents[24]) {
                case WEST: return 15;
                case NORTHWEST: return 16;
                case NORTH: return 25;
                case NORTHEAST: return 34;
                case EAST: return 33;
                case SOUTHEAST: return 32;
                case SOUTH: return 23;
                case SOUTHWEST: return 14;
default:}
        case 25:
            switch(currents[25]) {
                case WEST: return 16;
                case NORTHWEST: return 17;
                case NORTH: return 26;
                case NORTHEAST: return 35;
                case EAST: return 34;
                case SOUTHEAST: return 33;
                case SOUTH: return 24;
                case SOUTHWEST: return 15;
default:}
        case 26:
            switch(currents[26]) {
                case WEST: return 17;
                case NORTHWEST: return 18;
                case NORTH: return 27;
                case NORTHEAST: return 36;
                case EAST: return 35;
                case SOUTHEAST: return 34;
                case SOUTH: return 25;
                case SOUTHWEST: return 16;
default:}
        case 27:
            switch(currents[27]) {
                case WEST: return 18;
                case NORTHWEST: return 19;
                case NORTH: return 28;
                case NORTHEAST: return 37;
                case EAST: return 36;
                case SOUTHEAST: return 35;
                case SOUTH: return 26;
                case SOUTHWEST: return 17;
default:}
        case 28:
            switch(currents[28]) {
                case WEST: return 19;
                case NORTHWEST: return 20;
                case NORTH: return 29;
                case NORTHEAST: return 38;
                case EAST: return 37;
                case SOUTHEAST: return 36;
                case SOUTH: return 27;
                case SOUTHWEST: return 18;
default:}
        case 29:
            switch(currents[29]) {
                case WEST: return 20;
                case EAST: return 38;
                case SOUTHEAST: return 37;
                case SOUTH: return 28;
                case SOUTHWEST: return 19;
default:}
        case 30:
            switch(currents[30]) {
                case WEST: return 21;
                case NORTHWEST: return 22;
                case NORTH: return 31;
                case NORTHEAST: return 40;
                case EAST: return 39;
default:}
        case 31:
            switch(currents[31]) {
                case WEST: return 22;
                case NORTHWEST: return 23;
                case NORTH: return 32;
                case NORTHEAST: return 41;
                case EAST: return 40;
                case SOUTHEAST: return 39;
                case SOUTH: return 30;
                case SOUTHWEST: return 21;
default:}
        case 32:
            switch(currents[32]) {
                case WEST: return 23;
                case NORTHWEST: return 24;
                case NORTH: return 33;
                case NORTHEAST: return 42;
                case EAST: return 41;
                case SOUTHEAST: return 40;
                case SOUTH: return 31;
                case SOUTHWEST: return 22;
default:}
        case 33:
            switch(currents[33]) {
                case WEST: return 24;
                case NORTHWEST: return 25;
                case NORTH: return 34;
                case NORTHEAST: return 43;
                case EAST: return 42;
                case SOUTHEAST: return 41;
                case SOUTH: return 32;
                case SOUTHWEST: return 23;
default:}
        case 34:
            switch(currents[34]) {
                case WEST: return 25;
                case NORTHWEST: return 26;
                case NORTH: return 35;
                case NORTHEAST: return 44;
                case EAST: return 43;
                case SOUTHEAST: return 42;
                case SOUTH: return 33;
                case SOUTHWEST: return 24;
default:}
        case 35:
            switch(currents[35]) {
                case WEST: return 26;
                case NORTHWEST: return 27;
                case NORTH: return 36;
                case NORTHEAST: return 45;
                case EAST: return 44;
                case SOUTHEAST: return 43;
                case SOUTH: return 34;
                case SOUTHWEST: return 25;
default:}
        case 36:
            switch(currents[36]) {
                case WEST: return 27;
                case NORTHWEST: return 28;
                case NORTH: return 37;
                case NORTHEAST: return 46;
                case EAST: return 45;
                case SOUTHEAST: return 44;
                case SOUTH: return 35;
                case SOUTHWEST: return 26;
default:}
        case 37:
            switch(currents[37]) {
                case WEST: return 28;
                case NORTHWEST: return 29;
                case NORTH: return 38;
                case NORTHEAST: return 47;
                case EAST: return 46;
                case SOUTHEAST: return 45;
                case SOUTH: return 36;
                case SOUTHWEST: return 27;
default:}
        case 38:
            switch(currents[38]) {
                case WEST: return 29;
                case EAST: return 47;
                case SOUTHEAST: return 46;
                case SOUTH: return 37;
                case SOUTHWEST: return 28;
default:}
        case 39:
            switch(currents[39]) {
                case WEST: return 30;
                case NORTHWEST: return 31;
                case NORTH: return 40;
                case NORTHEAST: return 49;
                case EAST: return 48;
default:}
        case 40:
            switch(currents[40]) {
                case WEST: return 31;
                case NORTHWEST: return 32;
                case NORTH: return 41;
                case NORTHEAST: return 50;
                case EAST: return 49;
                case SOUTHEAST: return 48;
                case SOUTH: return 39;
                case SOUTHWEST: return 30;
default:}
        case 41:
            switch(currents[41]) {
                case WEST: return 32;
                case NORTHWEST: return 33;
                case NORTH: return 42;
                case NORTHEAST: return 51;
                case EAST: return 50;
                case SOUTHEAST: return 49;
                case SOUTH: return 40;
                case SOUTHWEST: return 31;
default:}
        case 42:
            switch(currents[42]) {
                case WEST: return 33;
                case NORTHWEST: return 34;
                case NORTH: return 43;
                case NORTHEAST: return 52;
                case EAST: return 51;
                case SOUTHEAST: return 50;
                case SOUTH: return 41;
                case SOUTHWEST: return 32;
default:}
        case 43:
            switch(currents[43]) {
                case WEST: return 34;
                case NORTHWEST: return 35;
                case NORTH: return 44;
                case NORTHEAST: return 53;
                case EAST: return 52;
                case SOUTHEAST: return 51;
                case SOUTH: return 42;
                case SOUTHWEST: return 33;
default:}
        case 44:
            switch(currents[44]) {
                case WEST: return 35;
                case NORTHWEST: return 36;
                case NORTH: return 45;
                case NORTHEAST: return 54;
                case EAST: return 53;
                case SOUTHEAST: return 52;
                case SOUTH: return 43;
                case SOUTHWEST: return 34;
default:}
        case 45:
            switch(currents[45]) {
                case WEST: return 36;
                case NORTHWEST: return 37;
                case NORTH: return 46;
                case NORTHEAST: return 55;
                case EAST: return 54;
                case SOUTHEAST: return 53;
                case SOUTH: return 44;
                case SOUTHWEST: return 35;
default:}
        case 46:
            switch(currents[46]) {
                case WEST: return 37;
                case NORTHWEST: return 38;
                case NORTH: return 47;
                case NORTHEAST: return 56;
                case EAST: return 55;
                case SOUTHEAST: return 54;
                case SOUTH: return 45;
                case SOUTHWEST: return 36;
default:}
        case 47:
            switch(currents[47]) {
                case WEST: return 38;
                case EAST: return 56;
                case SOUTHEAST: return 55;
                case SOUTH: return 46;
                case SOUTHWEST: return 37;
default:}
        case 48:
            switch(currents[48]) {
                case WEST: return 39;
                case NORTHWEST: return 40;
                case NORTH: return 49;
                case NORTHEAST: return 57;
default:}
        case 49:
            switch(currents[49]) {
                case WEST: return 40;
                case NORTHWEST: return 41;
                case NORTH: return 50;
                case NORTHEAST: return 58;
                case EAST: return 57;
                case SOUTH: return 48;
                case SOUTHWEST: return 39;
default:}
        case 50:
            switch(currents[50]) {
                case WEST: return 41;
                case NORTHWEST: return 42;
                case NORTH: return 51;
                case NORTHEAST: return 59;
                case EAST: return 58;
                case SOUTHEAST: return 57;
                case SOUTH: return 49;
                case SOUTHWEST: return 40;
default:}
        case 51:
            switch(currents[51]) {
                case WEST: return 42;
                case NORTHWEST: return 43;
                case NORTH: return 52;
                case NORTHEAST: return 60;
                case EAST: return 59;
                case SOUTHEAST: return 58;
                case SOUTH: return 50;
                case SOUTHWEST: return 41;
default:}
        case 52:
            switch(currents[52]) {
                case WEST: return 43;
                case NORTHWEST: return 44;
                case NORTH: return 53;
                case NORTHEAST: return 61;
                case EAST: return 60;
                case SOUTHEAST: return 59;
                case SOUTH: return 51;
                case SOUTHWEST: return 42;
default:}
        case 53:
            switch(currents[53]) {
                case WEST: return 44;
                case NORTHWEST: return 45;
                case NORTH: return 54;
                case NORTHEAST: return 62;
                case EAST: return 61;
                case SOUTHEAST: return 60;
                case SOUTH: return 52;
                case SOUTHWEST: return 43;
default:}
        case 54:
            switch(currents[54]) {
                case WEST: return 45;
                case NORTHWEST: return 46;
                case NORTH: return 55;
                case NORTHEAST: return 63;
                case EAST: return 62;
                case SOUTHEAST: return 61;
                case SOUTH: return 53;
                case SOUTHWEST: return 44;
default:}
        case 55:
            switch(currents[55]) {
                case WEST: return 46;
                case NORTHWEST: return 47;
                case NORTH: return 56;
                case EAST: return 63;
                case SOUTHEAST: return 62;
                case SOUTH: return 54;
                case SOUTHWEST: return 45;
default:}
        case 56:
            switch(currents[56]) {
                case WEST: return 47;
                case SOUTHEAST: return 63;
                case SOUTH: return 55;
                case SOUTHWEST: return 46;
default:}
        case 57:
            switch(currents[57]) {
                case WEST: return 49;
                case NORTHWEST: return 50;
                case NORTH: return 58;
                case NORTHEAST: return 64;
                case SOUTHWEST: return 48;
default:}
        case 58:
            switch(currents[58]) {
                case WEST: return 50;
                case NORTHWEST: return 51;
                case NORTH: return 59;
                case NORTHEAST: return 65;
                case EAST: return 64;
                case SOUTH: return 57;
                case SOUTHWEST: return 49;
default:}
        case 59:
            switch(currents[59]) {
                case WEST: return 51;
                case NORTHWEST: return 52;
                case NORTH: return 60;
                case NORTHEAST: return 66;
                case EAST: return 65;
                case SOUTHEAST: return 64;
                case SOUTH: return 58;
                case SOUTHWEST: return 50;
default:}
        case 60:
            switch(currents[60]) {
                case WEST: return 52;
                case NORTHWEST: return 53;
                case NORTH: return 61;
                case NORTHEAST: return 67;
                case EAST: return 66;
                case SOUTHEAST: return 65;
                case SOUTH: return 59;
                case SOUTHWEST: return 51;
default:}
        case 61:
            switch(currents[61]) {
                case WEST: return 53;
                case NORTHWEST: return 54;
                case NORTH: return 62;
                case NORTHEAST: return 68;
                case EAST: return 67;
                case SOUTHEAST: return 66;
                case SOUTH: return 60;
                case SOUTHWEST: return 52;
default:}
        case 62:
            switch(currents[62]) {
                case WEST: return 54;
                case NORTHWEST: return 55;
                case NORTH: return 63;
                case EAST: return 68;
                case SOUTHEAST: return 67;
                case SOUTH: return 61;
                case SOUTHWEST: return 53;
default:}
        case 63:
            switch(currents[63]) {
                case WEST: return 55;
                case NORTHWEST: return 56;
                case SOUTHEAST: return 68;
                case SOUTH: return 62;
                case SOUTHWEST: return 54;
default:}
        case 64:
            switch(currents[64]) {
                case WEST: return 58;
                case NORTHWEST: return 59;
                case NORTH: return 65;
                case SOUTHWEST: return 57;
default:}
        case 65:
            switch(currents[65]) {
                case WEST: return 59;
                case NORTHWEST: return 60;
                case NORTH: return 66;
                case SOUTH: return 64;
                case SOUTHWEST: return 58;
default:}
        case 66:
            switch(currents[66]) {
                case WEST: return 60;
                case NORTHWEST: return 61;
                case NORTH: return 67;
                case SOUTH: return 65;
                case SOUTHWEST: return 59;
default:}
        case 67:
            switch(currents[67]) {
                case WEST: return 61;
                case NORTHWEST: return 62;
                case NORTH: return 68;
                case SOUTH: return 66;
                case SOUTHWEST: return 60;
default:}
        case 68:
            switch(currents[68]) {
                case WEST: return 62;
                case NORTHWEST: return 63;
                case SOUTH: return 67;
                case SOUTHWEST: return 61;
default:}
default: return -1;}}public static int translateDir(int encoded, Direction dir) {
        switch(encoded) {
        case 0:
            switch(dir) {
                case NORTH: return 1;
                case NORTHEAST: return 7;
                case EAST: return 6;
                case SOUTHEAST: return 5;
default:}
        case 1:
            switch(dir) {
                case NORTH: return 2;
                case NORTHEAST: return 8;
                case EAST: return 7;
                case SOUTHEAST: return 6;
                case SOUTH: return 0;
default:}
        case 2:
            switch(dir) {
                case NORTH: return 3;
                case NORTHEAST: return 9;
                case EAST: return 8;
                case SOUTHEAST: return 7;
                case SOUTH: return 1;
default:}
        case 3:
            switch(dir) {
                case NORTH: return 4;
                case NORTHEAST: return 10;
                case EAST: return 9;
                case SOUTHEAST: return 8;
                case SOUTH: return 2;
default:}
        case 4:
            switch(dir) {
                case NORTHEAST: return 11;
                case EAST: return 10;
                case SOUTHEAST: return 9;
                case SOUTH: return 3;
default:}
        case 5:
            switch(dir) {
                case NORTHWEST: return 0;
                case NORTH: return 6;
                case NORTHEAST: return 14;
                case EAST: return 13;
                case SOUTHEAST: return 12;
default:}
        case 6:
            switch(dir) {
                case WEST: return 0;
                case NORTHWEST: return 1;
                case NORTH: return 7;
                case NORTHEAST: return 15;
                case EAST: return 14;
                case SOUTHEAST: return 13;
                case SOUTH: return 5;
default:}
        case 7:
            switch(dir) {
                case WEST: return 1;
                case NORTHWEST: return 2;
                case NORTH: return 8;
                case NORTHEAST: return 16;
                case EAST: return 15;
                case SOUTHEAST: return 14;
                case SOUTH: return 6;
                case SOUTHWEST: return 0;
default:}
        case 8:
            switch(dir) {
                case WEST: return 2;
                case NORTHWEST: return 3;
                case NORTH: return 9;
                case NORTHEAST: return 17;
                case EAST: return 16;
                case SOUTHEAST: return 15;
                case SOUTH: return 7;
                case SOUTHWEST: return 1;
default:}
        case 9:
            switch(dir) {
                case WEST: return 3;
                case NORTHWEST: return 4;
                case NORTH: return 10;
                case NORTHEAST: return 18;
                case EAST: return 17;
                case SOUTHEAST: return 16;
                case SOUTH: return 8;
                case SOUTHWEST: return 2;
default:}
        case 10:
            switch(dir) {
                case WEST: return 4;
                case NORTH: return 11;
                case NORTHEAST: return 19;
                case EAST: return 18;
                case SOUTHEAST: return 17;
                case SOUTH: return 9;
                case SOUTHWEST: return 3;
default:}
        case 11:
            switch(dir) {
                case NORTHEAST: return 20;
                case EAST: return 19;
                case SOUTHEAST: return 18;
                case SOUTH: return 10;
                case SOUTHWEST: return 4;
default:}
        case 12:
            switch(dir) {
                case NORTHWEST: return 5;
                case NORTH: return 13;
                case NORTHEAST: return 22;
                case EAST: return 21;
default:}
        case 13:
            switch(dir) {
                case WEST: return 5;
                case NORTHWEST: return 6;
                case NORTH: return 14;
                case NORTHEAST: return 23;
                case EAST: return 22;
                case SOUTHEAST: return 21;
                case SOUTH: return 12;
default:}
        case 14:
            switch(dir) {
                case WEST: return 6;
                case NORTHWEST: return 7;
                case NORTH: return 15;
                case NORTHEAST: return 24;
                case EAST: return 23;
                case SOUTHEAST: return 22;
                case SOUTH: return 13;
                case SOUTHWEST: return 5;
default:}
        case 15:
            switch(dir) {
                case WEST: return 7;
                case NORTHWEST: return 8;
                case NORTH: return 16;
                case NORTHEAST: return 25;
                case EAST: return 24;
                case SOUTHEAST: return 23;
                case SOUTH: return 14;
                case SOUTHWEST: return 6;
default:}
        case 16:
            switch(dir) {
                case WEST: return 8;
                case NORTHWEST: return 9;
                case NORTH: return 17;
                case NORTHEAST: return 26;
                case EAST: return 25;
                case SOUTHEAST: return 24;
                case SOUTH: return 15;
                case SOUTHWEST: return 7;
default:}
        case 17:
            switch(dir) {
                case WEST: return 9;
                case NORTHWEST: return 10;
                case NORTH: return 18;
                case NORTHEAST: return 27;
                case EAST: return 26;
                case SOUTHEAST: return 25;
                case SOUTH: return 16;
                case SOUTHWEST: return 8;
default:}
        case 18:
            switch(dir) {
                case WEST: return 10;
                case NORTHWEST: return 11;
                case NORTH: return 19;
                case NORTHEAST: return 28;
                case EAST: return 27;
                case SOUTHEAST: return 26;
                case SOUTH: return 17;
                case SOUTHWEST: return 9;
default:}
        case 19:
            switch(dir) {
                case WEST: return 11;
                case NORTH: return 20;
                case NORTHEAST: return 29;
                case EAST: return 28;
                case SOUTHEAST: return 27;
                case SOUTH: return 18;
                case SOUTHWEST: return 10;
default:}
        case 20:
            switch(dir) {
                case EAST: return 29;
                case SOUTHEAST: return 28;
                case SOUTH: return 19;
                case SOUTHWEST: return 11;
default:}
        case 21:
            switch(dir) {
                case WEST: return 12;
                case NORTHWEST: return 13;
                case NORTH: return 22;
                case NORTHEAST: return 31;
                case EAST: return 30;
default:}
        case 22:
            switch(dir) {
                case WEST: return 13;
                case NORTHWEST: return 14;
                case NORTH: return 23;
                case NORTHEAST: return 32;
                case EAST: return 31;
                case SOUTHEAST: return 30;
                case SOUTH: return 21;
                case SOUTHWEST: return 12;
default:}
        case 23:
            switch(dir) {
                case WEST: return 14;
                case NORTHWEST: return 15;
                case NORTH: return 24;
                case NORTHEAST: return 33;
                case EAST: return 32;
                case SOUTHEAST: return 31;
                case SOUTH: return 22;
                case SOUTHWEST: return 13;
default:}
        case 24:
            switch(dir) {
                case WEST: return 15;
                case NORTHWEST: return 16;
                case NORTH: return 25;
                case NORTHEAST: return 34;
                case EAST: return 33;
                case SOUTHEAST: return 32;
                case SOUTH: return 23;
                case SOUTHWEST: return 14;
default:}
        case 25:
            switch(dir) {
                case WEST: return 16;
                case NORTHWEST: return 17;
                case NORTH: return 26;
                case NORTHEAST: return 35;
                case EAST: return 34;
                case SOUTHEAST: return 33;
                case SOUTH: return 24;
                case SOUTHWEST: return 15;
default:}
        case 26:
            switch(dir) {
                case WEST: return 17;
                case NORTHWEST: return 18;
                case NORTH: return 27;
                case NORTHEAST: return 36;
                case EAST: return 35;
                case SOUTHEAST: return 34;
                case SOUTH: return 25;
                case SOUTHWEST: return 16;
default:}
        case 27:
            switch(dir) {
                case WEST: return 18;
                case NORTHWEST: return 19;
                case NORTH: return 28;
                case NORTHEAST: return 37;
                case EAST: return 36;
                case SOUTHEAST: return 35;
                case SOUTH: return 26;
                case SOUTHWEST: return 17;
default:}
        case 28:
            switch(dir) {
                case WEST: return 19;
                case NORTHWEST: return 20;
                case NORTH: return 29;
                case NORTHEAST: return 38;
                case EAST: return 37;
                case SOUTHEAST: return 36;
                case SOUTH: return 27;
                case SOUTHWEST: return 18;
default:}
        case 29:
            switch(dir) {
                case WEST: return 20;
                case EAST: return 38;
                case SOUTHEAST: return 37;
                case SOUTH: return 28;
                case SOUTHWEST: return 19;
default:}
        case 30:
            switch(dir) {
                case WEST: return 21;
                case NORTHWEST: return 22;
                case NORTH: return 31;
                case NORTHEAST: return 40;
                case EAST: return 39;
default:}
        case 31:
            switch(dir) {
                case WEST: return 22;
                case NORTHWEST: return 23;
                case NORTH: return 32;
                case NORTHEAST: return 41;
                case EAST: return 40;
                case SOUTHEAST: return 39;
                case SOUTH: return 30;
                case SOUTHWEST: return 21;
default:}
        case 32:
            switch(dir) {
                case WEST: return 23;
                case NORTHWEST: return 24;
                case NORTH: return 33;
                case NORTHEAST: return 42;
                case EAST: return 41;
                case SOUTHEAST: return 40;
                case SOUTH: return 31;
                case SOUTHWEST: return 22;
default:}
        case 33:
            switch(dir) {
                case WEST: return 24;
                case NORTHWEST: return 25;
                case NORTH: return 34;
                case NORTHEAST: return 43;
                case EAST: return 42;
                case SOUTHEAST: return 41;
                case SOUTH: return 32;
                case SOUTHWEST: return 23;
default:}
        case 34:
            switch(dir) {
                case WEST: return 25;
                case NORTHWEST: return 26;
                case NORTH: return 35;
                case NORTHEAST: return 44;
                case EAST: return 43;
                case SOUTHEAST: return 42;
                case SOUTH: return 33;
                case SOUTHWEST: return 24;
default:}
        case 35:
            switch(dir) {
                case WEST: return 26;
                case NORTHWEST: return 27;
                case NORTH: return 36;
                case NORTHEAST: return 45;
                case EAST: return 44;
                case SOUTHEAST: return 43;
                case SOUTH: return 34;
                case SOUTHWEST: return 25;
default:}
        case 36:
            switch(dir) {
                case WEST: return 27;
                case NORTHWEST: return 28;
                case NORTH: return 37;
                case NORTHEAST: return 46;
                case EAST: return 45;
                case SOUTHEAST: return 44;
                case SOUTH: return 35;
                case SOUTHWEST: return 26;
default:}
        case 37:
            switch(dir) {
                case WEST: return 28;
                case NORTHWEST: return 29;
                case NORTH: return 38;
                case NORTHEAST: return 47;
                case EAST: return 46;
                case SOUTHEAST: return 45;
                case SOUTH: return 36;
                case SOUTHWEST: return 27;
default:}
        case 38:
            switch(dir) {
                case WEST: return 29;
                case EAST: return 47;
                case SOUTHEAST: return 46;
                case SOUTH: return 37;
                case SOUTHWEST: return 28;
default:}
        case 39:
            switch(dir) {
                case WEST: return 30;
                case NORTHWEST: return 31;
                case NORTH: return 40;
                case NORTHEAST: return 49;
                case EAST: return 48;
default:}
        case 40:
            switch(dir) {
                case WEST: return 31;
                case NORTHWEST: return 32;
                case NORTH: return 41;
                case NORTHEAST: return 50;
                case EAST: return 49;
                case SOUTHEAST: return 48;
                case SOUTH: return 39;
                case SOUTHWEST: return 30;
default:}
        case 41:
            switch(dir) {
                case WEST: return 32;
                case NORTHWEST: return 33;
                case NORTH: return 42;
                case NORTHEAST: return 51;
                case EAST: return 50;
                case SOUTHEAST: return 49;
                case SOUTH: return 40;
                case SOUTHWEST: return 31;
default:}
        case 42:
            switch(dir) {
                case WEST: return 33;
                case NORTHWEST: return 34;
                case NORTH: return 43;
                case NORTHEAST: return 52;
                case EAST: return 51;
                case SOUTHEAST: return 50;
                case SOUTH: return 41;
                case SOUTHWEST: return 32;
default:}
        case 43:
            switch(dir) {
                case WEST: return 34;
                case NORTHWEST: return 35;
                case NORTH: return 44;
                case NORTHEAST: return 53;
                case EAST: return 52;
                case SOUTHEAST: return 51;
                case SOUTH: return 42;
                case SOUTHWEST: return 33;
default:}
        case 44:
            switch(dir) {
                case WEST: return 35;
                case NORTHWEST: return 36;
                case NORTH: return 45;
                case NORTHEAST: return 54;
                case EAST: return 53;
                case SOUTHEAST: return 52;
                case SOUTH: return 43;
                case SOUTHWEST: return 34;
default:}
        case 45:
            switch(dir) {
                case WEST: return 36;
                case NORTHWEST: return 37;
                case NORTH: return 46;
                case NORTHEAST: return 55;
                case EAST: return 54;
                case SOUTHEAST: return 53;
                case SOUTH: return 44;
                case SOUTHWEST: return 35;
default:}
        case 46:
            switch(dir) {
                case WEST: return 37;
                case NORTHWEST: return 38;
                case NORTH: return 47;
                case NORTHEAST: return 56;
                case EAST: return 55;
                case SOUTHEAST: return 54;
                case SOUTH: return 45;
                case SOUTHWEST: return 36;
default:}
        case 47:
            switch(dir) {
                case WEST: return 38;
                case EAST: return 56;
                case SOUTHEAST: return 55;
                case SOUTH: return 46;
                case SOUTHWEST: return 37;
default:}
        case 48:
            switch(dir) {
                case WEST: return 39;
                case NORTHWEST: return 40;
                case NORTH: return 49;
                case NORTHEAST: return 57;
default:}
        case 49:
            switch(dir) {
                case WEST: return 40;
                case NORTHWEST: return 41;
                case NORTH: return 50;
                case NORTHEAST: return 58;
                case EAST: return 57;
                case SOUTH: return 48;
                case SOUTHWEST: return 39;
default:}
        case 50:
            switch(dir) {
                case WEST: return 41;
                case NORTHWEST: return 42;
                case NORTH: return 51;
                case NORTHEAST: return 59;
                case EAST: return 58;
                case SOUTHEAST: return 57;
                case SOUTH: return 49;
                case SOUTHWEST: return 40;
default:}
        case 51:
            switch(dir) {
                case WEST: return 42;
                case NORTHWEST: return 43;
                case NORTH: return 52;
                case NORTHEAST: return 60;
                case EAST: return 59;
                case SOUTHEAST: return 58;
                case SOUTH: return 50;
                case SOUTHWEST: return 41;
default:}
        case 52:
            switch(dir) {
                case WEST: return 43;
                case NORTHWEST: return 44;
                case NORTH: return 53;
                case NORTHEAST: return 61;
                case EAST: return 60;
                case SOUTHEAST: return 59;
                case SOUTH: return 51;
                case SOUTHWEST: return 42;
default:}
        case 53:
            switch(dir) {
                case WEST: return 44;
                case NORTHWEST: return 45;
                case NORTH: return 54;
                case NORTHEAST: return 62;
                case EAST: return 61;
                case SOUTHEAST: return 60;
                case SOUTH: return 52;
                case SOUTHWEST: return 43;
default:}
        case 54:
            switch(dir) {
                case WEST: return 45;
                case NORTHWEST: return 46;
                case NORTH: return 55;
                case NORTHEAST: return 63;
                case EAST: return 62;
                case SOUTHEAST: return 61;
                case SOUTH: return 53;
                case SOUTHWEST: return 44;
default:}
        case 55:
            switch(dir) {
                case WEST: return 46;
                case NORTHWEST: return 47;
                case NORTH: return 56;
                case EAST: return 63;
                case SOUTHEAST: return 62;
                case SOUTH: return 54;
                case SOUTHWEST: return 45;
default:}
        case 56:
            switch(dir) {
                case WEST: return 47;
                case SOUTHEAST: return 63;
                case SOUTH: return 55;
                case SOUTHWEST: return 46;
default:}
        case 57:
            switch(dir) {
                case WEST: return 49;
                case NORTHWEST: return 50;
                case NORTH: return 58;
                case NORTHEAST: return 64;
                case SOUTHWEST: return 48;
default:}
        case 58:
            switch(dir) {
                case WEST: return 50;
                case NORTHWEST: return 51;
                case NORTH: return 59;
                case NORTHEAST: return 65;
                case EAST: return 64;
                case SOUTH: return 57;
                case SOUTHWEST: return 49;
default:}
        case 59:
            switch(dir) {
                case WEST: return 51;
                case NORTHWEST: return 52;
                case NORTH: return 60;
                case NORTHEAST: return 66;
                case EAST: return 65;
                case SOUTHEAST: return 64;
                case SOUTH: return 58;
                case SOUTHWEST: return 50;
default:}
        case 60:
            switch(dir) {
                case WEST: return 52;
                case NORTHWEST: return 53;
                case NORTH: return 61;
                case NORTHEAST: return 67;
                case EAST: return 66;
                case SOUTHEAST: return 65;
                case SOUTH: return 59;
                case SOUTHWEST: return 51;
default:}
        case 61:
            switch(dir) {
                case WEST: return 53;
                case NORTHWEST: return 54;
                case NORTH: return 62;
                case NORTHEAST: return 68;
                case EAST: return 67;
                case SOUTHEAST: return 66;
                case SOUTH: return 60;
                case SOUTHWEST: return 52;
default:}
        case 62:
            switch(dir) {
                case WEST: return 54;
                case NORTHWEST: return 55;
                case NORTH: return 63;
                case EAST: return 68;
                case SOUTHEAST: return 67;
                case SOUTH: return 61;
                case SOUTHWEST: return 53;
default:}
        case 63:
            switch(dir) {
                case WEST: return 55;
                case NORTHWEST: return 56;
                case SOUTHEAST: return 68;
                case SOUTH: return 62;
                case SOUTHWEST: return 54;
default:}
        case 64:
            switch(dir) {
                case WEST: return 58;
                case NORTHWEST: return 59;
                case NORTH: return 65;
                case SOUTHWEST: return 57;
default:}
        case 65:
            switch(dir) {
                case WEST: return 59;
                case NORTHWEST: return 60;
                case NORTH: return 66;
                case SOUTH: return 64;
                case SOUTHWEST: return 58;
default:}
        case 66:
            switch(dir) {
                case WEST: return 60;
                case NORTHWEST: return 61;
                case NORTH: return 67;
                case SOUTH: return 65;
                case SOUTHWEST: return 59;
default:}
        case 67:
            switch(dir) {
                case WEST: return 61;
                case NORTHWEST: return 62;
                case NORTH: return 68;
                case SOUTH: return 66;
                case SOUTHWEST: return 60;
default:}
        case 68:
            switch(dir) {
                case WEST: return 62;
                case NORTHWEST: return 63;
                case SOUTH: return 67;
                case SOUTHWEST: return 61;
default:}
default: return -1;}}public static int dijkstraSub0(RobotController rc, int n) {int cost; switch(n) {case 0:
        cost=costs[0];if(toCheck1){//debugPoint(1, rc);
                if(currents[1]!=Direction.CENTER&&cost%10+cooldowns[1]>9) {
                    if (cost%10>0&&cooldowns[1]<10&&currents[0]==Direction.CENTER) {
                        costs[1] = cooldowns[1]+(cost+9)/10*10;
                        dirs[1] = Direction.NORTH;
                        wait[1] = true;
                        currented[1] = null;
                        setChecked(1);

                        if (dest[1]) return 1;

                        addToQueue(1);
                    }
                    int currentTile = moveWithCurrent(1);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[1];
                        dirs[currentTile] = currents[1];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[1] = cost + cooldowns[1];
                    dirs[1] = Direction.NORTH;
                    currented[1] = null;
                    wait[1] = false;
                    setChecked(1);

                    if (dest[1]) return 1;

                    addToQueue(1);
                }
            }
            if(toCheck7){//debugPoint(7, rc);
                if(currents[7]!=Direction.CENTER&&cost%10+cooldowns[7]>9) {
                    if (cost%10>0&&cooldowns[7]<10&&currents[0]==Direction.CENTER) {
                        costs[7] = cooldowns[7]+(cost+9)/10*10;
                        dirs[7] = Direction.NORTHEAST;
                        wait[7] = true;
                        currented[7] = null;
                        setChecked(7);

                        if (dest[7]) return 7;

                        addToQueue(7);
                    }
                    int currentTile = moveWithCurrent(7);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[7];
                        dirs[currentTile] = currents[7];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[7] = cost + cooldowns[7];
                    dirs[7] = Direction.NORTHEAST;
                    currented[7] = null;
                    wait[7] = false;
                    setChecked(7);

                    if (dest[7]) return 7;

                    addToQueue(7);
                }
            }
            if(toCheck6){//debugPoint(6, rc);
                if(currents[6]!=Direction.CENTER&&cost%10+cooldowns[6]>9) {
                    if (cost%10>0&&cooldowns[6]<10&&currents[0]==Direction.CENTER) {
                        costs[6] = cooldowns[6]+(cost+9)/10*10;
                        dirs[6] = Direction.EAST;
                        wait[6] = true;
                        currented[6] = null;
                        setChecked(6);

                        if (dest[6]) return 6;

                        addToQueue(6);
                    }
                    int currentTile = moveWithCurrent(6);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[6];
                        dirs[currentTile] = currents[6];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[6] = cost + cooldowns[6];
                    dirs[6] = Direction.EAST;
                    currented[6] = null;
                    wait[6] = false;
                    setChecked(6);

                    if (dest[6]) return 6;

                    addToQueue(6);
                }
            }
            if(toCheck5){//debugPoint(5, rc);
                if(currents[5]!=Direction.CENTER&&cost%10+cooldowns[5]>9) {
                    if (cost%10>0&&cooldowns[5]<10&&currents[0]==Direction.CENTER) {
                        costs[5] = cooldowns[5]+(cost+9)/10*10;
                        dirs[5] = Direction.SOUTHEAST;
                        wait[5] = true;
                        currented[5] = null;
                        setChecked(5);

                        if (dest[5]) return 5;

                        addToQueue(5);
                    }
                    int currentTile = moveWithCurrent(5);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[5];
                        dirs[currentTile] = currents[5];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[5] = cost + cooldowns[5];
                    dirs[5] = Direction.SOUTHEAST;
                    currented[5] = null;
                    wait[5] = false;
                    setChecked(5);

                    if (dest[5]) return 5;

                    addToQueue(5);
                }
            }
            break;case 1:
        cost=costs[1];if(toCheck2){//debugPoint(2, rc);
                if(currents[2]!=Direction.CENTER&&cost%10+cooldowns[2]>9) {
                    if (cost%10>0&&cooldowns[2]<10&&currents[1]==Direction.CENTER) {
                        costs[2] = cooldowns[2]+(cost+9)/10*10;
                        dirs[2] = Direction.NORTH;
                        wait[2] = true;
                        currented[2] = null;
                        setChecked(2);

                        if (dest[2]) return 2;

                        addToQueue(2);
                    }
                    int currentTile = moveWithCurrent(2);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[2];
                        dirs[currentTile] = currents[2];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[2] = cost + cooldowns[2];
                    dirs[2] = Direction.NORTH;
                    currented[2] = null;
                    wait[2] = false;
                    setChecked(2);

                    if (dest[2]) return 2;

                    addToQueue(2);
                }
            }
            if(toCheck8){//debugPoint(8, rc);
                if(currents[8]!=Direction.CENTER&&cost%10+cooldowns[8]>9) {
                    if (cost%10>0&&cooldowns[8]<10&&currents[1]==Direction.CENTER) {
                        costs[8] = cooldowns[8]+(cost+9)/10*10;
                        dirs[8] = Direction.NORTHEAST;
                        wait[8] = true;
                        currented[8] = null;
                        setChecked(8);

                        if (dest[8]) return 8;

                        addToQueue(8);
                    }
                    int currentTile = moveWithCurrent(8);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[8];
                        dirs[currentTile] = currents[8];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[8] = cost + cooldowns[8];
                    dirs[8] = Direction.NORTHEAST;
                    currented[8] = null;
                    wait[8] = false;
                    setChecked(8);

                    if (dest[8]) return 8;

                    addToQueue(8);
                }
            }
            if(toCheck7){//debugPoint(7, rc);
                if(currents[7]!=Direction.CENTER&&cost%10+cooldowns[7]>9) {
                    if (cost%10>0&&cooldowns[7]<10&&currents[1]==Direction.CENTER) {
                        costs[7] = cooldowns[7]+(cost+9)/10*10;
                        dirs[7] = Direction.EAST;
                        wait[7] = true;
                        currented[7] = null;
                        setChecked(7);

                        if (dest[7]) return 7;

                        addToQueue(7);
                    }
                    int currentTile = moveWithCurrent(7);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[7];
                        dirs[currentTile] = currents[7];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[7] = cost + cooldowns[7];
                    dirs[7] = Direction.EAST;
                    currented[7] = null;
                    wait[7] = false;
                    setChecked(7);

                    if (dest[7]) return 7;

                    addToQueue(7);
                }
            }
            if(toCheck6){//debugPoint(6, rc);
                if(currents[6]!=Direction.CENTER&&cost%10+cooldowns[6]>9) {
                    if (cost%10>0&&cooldowns[6]<10&&currents[1]==Direction.CENTER) {
                        costs[6] = cooldowns[6]+(cost+9)/10*10;
                        dirs[6] = Direction.SOUTHEAST;
                        wait[6] = true;
                        currented[6] = null;
                        setChecked(6);

                        if (dest[6]) return 6;

                        addToQueue(6);
                    }
                    int currentTile = moveWithCurrent(6);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[6];
                        dirs[currentTile] = currents[6];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[6] = cost + cooldowns[6];
                    dirs[6] = Direction.SOUTHEAST;
                    currented[6] = null;
                    wait[6] = false;
                    setChecked(6);

                    if (dest[6]) return 6;

                    addToQueue(6);
                }
            }
            if(toCheck0){//debugPoint(0, rc);
                if(currents[0]!=Direction.CENTER&&cost%10+cooldowns[0]>9) {
                    if (cost%10>0&&cooldowns[0]<10&&currents[1]==Direction.CENTER) {
                        costs[0] = cooldowns[0]+(cost+9)/10*10;
                        dirs[0] = Direction.SOUTH;
                        wait[0] = true;
                        currented[0] = null;
                        setChecked(0);

                        if (dest[0]) return 0;

                        addToQueue(0);
                    }
                    int currentTile = moveWithCurrent(0);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[0];
                        dirs[currentTile] = currents[0];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[0] = cost + cooldowns[0];
                    dirs[0] = Direction.SOUTH;
                    currented[0] = null;
                    wait[0] = false;
                    setChecked(0);

                    if (dest[0]) return 0;

                    addToQueue(0);
                }
            }
            break;case 2:
        cost=costs[2];if(toCheck3){//debugPoint(3, rc);
                if(currents[3]!=Direction.CENTER&&cost%10+cooldowns[3]>9) {
                    if (cost%10>0&&cooldowns[3]<10&&currents[2]==Direction.CENTER) {
                        costs[3] = cooldowns[3]+(cost+9)/10*10;
                        dirs[3] = Direction.NORTH;
                        wait[3] = true;
                        currented[3] = null;
                        setChecked(3);

                        if (dest[3]) return 3;

                        addToQueue(3);
                    }
                    int currentTile = moveWithCurrent(3);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[3];
                        dirs[currentTile] = currents[3];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[3] = cost + cooldowns[3];
                    dirs[3] = Direction.NORTH;
                    currented[3] = null;
                    wait[3] = false;
                    setChecked(3);

                    if (dest[3]) return 3;

                    addToQueue(3);
                }
            }
            if(toCheck9){//debugPoint(9, rc);
                if(currents[9]!=Direction.CENTER&&cost%10+cooldowns[9]>9) {
                    if (cost%10>0&&cooldowns[9]<10&&currents[2]==Direction.CENTER) {
                        costs[9] = cooldowns[9]+(cost+9)/10*10;
                        dirs[9] = Direction.NORTHEAST;
                        wait[9] = true;
                        currented[9] = null;
                        setChecked(9);

                        if (dest[9]) return 9;

                        addToQueue(9);
                    }
                    int currentTile = moveWithCurrent(9);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[9];
                        dirs[currentTile] = currents[9];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[9] = cost + cooldowns[9];
                    dirs[9] = Direction.NORTHEAST;
                    currented[9] = null;
                    wait[9] = false;
                    setChecked(9);

                    if (dest[9]) return 9;

                    addToQueue(9);
                }
            }
            if(toCheck8){//debugPoint(8, rc);
                if(currents[8]!=Direction.CENTER&&cost%10+cooldowns[8]>9) {
                    if (cost%10>0&&cooldowns[8]<10&&currents[2]==Direction.CENTER) {
                        costs[8] = cooldowns[8]+(cost+9)/10*10;
                        dirs[8] = Direction.EAST;
                        wait[8] = true;
                        currented[8] = null;
                        setChecked(8);

                        if (dest[8]) return 8;

                        addToQueue(8);
                    }
                    int currentTile = moveWithCurrent(8);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[8];
                        dirs[currentTile] = currents[8];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[8] = cost + cooldowns[8];
                    dirs[8] = Direction.EAST;
                    currented[8] = null;
                    wait[8] = false;
                    setChecked(8);

                    if (dest[8]) return 8;

                    addToQueue(8);
                }
            }
            if(toCheck7){//debugPoint(7, rc);
                if(currents[7]!=Direction.CENTER&&cost%10+cooldowns[7]>9) {
                    if (cost%10>0&&cooldowns[7]<10&&currents[2]==Direction.CENTER) {
                        costs[7] = cooldowns[7]+(cost+9)/10*10;
                        dirs[7] = Direction.SOUTHEAST;
                        wait[7] = true;
                        currented[7] = null;
                        setChecked(7);

                        if (dest[7]) return 7;

                        addToQueue(7);
                    }
                    int currentTile = moveWithCurrent(7);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[7];
                        dirs[currentTile] = currents[7];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[7] = cost + cooldowns[7];
                    dirs[7] = Direction.SOUTHEAST;
                    currented[7] = null;
                    wait[7] = false;
                    setChecked(7);

                    if (dest[7]) return 7;

                    addToQueue(7);
                }
            }
            if(toCheck1){//debugPoint(1, rc);
                if(currents[1]!=Direction.CENTER&&cost%10+cooldowns[1]>9) {
                    if (cost%10>0&&cooldowns[1]<10&&currents[2]==Direction.CENTER) {
                        costs[1] = cooldowns[1]+(cost+9)/10*10;
                        dirs[1] = Direction.SOUTH;
                        wait[1] = true;
                        currented[1] = null;
                        setChecked(1);

                        if (dest[1]) return 1;

                        addToQueue(1);
                    }
                    int currentTile = moveWithCurrent(1);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[1];
                        dirs[currentTile] = currents[1];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[1] = cost + cooldowns[1];
                    dirs[1] = Direction.SOUTH;
                    currented[1] = null;
                    wait[1] = false;
                    setChecked(1);

                    if (dest[1]) return 1;

                    addToQueue(1);
                }
            }
            break;case 3:
        cost=costs[3];if(toCheck4){//debugPoint(4, rc);
                if(currents[4]!=Direction.CENTER&&cost%10+cooldowns[4]>9) {
                    if (cost%10>0&&cooldowns[4]<10&&currents[3]==Direction.CENTER) {
                        costs[4] = cooldowns[4]+(cost+9)/10*10;
                        dirs[4] = Direction.NORTH;
                        wait[4] = true;
                        currented[4] = null;
                        setChecked(4);

                        if (dest[4]) return 4;

                        addToQueue(4);
                    }
                    int currentTile = moveWithCurrent(4);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[4];
                        dirs[currentTile] = currents[4];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[4] = cost + cooldowns[4];
                    dirs[4] = Direction.NORTH;
                    currented[4] = null;
                    wait[4] = false;
                    setChecked(4);

                    if (dest[4]) return 4;

                    addToQueue(4);
                }
            }
            if(toCheck10){//debugPoint(10, rc);
                if(currents[10]!=Direction.CENTER&&cost%10+cooldowns[10]>9) {
                    if (cost%10>0&&cooldowns[10]<10&&currents[3]==Direction.CENTER) {
                        costs[10] = cooldowns[10]+(cost+9)/10*10;
                        dirs[10] = Direction.NORTHEAST;
                        wait[10] = true;
                        currented[10] = null;
                        setChecked(10);

                        if (dest[10]) return 10;

                        addToQueue(10);
                    }
                    int currentTile = moveWithCurrent(10);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[10];
                        dirs[currentTile] = currents[10];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[10] = cost + cooldowns[10];
                    dirs[10] = Direction.NORTHEAST;
                    currented[10] = null;
                    wait[10] = false;
                    setChecked(10);

                    if (dest[10]) return 10;

                    addToQueue(10);
                }
            }
            if(toCheck9){//debugPoint(9, rc);
                if(currents[9]!=Direction.CENTER&&cost%10+cooldowns[9]>9) {
                    if (cost%10>0&&cooldowns[9]<10&&currents[3]==Direction.CENTER) {
                        costs[9] = cooldowns[9]+(cost+9)/10*10;
                        dirs[9] = Direction.EAST;
                        wait[9] = true;
                        currented[9] = null;
                        setChecked(9);

                        if (dest[9]) return 9;

                        addToQueue(9);
                    }
                    int currentTile = moveWithCurrent(9);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[9];
                        dirs[currentTile] = currents[9];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[9] = cost + cooldowns[9];
                    dirs[9] = Direction.EAST;
                    currented[9] = null;
                    wait[9] = false;
                    setChecked(9);

                    if (dest[9]) return 9;

                    addToQueue(9);
                }
            }
            if(toCheck8){//debugPoint(8, rc);
                if(currents[8]!=Direction.CENTER&&cost%10+cooldowns[8]>9) {
                    if (cost%10>0&&cooldowns[8]<10&&currents[3]==Direction.CENTER) {
                        costs[8] = cooldowns[8]+(cost+9)/10*10;
                        dirs[8] = Direction.SOUTHEAST;
                        wait[8] = true;
                        currented[8] = null;
                        setChecked(8);

                        if (dest[8]) return 8;

                        addToQueue(8);
                    }
                    int currentTile = moveWithCurrent(8);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[8];
                        dirs[currentTile] = currents[8];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[8] = cost + cooldowns[8];
                    dirs[8] = Direction.SOUTHEAST;
                    currented[8] = null;
                    wait[8] = false;
                    setChecked(8);

                    if (dest[8]) return 8;

                    addToQueue(8);
                }
            }
            if(toCheck2){//debugPoint(2, rc);
                if(currents[2]!=Direction.CENTER&&cost%10+cooldowns[2]>9) {
                    if (cost%10>0&&cooldowns[2]<10&&currents[3]==Direction.CENTER) {
                        costs[2] = cooldowns[2]+(cost+9)/10*10;
                        dirs[2] = Direction.SOUTH;
                        wait[2] = true;
                        currented[2] = null;
                        setChecked(2);

                        if (dest[2]) return 2;

                        addToQueue(2);
                    }
                    int currentTile = moveWithCurrent(2);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[2];
                        dirs[currentTile] = currents[2];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[2] = cost + cooldowns[2];
                    dirs[2] = Direction.SOUTH;
                    currented[2] = null;
                    wait[2] = false;
                    setChecked(2);

                    if (dest[2]) return 2;

                    addToQueue(2);
                }
            }
            break;case 4:
        cost=costs[4];if(toCheck11){//debugPoint(11, rc);
                if(currents[11]!=Direction.CENTER&&cost%10+cooldowns[11]>9) {
                    if (cost%10>0&&cooldowns[11]<10&&currents[4]==Direction.CENTER) {
                        costs[11] = cooldowns[11]+(cost+9)/10*10;
                        dirs[11] = Direction.NORTHEAST;
                        wait[11] = true;
                        currented[11] = null;
                        setChecked(11);

                        if (dest[11]) return 11;

                        addToQueue(11);
                    }
                    int currentTile = moveWithCurrent(11);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[11];
                        dirs[currentTile] = currents[11];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[11] = cost + cooldowns[11];
                    dirs[11] = Direction.NORTHEAST;
                    currented[11] = null;
                    wait[11] = false;
                    setChecked(11);

                    if (dest[11]) return 11;

                    addToQueue(11);
                }
            }
            if(toCheck10){//debugPoint(10, rc);
                if(currents[10]!=Direction.CENTER&&cost%10+cooldowns[10]>9) {
                    if (cost%10>0&&cooldowns[10]<10&&currents[4]==Direction.CENTER) {
                        costs[10] = cooldowns[10]+(cost+9)/10*10;
                        dirs[10] = Direction.EAST;
                        wait[10] = true;
                        currented[10] = null;
                        setChecked(10);

                        if (dest[10]) return 10;

                        addToQueue(10);
                    }
                    int currentTile = moveWithCurrent(10);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[10];
                        dirs[currentTile] = currents[10];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[10] = cost + cooldowns[10];
                    dirs[10] = Direction.EAST;
                    currented[10] = null;
                    wait[10] = false;
                    setChecked(10);

                    if (dest[10]) return 10;

                    addToQueue(10);
                }
            }
            if(toCheck9){//debugPoint(9, rc);
                if(currents[9]!=Direction.CENTER&&cost%10+cooldowns[9]>9) {
                    if (cost%10>0&&cooldowns[9]<10&&currents[4]==Direction.CENTER) {
                        costs[9] = cooldowns[9]+(cost+9)/10*10;
                        dirs[9] = Direction.SOUTHEAST;
                        wait[9] = true;
                        currented[9] = null;
                        setChecked(9);

                        if (dest[9]) return 9;

                        addToQueue(9);
                    }
                    int currentTile = moveWithCurrent(9);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[9];
                        dirs[currentTile] = currents[9];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[9] = cost + cooldowns[9];
                    dirs[9] = Direction.SOUTHEAST;
                    currented[9] = null;
                    wait[9] = false;
                    setChecked(9);

                    if (dest[9]) return 9;

                    addToQueue(9);
                }
            }
            if(toCheck3){//debugPoint(3, rc);
                if(currents[3]!=Direction.CENTER&&cost%10+cooldowns[3]>9) {
                    if (cost%10>0&&cooldowns[3]<10&&currents[4]==Direction.CENTER) {
                        costs[3] = cooldowns[3]+(cost+9)/10*10;
                        dirs[3] = Direction.SOUTH;
                        wait[3] = true;
                        currented[3] = null;
                        setChecked(3);

                        if (dest[3]) return 3;

                        addToQueue(3);
                    }
                    int currentTile = moveWithCurrent(3);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[3];
                        dirs[currentTile] = currents[3];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[3] = cost + cooldowns[3];
                    dirs[3] = Direction.SOUTH;
                    currented[3] = null;
                    wait[3] = false;
                    setChecked(3);

                    if (dest[3]) return 3;

                    addToQueue(3);
                }
            }
            break;case 5:
        cost=costs[5];if(toCheck0){//debugPoint(0, rc);
                if(currents[0]!=Direction.CENTER&&cost%10+cooldowns[0]>9) {
                    if (cost%10>0&&cooldowns[0]<10&&currents[5]==Direction.CENTER) {
                        costs[0] = cooldowns[0]+(cost+9)/10*10;
                        dirs[0] = Direction.NORTHWEST;
                        wait[0] = true;
                        currented[0] = null;
                        setChecked(0);

                        if (dest[0]) return 0;

                        addToQueue(0);
                    }
                    int currentTile = moveWithCurrent(0);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[0];
                        dirs[currentTile] = currents[0];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[0] = cost + cooldowns[0];
                    dirs[0] = Direction.NORTHWEST;
                    currented[0] = null;
                    wait[0] = false;
                    setChecked(0);

                    if (dest[0]) return 0;

                    addToQueue(0);
                }
            }
            if(toCheck6){//debugPoint(6, rc);
                if(currents[6]!=Direction.CENTER&&cost%10+cooldowns[6]>9) {
                    if (cost%10>0&&cooldowns[6]<10&&currents[5]==Direction.CENTER) {
                        costs[6] = cooldowns[6]+(cost+9)/10*10;
                        dirs[6] = Direction.NORTH;
                        wait[6] = true;
                        currented[6] = null;
                        setChecked(6);

                        if (dest[6]) return 6;

                        addToQueue(6);
                    }
                    int currentTile = moveWithCurrent(6);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[6];
                        dirs[currentTile] = currents[6];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[6] = cost + cooldowns[6];
                    dirs[6] = Direction.NORTH;
                    currented[6] = null;
                    wait[6] = false;
                    setChecked(6);

                    if (dest[6]) return 6;

                    addToQueue(6);
                }
            }
            if(toCheck14){//debugPoint(14, rc);
                if(currents[14]!=Direction.CENTER&&cost%10+cooldowns[14]>9) {
                    if (cost%10>0&&cooldowns[14]<10&&currents[5]==Direction.CENTER) {
                        costs[14] = cooldowns[14]+(cost+9)/10*10;
                        dirs[14] = Direction.NORTHEAST;
                        wait[14] = true;
                        currented[14] = null;
                        setChecked(14);

                        if (dest[14]) return 14;

                        addToQueue(14);
                    }
                    int currentTile = moveWithCurrent(14);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[14];
                        dirs[currentTile] = currents[14];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[14] = cost + cooldowns[14];
                    dirs[14] = Direction.NORTHEAST;
                    currented[14] = null;
                    wait[14] = false;
                    setChecked(14);

                    if (dest[14]) return 14;

                    addToQueue(14);
                }
            }
            if(toCheck13){//debugPoint(13, rc);
                if(currents[13]!=Direction.CENTER&&cost%10+cooldowns[13]>9) {
                    if (cost%10>0&&cooldowns[13]<10&&currents[5]==Direction.CENTER) {
                        costs[13] = cooldowns[13]+(cost+9)/10*10;
                        dirs[13] = Direction.EAST;
                        wait[13] = true;
                        currented[13] = null;
                        setChecked(13);

                        if (dest[13]) return 13;

                        addToQueue(13);
                    }
                    int currentTile = moveWithCurrent(13);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[13];
                        dirs[currentTile] = currents[13];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[13] = cost + cooldowns[13];
                    dirs[13] = Direction.EAST;
                    currented[13] = null;
                    wait[13] = false;
                    setChecked(13);

                    if (dest[13]) return 13;

                    addToQueue(13);
                }
            }
            if(toCheck12){//debugPoint(12, rc);
                if(currents[12]!=Direction.CENTER&&cost%10+cooldowns[12]>9) {
                    if (cost%10>0&&cooldowns[12]<10&&currents[5]==Direction.CENTER) {
                        costs[12] = cooldowns[12]+(cost+9)/10*10;
                        dirs[12] = Direction.SOUTHEAST;
                        wait[12] = true;
                        currented[12] = null;
                        setChecked(12);

                        if (dest[12]) return 12;

                        addToQueue(12);
                    }
                    int currentTile = moveWithCurrent(12);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[12];
                        dirs[currentTile] = currents[12];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[12] = cost + cooldowns[12];
                    dirs[12] = Direction.SOUTHEAST;
                    currented[12] = null;
                    wait[12] = false;
                    setChecked(12);

                    if (dest[12]) return 12;

                    addToQueue(12);
                }
            }
            break;case 6:
        cost=costs[6];if(toCheck0){//debugPoint(0, rc);
                if(currents[0]!=Direction.CENTER&&cost%10+cooldowns[0]>9) {
                    if (cost%10>0&&cooldowns[0]<10&&currents[6]==Direction.CENTER) {
                        costs[0] = cooldowns[0]+(cost+9)/10*10;
                        dirs[0] = Direction.WEST;
                        wait[0] = true;
                        currented[0] = null;
                        setChecked(0);

                        if (dest[0]) return 0;

                        addToQueue(0);
                    }
                    int currentTile = moveWithCurrent(0);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[0];
                        dirs[currentTile] = currents[0];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[0] = cost + cooldowns[0];
                    dirs[0] = Direction.WEST;
                    currented[0] = null;
                    wait[0] = false;
                    setChecked(0);

                    if (dest[0]) return 0;

                    addToQueue(0);
                }
            }
            if(toCheck1){//debugPoint(1, rc);
                if(currents[1]!=Direction.CENTER&&cost%10+cooldowns[1]>9) {
                    if (cost%10>0&&cooldowns[1]<10&&currents[6]==Direction.CENTER) {
                        costs[1] = cooldowns[1]+(cost+9)/10*10;
                        dirs[1] = Direction.NORTHWEST;
                        wait[1] = true;
                        currented[1] = null;
                        setChecked(1);

                        if (dest[1]) return 1;

                        addToQueue(1);
                    }
                    int currentTile = moveWithCurrent(1);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[1];
                        dirs[currentTile] = currents[1];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[1] = cost + cooldowns[1];
                    dirs[1] = Direction.NORTHWEST;
                    currented[1] = null;
                    wait[1] = false;
                    setChecked(1);

                    if (dest[1]) return 1;

                    addToQueue(1);
                }
            }
            if(toCheck7){//debugPoint(7, rc);
                if(currents[7]!=Direction.CENTER&&cost%10+cooldowns[7]>9) {
                    if (cost%10>0&&cooldowns[7]<10&&currents[6]==Direction.CENTER) {
                        costs[7] = cooldowns[7]+(cost+9)/10*10;
                        dirs[7] = Direction.NORTH;
                        wait[7] = true;
                        currented[7] = null;
                        setChecked(7);

                        if (dest[7]) return 7;

                        addToQueue(7);
                    }
                    int currentTile = moveWithCurrent(7);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[7];
                        dirs[currentTile] = currents[7];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[7] = cost + cooldowns[7];
                    dirs[7] = Direction.NORTH;
                    currented[7] = null;
                    wait[7] = false;
                    setChecked(7);

                    if (dest[7]) return 7;

                    addToQueue(7);
                }
            }
            if(toCheck15){//debugPoint(15, rc);
                if(currents[15]!=Direction.CENTER&&cost%10+cooldowns[15]>9) {
                    if (cost%10>0&&cooldowns[15]<10&&currents[6]==Direction.CENTER) {
                        costs[15] = cooldowns[15]+(cost+9)/10*10;
                        dirs[15] = Direction.NORTHEAST;
                        wait[15] = true;
                        currented[15] = null;
                        setChecked(15);

                        if (dest[15]) return 15;

                        addToQueue(15);
                    }
                    int currentTile = moveWithCurrent(15);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[15];
                        dirs[currentTile] = currents[15];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[15] = cost + cooldowns[15];
                    dirs[15] = Direction.NORTHEAST;
                    currented[15] = null;
                    wait[15] = false;
                    setChecked(15);

                    if (dest[15]) return 15;

                    addToQueue(15);
                }
            }
            if(toCheck14){//debugPoint(14, rc);
                if(currents[14]!=Direction.CENTER&&cost%10+cooldowns[14]>9) {
                    if (cost%10>0&&cooldowns[14]<10&&currents[6]==Direction.CENTER) {
                        costs[14] = cooldowns[14]+(cost+9)/10*10;
                        dirs[14] = Direction.EAST;
                        wait[14] = true;
                        currented[14] = null;
                        setChecked(14);

                        if (dest[14]) return 14;

                        addToQueue(14);
                    }
                    int currentTile = moveWithCurrent(14);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[14];
                        dirs[currentTile] = currents[14];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[14] = cost + cooldowns[14];
                    dirs[14] = Direction.EAST;
                    currented[14] = null;
                    wait[14] = false;
                    setChecked(14);

                    if (dest[14]) return 14;

                    addToQueue(14);
                }
            }
            if(toCheck13){//debugPoint(13, rc);
                if(currents[13]!=Direction.CENTER&&cost%10+cooldowns[13]>9) {
                    if (cost%10>0&&cooldowns[13]<10&&currents[6]==Direction.CENTER) {
                        costs[13] = cooldowns[13]+(cost+9)/10*10;
                        dirs[13] = Direction.SOUTHEAST;
                        wait[13] = true;
                        currented[13] = null;
                        setChecked(13);

                        if (dest[13]) return 13;

                        addToQueue(13);
                    }
                    int currentTile = moveWithCurrent(13);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[13];
                        dirs[currentTile] = currents[13];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[13] = cost + cooldowns[13];
                    dirs[13] = Direction.SOUTHEAST;
                    currented[13] = null;
                    wait[13] = false;
                    setChecked(13);

                    if (dest[13]) return 13;

                    addToQueue(13);
                }
            }
            if(toCheck5){//debugPoint(5, rc);
                if(currents[5]!=Direction.CENTER&&cost%10+cooldowns[5]>9) {
                    if (cost%10>0&&cooldowns[5]<10&&currents[6]==Direction.CENTER) {
                        costs[5] = cooldowns[5]+(cost+9)/10*10;
                        dirs[5] = Direction.SOUTH;
                        wait[5] = true;
                        currented[5] = null;
                        setChecked(5);

                        if (dest[5]) return 5;

                        addToQueue(5);
                    }
                    int currentTile = moveWithCurrent(5);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[5];
                        dirs[currentTile] = currents[5];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[5] = cost + cooldowns[5];
                    dirs[5] = Direction.SOUTH;
                    currented[5] = null;
                    wait[5] = false;
                    setChecked(5);

                    if (dest[5]) return 5;

                    addToQueue(5);
                }
            }
            break;case 7:
        cost=costs[7];if(toCheck1){//debugPoint(1, rc);
                if(currents[1]!=Direction.CENTER&&cost%10+cooldowns[1]>9) {
                    if (cost%10>0&&cooldowns[1]<10&&currents[7]==Direction.CENTER) {
                        costs[1] = cooldowns[1]+(cost+9)/10*10;
                        dirs[1] = Direction.WEST;
                        wait[1] = true;
                        currented[1] = null;
                        setChecked(1);

                        if (dest[1]) return 1;

                        addToQueue(1);
                    }
                    int currentTile = moveWithCurrent(1);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[1];
                        dirs[currentTile] = currents[1];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[1] = cost + cooldowns[1];
                    dirs[1] = Direction.WEST;
                    currented[1] = null;
                    wait[1] = false;
                    setChecked(1);

                    if (dest[1]) return 1;

                    addToQueue(1);
                }
            }
            if(toCheck2){//debugPoint(2, rc);
                if(currents[2]!=Direction.CENTER&&cost%10+cooldowns[2]>9) {
                    if (cost%10>0&&cooldowns[2]<10&&currents[7]==Direction.CENTER) {
                        costs[2] = cooldowns[2]+(cost+9)/10*10;
                        dirs[2] = Direction.NORTHWEST;
                        wait[2] = true;
                        currented[2] = null;
                        setChecked(2);

                        if (dest[2]) return 2;

                        addToQueue(2);
                    }
                    int currentTile = moveWithCurrent(2);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[2];
                        dirs[currentTile] = currents[2];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[2] = cost + cooldowns[2];
                    dirs[2] = Direction.NORTHWEST;
                    currented[2] = null;
                    wait[2] = false;
                    setChecked(2);

                    if (dest[2]) return 2;

                    addToQueue(2);
                }
            }
            if(toCheck8){//debugPoint(8, rc);
                if(currents[8]!=Direction.CENTER&&cost%10+cooldowns[8]>9) {
                    if (cost%10>0&&cooldowns[8]<10&&currents[7]==Direction.CENTER) {
                        costs[8] = cooldowns[8]+(cost+9)/10*10;
                        dirs[8] = Direction.NORTH;
                        wait[8] = true;
                        currented[8] = null;
                        setChecked(8);

                        if (dest[8]) return 8;

                        addToQueue(8);
                    }
                    int currentTile = moveWithCurrent(8);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[8];
                        dirs[currentTile] = currents[8];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[8] = cost + cooldowns[8];
                    dirs[8] = Direction.NORTH;
                    currented[8] = null;
                    wait[8] = false;
                    setChecked(8);

                    if (dest[8]) return 8;

                    addToQueue(8);
                }
            }
            if(toCheck16){//debugPoint(16, rc);
                if(currents[16]!=Direction.CENTER&&cost%10+cooldowns[16]>9) {
                    if (cost%10>0&&cooldowns[16]<10&&currents[7]==Direction.CENTER) {
                        costs[16] = cooldowns[16]+(cost+9)/10*10;
                        dirs[16] = Direction.NORTHEAST;
                        wait[16] = true;
                        currented[16] = null;
                        setChecked(16);

                        if (dest[16]) return 16;

                        addToQueue(16);
                    }
                    int currentTile = moveWithCurrent(16);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[16];
                        dirs[currentTile] = currents[16];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[16] = cost + cooldowns[16];
                    dirs[16] = Direction.NORTHEAST;
                    currented[16] = null;
                    wait[16] = false;
                    setChecked(16);

                    if (dest[16]) return 16;

                    addToQueue(16);
                }
            }
            if(toCheck15){//debugPoint(15, rc);
                if(currents[15]!=Direction.CENTER&&cost%10+cooldowns[15]>9) {
                    if (cost%10>0&&cooldowns[15]<10&&currents[7]==Direction.CENTER) {
                        costs[15] = cooldowns[15]+(cost+9)/10*10;
                        dirs[15] = Direction.EAST;
                        wait[15] = true;
                        currented[15] = null;
                        setChecked(15);

                        if (dest[15]) return 15;

                        addToQueue(15);
                    }
                    int currentTile = moveWithCurrent(15);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[15];
                        dirs[currentTile] = currents[15];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[15] = cost + cooldowns[15];
                    dirs[15] = Direction.EAST;
                    currented[15] = null;
                    wait[15] = false;
                    setChecked(15);

                    if (dest[15]) return 15;

                    addToQueue(15);
                }
            }
            if(toCheck14){//debugPoint(14, rc);
                if(currents[14]!=Direction.CENTER&&cost%10+cooldowns[14]>9) {
                    if (cost%10>0&&cooldowns[14]<10&&currents[7]==Direction.CENTER) {
                        costs[14] = cooldowns[14]+(cost+9)/10*10;
                        dirs[14] = Direction.SOUTHEAST;
                        wait[14] = true;
                        currented[14] = null;
                        setChecked(14);

                        if (dest[14]) return 14;

                        addToQueue(14);
                    }
                    int currentTile = moveWithCurrent(14);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[14];
                        dirs[currentTile] = currents[14];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[14] = cost + cooldowns[14];
                    dirs[14] = Direction.SOUTHEAST;
                    currented[14] = null;
                    wait[14] = false;
                    setChecked(14);

                    if (dest[14]) return 14;

                    addToQueue(14);
                }
            }
            if(toCheck6){//debugPoint(6, rc);
                if(currents[6]!=Direction.CENTER&&cost%10+cooldowns[6]>9) {
                    if (cost%10>0&&cooldowns[6]<10&&currents[7]==Direction.CENTER) {
                        costs[6] = cooldowns[6]+(cost+9)/10*10;
                        dirs[6] = Direction.SOUTH;
                        wait[6] = true;
                        currented[6] = null;
                        setChecked(6);

                        if (dest[6]) return 6;

                        addToQueue(6);
                    }
                    int currentTile = moveWithCurrent(6);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[6];
                        dirs[currentTile] = currents[6];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[6] = cost + cooldowns[6];
                    dirs[6] = Direction.SOUTH;
                    currented[6] = null;
                    wait[6] = false;
                    setChecked(6);

                    if (dest[6]) return 6;

                    addToQueue(6);
                }
            }
            if(toCheck0){//debugPoint(0, rc);
                if(currents[0]!=Direction.CENTER&&cost%10+cooldowns[0]>9) {
                    if (cost%10>0&&cooldowns[0]<10&&currents[7]==Direction.CENTER) {
                        costs[0] = cooldowns[0]+(cost+9)/10*10;
                        dirs[0] = Direction.SOUTHWEST;
                        wait[0] = true;
                        currented[0] = null;
                        setChecked(0);

                        if (dest[0]) return 0;

                        addToQueue(0);
                    }
                    int currentTile = moveWithCurrent(0);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[0];
                        dirs[currentTile] = currents[0];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[0] = cost + cooldowns[0];
                    dirs[0] = Direction.SOUTHWEST;
                    currented[0] = null;
                    wait[0] = false;
                    setChecked(0);

                    if (dest[0]) return 0;

                    addToQueue(0);
                }
            }
            break;case 8:
        cost=costs[8];if(toCheck2){//debugPoint(2, rc);
                if(currents[2]!=Direction.CENTER&&cost%10+cooldowns[2]>9) {
                    if (cost%10>0&&cooldowns[2]<10&&currents[8]==Direction.CENTER) {
                        costs[2] = cooldowns[2]+(cost+9)/10*10;
                        dirs[2] = Direction.WEST;
                        wait[2] = true;
                        currented[2] = null;
                        setChecked(2);

                        if (dest[2]) return 2;

                        addToQueue(2);
                    }
                    int currentTile = moveWithCurrent(2);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[2];
                        dirs[currentTile] = currents[2];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[2] = cost + cooldowns[2];
                    dirs[2] = Direction.WEST;
                    currented[2] = null;
                    wait[2] = false;
                    setChecked(2);

                    if (dest[2]) return 2;

                    addToQueue(2);
                }
            }
            if(toCheck3){//debugPoint(3, rc);
                if(currents[3]!=Direction.CENTER&&cost%10+cooldowns[3]>9) {
                    if (cost%10>0&&cooldowns[3]<10&&currents[8]==Direction.CENTER) {
                        costs[3] = cooldowns[3]+(cost+9)/10*10;
                        dirs[3] = Direction.NORTHWEST;
                        wait[3] = true;
                        currented[3] = null;
                        setChecked(3);

                        if (dest[3]) return 3;

                        addToQueue(3);
                    }
                    int currentTile = moveWithCurrent(3);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[3];
                        dirs[currentTile] = currents[3];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[3] = cost + cooldowns[3];
                    dirs[3] = Direction.NORTHWEST;
                    currented[3] = null;
                    wait[3] = false;
                    setChecked(3);

                    if (dest[3]) return 3;

                    addToQueue(3);
                }
            }
            if(toCheck9){//debugPoint(9, rc);
                if(currents[9]!=Direction.CENTER&&cost%10+cooldowns[9]>9) {
                    if (cost%10>0&&cooldowns[9]<10&&currents[8]==Direction.CENTER) {
                        costs[9] = cooldowns[9]+(cost+9)/10*10;
                        dirs[9] = Direction.NORTH;
                        wait[9] = true;
                        currented[9] = null;
                        setChecked(9);

                        if (dest[9]) return 9;

                        addToQueue(9);
                    }
                    int currentTile = moveWithCurrent(9);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[9];
                        dirs[currentTile] = currents[9];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[9] = cost + cooldowns[9];
                    dirs[9] = Direction.NORTH;
                    currented[9] = null;
                    wait[9] = false;
                    setChecked(9);

                    if (dest[9]) return 9;

                    addToQueue(9);
                }
            }
            if(toCheck17){//debugPoint(17, rc);
                if(currents[17]!=Direction.CENTER&&cost%10+cooldowns[17]>9) {
                    if (cost%10>0&&cooldowns[17]<10&&currents[8]==Direction.CENTER) {
                        costs[17] = cooldowns[17]+(cost+9)/10*10;
                        dirs[17] = Direction.NORTHEAST;
                        wait[17] = true;
                        currented[17] = null;
                        setChecked(17);

                        if (dest[17]) return 17;

                        addToQueue(17);
                    }
                    int currentTile = moveWithCurrent(17);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[17];
                        dirs[currentTile] = currents[17];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[17] = cost + cooldowns[17];
                    dirs[17] = Direction.NORTHEAST;
                    currented[17] = null;
                    wait[17] = false;
                    setChecked(17);

                    if (dest[17]) return 17;

                    addToQueue(17);
                }
            }
            if(toCheck16){//debugPoint(16, rc);
                if(currents[16]!=Direction.CENTER&&cost%10+cooldowns[16]>9) {
                    if (cost%10>0&&cooldowns[16]<10&&currents[8]==Direction.CENTER) {
                        costs[16] = cooldowns[16]+(cost+9)/10*10;
                        dirs[16] = Direction.EAST;
                        wait[16] = true;
                        currented[16] = null;
                        setChecked(16);

                        if (dest[16]) return 16;

                        addToQueue(16);
                    }
                    int currentTile = moveWithCurrent(16);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[16];
                        dirs[currentTile] = currents[16];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[16] = cost + cooldowns[16];
                    dirs[16] = Direction.EAST;
                    currented[16] = null;
                    wait[16] = false;
                    setChecked(16);

                    if (dest[16]) return 16;

                    addToQueue(16);
                }
            }
            if(toCheck15){//debugPoint(15, rc);
                if(currents[15]!=Direction.CENTER&&cost%10+cooldowns[15]>9) {
                    if (cost%10>0&&cooldowns[15]<10&&currents[8]==Direction.CENTER) {
                        costs[15] = cooldowns[15]+(cost+9)/10*10;
                        dirs[15] = Direction.SOUTHEAST;
                        wait[15] = true;
                        currented[15] = null;
                        setChecked(15);

                        if (dest[15]) return 15;

                        addToQueue(15);
                    }
                    int currentTile = moveWithCurrent(15);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[15];
                        dirs[currentTile] = currents[15];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[15] = cost + cooldowns[15];
                    dirs[15] = Direction.SOUTHEAST;
                    currented[15] = null;
                    wait[15] = false;
                    setChecked(15);

                    if (dest[15]) return 15;

                    addToQueue(15);
                }
            }
            if(toCheck7){//debugPoint(7, rc);
                if(currents[7]!=Direction.CENTER&&cost%10+cooldowns[7]>9) {
                    if (cost%10>0&&cooldowns[7]<10&&currents[8]==Direction.CENTER) {
                        costs[7] = cooldowns[7]+(cost+9)/10*10;
                        dirs[7] = Direction.SOUTH;
                        wait[7] = true;
                        currented[7] = null;
                        setChecked(7);

                        if (dest[7]) return 7;

                        addToQueue(7);
                    }
                    int currentTile = moveWithCurrent(7);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[7];
                        dirs[currentTile] = currents[7];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[7] = cost + cooldowns[7];
                    dirs[7] = Direction.SOUTH;
                    currented[7] = null;
                    wait[7] = false;
                    setChecked(7);

                    if (dest[7]) return 7;

                    addToQueue(7);
                }
            }
            if(toCheck1){//debugPoint(1, rc);
                if(currents[1]!=Direction.CENTER&&cost%10+cooldowns[1]>9) {
                    if (cost%10>0&&cooldowns[1]<10&&currents[8]==Direction.CENTER) {
                        costs[1] = cooldowns[1]+(cost+9)/10*10;
                        dirs[1] = Direction.SOUTHWEST;
                        wait[1] = true;
                        currented[1] = null;
                        setChecked(1);

                        if (dest[1]) return 1;

                        addToQueue(1);
                    }
                    int currentTile = moveWithCurrent(1);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[1];
                        dirs[currentTile] = currents[1];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[1] = cost + cooldowns[1];
                    dirs[1] = Direction.SOUTHWEST;
                    currented[1] = null;
                    wait[1] = false;
                    setChecked(1);

                    if (dest[1]) return 1;

                    addToQueue(1);
                }
            }
            break;case 9:
        cost=costs[9];if(toCheck3){//debugPoint(3, rc);
                if(currents[3]!=Direction.CENTER&&cost%10+cooldowns[3]>9) {
                    if (cost%10>0&&cooldowns[3]<10&&currents[9]==Direction.CENTER) {
                        costs[3] = cooldowns[3]+(cost+9)/10*10;
                        dirs[3] = Direction.WEST;
                        wait[3] = true;
                        currented[3] = null;
                        setChecked(3);

                        if (dest[3]) return 3;

                        addToQueue(3);
                    }
                    int currentTile = moveWithCurrent(3);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[3];
                        dirs[currentTile] = currents[3];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[3] = cost + cooldowns[3];
                    dirs[3] = Direction.WEST;
                    currented[3] = null;
                    wait[3] = false;
                    setChecked(3);

                    if (dest[3]) return 3;

                    addToQueue(3);
                }
            }
            if(toCheck4){//debugPoint(4, rc);
                if(currents[4]!=Direction.CENTER&&cost%10+cooldowns[4]>9) {
                    if (cost%10>0&&cooldowns[4]<10&&currents[9]==Direction.CENTER) {
                        costs[4] = cooldowns[4]+(cost+9)/10*10;
                        dirs[4] = Direction.NORTHWEST;
                        wait[4] = true;
                        currented[4] = null;
                        setChecked(4);

                        if (dest[4]) return 4;

                        addToQueue(4);
                    }
                    int currentTile = moveWithCurrent(4);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[4];
                        dirs[currentTile] = currents[4];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[4] = cost + cooldowns[4];
                    dirs[4] = Direction.NORTHWEST;
                    currented[4] = null;
                    wait[4] = false;
                    setChecked(4);

                    if (dest[4]) return 4;

                    addToQueue(4);
                }
            }
            if(toCheck10){//debugPoint(10, rc);
                if(currents[10]!=Direction.CENTER&&cost%10+cooldowns[10]>9) {
                    if (cost%10>0&&cooldowns[10]<10&&currents[9]==Direction.CENTER) {
                        costs[10] = cooldowns[10]+(cost+9)/10*10;
                        dirs[10] = Direction.NORTH;
                        wait[10] = true;
                        currented[10] = null;
                        setChecked(10);

                        if (dest[10]) return 10;

                        addToQueue(10);
                    }
                    int currentTile = moveWithCurrent(10);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[10];
                        dirs[currentTile] = currents[10];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[10] = cost + cooldowns[10];
                    dirs[10] = Direction.NORTH;
                    currented[10] = null;
                    wait[10] = false;
                    setChecked(10);

                    if (dest[10]) return 10;

                    addToQueue(10);
                }
            }
            if(toCheck18){//debugPoint(18, rc);
                if(currents[18]!=Direction.CENTER&&cost%10+cooldowns[18]>9) {
                    if (cost%10>0&&cooldowns[18]<10&&currents[9]==Direction.CENTER) {
                        costs[18] = cooldowns[18]+(cost+9)/10*10;
                        dirs[18] = Direction.NORTHEAST;
                        wait[18] = true;
                        currented[18] = null;
                        setChecked(18);

                        if (dest[18]) return 18;

                        addToQueue(18);
                    }
                    int currentTile = moveWithCurrent(18);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[18];
                        dirs[currentTile] = currents[18];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[18] = cost + cooldowns[18];
                    dirs[18] = Direction.NORTHEAST;
                    currented[18] = null;
                    wait[18] = false;
                    setChecked(18);

                    if (dest[18]) return 18;

                    addToQueue(18);
                }
            }
            if(toCheck17){//debugPoint(17, rc);
                if(currents[17]!=Direction.CENTER&&cost%10+cooldowns[17]>9) {
                    if (cost%10>0&&cooldowns[17]<10&&currents[9]==Direction.CENTER) {
                        costs[17] = cooldowns[17]+(cost+9)/10*10;
                        dirs[17] = Direction.EAST;
                        wait[17] = true;
                        currented[17] = null;
                        setChecked(17);

                        if (dest[17]) return 17;

                        addToQueue(17);
                    }
                    int currentTile = moveWithCurrent(17);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[17];
                        dirs[currentTile] = currents[17];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[17] = cost + cooldowns[17];
                    dirs[17] = Direction.EAST;
                    currented[17] = null;
                    wait[17] = false;
                    setChecked(17);

                    if (dest[17]) return 17;

                    addToQueue(17);
                }
            }
            if(toCheck16){//debugPoint(16, rc);
                if(currents[16]!=Direction.CENTER&&cost%10+cooldowns[16]>9) {
                    if (cost%10>0&&cooldowns[16]<10&&currents[9]==Direction.CENTER) {
                        costs[16] = cooldowns[16]+(cost+9)/10*10;
                        dirs[16] = Direction.SOUTHEAST;
                        wait[16] = true;
                        currented[16] = null;
                        setChecked(16);

                        if (dest[16]) return 16;

                        addToQueue(16);
                    }
                    int currentTile = moveWithCurrent(16);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[16];
                        dirs[currentTile] = currents[16];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[16] = cost + cooldowns[16];
                    dirs[16] = Direction.SOUTHEAST;
                    currented[16] = null;
                    wait[16] = false;
                    setChecked(16);

                    if (dest[16]) return 16;

                    addToQueue(16);
                }
            }
            if(toCheck8){//debugPoint(8, rc);
                if(currents[8]!=Direction.CENTER&&cost%10+cooldowns[8]>9) {
                    if (cost%10>0&&cooldowns[8]<10&&currents[9]==Direction.CENTER) {
                        costs[8] = cooldowns[8]+(cost+9)/10*10;
                        dirs[8] = Direction.SOUTH;
                        wait[8] = true;
                        currented[8] = null;
                        setChecked(8);

                        if (dest[8]) return 8;

                        addToQueue(8);
                    }
                    int currentTile = moveWithCurrent(8);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[8];
                        dirs[currentTile] = currents[8];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[8] = cost + cooldowns[8];
                    dirs[8] = Direction.SOUTH;
                    currented[8] = null;
                    wait[8] = false;
                    setChecked(8);

                    if (dest[8]) return 8;

                    addToQueue(8);
                }
            }
            if(toCheck2){//debugPoint(2, rc);
                if(currents[2]!=Direction.CENTER&&cost%10+cooldowns[2]>9) {
                    if (cost%10>0&&cooldowns[2]<10&&currents[9]==Direction.CENTER) {
                        costs[2] = cooldowns[2]+(cost+9)/10*10;
                        dirs[2] = Direction.SOUTHWEST;
                        wait[2] = true;
                        currented[2] = null;
                        setChecked(2);

                        if (dest[2]) return 2;

                        addToQueue(2);
                    }
                    int currentTile = moveWithCurrent(2);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[2];
                        dirs[currentTile] = currents[2];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[2] = cost + cooldowns[2];
                    dirs[2] = Direction.SOUTHWEST;
                    currented[2] = null;
                    wait[2] = false;
                    setChecked(2);

                    if (dest[2]) return 2;

                    addToQueue(2);
                }
            }
            break;case 10:
        cost=costs[10];if(toCheck4){//debugPoint(4, rc);
                if(currents[4]!=Direction.CENTER&&cost%10+cooldowns[4]>9) {
                    if (cost%10>0&&cooldowns[4]<10&&currents[10]==Direction.CENTER) {
                        costs[4] = cooldowns[4]+(cost+9)/10*10;
                        dirs[4] = Direction.WEST;
                        wait[4] = true;
                        currented[4] = null;
                        setChecked(4);

                        if (dest[4]) return 4;

                        addToQueue(4);
                    }
                    int currentTile = moveWithCurrent(4);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[4];
                        dirs[currentTile] = currents[4];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[4] = cost + cooldowns[4];
                    dirs[4] = Direction.WEST;
                    currented[4] = null;
                    wait[4] = false;
                    setChecked(4);

                    if (dest[4]) return 4;

                    addToQueue(4);
                }
            }
            if(toCheck11){//debugPoint(11, rc);
                if(currents[11]!=Direction.CENTER&&cost%10+cooldowns[11]>9) {
                    if (cost%10>0&&cooldowns[11]<10&&currents[10]==Direction.CENTER) {
                        costs[11] = cooldowns[11]+(cost+9)/10*10;
                        dirs[11] = Direction.NORTH;
                        wait[11] = true;
                        currented[11] = null;
                        setChecked(11);

                        if (dest[11]) return 11;

                        addToQueue(11);
                    }
                    int currentTile = moveWithCurrent(11);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[11];
                        dirs[currentTile] = currents[11];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[11] = cost + cooldowns[11];
                    dirs[11] = Direction.NORTH;
                    currented[11] = null;
                    wait[11] = false;
                    setChecked(11);

                    if (dest[11]) return 11;

                    addToQueue(11);
                }
            }
            if(toCheck19){//debugPoint(19, rc);
                if(currents[19]!=Direction.CENTER&&cost%10+cooldowns[19]>9) {
                    if (cost%10>0&&cooldowns[19]<10&&currents[10]==Direction.CENTER) {
                        costs[19] = cooldowns[19]+(cost+9)/10*10;
                        dirs[19] = Direction.NORTHEAST;
                        wait[19] = true;
                        currented[19] = null;
                        setChecked(19);

                        if (dest[19]) return 19;

                        addToQueue(19);
                    }
                    int currentTile = moveWithCurrent(19);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[19];
                        dirs[currentTile] = currents[19];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[19] = cost + cooldowns[19];
                    dirs[19] = Direction.NORTHEAST;
                    currented[19] = null;
                    wait[19] = false;
                    setChecked(19);

                    if (dest[19]) return 19;

                    addToQueue(19);
                }
            }
            if(toCheck18){//debugPoint(18, rc);
                if(currents[18]!=Direction.CENTER&&cost%10+cooldowns[18]>9) {
                    if (cost%10>0&&cooldowns[18]<10&&currents[10]==Direction.CENTER) {
                        costs[18] = cooldowns[18]+(cost+9)/10*10;
                        dirs[18] = Direction.EAST;
                        wait[18] = true;
                        currented[18] = null;
                        setChecked(18);

                        if (dest[18]) return 18;

                        addToQueue(18);
                    }
                    int currentTile = moveWithCurrent(18);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[18];
                        dirs[currentTile] = currents[18];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[18] = cost + cooldowns[18];
                    dirs[18] = Direction.EAST;
                    currented[18] = null;
                    wait[18] = false;
                    setChecked(18);

                    if (dest[18]) return 18;

                    addToQueue(18);
                }
            }
            if(toCheck17){//debugPoint(17, rc);
                if(currents[17]!=Direction.CENTER&&cost%10+cooldowns[17]>9) {
                    if (cost%10>0&&cooldowns[17]<10&&currents[10]==Direction.CENTER) {
                        costs[17] = cooldowns[17]+(cost+9)/10*10;
                        dirs[17] = Direction.SOUTHEAST;
                        wait[17] = true;
                        currented[17] = null;
                        setChecked(17);

                        if (dest[17]) return 17;

                        addToQueue(17);
                    }
                    int currentTile = moveWithCurrent(17);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[17];
                        dirs[currentTile] = currents[17];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[17] = cost + cooldowns[17];
                    dirs[17] = Direction.SOUTHEAST;
                    currented[17] = null;
                    wait[17] = false;
                    setChecked(17);

                    if (dest[17]) return 17;

                    addToQueue(17);
                }
            }
            if(toCheck9){//debugPoint(9, rc);
                if(currents[9]!=Direction.CENTER&&cost%10+cooldowns[9]>9) {
                    if (cost%10>0&&cooldowns[9]<10&&currents[10]==Direction.CENTER) {
                        costs[9] = cooldowns[9]+(cost+9)/10*10;
                        dirs[9] = Direction.SOUTH;
                        wait[9] = true;
                        currented[9] = null;
                        setChecked(9);

                        if (dest[9]) return 9;

                        addToQueue(9);
                    }
                    int currentTile = moveWithCurrent(9);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[9];
                        dirs[currentTile] = currents[9];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[9] = cost + cooldowns[9];
                    dirs[9] = Direction.SOUTH;
                    currented[9] = null;
                    wait[9] = false;
                    setChecked(9);

                    if (dest[9]) return 9;

                    addToQueue(9);
                }
            }
            if(toCheck3){//debugPoint(3, rc);
                if(currents[3]!=Direction.CENTER&&cost%10+cooldowns[3]>9) {
                    if (cost%10>0&&cooldowns[3]<10&&currents[10]==Direction.CENTER) {
                        costs[3] = cooldowns[3]+(cost+9)/10*10;
                        dirs[3] = Direction.SOUTHWEST;
                        wait[3] = true;
                        currented[3] = null;
                        setChecked(3);

                        if (dest[3]) return 3;

                        addToQueue(3);
                    }
                    int currentTile = moveWithCurrent(3);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[3];
                        dirs[currentTile] = currents[3];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[3] = cost + cooldowns[3];
                    dirs[3] = Direction.SOUTHWEST;
                    currented[3] = null;
                    wait[3] = false;
                    setChecked(3);

                    if (dest[3]) return 3;

                    addToQueue(3);
                }
            }
            break;case 11:
        cost=costs[11];if(toCheck20){//debugPoint(20, rc);
                if(currents[20]!=Direction.CENTER&&cost%10+cooldowns[20]>9) {
                    if (cost%10>0&&cooldowns[20]<10&&currents[11]==Direction.CENTER) {
                        costs[20] = cooldowns[20]+(cost+9)/10*10;
                        dirs[20] = Direction.NORTHEAST;
                        wait[20] = true;
                        currented[20] = null;
                        setChecked(20);

                        if (dest[20]) return 20;

                        addToQueue(20);
                    }
                    int currentTile = moveWithCurrent(20);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[20];
                        dirs[currentTile] = currents[20];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[20] = cost + cooldowns[20];
                    dirs[20] = Direction.NORTHEAST;
                    currented[20] = null;
                    wait[20] = false;
                    setChecked(20);

                    if (dest[20]) return 20;

                    addToQueue(20);
                }
            }
            if(toCheck19){//debugPoint(19, rc);
                if(currents[19]!=Direction.CENTER&&cost%10+cooldowns[19]>9) {
                    if (cost%10>0&&cooldowns[19]<10&&currents[11]==Direction.CENTER) {
                        costs[19] = cooldowns[19]+(cost+9)/10*10;
                        dirs[19] = Direction.EAST;
                        wait[19] = true;
                        currented[19] = null;
                        setChecked(19);

                        if (dest[19]) return 19;

                        addToQueue(19);
                    }
                    int currentTile = moveWithCurrent(19);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[19];
                        dirs[currentTile] = currents[19];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[19] = cost + cooldowns[19];
                    dirs[19] = Direction.EAST;
                    currented[19] = null;
                    wait[19] = false;
                    setChecked(19);

                    if (dest[19]) return 19;

                    addToQueue(19);
                }
            }
            if(toCheck18){//debugPoint(18, rc);
                if(currents[18]!=Direction.CENTER&&cost%10+cooldowns[18]>9) {
                    if (cost%10>0&&cooldowns[18]<10&&currents[11]==Direction.CENTER) {
                        costs[18] = cooldowns[18]+(cost+9)/10*10;
                        dirs[18] = Direction.SOUTHEAST;
                        wait[18] = true;
                        currented[18] = null;
                        setChecked(18);

                        if (dest[18]) return 18;

                        addToQueue(18);
                    }
                    int currentTile = moveWithCurrent(18);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[18];
                        dirs[currentTile] = currents[18];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[18] = cost + cooldowns[18];
                    dirs[18] = Direction.SOUTHEAST;
                    currented[18] = null;
                    wait[18] = false;
                    setChecked(18);

                    if (dest[18]) return 18;

                    addToQueue(18);
                }
            }
            if(toCheck10){//debugPoint(10, rc);
                if(currents[10]!=Direction.CENTER&&cost%10+cooldowns[10]>9) {
                    if (cost%10>0&&cooldowns[10]<10&&currents[11]==Direction.CENTER) {
                        costs[10] = cooldowns[10]+(cost+9)/10*10;
                        dirs[10] = Direction.SOUTH;
                        wait[10] = true;
                        currented[10] = null;
                        setChecked(10);

                        if (dest[10]) return 10;

                        addToQueue(10);
                    }
                    int currentTile = moveWithCurrent(10);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[10];
                        dirs[currentTile] = currents[10];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[10] = cost + cooldowns[10];
                    dirs[10] = Direction.SOUTH;
                    currented[10] = null;
                    wait[10] = false;
                    setChecked(10);

                    if (dest[10]) return 10;

                    addToQueue(10);
                }
            }
            if(toCheck4){//debugPoint(4, rc);
                if(currents[4]!=Direction.CENTER&&cost%10+cooldowns[4]>9) {
                    if (cost%10>0&&cooldowns[4]<10&&currents[11]==Direction.CENTER) {
                        costs[4] = cooldowns[4]+(cost+9)/10*10;
                        dirs[4] = Direction.SOUTHWEST;
                        wait[4] = true;
                        currented[4] = null;
                        setChecked(4);

                        if (dest[4]) return 4;

                        addToQueue(4);
                    }
                    int currentTile = moveWithCurrent(4);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[4];
                        dirs[currentTile] = currents[4];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[4] = cost + cooldowns[4];
                    dirs[4] = Direction.SOUTHWEST;
                    currented[4] = null;
                    wait[4] = false;
                    setChecked(4);

                    if (dest[4]) return 4;

                    addToQueue(4);
                }
            }
            break;case 12:
        cost=costs[12];if(toCheck5){//debugPoint(5, rc);
                if(currents[5]!=Direction.CENTER&&cost%10+cooldowns[5]>9) {
                    if (cost%10>0&&cooldowns[5]<10&&currents[12]==Direction.CENTER) {
                        costs[5] = cooldowns[5]+(cost+9)/10*10;
                        dirs[5] = Direction.NORTHWEST;
                        wait[5] = true;
                        currented[5] = null;
                        setChecked(5);

                        if (dest[5]) return 5;

                        addToQueue(5);
                    }
                    int currentTile = moveWithCurrent(5);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[5];
                        dirs[currentTile] = currents[5];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[5] = cost + cooldowns[5];
                    dirs[5] = Direction.NORTHWEST;
                    currented[5] = null;
                    wait[5] = false;
                    setChecked(5);

                    if (dest[5]) return 5;

                    addToQueue(5);
                }
            }
            if(toCheck13){//debugPoint(13, rc);
                if(currents[13]!=Direction.CENTER&&cost%10+cooldowns[13]>9) {
                    if (cost%10>0&&cooldowns[13]<10&&currents[12]==Direction.CENTER) {
                        costs[13] = cooldowns[13]+(cost+9)/10*10;
                        dirs[13] = Direction.NORTH;
                        wait[13] = true;
                        currented[13] = null;
                        setChecked(13);

                        if (dest[13]) return 13;

                        addToQueue(13);
                    }
                    int currentTile = moveWithCurrent(13);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[13];
                        dirs[currentTile] = currents[13];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[13] = cost + cooldowns[13];
                    dirs[13] = Direction.NORTH;
                    currented[13] = null;
                    wait[13] = false;
                    setChecked(13);

                    if (dest[13]) return 13;

                    addToQueue(13);
                }
            }
            if(toCheck22){//debugPoint(22, rc);
                if(currents[22]!=Direction.CENTER&&cost%10+cooldowns[22]>9) {
                    if (cost%10>0&&cooldowns[22]<10&&currents[12]==Direction.CENTER) {
                        costs[22] = cooldowns[22]+(cost+9)/10*10;
                        dirs[22] = Direction.NORTHEAST;
                        wait[22] = true;
                        currented[22] = null;
                        setChecked(22);

                        if (dest[22]) return 22;

                        addToQueue(22);
                    }
                    int currentTile = moveWithCurrent(22);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[22];
                        dirs[currentTile] = currents[22];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[22] = cost + cooldowns[22];
                    dirs[22] = Direction.NORTHEAST;
                    currented[22] = null;
                    wait[22] = false;
                    setChecked(22);

                    if (dest[22]) return 22;

                    addToQueue(22);
                }
            }
            if(toCheck21){//debugPoint(21, rc);
                if(currents[21]!=Direction.CENTER&&cost%10+cooldowns[21]>9) {
                    if (cost%10>0&&cooldowns[21]<10&&currents[12]==Direction.CENTER) {
                        costs[21] = cooldowns[21]+(cost+9)/10*10;
                        dirs[21] = Direction.EAST;
                        wait[21] = true;
                        currented[21] = null;
                        setChecked(21);

                        if (dest[21]) return 21;

                        addToQueue(21);
                    }
                    int currentTile = moveWithCurrent(21);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[21];
                        dirs[currentTile] = currents[21];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[21] = cost + cooldowns[21];
                    dirs[21] = Direction.EAST;
                    currented[21] = null;
                    wait[21] = false;
                    setChecked(21);

                    if (dest[21]) return 21;

                    addToQueue(21);
                }
            }
            break;
        }
    return -1;
    }
    public static int dijkstraSub1(RobotController rc, int n) {int cost; switch(n) {case 13:
        cost=costs[13];if(toCheck5){//debugPoint(5, rc);
                if(currents[5]!=Direction.CENTER&&cost%10+cooldowns[5]>9) {
                    if (cost%10>0&&cooldowns[5]<10&&currents[13]==Direction.CENTER) {
                        costs[5] = cooldowns[5]+(cost+9)/10*10;
                        dirs[5] = Direction.WEST;
                        wait[5] = true;
                        currented[5] = null;
                        setChecked(5);

                        if (dest[5]) return 5;

                        addToQueue(5);
                    }
                    int currentTile = moveWithCurrent(5);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[5];
                        dirs[currentTile] = currents[5];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[5] = cost + cooldowns[5];
                    dirs[5] = Direction.WEST;
                    currented[5] = null;
                    wait[5] = false;
                    setChecked(5);

                    if (dest[5]) return 5;

                    addToQueue(5);
                }
            }
            if(toCheck6){//debugPoint(6, rc);
                if(currents[6]!=Direction.CENTER&&cost%10+cooldowns[6]>9) {
                    if (cost%10>0&&cooldowns[6]<10&&currents[13]==Direction.CENTER) {
                        costs[6] = cooldowns[6]+(cost+9)/10*10;
                        dirs[6] = Direction.NORTHWEST;
                        wait[6] = true;
                        currented[6] = null;
                        setChecked(6);

                        if (dest[6]) return 6;

                        addToQueue(6);
                    }
                    int currentTile = moveWithCurrent(6);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[6];
                        dirs[currentTile] = currents[6];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[6] = cost + cooldowns[6];
                    dirs[6] = Direction.NORTHWEST;
                    currented[6] = null;
                    wait[6] = false;
                    setChecked(6);

                    if (dest[6]) return 6;

                    addToQueue(6);
                }
            }
            if(toCheck14){//debugPoint(14, rc);
                if(currents[14]!=Direction.CENTER&&cost%10+cooldowns[14]>9) {
                    if (cost%10>0&&cooldowns[14]<10&&currents[13]==Direction.CENTER) {
                        costs[14] = cooldowns[14]+(cost+9)/10*10;
                        dirs[14] = Direction.NORTH;
                        wait[14] = true;
                        currented[14] = null;
                        setChecked(14);

                        if (dest[14]) return 14;

                        addToQueue(14);
                    }
                    int currentTile = moveWithCurrent(14);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[14];
                        dirs[currentTile] = currents[14];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[14] = cost + cooldowns[14];
                    dirs[14] = Direction.NORTH;
                    currented[14] = null;
                    wait[14] = false;
                    setChecked(14);

                    if (dest[14]) return 14;

                    addToQueue(14);
                }
            }
            if(toCheck23){//debugPoint(23, rc);
                if(currents[23]!=Direction.CENTER&&cost%10+cooldowns[23]>9) {
                    if (cost%10>0&&cooldowns[23]<10&&currents[13]==Direction.CENTER) {
                        costs[23] = cooldowns[23]+(cost+9)/10*10;
                        dirs[23] = Direction.NORTHEAST;
                        wait[23] = true;
                        currented[23] = null;
                        setChecked(23);

                        if (dest[23]) return 23;

                        addToQueue(23);
                    }
                    int currentTile = moveWithCurrent(23);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[23];
                        dirs[currentTile] = currents[23];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[23] = cost + cooldowns[23];
                    dirs[23] = Direction.NORTHEAST;
                    currented[23] = null;
                    wait[23] = false;
                    setChecked(23);

                    if (dest[23]) return 23;

                    addToQueue(23);
                }
            }
            if(toCheck22){//debugPoint(22, rc);
                if(currents[22]!=Direction.CENTER&&cost%10+cooldowns[22]>9) {
                    if (cost%10>0&&cooldowns[22]<10&&currents[13]==Direction.CENTER) {
                        costs[22] = cooldowns[22]+(cost+9)/10*10;
                        dirs[22] = Direction.EAST;
                        wait[22] = true;
                        currented[22] = null;
                        setChecked(22);

                        if (dest[22]) return 22;

                        addToQueue(22);
                    }
                    int currentTile = moveWithCurrent(22);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[22];
                        dirs[currentTile] = currents[22];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[22] = cost + cooldowns[22];
                    dirs[22] = Direction.EAST;
                    currented[22] = null;
                    wait[22] = false;
                    setChecked(22);

                    if (dest[22]) return 22;

                    addToQueue(22);
                }
            }
            if(toCheck21){//debugPoint(21, rc);
                if(currents[21]!=Direction.CENTER&&cost%10+cooldowns[21]>9) {
                    if (cost%10>0&&cooldowns[21]<10&&currents[13]==Direction.CENTER) {
                        costs[21] = cooldowns[21]+(cost+9)/10*10;
                        dirs[21] = Direction.SOUTHEAST;
                        wait[21] = true;
                        currented[21] = null;
                        setChecked(21);

                        if (dest[21]) return 21;

                        addToQueue(21);
                    }
                    int currentTile = moveWithCurrent(21);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[21];
                        dirs[currentTile] = currents[21];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[21] = cost + cooldowns[21];
                    dirs[21] = Direction.SOUTHEAST;
                    currented[21] = null;
                    wait[21] = false;
                    setChecked(21);

                    if (dest[21]) return 21;

                    addToQueue(21);
                }
            }
            if(toCheck12){//debugPoint(12, rc);
                if(currents[12]!=Direction.CENTER&&cost%10+cooldowns[12]>9) {
                    if (cost%10>0&&cooldowns[12]<10&&currents[13]==Direction.CENTER) {
                        costs[12] = cooldowns[12]+(cost+9)/10*10;
                        dirs[12] = Direction.SOUTH;
                        wait[12] = true;
                        currented[12] = null;
                        setChecked(12);

                        if (dest[12]) return 12;

                        addToQueue(12);
                    }
                    int currentTile = moveWithCurrent(12);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[12];
                        dirs[currentTile] = currents[12];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[12] = cost + cooldowns[12];
                    dirs[12] = Direction.SOUTH;
                    currented[12] = null;
                    wait[12] = false;
                    setChecked(12);

                    if (dest[12]) return 12;

                    addToQueue(12);
                }
            }
            break;case 14:
        cost=costs[14];if(toCheck6){//debugPoint(6, rc);
                if(currents[6]!=Direction.CENTER&&cost%10+cooldowns[6]>9) {
                    if (cost%10>0&&cooldowns[6]<10&&currents[14]==Direction.CENTER) {
                        costs[6] = cooldowns[6]+(cost+9)/10*10;
                        dirs[6] = Direction.WEST;
                        wait[6] = true;
                        currented[6] = null;
                        setChecked(6);

                        if (dest[6]) return 6;

                        addToQueue(6);
                    }
                    int currentTile = moveWithCurrent(6);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[6];
                        dirs[currentTile] = currents[6];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[6] = cost + cooldowns[6];
                    dirs[6] = Direction.WEST;
                    currented[6] = null;
                    wait[6] = false;
                    setChecked(6);

                    if (dest[6]) return 6;

                    addToQueue(6);
                }
            }
            if(toCheck7){//debugPoint(7, rc);
                if(currents[7]!=Direction.CENTER&&cost%10+cooldowns[7]>9) {
                    if (cost%10>0&&cooldowns[7]<10&&currents[14]==Direction.CENTER) {
                        costs[7] = cooldowns[7]+(cost+9)/10*10;
                        dirs[7] = Direction.NORTHWEST;
                        wait[7] = true;
                        currented[7] = null;
                        setChecked(7);

                        if (dest[7]) return 7;

                        addToQueue(7);
                    }
                    int currentTile = moveWithCurrent(7);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[7];
                        dirs[currentTile] = currents[7];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[7] = cost + cooldowns[7];
                    dirs[7] = Direction.NORTHWEST;
                    currented[7] = null;
                    wait[7] = false;
                    setChecked(7);

                    if (dest[7]) return 7;

                    addToQueue(7);
                }
            }
            if(toCheck15){//debugPoint(15, rc);
                if(currents[15]!=Direction.CENTER&&cost%10+cooldowns[15]>9) {
                    if (cost%10>0&&cooldowns[15]<10&&currents[14]==Direction.CENTER) {
                        costs[15] = cooldowns[15]+(cost+9)/10*10;
                        dirs[15] = Direction.NORTH;
                        wait[15] = true;
                        currented[15] = null;
                        setChecked(15);

                        if (dest[15]) return 15;

                        addToQueue(15);
                    }
                    int currentTile = moveWithCurrent(15);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[15];
                        dirs[currentTile] = currents[15];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[15] = cost + cooldowns[15];
                    dirs[15] = Direction.NORTH;
                    currented[15] = null;
                    wait[15] = false;
                    setChecked(15);

                    if (dest[15]) return 15;

                    addToQueue(15);
                }
            }
            if(toCheck24){//debugPoint(24, rc);
                if(currents[24]!=Direction.CENTER&&cost%10+cooldowns[24]>9) {
                    if (cost%10>0&&cooldowns[24]<10&&currents[14]==Direction.CENTER) {
                        costs[24] = cooldowns[24]+(cost+9)/10*10;
                        dirs[24] = Direction.NORTHEAST;
                        wait[24] = true;
                        currented[24] = null;
                        setChecked(24);

                        if (dest[24]) return 24;

                        addToQueue(24);
                    }
                    int currentTile = moveWithCurrent(24);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[24];
                        dirs[currentTile] = currents[24];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[24] = cost + cooldowns[24];
                    dirs[24] = Direction.NORTHEAST;
                    currented[24] = null;
                    wait[24] = false;
                    setChecked(24);

                    if (dest[24]) return 24;

                    addToQueue(24);
                }
            }
            if(toCheck23){//debugPoint(23, rc);
                if(currents[23]!=Direction.CENTER&&cost%10+cooldowns[23]>9) {
                    if (cost%10>0&&cooldowns[23]<10&&currents[14]==Direction.CENTER) {
                        costs[23] = cooldowns[23]+(cost+9)/10*10;
                        dirs[23] = Direction.EAST;
                        wait[23] = true;
                        currented[23] = null;
                        setChecked(23);

                        if (dest[23]) return 23;

                        addToQueue(23);
                    }
                    int currentTile = moveWithCurrent(23);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[23];
                        dirs[currentTile] = currents[23];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[23] = cost + cooldowns[23];
                    dirs[23] = Direction.EAST;
                    currented[23] = null;
                    wait[23] = false;
                    setChecked(23);

                    if (dest[23]) return 23;

                    addToQueue(23);
                }
            }
            if(toCheck22){//debugPoint(22, rc);
                if(currents[22]!=Direction.CENTER&&cost%10+cooldowns[22]>9) {
                    if (cost%10>0&&cooldowns[22]<10&&currents[14]==Direction.CENTER) {
                        costs[22] = cooldowns[22]+(cost+9)/10*10;
                        dirs[22] = Direction.SOUTHEAST;
                        wait[22] = true;
                        currented[22] = null;
                        setChecked(22);

                        if (dest[22]) return 22;

                        addToQueue(22);
                    }
                    int currentTile = moveWithCurrent(22);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[22];
                        dirs[currentTile] = currents[22];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[22] = cost + cooldowns[22];
                    dirs[22] = Direction.SOUTHEAST;
                    currented[22] = null;
                    wait[22] = false;
                    setChecked(22);

                    if (dest[22]) return 22;

                    addToQueue(22);
                }
            }
            if(toCheck13){//debugPoint(13, rc);
                if(currents[13]!=Direction.CENTER&&cost%10+cooldowns[13]>9) {
                    if (cost%10>0&&cooldowns[13]<10&&currents[14]==Direction.CENTER) {
                        costs[13] = cooldowns[13]+(cost+9)/10*10;
                        dirs[13] = Direction.SOUTH;
                        wait[13] = true;
                        currented[13] = null;
                        setChecked(13);

                        if (dest[13]) return 13;

                        addToQueue(13);
                    }
                    int currentTile = moveWithCurrent(13);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[13];
                        dirs[currentTile] = currents[13];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[13] = cost + cooldowns[13];
                    dirs[13] = Direction.SOUTH;
                    currented[13] = null;
                    wait[13] = false;
                    setChecked(13);

                    if (dest[13]) return 13;

                    addToQueue(13);
                }
            }
            if(toCheck5){//debugPoint(5, rc);
                if(currents[5]!=Direction.CENTER&&cost%10+cooldowns[5]>9) {
                    if (cost%10>0&&cooldowns[5]<10&&currents[14]==Direction.CENTER) {
                        costs[5] = cooldowns[5]+(cost+9)/10*10;
                        dirs[5] = Direction.SOUTHWEST;
                        wait[5] = true;
                        currented[5] = null;
                        setChecked(5);

                        if (dest[5]) return 5;

                        addToQueue(5);
                    }
                    int currentTile = moveWithCurrent(5);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[5];
                        dirs[currentTile] = currents[5];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[5] = cost + cooldowns[5];
                    dirs[5] = Direction.SOUTHWEST;
                    currented[5] = null;
                    wait[5] = false;
                    setChecked(5);

                    if (dest[5]) return 5;

                    addToQueue(5);
                }
            }
            break;case 15:
        cost=costs[15];if(toCheck7){//debugPoint(7, rc);
                if(currents[7]!=Direction.CENTER&&cost%10+cooldowns[7]>9) {
                    if (cost%10>0&&cooldowns[7]<10&&currents[15]==Direction.CENTER) {
                        costs[7] = cooldowns[7]+(cost+9)/10*10;
                        dirs[7] = Direction.WEST;
                        wait[7] = true;
                        currented[7] = null;
                        setChecked(7);

                        if (dest[7]) return 7;

                        addToQueue(7);
                    }
                    int currentTile = moveWithCurrent(7);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[7];
                        dirs[currentTile] = currents[7];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[7] = cost + cooldowns[7];
                    dirs[7] = Direction.WEST;
                    currented[7] = null;
                    wait[7] = false;
                    setChecked(7);

                    if (dest[7]) return 7;

                    addToQueue(7);
                }
            }
            if(toCheck8){//debugPoint(8, rc);
                if(currents[8]!=Direction.CENTER&&cost%10+cooldowns[8]>9) {
                    if (cost%10>0&&cooldowns[8]<10&&currents[15]==Direction.CENTER) {
                        costs[8] = cooldowns[8]+(cost+9)/10*10;
                        dirs[8] = Direction.NORTHWEST;
                        wait[8] = true;
                        currented[8] = null;
                        setChecked(8);

                        if (dest[8]) return 8;

                        addToQueue(8);
                    }
                    int currentTile = moveWithCurrent(8);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[8];
                        dirs[currentTile] = currents[8];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[8] = cost + cooldowns[8];
                    dirs[8] = Direction.NORTHWEST;
                    currented[8] = null;
                    wait[8] = false;
                    setChecked(8);

                    if (dest[8]) return 8;

                    addToQueue(8);
                }
            }
            if(toCheck16){//debugPoint(16, rc);
                if(currents[16]!=Direction.CENTER&&cost%10+cooldowns[16]>9) {
                    if (cost%10>0&&cooldowns[16]<10&&currents[15]==Direction.CENTER) {
                        costs[16] = cooldowns[16]+(cost+9)/10*10;
                        dirs[16] = Direction.NORTH;
                        wait[16] = true;
                        currented[16] = null;
                        setChecked(16);

                        if (dest[16]) return 16;

                        addToQueue(16);
                    }
                    int currentTile = moveWithCurrent(16);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[16];
                        dirs[currentTile] = currents[16];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[16] = cost + cooldowns[16];
                    dirs[16] = Direction.NORTH;
                    currented[16] = null;
                    wait[16] = false;
                    setChecked(16);

                    if (dest[16]) return 16;

                    addToQueue(16);
                }
            }
            if(toCheck25){//debugPoint(25, rc);
                if(currents[25]!=Direction.CENTER&&cost%10+cooldowns[25]>9) {
                    if (cost%10>0&&cooldowns[25]<10&&currents[15]==Direction.CENTER) {
                        costs[25] = cooldowns[25]+(cost+9)/10*10;
                        dirs[25] = Direction.NORTHEAST;
                        wait[25] = true;
                        currented[25] = null;
                        setChecked(25);

                        if (dest[25]) return 25;

                        addToQueue(25);
                    }
                    int currentTile = moveWithCurrent(25);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[25];
                        dirs[currentTile] = currents[25];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[25] = cost + cooldowns[25];
                    dirs[25] = Direction.NORTHEAST;
                    currented[25] = null;
                    wait[25] = false;
                    setChecked(25);

                    if (dest[25]) return 25;

                    addToQueue(25);
                }
            }
            if(toCheck24){//debugPoint(24, rc);
                if(currents[24]!=Direction.CENTER&&cost%10+cooldowns[24]>9) {
                    if (cost%10>0&&cooldowns[24]<10&&currents[15]==Direction.CENTER) {
                        costs[24] = cooldowns[24]+(cost+9)/10*10;
                        dirs[24] = Direction.EAST;
                        wait[24] = true;
                        currented[24] = null;
                        setChecked(24);

                        if (dest[24]) return 24;

                        addToQueue(24);
                    }
                    int currentTile = moveWithCurrent(24);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[24];
                        dirs[currentTile] = currents[24];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[24] = cost + cooldowns[24];
                    dirs[24] = Direction.EAST;
                    currented[24] = null;
                    wait[24] = false;
                    setChecked(24);

                    if (dest[24]) return 24;

                    addToQueue(24);
                }
            }
            if(toCheck23){//debugPoint(23, rc);
                if(currents[23]!=Direction.CENTER&&cost%10+cooldowns[23]>9) {
                    if (cost%10>0&&cooldowns[23]<10&&currents[15]==Direction.CENTER) {
                        costs[23] = cooldowns[23]+(cost+9)/10*10;
                        dirs[23] = Direction.SOUTHEAST;
                        wait[23] = true;
                        currented[23] = null;
                        setChecked(23);

                        if (dest[23]) return 23;

                        addToQueue(23);
                    }
                    int currentTile = moveWithCurrent(23);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[23];
                        dirs[currentTile] = currents[23];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[23] = cost + cooldowns[23];
                    dirs[23] = Direction.SOUTHEAST;
                    currented[23] = null;
                    wait[23] = false;
                    setChecked(23);

                    if (dest[23]) return 23;

                    addToQueue(23);
                }
            }
            if(toCheck14){//debugPoint(14, rc);
                if(currents[14]!=Direction.CENTER&&cost%10+cooldowns[14]>9) {
                    if (cost%10>0&&cooldowns[14]<10&&currents[15]==Direction.CENTER) {
                        costs[14] = cooldowns[14]+(cost+9)/10*10;
                        dirs[14] = Direction.SOUTH;
                        wait[14] = true;
                        currented[14] = null;
                        setChecked(14);

                        if (dest[14]) return 14;

                        addToQueue(14);
                    }
                    int currentTile = moveWithCurrent(14);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[14];
                        dirs[currentTile] = currents[14];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[14] = cost + cooldowns[14];
                    dirs[14] = Direction.SOUTH;
                    currented[14] = null;
                    wait[14] = false;
                    setChecked(14);

                    if (dest[14]) return 14;

                    addToQueue(14);
                }
            }
            if(toCheck6){//debugPoint(6, rc);
                if(currents[6]!=Direction.CENTER&&cost%10+cooldowns[6]>9) {
                    if (cost%10>0&&cooldowns[6]<10&&currents[15]==Direction.CENTER) {
                        costs[6] = cooldowns[6]+(cost+9)/10*10;
                        dirs[6] = Direction.SOUTHWEST;
                        wait[6] = true;
                        currented[6] = null;
                        setChecked(6);

                        if (dest[6]) return 6;

                        addToQueue(6);
                    }
                    int currentTile = moveWithCurrent(6);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[6];
                        dirs[currentTile] = currents[6];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[6] = cost + cooldowns[6];
                    dirs[6] = Direction.SOUTHWEST;
                    currented[6] = null;
                    wait[6] = false;
                    setChecked(6);

                    if (dest[6]) return 6;

                    addToQueue(6);
                }
            }
            break;case 16:
        cost=costs[16];if(toCheck8){//debugPoint(8, rc);
                if(currents[8]!=Direction.CENTER&&cost%10+cooldowns[8]>9) {
                    if (cost%10>0&&cooldowns[8]<10&&currents[16]==Direction.CENTER) {
                        costs[8] = cooldowns[8]+(cost+9)/10*10;
                        dirs[8] = Direction.WEST;
                        wait[8] = true;
                        currented[8] = null;
                        setChecked(8);

                        if (dest[8]) return 8;

                        addToQueue(8);
                    }
                    int currentTile = moveWithCurrent(8);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[8];
                        dirs[currentTile] = currents[8];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[8] = cost + cooldowns[8];
                    dirs[8] = Direction.WEST;
                    currented[8] = null;
                    wait[8] = false;
                    setChecked(8);

                    if (dest[8]) return 8;

                    addToQueue(8);
                }
            }
            if(toCheck9){//debugPoint(9, rc);
                if(currents[9]!=Direction.CENTER&&cost%10+cooldowns[9]>9) {
                    if (cost%10>0&&cooldowns[9]<10&&currents[16]==Direction.CENTER) {
                        costs[9] = cooldowns[9]+(cost+9)/10*10;
                        dirs[9] = Direction.NORTHWEST;
                        wait[9] = true;
                        currented[9] = null;
                        setChecked(9);

                        if (dest[9]) return 9;

                        addToQueue(9);
                    }
                    int currentTile = moveWithCurrent(9);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[9];
                        dirs[currentTile] = currents[9];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[9] = cost + cooldowns[9];
                    dirs[9] = Direction.NORTHWEST;
                    currented[9] = null;
                    wait[9] = false;
                    setChecked(9);

                    if (dest[9]) return 9;

                    addToQueue(9);
                }
            }
            if(toCheck17){//debugPoint(17, rc);
                if(currents[17]!=Direction.CENTER&&cost%10+cooldowns[17]>9) {
                    if (cost%10>0&&cooldowns[17]<10&&currents[16]==Direction.CENTER) {
                        costs[17] = cooldowns[17]+(cost+9)/10*10;
                        dirs[17] = Direction.NORTH;
                        wait[17] = true;
                        currented[17] = null;
                        setChecked(17);

                        if (dest[17]) return 17;

                        addToQueue(17);
                    }
                    int currentTile = moveWithCurrent(17);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[17];
                        dirs[currentTile] = currents[17];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[17] = cost + cooldowns[17];
                    dirs[17] = Direction.NORTH;
                    currented[17] = null;
                    wait[17] = false;
                    setChecked(17);

                    if (dest[17]) return 17;

                    addToQueue(17);
                }
            }
            if(toCheck26){//debugPoint(26, rc);
                if(currents[26]!=Direction.CENTER&&cost%10+cooldowns[26]>9) {
                    if (cost%10>0&&cooldowns[26]<10&&currents[16]==Direction.CENTER) {
                        costs[26] = cooldowns[26]+(cost+9)/10*10;
                        dirs[26] = Direction.NORTHEAST;
                        wait[26] = true;
                        currented[26] = null;
                        setChecked(26);

                        if (dest[26]) return 26;

                        addToQueue(26);
                    }
                    int currentTile = moveWithCurrent(26);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[26];
                        dirs[currentTile] = currents[26];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[26] = cost + cooldowns[26];
                    dirs[26] = Direction.NORTHEAST;
                    currented[26] = null;
                    wait[26] = false;
                    setChecked(26);

                    if (dest[26]) return 26;

                    addToQueue(26);
                }
            }
            if(toCheck25){//debugPoint(25, rc);
                if(currents[25]!=Direction.CENTER&&cost%10+cooldowns[25]>9) {
                    if (cost%10>0&&cooldowns[25]<10&&currents[16]==Direction.CENTER) {
                        costs[25] = cooldowns[25]+(cost+9)/10*10;
                        dirs[25] = Direction.EAST;
                        wait[25] = true;
                        currented[25] = null;
                        setChecked(25);

                        if (dest[25]) return 25;

                        addToQueue(25);
                    }
                    int currentTile = moveWithCurrent(25);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[25];
                        dirs[currentTile] = currents[25];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[25] = cost + cooldowns[25];
                    dirs[25] = Direction.EAST;
                    currented[25] = null;
                    wait[25] = false;
                    setChecked(25);

                    if (dest[25]) return 25;

                    addToQueue(25);
                }
            }
            if(toCheck24){//debugPoint(24, rc);
                if(currents[24]!=Direction.CENTER&&cost%10+cooldowns[24]>9) {
                    if (cost%10>0&&cooldowns[24]<10&&currents[16]==Direction.CENTER) {
                        costs[24] = cooldowns[24]+(cost+9)/10*10;
                        dirs[24] = Direction.SOUTHEAST;
                        wait[24] = true;
                        currented[24] = null;
                        setChecked(24);

                        if (dest[24]) return 24;

                        addToQueue(24);
                    }
                    int currentTile = moveWithCurrent(24);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[24];
                        dirs[currentTile] = currents[24];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[24] = cost + cooldowns[24];
                    dirs[24] = Direction.SOUTHEAST;
                    currented[24] = null;
                    wait[24] = false;
                    setChecked(24);

                    if (dest[24]) return 24;

                    addToQueue(24);
                }
            }
            if(toCheck15){//debugPoint(15, rc);
                if(currents[15]!=Direction.CENTER&&cost%10+cooldowns[15]>9) {
                    if (cost%10>0&&cooldowns[15]<10&&currents[16]==Direction.CENTER) {
                        costs[15] = cooldowns[15]+(cost+9)/10*10;
                        dirs[15] = Direction.SOUTH;
                        wait[15] = true;
                        currented[15] = null;
                        setChecked(15);

                        if (dest[15]) return 15;

                        addToQueue(15);
                    }
                    int currentTile = moveWithCurrent(15);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[15];
                        dirs[currentTile] = currents[15];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[15] = cost + cooldowns[15];
                    dirs[15] = Direction.SOUTH;
                    currented[15] = null;
                    wait[15] = false;
                    setChecked(15);

                    if (dest[15]) return 15;

                    addToQueue(15);
                }
            }
            if(toCheck7){//debugPoint(7, rc);
                if(currents[7]!=Direction.CENTER&&cost%10+cooldowns[7]>9) {
                    if (cost%10>0&&cooldowns[7]<10&&currents[16]==Direction.CENTER) {
                        costs[7] = cooldowns[7]+(cost+9)/10*10;
                        dirs[7] = Direction.SOUTHWEST;
                        wait[7] = true;
                        currented[7] = null;
                        setChecked(7);

                        if (dest[7]) return 7;

                        addToQueue(7);
                    }
                    int currentTile = moveWithCurrent(7);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[7];
                        dirs[currentTile] = currents[7];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[7] = cost + cooldowns[7];
                    dirs[7] = Direction.SOUTHWEST;
                    currented[7] = null;
                    wait[7] = false;
                    setChecked(7);

                    if (dest[7]) return 7;

                    addToQueue(7);
                }
            }
            break;case 17:
        cost=costs[17];if(toCheck9){//debugPoint(9, rc);
                if(currents[9]!=Direction.CENTER&&cost%10+cooldowns[9]>9) {
                    if (cost%10>0&&cooldowns[9]<10&&currents[17]==Direction.CENTER) {
                        costs[9] = cooldowns[9]+(cost+9)/10*10;
                        dirs[9] = Direction.WEST;
                        wait[9] = true;
                        currented[9] = null;
                        setChecked(9);

                        if (dest[9]) return 9;

                        addToQueue(9);
                    }
                    int currentTile = moveWithCurrent(9);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[9];
                        dirs[currentTile] = currents[9];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[9] = cost + cooldowns[9];
                    dirs[9] = Direction.WEST;
                    currented[9] = null;
                    wait[9] = false;
                    setChecked(9);

                    if (dest[9]) return 9;

                    addToQueue(9);
                }
            }
            if(toCheck10){//debugPoint(10, rc);
                if(currents[10]!=Direction.CENTER&&cost%10+cooldowns[10]>9) {
                    if (cost%10>0&&cooldowns[10]<10&&currents[17]==Direction.CENTER) {
                        costs[10] = cooldowns[10]+(cost+9)/10*10;
                        dirs[10] = Direction.NORTHWEST;
                        wait[10] = true;
                        currented[10] = null;
                        setChecked(10);

                        if (dest[10]) return 10;

                        addToQueue(10);
                    }
                    int currentTile = moveWithCurrent(10);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[10];
                        dirs[currentTile] = currents[10];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[10] = cost + cooldowns[10];
                    dirs[10] = Direction.NORTHWEST;
                    currented[10] = null;
                    wait[10] = false;
                    setChecked(10);

                    if (dest[10]) return 10;

                    addToQueue(10);
                }
            }
            if(toCheck18){//debugPoint(18, rc);
                if(currents[18]!=Direction.CENTER&&cost%10+cooldowns[18]>9) {
                    if (cost%10>0&&cooldowns[18]<10&&currents[17]==Direction.CENTER) {
                        costs[18] = cooldowns[18]+(cost+9)/10*10;
                        dirs[18] = Direction.NORTH;
                        wait[18] = true;
                        currented[18] = null;
                        setChecked(18);

                        if (dest[18]) return 18;

                        addToQueue(18);
                    }
                    int currentTile = moveWithCurrent(18);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[18];
                        dirs[currentTile] = currents[18];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[18] = cost + cooldowns[18];
                    dirs[18] = Direction.NORTH;
                    currented[18] = null;
                    wait[18] = false;
                    setChecked(18);

                    if (dest[18]) return 18;

                    addToQueue(18);
                }
            }
            if(toCheck27){//debugPoint(27, rc);
                if(currents[27]!=Direction.CENTER&&cost%10+cooldowns[27]>9) {
                    if (cost%10>0&&cooldowns[27]<10&&currents[17]==Direction.CENTER) {
                        costs[27] = cooldowns[27]+(cost+9)/10*10;
                        dirs[27] = Direction.NORTHEAST;
                        wait[27] = true;
                        currented[27] = null;
                        setChecked(27);

                        if (dest[27]) return 27;

                        addToQueue(27);
                    }
                    int currentTile = moveWithCurrent(27);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[27];
                        dirs[currentTile] = currents[27];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[27] = cost + cooldowns[27];
                    dirs[27] = Direction.NORTHEAST;
                    currented[27] = null;
                    wait[27] = false;
                    setChecked(27);

                    if (dest[27]) return 27;

                    addToQueue(27);
                }
            }
            if(toCheck26){//debugPoint(26, rc);
                if(currents[26]!=Direction.CENTER&&cost%10+cooldowns[26]>9) {
                    if (cost%10>0&&cooldowns[26]<10&&currents[17]==Direction.CENTER) {
                        costs[26] = cooldowns[26]+(cost+9)/10*10;
                        dirs[26] = Direction.EAST;
                        wait[26] = true;
                        currented[26] = null;
                        setChecked(26);

                        if (dest[26]) return 26;

                        addToQueue(26);
                    }
                    int currentTile = moveWithCurrent(26);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[26];
                        dirs[currentTile] = currents[26];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[26] = cost + cooldowns[26];
                    dirs[26] = Direction.EAST;
                    currented[26] = null;
                    wait[26] = false;
                    setChecked(26);

                    if (dest[26]) return 26;

                    addToQueue(26);
                }
            }
            if(toCheck25){//debugPoint(25, rc);
                if(currents[25]!=Direction.CENTER&&cost%10+cooldowns[25]>9) {
                    if (cost%10>0&&cooldowns[25]<10&&currents[17]==Direction.CENTER) {
                        costs[25] = cooldowns[25]+(cost+9)/10*10;
                        dirs[25] = Direction.SOUTHEAST;
                        wait[25] = true;
                        currented[25] = null;
                        setChecked(25);

                        if (dest[25]) return 25;

                        addToQueue(25);
                    }
                    int currentTile = moveWithCurrent(25);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[25];
                        dirs[currentTile] = currents[25];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[25] = cost + cooldowns[25];
                    dirs[25] = Direction.SOUTHEAST;
                    currented[25] = null;
                    wait[25] = false;
                    setChecked(25);

                    if (dest[25]) return 25;

                    addToQueue(25);
                }
            }
            if(toCheck16){//debugPoint(16, rc);
                if(currents[16]!=Direction.CENTER&&cost%10+cooldowns[16]>9) {
                    if (cost%10>0&&cooldowns[16]<10&&currents[17]==Direction.CENTER) {
                        costs[16] = cooldowns[16]+(cost+9)/10*10;
                        dirs[16] = Direction.SOUTH;
                        wait[16] = true;
                        currented[16] = null;
                        setChecked(16);

                        if (dest[16]) return 16;

                        addToQueue(16);
                    }
                    int currentTile = moveWithCurrent(16);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[16];
                        dirs[currentTile] = currents[16];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[16] = cost + cooldowns[16];
                    dirs[16] = Direction.SOUTH;
                    currented[16] = null;
                    wait[16] = false;
                    setChecked(16);

                    if (dest[16]) return 16;

                    addToQueue(16);
                }
            }
            if(toCheck8){//debugPoint(8, rc);
                if(currents[8]!=Direction.CENTER&&cost%10+cooldowns[8]>9) {
                    if (cost%10>0&&cooldowns[8]<10&&currents[17]==Direction.CENTER) {
                        costs[8] = cooldowns[8]+(cost+9)/10*10;
                        dirs[8] = Direction.SOUTHWEST;
                        wait[8] = true;
                        currented[8] = null;
                        setChecked(8);

                        if (dest[8]) return 8;

                        addToQueue(8);
                    }
                    int currentTile = moveWithCurrent(8);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[8];
                        dirs[currentTile] = currents[8];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[8] = cost + cooldowns[8];
                    dirs[8] = Direction.SOUTHWEST;
                    currented[8] = null;
                    wait[8] = false;
                    setChecked(8);

                    if (dest[8]) return 8;

                    addToQueue(8);
                }
            }
            break;case 18:
        cost=costs[18];if(toCheck10){//debugPoint(10, rc);
                if(currents[10]!=Direction.CENTER&&cost%10+cooldowns[10]>9) {
                    if (cost%10>0&&cooldowns[10]<10&&currents[18]==Direction.CENTER) {
                        costs[10] = cooldowns[10]+(cost+9)/10*10;
                        dirs[10] = Direction.WEST;
                        wait[10] = true;
                        currented[10] = null;
                        setChecked(10);

                        if (dest[10]) return 10;

                        addToQueue(10);
                    }
                    int currentTile = moveWithCurrent(10);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[10];
                        dirs[currentTile] = currents[10];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[10] = cost + cooldowns[10];
                    dirs[10] = Direction.WEST;
                    currented[10] = null;
                    wait[10] = false;
                    setChecked(10);

                    if (dest[10]) return 10;

                    addToQueue(10);
                }
            }
            if(toCheck11){//debugPoint(11, rc);
                if(currents[11]!=Direction.CENTER&&cost%10+cooldowns[11]>9) {
                    if (cost%10>0&&cooldowns[11]<10&&currents[18]==Direction.CENTER) {
                        costs[11] = cooldowns[11]+(cost+9)/10*10;
                        dirs[11] = Direction.NORTHWEST;
                        wait[11] = true;
                        currented[11] = null;
                        setChecked(11);

                        if (dest[11]) return 11;

                        addToQueue(11);
                    }
                    int currentTile = moveWithCurrent(11);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[11];
                        dirs[currentTile] = currents[11];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[11] = cost + cooldowns[11];
                    dirs[11] = Direction.NORTHWEST;
                    currented[11] = null;
                    wait[11] = false;
                    setChecked(11);

                    if (dest[11]) return 11;

                    addToQueue(11);
                }
            }
            if(toCheck19){//debugPoint(19, rc);
                if(currents[19]!=Direction.CENTER&&cost%10+cooldowns[19]>9) {
                    if (cost%10>0&&cooldowns[19]<10&&currents[18]==Direction.CENTER) {
                        costs[19] = cooldowns[19]+(cost+9)/10*10;
                        dirs[19] = Direction.NORTH;
                        wait[19] = true;
                        currented[19] = null;
                        setChecked(19);

                        if (dest[19]) return 19;

                        addToQueue(19);
                    }
                    int currentTile = moveWithCurrent(19);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[19];
                        dirs[currentTile] = currents[19];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[19] = cost + cooldowns[19];
                    dirs[19] = Direction.NORTH;
                    currented[19] = null;
                    wait[19] = false;
                    setChecked(19);

                    if (dest[19]) return 19;

                    addToQueue(19);
                }
            }
            if(toCheck28){//debugPoint(28, rc);
                if(currents[28]!=Direction.CENTER&&cost%10+cooldowns[28]>9) {
                    if (cost%10>0&&cooldowns[28]<10&&currents[18]==Direction.CENTER) {
                        costs[28] = cooldowns[28]+(cost+9)/10*10;
                        dirs[28] = Direction.NORTHEAST;
                        wait[28] = true;
                        currented[28] = null;
                        setChecked(28);

                        if (dest[28]) return 28;

                        addToQueue(28);
                    }
                    int currentTile = moveWithCurrent(28);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[28];
                        dirs[currentTile] = currents[28];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[28] = cost + cooldowns[28];
                    dirs[28] = Direction.NORTHEAST;
                    currented[28] = null;
                    wait[28] = false;
                    setChecked(28);

                    if (dest[28]) return 28;

                    addToQueue(28);
                }
            }
            if(toCheck27){//debugPoint(27, rc);
                if(currents[27]!=Direction.CENTER&&cost%10+cooldowns[27]>9) {
                    if (cost%10>0&&cooldowns[27]<10&&currents[18]==Direction.CENTER) {
                        costs[27] = cooldowns[27]+(cost+9)/10*10;
                        dirs[27] = Direction.EAST;
                        wait[27] = true;
                        currented[27] = null;
                        setChecked(27);

                        if (dest[27]) return 27;

                        addToQueue(27);
                    }
                    int currentTile = moveWithCurrent(27);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[27];
                        dirs[currentTile] = currents[27];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[27] = cost + cooldowns[27];
                    dirs[27] = Direction.EAST;
                    currented[27] = null;
                    wait[27] = false;
                    setChecked(27);

                    if (dest[27]) return 27;

                    addToQueue(27);
                }
            }
            if(toCheck26){//debugPoint(26, rc);
                if(currents[26]!=Direction.CENTER&&cost%10+cooldowns[26]>9) {
                    if (cost%10>0&&cooldowns[26]<10&&currents[18]==Direction.CENTER) {
                        costs[26] = cooldowns[26]+(cost+9)/10*10;
                        dirs[26] = Direction.SOUTHEAST;
                        wait[26] = true;
                        currented[26] = null;
                        setChecked(26);

                        if (dest[26]) return 26;

                        addToQueue(26);
                    }
                    int currentTile = moveWithCurrent(26);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[26];
                        dirs[currentTile] = currents[26];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[26] = cost + cooldowns[26];
                    dirs[26] = Direction.SOUTHEAST;
                    currented[26] = null;
                    wait[26] = false;
                    setChecked(26);

                    if (dest[26]) return 26;

                    addToQueue(26);
                }
            }
            if(toCheck17){//debugPoint(17, rc);
                if(currents[17]!=Direction.CENTER&&cost%10+cooldowns[17]>9) {
                    if (cost%10>0&&cooldowns[17]<10&&currents[18]==Direction.CENTER) {
                        costs[17] = cooldowns[17]+(cost+9)/10*10;
                        dirs[17] = Direction.SOUTH;
                        wait[17] = true;
                        currented[17] = null;
                        setChecked(17);

                        if (dest[17]) return 17;

                        addToQueue(17);
                    }
                    int currentTile = moveWithCurrent(17);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[17];
                        dirs[currentTile] = currents[17];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[17] = cost + cooldowns[17];
                    dirs[17] = Direction.SOUTH;
                    currented[17] = null;
                    wait[17] = false;
                    setChecked(17);

                    if (dest[17]) return 17;

                    addToQueue(17);
                }
            }
            if(toCheck9){//debugPoint(9, rc);
                if(currents[9]!=Direction.CENTER&&cost%10+cooldowns[9]>9) {
                    if (cost%10>0&&cooldowns[9]<10&&currents[18]==Direction.CENTER) {
                        costs[9] = cooldowns[9]+(cost+9)/10*10;
                        dirs[9] = Direction.SOUTHWEST;
                        wait[9] = true;
                        currented[9] = null;
                        setChecked(9);

                        if (dest[9]) return 9;

                        addToQueue(9);
                    }
                    int currentTile = moveWithCurrent(9);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[9];
                        dirs[currentTile] = currents[9];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[9] = cost + cooldowns[9];
                    dirs[9] = Direction.SOUTHWEST;
                    currented[9] = null;
                    wait[9] = false;
                    setChecked(9);

                    if (dest[9]) return 9;

                    addToQueue(9);
                }
            }
            break;case 19:
        cost=costs[19];if(toCheck11){//debugPoint(11, rc);
                if(currents[11]!=Direction.CENTER&&cost%10+cooldowns[11]>9) {
                    if (cost%10>0&&cooldowns[11]<10&&currents[19]==Direction.CENTER) {
                        costs[11] = cooldowns[11]+(cost+9)/10*10;
                        dirs[11] = Direction.WEST;
                        wait[11] = true;
                        currented[11] = null;
                        setChecked(11);

                        if (dest[11]) return 11;

                        addToQueue(11);
                    }
                    int currentTile = moveWithCurrent(11);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[11];
                        dirs[currentTile] = currents[11];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[11] = cost + cooldowns[11];
                    dirs[11] = Direction.WEST;
                    currented[11] = null;
                    wait[11] = false;
                    setChecked(11);

                    if (dest[11]) return 11;

                    addToQueue(11);
                }
            }
            if(toCheck20){//debugPoint(20, rc);
                if(currents[20]!=Direction.CENTER&&cost%10+cooldowns[20]>9) {
                    if (cost%10>0&&cooldowns[20]<10&&currents[19]==Direction.CENTER) {
                        costs[20] = cooldowns[20]+(cost+9)/10*10;
                        dirs[20] = Direction.NORTH;
                        wait[20] = true;
                        currented[20] = null;
                        setChecked(20);

                        if (dest[20]) return 20;

                        addToQueue(20);
                    }
                    int currentTile = moveWithCurrent(20);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[20];
                        dirs[currentTile] = currents[20];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[20] = cost + cooldowns[20];
                    dirs[20] = Direction.NORTH;
                    currented[20] = null;
                    wait[20] = false;
                    setChecked(20);

                    if (dest[20]) return 20;

                    addToQueue(20);
                }
            }
            if(toCheck29){//debugPoint(29, rc);
                if(currents[29]!=Direction.CENTER&&cost%10+cooldowns[29]>9) {
                    if (cost%10>0&&cooldowns[29]<10&&currents[19]==Direction.CENTER) {
                        costs[29] = cooldowns[29]+(cost+9)/10*10;
                        dirs[29] = Direction.NORTHEAST;
                        wait[29] = true;
                        currented[29] = null;
                        setChecked(29);

                        if (dest[29]) return 29;

                        addToQueue(29);
                    }
                    int currentTile = moveWithCurrent(29);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[29];
                        dirs[currentTile] = currents[29];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[29] = cost + cooldowns[29];
                    dirs[29] = Direction.NORTHEAST;
                    currented[29] = null;
                    wait[29] = false;
                    setChecked(29);

                    if (dest[29]) return 29;

                    addToQueue(29);
                }
            }
            if(toCheck28){//debugPoint(28, rc);
                if(currents[28]!=Direction.CENTER&&cost%10+cooldowns[28]>9) {
                    if (cost%10>0&&cooldowns[28]<10&&currents[19]==Direction.CENTER) {
                        costs[28] = cooldowns[28]+(cost+9)/10*10;
                        dirs[28] = Direction.EAST;
                        wait[28] = true;
                        currented[28] = null;
                        setChecked(28);

                        if (dest[28]) return 28;

                        addToQueue(28);
                    }
                    int currentTile = moveWithCurrent(28);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[28];
                        dirs[currentTile] = currents[28];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[28] = cost + cooldowns[28];
                    dirs[28] = Direction.EAST;
                    currented[28] = null;
                    wait[28] = false;
                    setChecked(28);

                    if (dest[28]) return 28;

                    addToQueue(28);
                }
            }
            if(toCheck27){//debugPoint(27, rc);
                if(currents[27]!=Direction.CENTER&&cost%10+cooldowns[27]>9) {
                    if (cost%10>0&&cooldowns[27]<10&&currents[19]==Direction.CENTER) {
                        costs[27] = cooldowns[27]+(cost+9)/10*10;
                        dirs[27] = Direction.SOUTHEAST;
                        wait[27] = true;
                        currented[27] = null;
                        setChecked(27);

                        if (dest[27]) return 27;

                        addToQueue(27);
                    }
                    int currentTile = moveWithCurrent(27);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[27];
                        dirs[currentTile] = currents[27];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[27] = cost + cooldowns[27];
                    dirs[27] = Direction.SOUTHEAST;
                    currented[27] = null;
                    wait[27] = false;
                    setChecked(27);

                    if (dest[27]) return 27;

                    addToQueue(27);
                }
            }
            if(toCheck18){//debugPoint(18, rc);
                if(currents[18]!=Direction.CENTER&&cost%10+cooldowns[18]>9) {
                    if (cost%10>0&&cooldowns[18]<10&&currents[19]==Direction.CENTER) {
                        costs[18] = cooldowns[18]+(cost+9)/10*10;
                        dirs[18] = Direction.SOUTH;
                        wait[18] = true;
                        currented[18] = null;
                        setChecked(18);

                        if (dest[18]) return 18;

                        addToQueue(18);
                    }
                    int currentTile = moveWithCurrent(18);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[18];
                        dirs[currentTile] = currents[18];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[18] = cost + cooldowns[18];
                    dirs[18] = Direction.SOUTH;
                    currented[18] = null;
                    wait[18] = false;
                    setChecked(18);

                    if (dest[18]) return 18;

                    addToQueue(18);
                }
            }
            if(toCheck10){//debugPoint(10, rc);
                if(currents[10]!=Direction.CENTER&&cost%10+cooldowns[10]>9) {
                    if (cost%10>0&&cooldowns[10]<10&&currents[19]==Direction.CENTER) {
                        costs[10] = cooldowns[10]+(cost+9)/10*10;
                        dirs[10] = Direction.SOUTHWEST;
                        wait[10] = true;
                        currented[10] = null;
                        setChecked(10);

                        if (dest[10]) return 10;

                        addToQueue(10);
                    }
                    int currentTile = moveWithCurrent(10);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[10];
                        dirs[currentTile] = currents[10];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[10] = cost + cooldowns[10];
                    dirs[10] = Direction.SOUTHWEST;
                    currented[10] = null;
                    wait[10] = false;
                    setChecked(10);

                    if (dest[10]) return 10;

                    addToQueue(10);
                }
            }
            break;case 20:
        cost=costs[20];if(toCheck29){//debugPoint(29, rc);
                if(currents[29]!=Direction.CENTER&&cost%10+cooldowns[29]>9) {
                    if (cost%10>0&&cooldowns[29]<10&&currents[20]==Direction.CENTER) {
                        costs[29] = cooldowns[29]+(cost+9)/10*10;
                        dirs[29] = Direction.EAST;
                        wait[29] = true;
                        currented[29] = null;
                        setChecked(29);

                        if (dest[29]) return 29;

                        addToQueue(29);
                    }
                    int currentTile = moveWithCurrent(29);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[29];
                        dirs[currentTile] = currents[29];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[29] = cost + cooldowns[29];
                    dirs[29] = Direction.EAST;
                    currented[29] = null;
                    wait[29] = false;
                    setChecked(29);

                    if (dest[29]) return 29;

                    addToQueue(29);
                }
            }
            if(toCheck28){//debugPoint(28, rc);
                if(currents[28]!=Direction.CENTER&&cost%10+cooldowns[28]>9) {
                    if (cost%10>0&&cooldowns[28]<10&&currents[20]==Direction.CENTER) {
                        costs[28] = cooldowns[28]+(cost+9)/10*10;
                        dirs[28] = Direction.SOUTHEAST;
                        wait[28] = true;
                        currented[28] = null;
                        setChecked(28);

                        if (dest[28]) return 28;

                        addToQueue(28);
                    }
                    int currentTile = moveWithCurrent(28);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[28];
                        dirs[currentTile] = currents[28];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[28] = cost + cooldowns[28];
                    dirs[28] = Direction.SOUTHEAST;
                    currented[28] = null;
                    wait[28] = false;
                    setChecked(28);

                    if (dest[28]) return 28;

                    addToQueue(28);
                }
            }
            if(toCheck19){//debugPoint(19, rc);
                if(currents[19]!=Direction.CENTER&&cost%10+cooldowns[19]>9) {
                    if (cost%10>0&&cooldowns[19]<10&&currents[20]==Direction.CENTER) {
                        costs[19] = cooldowns[19]+(cost+9)/10*10;
                        dirs[19] = Direction.SOUTH;
                        wait[19] = true;
                        currented[19] = null;
                        setChecked(19);

                        if (dest[19]) return 19;

                        addToQueue(19);
                    }
                    int currentTile = moveWithCurrent(19);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[19];
                        dirs[currentTile] = currents[19];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[19] = cost + cooldowns[19];
                    dirs[19] = Direction.SOUTH;
                    currented[19] = null;
                    wait[19] = false;
                    setChecked(19);

                    if (dest[19]) return 19;

                    addToQueue(19);
                }
            }
            if(toCheck11){//debugPoint(11, rc);
                if(currents[11]!=Direction.CENTER&&cost%10+cooldowns[11]>9) {
                    if (cost%10>0&&cooldowns[11]<10&&currents[20]==Direction.CENTER) {
                        costs[11] = cooldowns[11]+(cost+9)/10*10;
                        dirs[11] = Direction.SOUTHWEST;
                        wait[11] = true;
                        currented[11] = null;
                        setChecked(11);

                        if (dest[11]) return 11;

                        addToQueue(11);
                    }
                    int currentTile = moveWithCurrent(11);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[11];
                        dirs[currentTile] = currents[11];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[11] = cost + cooldowns[11];
                    dirs[11] = Direction.SOUTHWEST;
                    currented[11] = null;
                    wait[11] = false;
                    setChecked(11);

                    if (dest[11]) return 11;

                    addToQueue(11);
                }
            }
            break;case 21:
        cost=costs[21];if(toCheck12){//debugPoint(12, rc);
                if(currents[12]!=Direction.CENTER&&cost%10+cooldowns[12]>9) {
                    if (cost%10>0&&cooldowns[12]<10&&currents[21]==Direction.CENTER) {
                        costs[12] = cooldowns[12]+(cost+9)/10*10;
                        dirs[12] = Direction.WEST;
                        wait[12] = true;
                        currented[12] = null;
                        setChecked(12);

                        if (dest[12]) return 12;

                        addToQueue(12);
                    }
                    int currentTile = moveWithCurrent(12);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[12];
                        dirs[currentTile] = currents[12];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[12] = cost + cooldowns[12];
                    dirs[12] = Direction.WEST;
                    currented[12] = null;
                    wait[12] = false;
                    setChecked(12);

                    if (dest[12]) return 12;

                    addToQueue(12);
                }
            }
            if(toCheck13){//debugPoint(13, rc);
                if(currents[13]!=Direction.CENTER&&cost%10+cooldowns[13]>9) {
                    if (cost%10>0&&cooldowns[13]<10&&currents[21]==Direction.CENTER) {
                        costs[13] = cooldowns[13]+(cost+9)/10*10;
                        dirs[13] = Direction.NORTHWEST;
                        wait[13] = true;
                        currented[13] = null;
                        setChecked(13);

                        if (dest[13]) return 13;

                        addToQueue(13);
                    }
                    int currentTile = moveWithCurrent(13);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[13];
                        dirs[currentTile] = currents[13];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[13] = cost + cooldowns[13];
                    dirs[13] = Direction.NORTHWEST;
                    currented[13] = null;
                    wait[13] = false;
                    setChecked(13);

                    if (dest[13]) return 13;

                    addToQueue(13);
                }
            }
            if(toCheck22){//debugPoint(22, rc);
                if(currents[22]!=Direction.CENTER&&cost%10+cooldowns[22]>9) {
                    if (cost%10>0&&cooldowns[22]<10&&currents[21]==Direction.CENTER) {
                        costs[22] = cooldowns[22]+(cost+9)/10*10;
                        dirs[22] = Direction.NORTH;
                        wait[22] = true;
                        currented[22] = null;
                        setChecked(22);

                        if (dest[22]) return 22;

                        addToQueue(22);
                    }
                    int currentTile = moveWithCurrent(22);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[22];
                        dirs[currentTile] = currents[22];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[22] = cost + cooldowns[22];
                    dirs[22] = Direction.NORTH;
                    currented[22] = null;
                    wait[22] = false;
                    setChecked(22);

                    if (dest[22]) return 22;

                    addToQueue(22);
                }
            }
            if(toCheck31){//debugPoint(31, rc);
                if(currents[31]!=Direction.CENTER&&cost%10+cooldowns[31]>9) {
                    if (cost%10>0&&cooldowns[31]<10&&currents[21]==Direction.CENTER) {
                        costs[31] = cooldowns[31]+(cost+9)/10*10;
                        dirs[31] = Direction.NORTHEAST;
                        wait[31] = true;
                        currented[31] = null;
                        setChecked(31);

                        if (dest[31]) return 31;

                        addToQueue(31);
                    }
                    int currentTile = moveWithCurrent(31);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[31];
                        dirs[currentTile] = currents[31];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[31] = cost + cooldowns[31];
                    dirs[31] = Direction.NORTHEAST;
                    currented[31] = null;
                    wait[31] = false;
                    setChecked(31);

                    if (dest[31]) return 31;

                    addToQueue(31);
                }
            }
            if(toCheck30){//debugPoint(30, rc);
                if(currents[30]!=Direction.CENTER&&cost%10+cooldowns[30]>9) {
                    if (cost%10>0&&cooldowns[30]<10&&currents[21]==Direction.CENTER) {
                        costs[30] = cooldowns[30]+(cost+9)/10*10;
                        dirs[30] = Direction.EAST;
                        wait[30] = true;
                        currented[30] = null;
                        setChecked(30);

                        if (dest[30]) return 30;

                        addToQueue(30);
                    }
                    int currentTile = moveWithCurrent(30);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[30];
                        dirs[currentTile] = currents[30];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[30] = cost + cooldowns[30];
                    dirs[30] = Direction.EAST;
                    currented[30] = null;
                    wait[30] = false;
                    setChecked(30);

                    if (dest[30]) return 30;

                    addToQueue(30);
                }
            }
            break;case 22:
        cost=costs[22];if(toCheck13){//debugPoint(13, rc);
                if(currents[13]!=Direction.CENTER&&cost%10+cooldowns[13]>9) {
                    if (cost%10>0&&cooldowns[13]<10&&currents[22]==Direction.CENTER) {
                        costs[13] = cooldowns[13]+(cost+9)/10*10;
                        dirs[13] = Direction.WEST;
                        wait[13] = true;
                        currented[13] = null;
                        setChecked(13);

                        if (dest[13]) return 13;

                        addToQueue(13);
                    }
                    int currentTile = moveWithCurrent(13);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[13];
                        dirs[currentTile] = currents[13];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[13] = cost + cooldowns[13];
                    dirs[13] = Direction.WEST;
                    currented[13] = null;
                    wait[13] = false;
                    setChecked(13);

                    if (dest[13]) return 13;

                    addToQueue(13);
                }
            }
            if(toCheck14){//debugPoint(14, rc);
                if(currents[14]!=Direction.CENTER&&cost%10+cooldowns[14]>9) {
                    if (cost%10>0&&cooldowns[14]<10&&currents[22]==Direction.CENTER) {
                        costs[14] = cooldowns[14]+(cost+9)/10*10;
                        dirs[14] = Direction.NORTHWEST;
                        wait[14] = true;
                        currented[14] = null;
                        setChecked(14);

                        if (dest[14]) return 14;

                        addToQueue(14);
                    }
                    int currentTile = moveWithCurrent(14);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[14];
                        dirs[currentTile] = currents[14];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[14] = cost + cooldowns[14];
                    dirs[14] = Direction.NORTHWEST;
                    currented[14] = null;
                    wait[14] = false;
                    setChecked(14);

                    if (dest[14]) return 14;

                    addToQueue(14);
                }
            }
            if(toCheck23){//debugPoint(23, rc);
                if(currents[23]!=Direction.CENTER&&cost%10+cooldowns[23]>9) {
                    if (cost%10>0&&cooldowns[23]<10&&currents[22]==Direction.CENTER) {
                        costs[23] = cooldowns[23]+(cost+9)/10*10;
                        dirs[23] = Direction.NORTH;
                        wait[23] = true;
                        currented[23] = null;
                        setChecked(23);

                        if (dest[23]) return 23;

                        addToQueue(23);
                    }
                    int currentTile = moveWithCurrent(23);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[23];
                        dirs[currentTile] = currents[23];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[23] = cost + cooldowns[23];
                    dirs[23] = Direction.NORTH;
                    currented[23] = null;
                    wait[23] = false;
                    setChecked(23);

                    if (dest[23]) return 23;

                    addToQueue(23);
                }
            }
            if(toCheck32){//debugPoint(32, rc);
                if(currents[32]!=Direction.CENTER&&cost%10+cooldowns[32]>9) {
                    if (cost%10>0&&cooldowns[32]<10&&currents[22]==Direction.CENTER) {
                        costs[32] = cooldowns[32]+(cost+9)/10*10;
                        dirs[32] = Direction.NORTHEAST;
                        wait[32] = true;
                        currented[32] = null;
                        setChecked(32);

                        if (dest[32]) return 32;

                        addToQueue(32);
                    }
                    int currentTile = moveWithCurrent(32);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[32];
                        dirs[currentTile] = currents[32];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[32] = cost + cooldowns[32];
                    dirs[32] = Direction.NORTHEAST;
                    currented[32] = null;
                    wait[32] = false;
                    setChecked(32);

                    if (dest[32]) return 32;

                    addToQueue(32);
                }
            }
            if(toCheck31){//debugPoint(31, rc);
                if(currents[31]!=Direction.CENTER&&cost%10+cooldowns[31]>9) {
                    if (cost%10>0&&cooldowns[31]<10&&currents[22]==Direction.CENTER) {
                        costs[31] = cooldowns[31]+(cost+9)/10*10;
                        dirs[31] = Direction.EAST;
                        wait[31] = true;
                        currented[31] = null;
                        setChecked(31);

                        if (dest[31]) return 31;

                        addToQueue(31);
                    }
                    int currentTile = moveWithCurrent(31);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[31];
                        dirs[currentTile] = currents[31];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[31] = cost + cooldowns[31];
                    dirs[31] = Direction.EAST;
                    currented[31] = null;
                    wait[31] = false;
                    setChecked(31);

                    if (dest[31]) return 31;

                    addToQueue(31);
                }
            }
            if(toCheck30){//debugPoint(30, rc);
                if(currents[30]!=Direction.CENTER&&cost%10+cooldowns[30]>9) {
                    if (cost%10>0&&cooldowns[30]<10&&currents[22]==Direction.CENTER) {
                        costs[30] = cooldowns[30]+(cost+9)/10*10;
                        dirs[30] = Direction.SOUTHEAST;
                        wait[30] = true;
                        currented[30] = null;
                        setChecked(30);

                        if (dest[30]) return 30;

                        addToQueue(30);
                    }
                    int currentTile = moveWithCurrent(30);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[30];
                        dirs[currentTile] = currents[30];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[30] = cost + cooldowns[30];
                    dirs[30] = Direction.SOUTHEAST;
                    currented[30] = null;
                    wait[30] = false;
                    setChecked(30);

                    if (dest[30]) return 30;

                    addToQueue(30);
                }
            }
            if(toCheck21){//debugPoint(21, rc);
                if(currents[21]!=Direction.CENTER&&cost%10+cooldowns[21]>9) {
                    if (cost%10>0&&cooldowns[21]<10&&currents[22]==Direction.CENTER) {
                        costs[21] = cooldowns[21]+(cost+9)/10*10;
                        dirs[21] = Direction.SOUTH;
                        wait[21] = true;
                        currented[21] = null;
                        setChecked(21);

                        if (dest[21]) return 21;

                        addToQueue(21);
                    }
                    int currentTile = moveWithCurrent(21);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[21];
                        dirs[currentTile] = currents[21];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[21] = cost + cooldowns[21];
                    dirs[21] = Direction.SOUTH;
                    currented[21] = null;
                    wait[21] = false;
                    setChecked(21);

                    if (dest[21]) return 21;

                    addToQueue(21);
                }
            }
            if(toCheck12){//debugPoint(12, rc);
                if(currents[12]!=Direction.CENTER&&cost%10+cooldowns[12]>9) {
                    if (cost%10>0&&cooldowns[12]<10&&currents[22]==Direction.CENTER) {
                        costs[12] = cooldowns[12]+(cost+9)/10*10;
                        dirs[12] = Direction.SOUTHWEST;
                        wait[12] = true;
                        currented[12] = null;
                        setChecked(12);

                        if (dest[12]) return 12;

                        addToQueue(12);
                    }
                    int currentTile = moveWithCurrent(12);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[12];
                        dirs[currentTile] = currents[12];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[12] = cost + cooldowns[12];
                    dirs[12] = Direction.SOUTHWEST;
                    currented[12] = null;
                    wait[12] = false;
                    setChecked(12);

                    if (dest[12]) return 12;

                    addToQueue(12);
                }
            }
            break;case 23:
        cost=costs[23];if(toCheck14){//debugPoint(14, rc);
                if(currents[14]!=Direction.CENTER&&cost%10+cooldowns[14]>9) {
                    if (cost%10>0&&cooldowns[14]<10&&currents[23]==Direction.CENTER) {
                        costs[14] = cooldowns[14]+(cost+9)/10*10;
                        dirs[14] = Direction.WEST;
                        wait[14] = true;
                        currented[14] = null;
                        setChecked(14);

                        if (dest[14]) return 14;

                        addToQueue(14);
                    }
                    int currentTile = moveWithCurrent(14);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[14];
                        dirs[currentTile] = currents[14];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[14] = cost + cooldowns[14];
                    dirs[14] = Direction.WEST;
                    currented[14] = null;
                    wait[14] = false;
                    setChecked(14);

                    if (dest[14]) return 14;

                    addToQueue(14);
                }
            }
            if(toCheck15){//debugPoint(15, rc);
                if(currents[15]!=Direction.CENTER&&cost%10+cooldowns[15]>9) {
                    if (cost%10>0&&cooldowns[15]<10&&currents[23]==Direction.CENTER) {
                        costs[15] = cooldowns[15]+(cost+9)/10*10;
                        dirs[15] = Direction.NORTHWEST;
                        wait[15] = true;
                        currented[15] = null;
                        setChecked(15);

                        if (dest[15]) return 15;

                        addToQueue(15);
                    }
                    int currentTile = moveWithCurrent(15);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[15];
                        dirs[currentTile] = currents[15];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[15] = cost + cooldowns[15];
                    dirs[15] = Direction.NORTHWEST;
                    currented[15] = null;
                    wait[15] = false;
                    setChecked(15);

                    if (dest[15]) return 15;

                    addToQueue(15);
                }
            }
            if(toCheck24){//debugPoint(24, rc);
                if(currents[24]!=Direction.CENTER&&cost%10+cooldowns[24]>9) {
                    if (cost%10>0&&cooldowns[24]<10&&currents[23]==Direction.CENTER) {
                        costs[24] = cooldowns[24]+(cost+9)/10*10;
                        dirs[24] = Direction.NORTH;
                        wait[24] = true;
                        currented[24] = null;
                        setChecked(24);

                        if (dest[24]) return 24;

                        addToQueue(24);
                    }
                    int currentTile = moveWithCurrent(24);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[24];
                        dirs[currentTile] = currents[24];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[24] = cost + cooldowns[24];
                    dirs[24] = Direction.NORTH;
                    currented[24] = null;
                    wait[24] = false;
                    setChecked(24);

                    if (dest[24]) return 24;

                    addToQueue(24);
                }
            }
            if(toCheck33){//debugPoint(33, rc);
                if(currents[33]!=Direction.CENTER&&cost%10+cooldowns[33]>9) {
                    if (cost%10>0&&cooldowns[33]<10&&currents[23]==Direction.CENTER) {
                        costs[33] = cooldowns[33]+(cost+9)/10*10;
                        dirs[33] = Direction.NORTHEAST;
                        wait[33] = true;
                        currented[33] = null;
                        setChecked(33);

                        if (dest[33]) return 33;

                        addToQueue(33);
                    }
                    int currentTile = moveWithCurrent(33);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[33];
                        dirs[currentTile] = currents[33];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[33] = cost + cooldowns[33];
                    dirs[33] = Direction.NORTHEAST;
                    currented[33] = null;
                    wait[33] = false;
                    setChecked(33);

                    if (dest[33]) return 33;

                    addToQueue(33);
                }
            }
            if(toCheck32){//debugPoint(32, rc);
                if(currents[32]!=Direction.CENTER&&cost%10+cooldowns[32]>9) {
                    if (cost%10>0&&cooldowns[32]<10&&currents[23]==Direction.CENTER) {
                        costs[32] = cooldowns[32]+(cost+9)/10*10;
                        dirs[32] = Direction.EAST;
                        wait[32] = true;
                        currented[32] = null;
                        setChecked(32);

                        if (dest[32]) return 32;

                        addToQueue(32);
                    }
                    int currentTile = moveWithCurrent(32);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[32];
                        dirs[currentTile] = currents[32];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[32] = cost + cooldowns[32];
                    dirs[32] = Direction.EAST;
                    currented[32] = null;
                    wait[32] = false;
                    setChecked(32);

                    if (dest[32]) return 32;

                    addToQueue(32);
                }
            }
            if(toCheck31){//debugPoint(31, rc);
                if(currents[31]!=Direction.CENTER&&cost%10+cooldowns[31]>9) {
                    if (cost%10>0&&cooldowns[31]<10&&currents[23]==Direction.CENTER) {
                        costs[31] = cooldowns[31]+(cost+9)/10*10;
                        dirs[31] = Direction.SOUTHEAST;
                        wait[31] = true;
                        currented[31] = null;
                        setChecked(31);

                        if (dest[31]) return 31;

                        addToQueue(31);
                    }
                    int currentTile = moveWithCurrent(31);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[31];
                        dirs[currentTile] = currents[31];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[31] = cost + cooldowns[31];
                    dirs[31] = Direction.SOUTHEAST;
                    currented[31] = null;
                    wait[31] = false;
                    setChecked(31);

                    if (dest[31]) return 31;

                    addToQueue(31);
                }
            }
            if(toCheck22){//debugPoint(22, rc);
                if(currents[22]!=Direction.CENTER&&cost%10+cooldowns[22]>9) {
                    if (cost%10>0&&cooldowns[22]<10&&currents[23]==Direction.CENTER) {
                        costs[22] = cooldowns[22]+(cost+9)/10*10;
                        dirs[22] = Direction.SOUTH;
                        wait[22] = true;
                        currented[22] = null;
                        setChecked(22);

                        if (dest[22]) return 22;

                        addToQueue(22);
                    }
                    int currentTile = moveWithCurrent(22);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[22];
                        dirs[currentTile] = currents[22];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[22] = cost + cooldowns[22];
                    dirs[22] = Direction.SOUTH;
                    currented[22] = null;
                    wait[22] = false;
                    setChecked(22);

                    if (dest[22]) return 22;

                    addToQueue(22);
                }
            }
            if(toCheck13){//debugPoint(13, rc);
                if(currents[13]!=Direction.CENTER&&cost%10+cooldowns[13]>9) {
                    if (cost%10>0&&cooldowns[13]<10&&currents[23]==Direction.CENTER) {
                        costs[13] = cooldowns[13]+(cost+9)/10*10;
                        dirs[13] = Direction.SOUTHWEST;
                        wait[13] = true;
                        currented[13] = null;
                        setChecked(13);

                        if (dest[13]) return 13;

                        addToQueue(13);
                    }
                    int currentTile = moveWithCurrent(13);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[13];
                        dirs[currentTile] = currents[13];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[13] = cost + cooldowns[13];
                    dirs[13] = Direction.SOUTHWEST;
                    currented[13] = null;
                    wait[13] = false;
                    setChecked(13);

                    if (dest[13]) return 13;

                    addToQueue(13);
                }
            }
            break;case 24:
        cost=costs[24];if(toCheck15){//debugPoint(15, rc);
                if(currents[15]!=Direction.CENTER&&cost%10+cooldowns[15]>9) {
                    if (cost%10>0&&cooldowns[15]<10&&currents[24]==Direction.CENTER) {
                        costs[15] = cooldowns[15]+(cost+9)/10*10;
                        dirs[15] = Direction.WEST;
                        wait[15] = true;
                        currented[15] = null;
                        setChecked(15);

                        if (dest[15]) return 15;

                        addToQueue(15);
                    }
                    int currentTile = moveWithCurrent(15);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[15];
                        dirs[currentTile] = currents[15];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[15] = cost + cooldowns[15];
                    dirs[15] = Direction.WEST;
                    currented[15] = null;
                    wait[15] = false;
                    setChecked(15);

                    if (dest[15]) return 15;

                    addToQueue(15);
                }
            }
            if(toCheck16){//debugPoint(16, rc);
                if(currents[16]!=Direction.CENTER&&cost%10+cooldowns[16]>9) {
                    if (cost%10>0&&cooldowns[16]<10&&currents[24]==Direction.CENTER) {
                        costs[16] = cooldowns[16]+(cost+9)/10*10;
                        dirs[16] = Direction.NORTHWEST;
                        wait[16] = true;
                        currented[16] = null;
                        setChecked(16);

                        if (dest[16]) return 16;

                        addToQueue(16);
                    }
                    int currentTile = moveWithCurrent(16);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[16];
                        dirs[currentTile] = currents[16];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[16] = cost + cooldowns[16];
                    dirs[16] = Direction.NORTHWEST;
                    currented[16] = null;
                    wait[16] = false;
                    setChecked(16);

                    if (dest[16]) return 16;

                    addToQueue(16);
                }
            }
            if(toCheck25){//debugPoint(25, rc);
                if(currents[25]!=Direction.CENTER&&cost%10+cooldowns[25]>9) {
                    if (cost%10>0&&cooldowns[25]<10&&currents[24]==Direction.CENTER) {
                        costs[25] = cooldowns[25]+(cost+9)/10*10;
                        dirs[25] = Direction.NORTH;
                        wait[25] = true;
                        currented[25] = null;
                        setChecked(25);

                        if (dest[25]) return 25;

                        addToQueue(25);
                    }
                    int currentTile = moveWithCurrent(25);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[25];
                        dirs[currentTile] = currents[25];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[25] = cost + cooldowns[25];
                    dirs[25] = Direction.NORTH;
                    currented[25] = null;
                    wait[25] = false;
                    setChecked(25);

                    if (dest[25]) return 25;

                    addToQueue(25);
                }
            }
            if(toCheck34){//debugPoint(34, rc);
                if(currents[34]!=Direction.CENTER&&cost%10+cooldowns[34]>9) {
                    if (cost%10>0&&cooldowns[34]<10&&currents[24]==Direction.CENTER) {
                        costs[34] = cooldowns[34]+(cost+9)/10*10;
                        dirs[34] = Direction.NORTHEAST;
                        wait[34] = true;
                        currented[34] = null;
                        setChecked(34);

                        if (dest[34]) return 34;

                        addToQueue(34);
                    }
                    int currentTile = moveWithCurrent(34);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[34];
                        dirs[currentTile] = currents[34];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[34] = cost + cooldowns[34];
                    dirs[34] = Direction.NORTHEAST;
                    currented[34] = null;
                    wait[34] = false;
                    setChecked(34);

                    if (dest[34]) return 34;

                    addToQueue(34);
                }
            }
            if(toCheck33){//debugPoint(33, rc);
                if(currents[33]!=Direction.CENTER&&cost%10+cooldowns[33]>9) {
                    if (cost%10>0&&cooldowns[33]<10&&currents[24]==Direction.CENTER) {
                        costs[33] = cooldowns[33]+(cost+9)/10*10;
                        dirs[33] = Direction.EAST;
                        wait[33] = true;
                        currented[33] = null;
                        setChecked(33);

                        if (dest[33]) return 33;

                        addToQueue(33);
                    }
                    int currentTile = moveWithCurrent(33);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[33];
                        dirs[currentTile] = currents[33];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[33] = cost + cooldowns[33];
                    dirs[33] = Direction.EAST;
                    currented[33] = null;
                    wait[33] = false;
                    setChecked(33);

                    if (dest[33]) return 33;

                    addToQueue(33);
                }
            }
            if(toCheck32){//debugPoint(32, rc);
                if(currents[32]!=Direction.CENTER&&cost%10+cooldowns[32]>9) {
                    if (cost%10>0&&cooldowns[32]<10&&currents[24]==Direction.CENTER) {
                        costs[32] = cooldowns[32]+(cost+9)/10*10;
                        dirs[32] = Direction.SOUTHEAST;
                        wait[32] = true;
                        currented[32] = null;
                        setChecked(32);

                        if (dest[32]) return 32;

                        addToQueue(32);
                    }
                    int currentTile = moveWithCurrent(32);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[32];
                        dirs[currentTile] = currents[32];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[32] = cost + cooldowns[32];
                    dirs[32] = Direction.SOUTHEAST;
                    currented[32] = null;
                    wait[32] = false;
                    setChecked(32);

                    if (dest[32]) return 32;

                    addToQueue(32);
                }
            }
            if(toCheck23){//debugPoint(23, rc);
                if(currents[23]!=Direction.CENTER&&cost%10+cooldowns[23]>9) {
                    if (cost%10>0&&cooldowns[23]<10&&currents[24]==Direction.CENTER) {
                        costs[23] = cooldowns[23]+(cost+9)/10*10;
                        dirs[23] = Direction.SOUTH;
                        wait[23] = true;
                        currented[23] = null;
                        setChecked(23);

                        if (dest[23]) return 23;

                        addToQueue(23);
                    }
                    int currentTile = moveWithCurrent(23);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[23];
                        dirs[currentTile] = currents[23];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[23] = cost + cooldowns[23];
                    dirs[23] = Direction.SOUTH;
                    currented[23] = null;
                    wait[23] = false;
                    setChecked(23);

                    if (dest[23]) return 23;

                    addToQueue(23);
                }
            }
            if(toCheck14){//debugPoint(14, rc);
                if(currents[14]!=Direction.CENTER&&cost%10+cooldowns[14]>9) {
                    if (cost%10>0&&cooldowns[14]<10&&currents[24]==Direction.CENTER) {
                        costs[14] = cooldowns[14]+(cost+9)/10*10;
                        dirs[14] = Direction.SOUTHWEST;
                        wait[14] = true;
                        currented[14] = null;
                        setChecked(14);

                        if (dest[14]) return 14;

                        addToQueue(14);
                    }
                    int currentTile = moveWithCurrent(14);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[14];
                        dirs[currentTile] = currents[14];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[14] = cost + cooldowns[14];
                    dirs[14] = Direction.SOUTHWEST;
                    currented[14] = null;
                    wait[14] = false;
                    setChecked(14);

                    if (dest[14]) return 14;

                    addToQueue(14);
                }
            }
            break;case 25:
        cost=costs[25];if(toCheck16){//debugPoint(16, rc);
                if(currents[16]!=Direction.CENTER&&cost%10+cooldowns[16]>9) {
                    if (cost%10>0&&cooldowns[16]<10&&currents[25]==Direction.CENTER) {
                        costs[16] = cooldowns[16]+(cost+9)/10*10;
                        dirs[16] = Direction.WEST;
                        wait[16] = true;
                        currented[16] = null;
                        setChecked(16);

                        if (dest[16]) return 16;

                        addToQueue(16);
                    }
                    int currentTile = moveWithCurrent(16);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[16];
                        dirs[currentTile] = currents[16];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[16] = cost + cooldowns[16];
                    dirs[16] = Direction.WEST;
                    currented[16] = null;
                    wait[16] = false;
                    setChecked(16);

                    if (dest[16]) return 16;

                    addToQueue(16);
                }
            }
            if(toCheck17){//debugPoint(17, rc);
                if(currents[17]!=Direction.CENTER&&cost%10+cooldowns[17]>9) {
                    if (cost%10>0&&cooldowns[17]<10&&currents[25]==Direction.CENTER) {
                        costs[17] = cooldowns[17]+(cost+9)/10*10;
                        dirs[17] = Direction.NORTHWEST;
                        wait[17] = true;
                        currented[17] = null;
                        setChecked(17);

                        if (dest[17]) return 17;

                        addToQueue(17);
                    }
                    int currentTile = moveWithCurrent(17);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[17];
                        dirs[currentTile] = currents[17];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[17] = cost + cooldowns[17];
                    dirs[17] = Direction.NORTHWEST;
                    currented[17] = null;
                    wait[17] = false;
                    setChecked(17);

                    if (dest[17]) return 17;

                    addToQueue(17);
                }
            }
            if(toCheck26){//debugPoint(26, rc);
                if(currents[26]!=Direction.CENTER&&cost%10+cooldowns[26]>9) {
                    if (cost%10>0&&cooldowns[26]<10&&currents[25]==Direction.CENTER) {
                        costs[26] = cooldowns[26]+(cost+9)/10*10;
                        dirs[26] = Direction.NORTH;
                        wait[26] = true;
                        currented[26] = null;
                        setChecked(26);

                        if (dest[26]) return 26;

                        addToQueue(26);
                    }
                    int currentTile = moveWithCurrent(26);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[26];
                        dirs[currentTile] = currents[26];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[26] = cost + cooldowns[26];
                    dirs[26] = Direction.NORTH;
                    currented[26] = null;
                    wait[26] = false;
                    setChecked(26);

                    if (dest[26]) return 26;

                    addToQueue(26);
                }
            }
            if(toCheck35){//debugPoint(35, rc);
                if(currents[35]!=Direction.CENTER&&cost%10+cooldowns[35]>9) {
                    if (cost%10>0&&cooldowns[35]<10&&currents[25]==Direction.CENTER) {
                        costs[35] = cooldowns[35]+(cost+9)/10*10;
                        dirs[35] = Direction.NORTHEAST;
                        wait[35] = true;
                        currented[35] = null;
                        setChecked(35);

                        if (dest[35]) return 35;

                        addToQueue(35);
                    }
                    int currentTile = moveWithCurrent(35);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[35];
                        dirs[currentTile] = currents[35];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[35] = cost + cooldowns[35];
                    dirs[35] = Direction.NORTHEAST;
                    currented[35] = null;
                    wait[35] = false;
                    setChecked(35);

                    if (dest[35]) return 35;

                    addToQueue(35);
                }
            }
            if(toCheck34){//debugPoint(34, rc);
                if(currents[34]!=Direction.CENTER&&cost%10+cooldowns[34]>9) {
                    if (cost%10>0&&cooldowns[34]<10&&currents[25]==Direction.CENTER) {
                        costs[34] = cooldowns[34]+(cost+9)/10*10;
                        dirs[34] = Direction.EAST;
                        wait[34] = true;
                        currented[34] = null;
                        setChecked(34);

                        if (dest[34]) return 34;

                        addToQueue(34);
                    }
                    int currentTile = moveWithCurrent(34);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[34];
                        dirs[currentTile] = currents[34];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[34] = cost + cooldowns[34];
                    dirs[34] = Direction.EAST;
                    currented[34] = null;
                    wait[34] = false;
                    setChecked(34);

                    if (dest[34]) return 34;

                    addToQueue(34);
                }
            }
            if(toCheck33){//debugPoint(33, rc);
                if(currents[33]!=Direction.CENTER&&cost%10+cooldowns[33]>9) {
                    if (cost%10>0&&cooldowns[33]<10&&currents[25]==Direction.CENTER) {
                        costs[33] = cooldowns[33]+(cost+9)/10*10;
                        dirs[33] = Direction.SOUTHEAST;
                        wait[33] = true;
                        currented[33] = null;
                        setChecked(33);

                        if (dest[33]) return 33;

                        addToQueue(33);
                    }
                    int currentTile = moveWithCurrent(33);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[33];
                        dirs[currentTile] = currents[33];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[33] = cost + cooldowns[33];
                    dirs[33] = Direction.SOUTHEAST;
                    currented[33] = null;
                    wait[33] = false;
                    setChecked(33);

                    if (dest[33]) return 33;

                    addToQueue(33);
                }
            }
            if(toCheck24){//debugPoint(24, rc);
                if(currents[24]!=Direction.CENTER&&cost%10+cooldowns[24]>9) {
                    if (cost%10>0&&cooldowns[24]<10&&currents[25]==Direction.CENTER) {
                        costs[24] = cooldowns[24]+(cost+9)/10*10;
                        dirs[24] = Direction.SOUTH;
                        wait[24] = true;
                        currented[24] = null;
                        setChecked(24);

                        if (dest[24]) return 24;

                        addToQueue(24);
                    }
                    int currentTile = moveWithCurrent(24);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[24];
                        dirs[currentTile] = currents[24];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[24] = cost + cooldowns[24];
                    dirs[24] = Direction.SOUTH;
                    currented[24] = null;
                    wait[24] = false;
                    setChecked(24);

                    if (dest[24]) return 24;

                    addToQueue(24);
                }
            }
            if(toCheck15){//debugPoint(15, rc);
                if(currents[15]!=Direction.CENTER&&cost%10+cooldowns[15]>9) {
                    if (cost%10>0&&cooldowns[15]<10&&currents[25]==Direction.CENTER) {
                        costs[15] = cooldowns[15]+(cost+9)/10*10;
                        dirs[15] = Direction.SOUTHWEST;
                        wait[15] = true;
                        currented[15] = null;
                        setChecked(15);

                        if (dest[15]) return 15;

                        addToQueue(15);
                    }
                    int currentTile = moveWithCurrent(15);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[15];
                        dirs[currentTile] = currents[15];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[15] = cost + cooldowns[15];
                    dirs[15] = Direction.SOUTHWEST;
                    currented[15] = null;
                    wait[15] = false;
                    setChecked(15);

                    if (dest[15]) return 15;

                    addToQueue(15);
                }
            }
            break;
        }
    return -1;
    }
    public static int dijkstraSub2(RobotController rc, int n) {int cost; switch(n) {case 26:
        cost=costs[26];if(toCheck17){//debugPoint(17, rc);
                if(currents[17]!=Direction.CENTER&&cost%10+cooldowns[17]>9) {
                    if (cost%10>0&&cooldowns[17]<10&&currents[26]==Direction.CENTER) {
                        costs[17] = cooldowns[17]+(cost+9)/10*10;
                        dirs[17] = Direction.WEST;
                        wait[17] = true;
                        currented[17] = null;
                        setChecked(17);

                        if (dest[17]) return 17;

                        addToQueue(17);
                    }
                    int currentTile = moveWithCurrent(17);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[17];
                        dirs[currentTile] = currents[17];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[17] = cost + cooldowns[17];
                    dirs[17] = Direction.WEST;
                    currented[17] = null;
                    wait[17] = false;
                    setChecked(17);

                    if (dest[17]) return 17;

                    addToQueue(17);
                }
            }
            if(toCheck18){//debugPoint(18, rc);
                if(currents[18]!=Direction.CENTER&&cost%10+cooldowns[18]>9) {
                    if (cost%10>0&&cooldowns[18]<10&&currents[26]==Direction.CENTER) {
                        costs[18] = cooldowns[18]+(cost+9)/10*10;
                        dirs[18] = Direction.NORTHWEST;
                        wait[18] = true;
                        currented[18] = null;
                        setChecked(18);

                        if (dest[18]) return 18;

                        addToQueue(18);
                    }
                    int currentTile = moveWithCurrent(18);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[18];
                        dirs[currentTile] = currents[18];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[18] = cost + cooldowns[18];
                    dirs[18] = Direction.NORTHWEST;
                    currented[18] = null;
                    wait[18] = false;
                    setChecked(18);

                    if (dest[18]) return 18;

                    addToQueue(18);
                }
            }
            if(toCheck27){//debugPoint(27, rc);
                if(currents[27]!=Direction.CENTER&&cost%10+cooldowns[27]>9) {
                    if (cost%10>0&&cooldowns[27]<10&&currents[26]==Direction.CENTER) {
                        costs[27] = cooldowns[27]+(cost+9)/10*10;
                        dirs[27] = Direction.NORTH;
                        wait[27] = true;
                        currented[27] = null;
                        setChecked(27);

                        if (dest[27]) return 27;

                        addToQueue(27);
                    }
                    int currentTile = moveWithCurrent(27);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[27];
                        dirs[currentTile] = currents[27];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[27] = cost + cooldowns[27];
                    dirs[27] = Direction.NORTH;
                    currented[27] = null;
                    wait[27] = false;
                    setChecked(27);

                    if (dest[27]) return 27;

                    addToQueue(27);
                }
            }
            if(toCheck36){//debugPoint(36, rc);
                if(currents[36]!=Direction.CENTER&&cost%10+cooldowns[36]>9) {
                    if (cost%10>0&&cooldowns[36]<10&&currents[26]==Direction.CENTER) {
                        costs[36] = cooldowns[36]+(cost+9)/10*10;
                        dirs[36] = Direction.NORTHEAST;
                        wait[36] = true;
                        currented[36] = null;
                        setChecked(36);

                        if (dest[36]) return 36;

                        addToQueue(36);
                    }
                    int currentTile = moveWithCurrent(36);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[36];
                        dirs[currentTile] = currents[36];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[36] = cost + cooldowns[36];
                    dirs[36] = Direction.NORTHEAST;
                    currented[36] = null;
                    wait[36] = false;
                    setChecked(36);

                    if (dest[36]) return 36;

                    addToQueue(36);
                }
            }
            if(toCheck35){//debugPoint(35, rc);
                if(currents[35]!=Direction.CENTER&&cost%10+cooldowns[35]>9) {
                    if (cost%10>0&&cooldowns[35]<10&&currents[26]==Direction.CENTER) {
                        costs[35] = cooldowns[35]+(cost+9)/10*10;
                        dirs[35] = Direction.EAST;
                        wait[35] = true;
                        currented[35] = null;
                        setChecked(35);

                        if (dest[35]) return 35;

                        addToQueue(35);
                    }
                    int currentTile = moveWithCurrent(35);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[35];
                        dirs[currentTile] = currents[35];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[35] = cost + cooldowns[35];
                    dirs[35] = Direction.EAST;
                    currented[35] = null;
                    wait[35] = false;
                    setChecked(35);

                    if (dest[35]) return 35;

                    addToQueue(35);
                }
            }
            if(toCheck34){//debugPoint(34, rc);
                if(currents[34]!=Direction.CENTER&&cost%10+cooldowns[34]>9) {
                    if (cost%10>0&&cooldowns[34]<10&&currents[26]==Direction.CENTER) {
                        costs[34] = cooldowns[34]+(cost+9)/10*10;
                        dirs[34] = Direction.SOUTHEAST;
                        wait[34] = true;
                        currented[34] = null;
                        setChecked(34);

                        if (dest[34]) return 34;

                        addToQueue(34);
                    }
                    int currentTile = moveWithCurrent(34);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[34];
                        dirs[currentTile] = currents[34];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[34] = cost + cooldowns[34];
                    dirs[34] = Direction.SOUTHEAST;
                    currented[34] = null;
                    wait[34] = false;
                    setChecked(34);

                    if (dest[34]) return 34;

                    addToQueue(34);
                }
            }
            if(toCheck25){//debugPoint(25, rc);
                if(currents[25]!=Direction.CENTER&&cost%10+cooldowns[25]>9) {
                    if (cost%10>0&&cooldowns[25]<10&&currents[26]==Direction.CENTER) {
                        costs[25] = cooldowns[25]+(cost+9)/10*10;
                        dirs[25] = Direction.SOUTH;
                        wait[25] = true;
                        currented[25] = null;
                        setChecked(25);

                        if (dest[25]) return 25;

                        addToQueue(25);
                    }
                    int currentTile = moveWithCurrent(25);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[25];
                        dirs[currentTile] = currents[25];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[25] = cost + cooldowns[25];
                    dirs[25] = Direction.SOUTH;
                    currented[25] = null;
                    wait[25] = false;
                    setChecked(25);

                    if (dest[25]) return 25;

                    addToQueue(25);
                }
            }
            if(toCheck16){//debugPoint(16, rc);
                if(currents[16]!=Direction.CENTER&&cost%10+cooldowns[16]>9) {
                    if (cost%10>0&&cooldowns[16]<10&&currents[26]==Direction.CENTER) {
                        costs[16] = cooldowns[16]+(cost+9)/10*10;
                        dirs[16] = Direction.SOUTHWEST;
                        wait[16] = true;
                        currented[16] = null;
                        setChecked(16);

                        if (dest[16]) return 16;

                        addToQueue(16);
                    }
                    int currentTile = moveWithCurrent(16);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[16];
                        dirs[currentTile] = currents[16];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[16] = cost + cooldowns[16];
                    dirs[16] = Direction.SOUTHWEST;
                    currented[16] = null;
                    wait[16] = false;
                    setChecked(16);

                    if (dest[16]) return 16;

                    addToQueue(16);
                }
            }
            break;case 27:
        cost=costs[27];if(toCheck18){//debugPoint(18, rc);
                if(currents[18]!=Direction.CENTER&&cost%10+cooldowns[18]>9) {
                    if (cost%10>0&&cooldowns[18]<10&&currents[27]==Direction.CENTER) {
                        costs[18] = cooldowns[18]+(cost+9)/10*10;
                        dirs[18] = Direction.WEST;
                        wait[18] = true;
                        currented[18] = null;
                        setChecked(18);

                        if (dest[18]) return 18;

                        addToQueue(18);
                    }
                    int currentTile = moveWithCurrent(18);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[18];
                        dirs[currentTile] = currents[18];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[18] = cost + cooldowns[18];
                    dirs[18] = Direction.WEST;
                    currented[18] = null;
                    wait[18] = false;
                    setChecked(18);

                    if (dest[18]) return 18;

                    addToQueue(18);
                }
            }
            if(toCheck19){//debugPoint(19, rc);
                if(currents[19]!=Direction.CENTER&&cost%10+cooldowns[19]>9) {
                    if (cost%10>0&&cooldowns[19]<10&&currents[27]==Direction.CENTER) {
                        costs[19] = cooldowns[19]+(cost+9)/10*10;
                        dirs[19] = Direction.NORTHWEST;
                        wait[19] = true;
                        currented[19] = null;
                        setChecked(19);

                        if (dest[19]) return 19;

                        addToQueue(19);
                    }
                    int currentTile = moveWithCurrent(19);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[19];
                        dirs[currentTile] = currents[19];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[19] = cost + cooldowns[19];
                    dirs[19] = Direction.NORTHWEST;
                    currented[19] = null;
                    wait[19] = false;
                    setChecked(19);

                    if (dest[19]) return 19;

                    addToQueue(19);
                }
            }
            if(toCheck28){//debugPoint(28, rc);
                if(currents[28]!=Direction.CENTER&&cost%10+cooldowns[28]>9) {
                    if (cost%10>0&&cooldowns[28]<10&&currents[27]==Direction.CENTER) {
                        costs[28] = cooldowns[28]+(cost+9)/10*10;
                        dirs[28] = Direction.NORTH;
                        wait[28] = true;
                        currented[28] = null;
                        setChecked(28);

                        if (dest[28]) return 28;

                        addToQueue(28);
                    }
                    int currentTile = moveWithCurrent(28);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[28];
                        dirs[currentTile] = currents[28];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[28] = cost + cooldowns[28];
                    dirs[28] = Direction.NORTH;
                    currented[28] = null;
                    wait[28] = false;
                    setChecked(28);

                    if (dest[28]) return 28;

                    addToQueue(28);
                }
            }
            if(toCheck37){//debugPoint(37, rc);
                if(currents[37]!=Direction.CENTER&&cost%10+cooldowns[37]>9) {
                    if (cost%10>0&&cooldowns[37]<10&&currents[27]==Direction.CENTER) {
                        costs[37] = cooldowns[37]+(cost+9)/10*10;
                        dirs[37] = Direction.NORTHEAST;
                        wait[37] = true;
                        currented[37] = null;
                        setChecked(37);

                        if (dest[37]) return 37;

                        addToQueue(37);
                    }
                    int currentTile = moveWithCurrent(37);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[37];
                        dirs[currentTile] = currents[37];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[37] = cost + cooldowns[37];
                    dirs[37] = Direction.NORTHEAST;
                    currented[37] = null;
                    wait[37] = false;
                    setChecked(37);

                    if (dest[37]) return 37;

                    addToQueue(37);
                }
            }
            if(toCheck36){//debugPoint(36, rc);
                if(currents[36]!=Direction.CENTER&&cost%10+cooldowns[36]>9) {
                    if (cost%10>0&&cooldowns[36]<10&&currents[27]==Direction.CENTER) {
                        costs[36] = cooldowns[36]+(cost+9)/10*10;
                        dirs[36] = Direction.EAST;
                        wait[36] = true;
                        currented[36] = null;
                        setChecked(36);

                        if (dest[36]) return 36;

                        addToQueue(36);
                    }
                    int currentTile = moveWithCurrent(36);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[36];
                        dirs[currentTile] = currents[36];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[36] = cost + cooldowns[36];
                    dirs[36] = Direction.EAST;
                    currented[36] = null;
                    wait[36] = false;
                    setChecked(36);

                    if (dest[36]) return 36;

                    addToQueue(36);
                }
            }
            if(toCheck35){//debugPoint(35, rc);
                if(currents[35]!=Direction.CENTER&&cost%10+cooldowns[35]>9) {
                    if (cost%10>0&&cooldowns[35]<10&&currents[27]==Direction.CENTER) {
                        costs[35] = cooldowns[35]+(cost+9)/10*10;
                        dirs[35] = Direction.SOUTHEAST;
                        wait[35] = true;
                        currented[35] = null;
                        setChecked(35);

                        if (dest[35]) return 35;

                        addToQueue(35);
                    }
                    int currentTile = moveWithCurrent(35);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[35];
                        dirs[currentTile] = currents[35];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[35] = cost + cooldowns[35];
                    dirs[35] = Direction.SOUTHEAST;
                    currented[35] = null;
                    wait[35] = false;
                    setChecked(35);

                    if (dest[35]) return 35;

                    addToQueue(35);
                }
            }
            if(toCheck26){//debugPoint(26, rc);
                if(currents[26]!=Direction.CENTER&&cost%10+cooldowns[26]>9) {
                    if (cost%10>0&&cooldowns[26]<10&&currents[27]==Direction.CENTER) {
                        costs[26] = cooldowns[26]+(cost+9)/10*10;
                        dirs[26] = Direction.SOUTH;
                        wait[26] = true;
                        currented[26] = null;
                        setChecked(26);

                        if (dest[26]) return 26;

                        addToQueue(26);
                    }
                    int currentTile = moveWithCurrent(26);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[26];
                        dirs[currentTile] = currents[26];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[26] = cost + cooldowns[26];
                    dirs[26] = Direction.SOUTH;
                    currented[26] = null;
                    wait[26] = false;
                    setChecked(26);

                    if (dest[26]) return 26;

                    addToQueue(26);
                }
            }
            if(toCheck17){//debugPoint(17, rc);
                if(currents[17]!=Direction.CENTER&&cost%10+cooldowns[17]>9) {
                    if (cost%10>0&&cooldowns[17]<10&&currents[27]==Direction.CENTER) {
                        costs[17] = cooldowns[17]+(cost+9)/10*10;
                        dirs[17] = Direction.SOUTHWEST;
                        wait[17] = true;
                        currented[17] = null;
                        setChecked(17);

                        if (dest[17]) return 17;

                        addToQueue(17);
                    }
                    int currentTile = moveWithCurrent(17);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[17];
                        dirs[currentTile] = currents[17];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[17] = cost + cooldowns[17];
                    dirs[17] = Direction.SOUTHWEST;
                    currented[17] = null;
                    wait[17] = false;
                    setChecked(17);

                    if (dest[17]) return 17;

                    addToQueue(17);
                }
            }
            break;case 28:
        cost=costs[28];if(toCheck19){//debugPoint(19, rc);
                if(currents[19]!=Direction.CENTER&&cost%10+cooldowns[19]>9) {
                    if (cost%10>0&&cooldowns[19]<10&&currents[28]==Direction.CENTER) {
                        costs[19] = cooldowns[19]+(cost+9)/10*10;
                        dirs[19] = Direction.WEST;
                        wait[19] = true;
                        currented[19] = null;
                        setChecked(19);

                        if (dest[19]) return 19;

                        addToQueue(19);
                    }
                    int currentTile = moveWithCurrent(19);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[19];
                        dirs[currentTile] = currents[19];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[19] = cost + cooldowns[19];
                    dirs[19] = Direction.WEST;
                    currented[19] = null;
                    wait[19] = false;
                    setChecked(19);

                    if (dest[19]) return 19;

                    addToQueue(19);
                }
            }
            if(toCheck20){//debugPoint(20, rc);
                if(currents[20]!=Direction.CENTER&&cost%10+cooldowns[20]>9) {
                    if (cost%10>0&&cooldowns[20]<10&&currents[28]==Direction.CENTER) {
                        costs[20] = cooldowns[20]+(cost+9)/10*10;
                        dirs[20] = Direction.NORTHWEST;
                        wait[20] = true;
                        currented[20] = null;
                        setChecked(20);

                        if (dest[20]) return 20;

                        addToQueue(20);
                    }
                    int currentTile = moveWithCurrent(20);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[20];
                        dirs[currentTile] = currents[20];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[20] = cost + cooldowns[20];
                    dirs[20] = Direction.NORTHWEST;
                    currented[20] = null;
                    wait[20] = false;
                    setChecked(20);

                    if (dest[20]) return 20;

                    addToQueue(20);
                }
            }
            if(toCheck29){//debugPoint(29, rc);
                if(currents[29]!=Direction.CENTER&&cost%10+cooldowns[29]>9) {
                    if (cost%10>0&&cooldowns[29]<10&&currents[28]==Direction.CENTER) {
                        costs[29] = cooldowns[29]+(cost+9)/10*10;
                        dirs[29] = Direction.NORTH;
                        wait[29] = true;
                        currented[29] = null;
                        setChecked(29);

                        if (dest[29]) return 29;

                        addToQueue(29);
                    }
                    int currentTile = moveWithCurrent(29);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[29];
                        dirs[currentTile] = currents[29];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[29] = cost + cooldowns[29];
                    dirs[29] = Direction.NORTH;
                    currented[29] = null;
                    wait[29] = false;
                    setChecked(29);

                    if (dest[29]) return 29;

                    addToQueue(29);
                }
            }
            if(toCheck38){//debugPoint(38, rc);
                if(currents[38]!=Direction.CENTER&&cost%10+cooldowns[38]>9) {
                    if (cost%10>0&&cooldowns[38]<10&&currents[28]==Direction.CENTER) {
                        costs[38] = cooldowns[38]+(cost+9)/10*10;
                        dirs[38] = Direction.NORTHEAST;
                        wait[38] = true;
                        currented[38] = null;
                        setChecked(38);

                        if (dest[38]) return 38;

                        addToQueue(38);
                    }
                    int currentTile = moveWithCurrent(38);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[38];
                        dirs[currentTile] = currents[38];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[38] = cost + cooldowns[38];
                    dirs[38] = Direction.NORTHEAST;
                    currented[38] = null;
                    wait[38] = false;
                    setChecked(38);

                    if (dest[38]) return 38;

                    addToQueue(38);
                }
            }
            if(toCheck37){//debugPoint(37, rc);
                if(currents[37]!=Direction.CENTER&&cost%10+cooldowns[37]>9) {
                    if (cost%10>0&&cooldowns[37]<10&&currents[28]==Direction.CENTER) {
                        costs[37] = cooldowns[37]+(cost+9)/10*10;
                        dirs[37] = Direction.EAST;
                        wait[37] = true;
                        currented[37] = null;
                        setChecked(37);

                        if (dest[37]) return 37;

                        addToQueue(37);
                    }
                    int currentTile = moveWithCurrent(37);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[37];
                        dirs[currentTile] = currents[37];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[37] = cost + cooldowns[37];
                    dirs[37] = Direction.EAST;
                    currented[37] = null;
                    wait[37] = false;
                    setChecked(37);

                    if (dest[37]) return 37;

                    addToQueue(37);
                }
            }
            if(toCheck36){//debugPoint(36, rc);
                if(currents[36]!=Direction.CENTER&&cost%10+cooldowns[36]>9) {
                    if (cost%10>0&&cooldowns[36]<10&&currents[28]==Direction.CENTER) {
                        costs[36] = cooldowns[36]+(cost+9)/10*10;
                        dirs[36] = Direction.SOUTHEAST;
                        wait[36] = true;
                        currented[36] = null;
                        setChecked(36);

                        if (dest[36]) return 36;

                        addToQueue(36);
                    }
                    int currentTile = moveWithCurrent(36);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[36];
                        dirs[currentTile] = currents[36];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[36] = cost + cooldowns[36];
                    dirs[36] = Direction.SOUTHEAST;
                    currented[36] = null;
                    wait[36] = false;
                    setChecked(36);

                    if (dest[36]) return 36;

                    addToQueue(36);
                }
            }
            if(toCheck27){//debugPoint(27, rc);
                if(currents[27]!=Direction.CENTER&&cost%10+cooldowns[27]>9) {
                    if (cost%10>0&&cooldowns[27]<10&&currents[28]==Direction.CENTER) {
                        costs[27] = cooldowns[27]+(cost+9)/10*10;
                        dirs[27] = Direction.SOUTH;
                        wait[27] = true;
                        currented[27] = null;
                        setChecked(27);

                        if (dest[27]) return 27;

                        addToQueue(27);
                    }
                    int currentTile = moveWithCurrent(27);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[27];
                        dirs[currentTile] = currents[27];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[27] = cost + cooldowns[27];
                    dirs[27] = Direction.SOUTH;
                    currented[27] = null;
                    wait[27] = false;
                    setChecked(27);

                    if (dest[27]) return 27;

                    addToQueue(27);
                }
            }
            if(toCheck18){//debugPoint(18, rc);
                if(currents[18]!=Direction.CENTER&&cost%10+cooldowns[18]>9) {
                    if (cost%10>0&&cooldowns[18]<10&&currents[28]==Direction.CENTER) {
                        costs[18] = cooldowns[18]+(cost+9)/10*10;
                        dirs[18] = Direction.SOUTHWEST;
                        wait[18] = true;
                        currented[18] = null;
                        setChecked(18);

                        if (dest[18]) return 18;

                        addToQueue(18);
                    }
                    int currentTile = moveWithCurrent(18);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[18];
                        dirs[currentTile] = currents[18];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[18] = cost + cooldowns[18];
                    dirs[18] = Direction.SOUTHWEST;
                    currented[18] = null;
                    wait[18] = false;
                    setChecked(18);

                    if (dest[18]) return 18;

                    addToQueue(18);
                }
            }
            break;case 29:
        cost=costs[29];if(toCheck20){//debugPoint(20, rc);
                if(currents[20]!=Direction.CENTER&&cost%10+cooldowns[20]>9) {
                    if (cost%10>0&&cooldowns[20]<10&&currents[29]==Direction.CENTER) {
                        costs[20] = cooldowns[20]+(cost+9)/10*10;
                        dirs[20] = Direction.WEST;
                        wait[20] = true;
                        currented[20] = null;
                        setChecked(20);

                        if (dest[20]) return 20;

                        addToQueue(20);
                    }
                    int currentTile = moveWithCurrent(20);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[20];
                        dirs[currentTile] = currents[20];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[20] = cost + cooldowns[20];
                    dirs[20] = Direction.WEST;
                    currented[20] = null;
                    wait[20] = false;
                    setChecked(20);

                    if (dest[20]) return 20;

                    addToQueue(20);
                }
            }
            if(toCheck38){//debugPoint(38, rc);
                if(currents[38]!=Direction.CENTER&&cost%10+cooldowns[38]>9) {
                    if (cost%10>0&&cooldowns[38]<10&&currents[29]==Direction.CENTER) {
                        costs[38] = cooldowns[38]+(cost+9)/10*10;
                        dirs[38] = Direction.EAST;
                        wait[38] = true;
                        currented[38] = null;
                        setChecked(38);

                        if (dest[38]) return 38;

                        addToQueue(38);
                    }
                    int currentTile = moveWithCurrent(38);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[38];
                        dirs[currentTile] = currents[38];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[38] = cost + cooldowns[38];
                    dirs[38] = Direction.EAST;
                    currented[38] = null;
                    wait[38] = false;
                    setChecked(38);

                    if (dest[38]) return 38;

                    addToQueue(38);
                }
            }
            if(toCheck37){//debugPoint(37, rc);
                if(currents[37]!=Direction.CENTER&&cost%10+cooldowns[37]>9) {
                    if (cost%10>0&&cooldowns[37]<10&&currents[29]==Direction.CENTER) {
                        costs[37] = cooldowns[37]+(cost+9)/10*10;
                        dirs[37] = Direction.SOUTHEAST;
                        wait[37] = true;
                        currented[37] = null;
                        setChecked(37);

                        if (dest[37]) return 37;

                        addToQueue(37);
                    }
                    int currentTile = moveWithCurrent(37);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[37];
                        dirs[currentTile] = currents[37];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[37] = cost + cooldowns[37];
                    dirs[37] = Direction.SOUTHEAST;
                    currented[37] = null;
                    wait[37] = false;
                    setChecked(37);

                    if (dest[37]) return 37;

                    addToQueue(37);
                }
            }
            if(toCheck28){//debugPoint(28, rc);
                if(currents[28]!=Direction.CENTER&&cost%10+cooldowns[28]>9) {
                    if (cost%10>0&&cooldowns[28]<10&&currents[29]==Direction.CENTER) {
                        costs[28] = cooldowns[28]+(cost+9)/10*10;
                        dirs[28] = Direction.SOUTH;
                        wait[28] = true;
                        currented[28] = null;
                        setChecked(28);

                        if (dest[28]) return 28;

                        addToQueue(28);
                    }
                    int currentTile = moveWithCurrent(28);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[28];
                        dirs[currentTile] = currents[28];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[28] = cost + cooldowns[28];
                    dirs[28] = Direction.SOUTH;
                    currented[28] = null;
                    wait[28] = false;
                    setChecked(28);

                    if (dest[28]) return 28;

                    addToQueue(28);
                }
            }
            if(toCheck19){//debugPoint(19, rc);
                if(currents[19]!=Direction.CENTER&&cost%10+cooldowns[19]>9) {
                    if (cost%10>0&&cooldowns[19]<10&&currents[29]==Direction.CENTER) {
                        costs[19] = cooldowns[19]+(cost+9)/10*10;
                        dirs[19] = Direction.SOUTHWEST;
                        wait[19] = true;
                        currented[19] = null;
                        setChecked(19);

                        if (dest[19]) return 19;

                        addToQueue(19);
                    }
                    int currentTile = moveWithCurrent(19);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[19];
                        dirs[currentTile] = currents[19];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[19] = cost + cooldowns[19];
                    dirs[19] = Direction.SOUTHWEST;
                    currented[19] = null;
                    wait[19] = false;
                    setChecked(19);

                    if (dest[19]) return 19;

                    addToQueue(19);
                }
            }
            break;case 30:
        cost=costs[30];if(toCheck21){//debugPoint(21, rc);
                if(currents[21]!=Direction.CENTER&&cost%10+cooldowns[21]>9) {
                    if (cost%10>0&&cooldowns[21]<10&&currents[30]==Direction.CENTER) {
                        costs[21] = cooldowns[21]+(cost+9)/10*10;
                        dirs[21] = Direction.WEST;
                        wait[21] = true;
                        currented[21] = null;
                        setChecked(21);

                        if (dest[21]) return 21;

                        addToQueue(21);
                    }
                    int currentTile = moveWithCurrent(21);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[21];
                        dirs[currentTile] = currents[21];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[21] = cost + cooldowns[21];
                    dirs[21] = Direction.WEST;
                    currented[21] = null;
                    wait[21] = false;
                    setChecked(21);

                    if (dest[21]) return 21;

                    addToQueue(21);
                }
            }
            if(toCheck22){//debugPoint(22, rc);
                if(currents[22]!=Direction.CENTER&&cost%10+cooldowns[22]>9) {
                    if (cost%10>0&&cooldowns[22]<10&&currents[30]==Direction.CENTER) {
                        costs[22] = cooldowns[22]+(cost+9)/10*10;
                        dirs[22] = Direction.NORTHWEST;
                        wait[22] = true;
                        currented[22] = null;
                        setChecked(22);

                        if (dest[22]) return 22;

                        addToQueue(22);
                    }
                    int currentTile = moveWithCurrent(22);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[22];
                        dirs[currentTile] = currents[22];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[22] = cost + cooldowns[22];
                    dirs[22] = Direction.NORTHWEST;
                    currented[22] = null;
                    wait[22] = false;
                    setChecked(22);

                    if (dest[22]) return 22;

                    addToQueue(22);
                }
            }
            if(toCheck31){//debugPoint(31, rc);
                if(currents[31]!=Direction.CENTER&&cost%10+cooldowns[31]>9) {
                    if (cost%10>0&&cooldowns[31]<10&&currents[30]==Direction.CENTER) {
                        costs[31] = cooldowns[31]+(cost+9)/10*10;
                        dirs[31] = Direction.NORTH;
                        wait[31] = true;
                        currented[31] = null;
                        setChecked(31);

                        if (dest[31]) return 31;

                        addToQueue(31);
                    }
                    int currentTile = moveWithCurrent(31);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[31];
                        dirs[currentTile] = currents[31];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[31] = cost + cooldowns[31];
                    dirs[31] = Direction.NORTH;
                    currented[31] = null;
                    wait[31] = false;
                    setChecked(31);

                    if (dest[31]) return 31;

                    addToQueue(31);
                }
            }
            if(toCheck40){//debugPoint(40, rc);
                if(currents[40]!=Direction.CENTER&&cost%10+cooldowns[40]>9) {
                    if (cost%10>0&&cooldowns[40]<10&&currents[30]==Direction.CENTER) {
                        costs[40] = cooldowns[40]+(cost+9)/10*10;
                        dirs[40] = Direction.NORTHEAST;
                        wait[40] = true;
                        currented[40] = null;
                        setChecked(40);

                        if (dest[40]) return 40;

                        addToQueue(40);
                    }
                    int currentTile = moveWithCurrent(40);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[40];
                        dirs[currentTile] = currents[40];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[40] = cost + cooldowns[40];
                    dirs[40] = Direction.NORTHEAST;
                    currented[40] = null;
                    wait[40] = false;
                    setChecked(40);

                    if (dest[40]) return 40;

                    addToQueue(40);
                }
            }
            if(toCheck39){//debugPoint(39, rc);
                if(currents[39]!=Direction.CENTER&&cost%10+cooldowns[39]>9) {
                    if (cost%10>0&&cooldowns[39]<10&&currents[30]==Direction.CENTER) {
                        costs[39] = cooldowns[39]+(cost+9)/10*10;
                        dirs[39] = Direction.EAST;
                        wait[39] = true;
                        currented[39] = null;
                        setChecked(39);

                        if (dest[39]) return 39;

                        addToQueue(39);
                    }
                    int currentTile = moveWithCurrent(39);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[39];
                        dirs[currentTile] = currents[39];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[39] = cost + cooldowns[39];
                    dirs[39] = Direction.EAST;
                    currented[39] = null;
                    wait[39] = false;
                    setChecked(39);

                    if (dest[39]) return 39;

                    addToQueue(39);
                }
            }
            break;case 31:
        cost=costs[31];if(toCheck22){//debugPoint(22, rc);
                if(currents[22]!=Direction.CENTER&&cost%10+cooldowns[22]>9) {
                    if (cost%10>0&&cooldowns[22]<10&&currents[31]==Direction.CENTER) {
                        costs[22] = cooldowns[22]+(cost+9)/10*10;
                        dirs[22] = Direction.WEST;
                        wait[22] = true;
                        currented[22] = null;
                        setChecked(22);

                        if (dest[22]) return 22;

                        addToQueue(22);
                    }
                    int currentTile = moveWithCurrent(22);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[22];
                        dirs[currentTile] = currents[22];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[22] = cost + cooldowns[22];
                    dirs[22] = Direction.WEST;
                    currented[22] = null;
                    wait[22] = false;
                    setChecked(22);

                    if (dest[22]) return 22;

                    addToQueue(22);
                }
            }
            if(toCheck23){//debugPoint(23, rc);
                if(currents[23]!=Direction.CENTER&&cost%10+cooldowns[23]>9) {
                    if (cost%10>0&&cooldowns[23]<10&&currents[31]==Direction.CENTER) {
                        costs[23] = cooldowns[23]+(cost+9)/10*10;
                        dirs[23] = Direction.NORTHWEST;
                        wait[23] = true;
                        currented[23] = null;
                        setChecked(23);

                        if (dest[23]) return 23;

                        addToQueue(23);
                    }
                    int currentTile = moveWithCurrent(23);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[23];
                        dirs[currentTile] = currents[23];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[23] = cost + cooldowns[23];
                    dirs[23] = Direction.NORTHWEST;
                    currented[23] = null;
                    wait[23] = false;
                    setChecked(23);

                    if (dest[23]) return 23;

                    addToQueue(23);
                }
            }
            if(toCheck32){//debugPoint(32, rc);
                if(currents[32]!=Direction.CENTER&&cost%10+cooldowns[32]>9) {
                    if (cost%10>0&&cooldowns[32]<10&&currents[31]==Direction.CENTER) {
                        costs[32] = cooldowns[32]+(cost+9)/10*10;
                        dirs[32] = Direction.NORTH;
                        wait[32] = true;
                        currented[32] = null;
                        setChecked(32);

                        if (dest[32]) return 32;

                        addToQueue(32);
                    }
                    int currentTile = moveWithCurrent(32);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[32];
                        dirs[currentTile] = currents[32];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[32] = cost + cooldowns[32];
                    dirs[32] = Direction.NORTH;
                    currented[32] = null;
                    wait[32] = false;
                    setChecked(32);

                    if (dest[32]) return 32;

                    addToQueue(32);
                }
            }
            if(toCheck41){//debugPoint(41, rc);
                if(currents[41]!=Direction.CENTER&&cost%10+cooldowns[41]>9) {
                    if (cost%10>0&&cooldowns[41]<10&&currents[31]==Direction.CENTER) {
                        costs[41] = cooldowns[41]+(cost+9)/10*10;
                        dirs[41] = Direction.NORTHEAST;
                        wait[41] = true;
                        currented[41] = null;
                        setChecked(41);

                        if (dest[41]) return 41;

                        addToQueue(41);
                    }
                    int currentTile = moveWithCurrent(41);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[41];
                        dirs[currentTile] = currents[41];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[41] = cost + cooldowns[41];
                    dirs[41] = Direction.NORTHEAST;
                    currented[41] = null;
                    wait[41] = false;
                    setChecked(41);

                    if (dest[41]) return 41;

                    addToQueue(41);
                }
            }
            if(toCheck40){//debugPoint(40, rc);
                if(currents[40]!=Direction.CENTER&&cost%10+cooldowns[40]>9) {
                    if (cost%10>0&&cooldowns[40]<10&&currents[31]==Direction.CENTER) {
                        costs[40] = cooldowns[40]+(cost+9)/10*10;
                        dirs[40] = Direction.EAST;
                        wait[40] = true;
                        currented[40] = null;
                        setChecked(40);

                        if (dest[40]) return 40;

                        addToQueue(40);
                    }
                    int currentTile = moveWithCurrent(40);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[40];
                        dirs[currentTile] = currents[40];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[40] = cost + cooldowns[40];
                    dirs[40] = Direction.EAST;
                    currented[40] = null;
                    wait[40] = false;
                    setChecked(40);

                    if (dest[40]) return 40;

                    addToQueue(40);
                }
            }
            if(toCheck39){//debugPoint(39, rc);
                if(currents[39]!=Direction.CENTER&&cost%10+cooldowns[39]>9) {
                    if (cost%10>0&&cooldowns[39]<10&&currents[31]==Direction.CENTER) {
                        costs[39] = cooldowns[39]+(cost+9)/10*10;
                        dirs[39] = Direction.SOUTHEAST;
                        wait[39] = true;
                        currented[39] = null;
                        setChecked(39);

                        if (dest[39]) return 39;

                        addToQueue(39);
                    }
                    int currentTile = moveWithCurrent(39);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[39];
                        dirs[currentTile] = currents[39];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[39] = cost + cooldowns[39];
                    dirs[39] = Direction.SOUTHEAST;
                    currented[39] = null;
                    wait[39] = false;
                    setChecked(39);

                    if (dest[39]) return 39;

                    addToQueue(39);
                }
            }
            if(toCheck30){//debugPoint(30, rc);
                if(currents[30]!=Direction.CENTER&&cost%10+cooldowns[30]>9) {
                    if (cost%10>0&&cooldowns[30]<10&&currents[31]==Direction.CENTER) {
                        costs[30] = cooldowns[30]+(cost+9)/10*10;
                        dirs[30] = Direction.SOUTH;
                        wait[30] = true;
                        currented[30] = null;
                        setChecked(30);

                        if (dest[30]) return 30;

                        addToQueue(30);
                    }
                    int currentTile = moveWithCurrent(30);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[30];
                        dirs[currentTile] = currents[30];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[30] = cost + cooldowns[30];
                    dirs[30] = Direction.SOUTH;
                    currented[30] = null;
                    wait[30] = false;
                    setChecked(30);

                    if (dest[30]) return 30;

                    addToQueue(30);
                }
            }
            if(toCheck21){//debugPoint(21, rc);
                if(currents[21]!=Direction.CENTER&&cost%10+cooldowns[21]>9) {
                    if (cost%10>0&&cooldowns[21]<10&&currents[31]==Direction.CENTER) {
                        costs[21] = cooldowns[21]+(cost+9)/10*10;
                        dirs[21] = Direction.SOUTHWEST;
                        wait[21] = true;
                        currented[21] = null;
                        setChecked(21);

                        if (dest[21]) return 21;

                        addToQueue(21);
                    }
                    int currentTile = moveWithCurrent(21);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[21];
                        dirs[currentTile] = currents[21];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[21] = cost + cooldowns[21];
                    dirs[21] = Direction.SOUTHWEST;
                    currented[21] = null;
                    wait[21] = false;
                    setChecked(21);

                    if (dest[21]) return 21;

                    addToQueue(21);
                }
            }
            break;case 32:
        cost=costs[32];if(toCheck23){//debugPoint(23, rc);
                if(currents[23]!=Direction.CENTER&&cost%10+cooldowns[23]>9) {
                    if (cost%10>0&&cooldowns[23]<10&&currents[32]==Direction.CENTER) {
                        costs[23] = cooldowns[23]+(cost+9)/10*10;
                        dirs[23] = Direction.WEST;
                        wait[23] = true;
                        currented[23] = null;
                        setChecked(23);

                        if (dest[23]) return 23;

                        addToQueue(23);
                    }
                    int currentTile = moveWithCurrent(23);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[23];
                        dirs[currentTile] = currents[23];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[23] = cost + cooldowns[23];
                    dirs[23] = Direction.WEST;
                    currented[23] = null;
                    wait[23] = false;
                    setChecked(23);

                    if (dest[23]) return 23;

                    addToQueue(23);
                }
            }
            if(toCheck24){//debugPoint(24, rc);
                if(currents[24]!=Direction.CENTER&&cost%10+cooldowns[24]>9) {
                    if (cost%10>0&&cooldowns[24]<10&&currents[32]==Direction.CENTER) {
                        costs[24] = cooldowns[24]+(cost+9)/10*10;
                        dirs[24] = Direction.NORTHWEST;
                        wait[24] = true;
                        currented[24] = null;
                        setChecked(24);

                        if (dest[24]) return 24;

                        addToQueue(24);
                    }
                    int currentTile = moveWithCurrent(24);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[24];
                        dirs[currentTile] = currents[24];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[24] = cost + cooldowns[24];
                    dirs[24] = Direction.NORTHWEST;
                    currented[24] = null;
                    wait[24] = false;
                    setChecked(24);

                    if (dest[24]) return 24;

                    addToQueue(24);
                }
            }
            if(toCheck33){//debugPoint(33, rc);
                if(currents[33]!=Direction.CENTER&&cost%10+cooldowns[33]>9) {
                    if (cost%10>0&&cooldowns[33]<10&&currents[32]==Direction.CENTER) {
                        costs[33] = cooldowns[33]+(cost+9)/10*10;
                        dirs[33] = Direction.NORTH;
                        wait[33] = true;
                        currented[33] = null;
                        setChecked(33);

                        if (dest[33]) return 33;

                        addToQueue(33);
                    }
                    int currentTile = moveWithCurrent(33);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[33];
                        dirs[currentTile] = currents[33];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[33] = cost + cooldowns[33];
                    dirs[33] = Direction.NORTH;
                    currented[33] = null;
                    wait[33] = false;
                    setChecked(33);

                    if (dest[33]) return 33;

                    addToQueue(33);
                }
            }
            if(toCheck42){//debugPoint(42, rc);
                if(currents[42]!=Direction.CENTER&&cost%10+cooldowns[42]>9) {
                    if (cost%10>0&&cooldowns[42]<10&&currents[32]==Direction.CENTER) {
                        costs[42] = cooldowns[42]+(cost+9)/10*10;
                        dirs[42] = Direction.NORTHEAST;
                        wait[42] = true;
                        currented[42] = null;
                        setChecked(42);

                        if (dest[42]) return 42;

                        addToQueue(42);
                    }
                    int currentTile = moveWithCurrent(42);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[42];
                        dirs[currentTile] = currents[42];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[42] = cost + cooldowns[42];
                    dirs[42] = Direction.NORTHEAST;
                    currented[42] = null;
                    wait[42] = false;
                    setChecked(42);

                    if (dest[42]) return 42;

                    addToQueue(42);
                }
            }
            if(toCheck41){//debugPoint(41, rc);
                if(currents[41]!=Direction.CENTER&&cost%10+cooldowns[41]>9) {
                    if (cost%10>0&&cooldowns[41]<10&&currents[32]==Direction.CENTER) {
                        costs[41] = cooldowns[41]+(cost+9)/10*10;
                        dirs[41] = Direction.EAST;
                        wait[41] = true;
                        currented[41] = null;
                        setChecked(41);

                        if (dest[41]) return 41;

                        addToQueue(41);
                    }
                    int currentTile = moveWithCurrent(41);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[41];
                        dirs[currentTile] = currents[41];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[41] = cost + cooldowns[41];
                    dirs[41] = Direction.EAST;
                    currented[41] = null;
                    wait[41] = false;
                    setChecked(41);

                    if (dest[41]) return 41;

                    addToQueue(41);
                }
            }
            if(toCheck40){//debugPoint(40, rc);
                if(currents[40]!=Direction.CENTER&&cost%10+cooldowns[40]>9) {
                    if (cost%10>0&&cooldowns[40]<10&&currents[32]==Direction.CENTER) {
                        costs[40] = cooldowns[40]+(cost+9)/10*10;
                        dirs[40] = Direction.SOUTHEAST;
                        wait[40] = true;
                        currented[40] = null;
                        setChecked(40);

                        if (dest[40]) return 40;

                        addToQueue(40);
                    }
                    int currentTile = moveWithCurrent(40);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[40];
                        dirs[currentTile] = currents[40];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[40] = cost + cooldowns[40];
                    dirs[40] = Direction.SOUTHEAST;
                    currented[40] = null;
                    wait[40] = false;
                    setChecked(40);

                    if (dest[40]) return 40;

                    addToQueue(40);
                }
            }
            if(toCheck31){//debugPoint(31, rc);
                if(currents[31]!=Direction.CENTER&&cost%10+cooldowns[31]>9) {
                    if (cost%10>0&&cooldowns[31]<10&&currents[32]==Direction.CENTER) {
                        costs[31] = cooldowns[31]+(cost+9)/10*10;
                        dirs[31] = Direction.SOUTH;
                        wait[31] = true;
                        currented[31] = null;
                        setChecked(31);

                        if (dest[31]) return 31;

                        addToQueue(31);
                    }
                    int currentTile = moveWithCurrent(31);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[31];
                        dirs[currentTile] = currents[31];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[31] = cost + cooldowns[31];
                    dirs[31] = Direction.SOUTH;
                    currented[31] = null;
                    wait[31] = false;
                    setChecked(31);

                    if (dest[31]) return 31;

                    addToQueue(31);
                }
            }
            if(toCheck22){//debugPoint(22, rc);
                if(currents[22]!=Direction.CENTER&&cost%10+cooldowns[22]>9) {
                    if (cost%10>0&&cooldowns[22]<10&&currents[32]==Direction.CENTER) {
                        costs[22] = cooldowns[22]+(cost+9)/10*10;
                        dirs[22] = Direction.SOUTHWEST;
                        wait[22] = true;
                        currented[22] = null;
                        setChecked(22);

                        if (dest[22]) return 22;

                        addToQueue(22);
                    }
                    int currentTile = moveWithCurrent(22);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[22];
                        dirs[currentTile] = currents[22];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[22] = cost + cooldowns[22];
                    dirs[22] = Direction.SOUTHWEST;
                    currented[22] = null;
                    wait[22] = false;
                    setChecked(22);

                    if (dest[22]) return 22;

                    addToQueue(22);
                }
            }
            break;case 33:
        cost=costs[33];if(toCheck24){//debugPoint(24, rc);
                if(currents[24]!=Direction.CENTER&&cost%10+cooldowns[24]>9) {
                    if (cost%10>0&&cooldowns[24]<10&&currents[33]==Direction.CENTER) {
                        costs[24] = cooldowns[24]+(cost+9)/10*10;
                        dirs[24] = Direction.WEST;
                        wait[24] = true;
                        currented[24] = null;
                        setChecked(24);

                        if (dest[24]) return 24;

                        addToQueue(24);
                    }
                    int currentTile = moveWithCurrent(24);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[24];
                        dirs[currentTile] = currents[24];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[24] = cost + cooldowns[24];
                    dirs[24] = Direction.WEST;
                    currented[24] = null;
                    wait[24] = false;
                    setChecked(24);

                    if (dest[24]) return 24;

                    addToQueue(24);
                }
            }
            if(toCheck25){//debugPoint(25, rc);
                if(currents[25]!=Direction.CENTER&&cost%10+cooldowns[25]>9) {
                    if (cost%10>0&&cooldowns[25]<10&&currents[33]==Direction.CENTER) {
                        costs[25] = cooldowns[25]+(cost+9)/10*10;
                        dirs[25] = Direction.NORTHWEST;
                        wait[25] = true;
                        currented[25] = null;
                        setChecked(25);

                        if (dest[25]) return 25;

                        addToQueue(25);
                    }
                    int currentTile = moveWithCurrent(25);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[25];
                        dirs[currentTile] = currents[25];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[25] = cost + cooldowns[25];
                    dirs[25] = Direction.NORTHWEST;
                    currented[25] = null;
                    wait[25] = false;
                    setChecked(25);

                    if (dest[25]) return 25;

                    addToQueue(25);
                }
            }
            if(toCheck34){//debugPoint(34, rc);
                if(currents[34]!=Direction.CENTER&&cost%10+cooldowns[34]>9) {
                    if (cost%10>0&&cooldowns[34]<10&&currents[33]==Direction.CENTER) {
                        costs[34] = cooldowns[34]+(cost+9)/10*10;
                        dirs[34] = Direction.NORTH;
                        wait[34] = true;
                        currented[34] = null;
                        setChecked(34);

                        if (dest[34]) return 34;

                        addToQueue(34);
                    }
                    int currentTile = moveWithCurrent(34);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[34];
                        dirs[currentTile] = currents[34];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[34] = cost + cooldowns[34];
                    dirs[34] = Direction.NORTH;
                    currented[34] = null;
                    wait[34] = false;
                    setChecked(34);

                    if (dest[34]) return 34;

                    addToQueue(34);
                }
            }
            if(toCheck43){//debugPoint(43, rc);
                if(currents[43]!=Direction.CENTER&&cost%10+cooldowns[43]>9) {
                    if (cost%10>0&&cooldowns[43]<10&&currents[33]==Direction.CENTER) {
                        costs[43] = cooldowns[43]+(cost+9)/10*10;
                        dirs[43] = Direction.NORTHEAST;
                        wait[43] = true;
                        currented[43] = null;
                        setChecked(43);

                        if (dest[43]) return 43;

                        addToQueue(43);
                    }
                    int currentTile = moveWithCurrent(43);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[43];
                        dirs[currentTile] = currents[43];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[43] = cost + cooldowns[43];
                    dirs[43] = Direction.NORTHEAST;
                    currented[43] = null;
                    wait[43] = false;
                    setChecked(43);

                    if (dest[43]) return 43;

                    addToQueue(43);
                }
            }
            if(toCheck42){//debugPoint(42, rc);
                if(currents[42]!=Direction.CENTER&&cost%10+cooldowns[42]>9) {
                    if (cost%10>0&&cooldowns[42]<10&&currents[33]==Direction.CENTER) {
                        costs[42] = cooldowns[42]+(cost+9)/10*10;
                        dirs[42] = Direction.EAST;
                        wait[42] = true;
                        currented[42] = null;
                        setChecked(42);

                        if (dest[42]) return 42;

                        addToQueue(42);
                    }
                    int currentTile = moveWithCurrent(42);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[42];
                        dirs[currentTile] = currents[42];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[42] = cost + cooldowns[42];
                    dirs[42] = Direction.EAST;
                    currented[42] = null;
                    wait[42] = false;
                    setChecked(42);

                    if (dest[42]) return 42;

                    addToQueue(42);
                }
            }
            if(toCheck41){//debugPoint(41, rc);
                if(currents[41]!=Direction.CENTER&&cost%10+cooldowns[41]>9) {
                    if (cost%10>0&&cooldowns[41]<10&&currents[33]==Direction.CENTER) {
                        costs[41] = cooldowns[41]+(cost+9)/10*10;
                        dirs[41] = Direction.SOUTHEAST;
                        wait[41] = true;
                        currented[41] = null;
                        setChecked(41);

                        if (dest[41]) return 41;

                        addToQueue(41);
                    }
                    int currentTile = moveWithCurrent(41);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[41];
                        dirs[currentTile] = currents[41];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[41] = cost + cooldowns[41];
                    dirs[41] = Direction.SOUTHEAST;
                    currented[41] = null;
                    wait[41] = false;
                    setChecked(41);

                    if (dest[41]) return 41;

                    addToQueue(41);
                }
            }
            if(toCheck32){//debugPoint(32, rc);
                if(currents[32]!=Direction.CENTER&&cost%10+cooldowns[32]>9) {
                    if (cost%10>0&&cooldowns[32]<10&&currents[33]==Direction.CENTER) {
                        costs[32] = cooldowns[32]+(cost+9)/10*10;
                        dirs[32] = Direction.SOUTH;
                        wait[32] = true;
                        currented[32] = null;
                        setChecked(32);

                        if (dest[32]) return 32;

                        addToQueue(32);
                    }
                    int currentTile = moveWithCurrent(32);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[32];
                        dirs[currentTile] = currents[32];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[32] = cost + cooldowns[32];
                    dirs[32] = Direction.SOUTH;
                    currented[32] = null;
                    wait[32] = false;
                    setChecked(32);

                    if (dest[32]) return 32;

                    addToQueue(32);
                }
            }
            if(toCheck23){//debugPoint(23, rc);
                if(currents[23]!=Direction.CENTER&&cost%10+cooldowns[23]>9) {
                    if (cost%10>0&&cooldowns[23]<10&&currents[33]==Direction.CENTER) {
                        costs[23] = cooldowns[23]+(cost+9)/10*10;
                        dirs[23] = Direction.SOUTHWEST;
                        wait[23] = true;
                        currented[23] = null;
                        setChecked(23);

                        if (dest[23]) return 23;

                        addToQueue(23);
                    }
                    int currentTile = moveWithCurrent(23);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[23];
                        dirs[currentTile] = currents[23];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[23] = cost + cooldowns[23];
                    dirs[23] = Direction.SOUTHWEST;
                    currented[23] = null;
                    wait[23] = false;
                    setChecked(23);

                    if (dest[23]) return 23;

                    addToQueue(23);
                }
            }
            break;case 34:
        cost=costs[34];if(toCheck25){//debugPoint(25, rc);
                if(currents[25]!=Direction.CENTER&&cost%10+cooldowns[25]>9) {
                    if (cost%10>0&&cooldowns[25]<10&&currents[34]==Direction.CENTER) {
                        costs[25] = cooldowns[25]+(cost+9)/10*10;
                        dirs[25] = Direction.WEST;
                        wait[25] = true;
                        currented[25] = null;
                        setChecked(25);

                        if (dest[25]) return 25;

                        addToQueue(25);
                    }
                    int currentTile = moveWithCurrent(25);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[25];
                        dirs[currentTile] = currents[25];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[25] = cost + cooldowns[25];
                    dirs[25] = Direction.WEST;
                    currented[25] = null;
                    wait[25] = false;
                    setChecked(25);

                    if (dest[25]) return 25;

                    addToQueue(25);
                }
            }
            if(toCheck26){//debugPoint(26, rc);
                if(currents[26]!=Direction.CENTER&&cost%10+cooldowns[26]>9) {
                    if (cost%10>0&&cooldowns[26]<10&&currents[34]==Direction.CENTER) {
                        costs[26] = cooldowns[26]+(cost+9)/10*10;
                        dirs[26] = Direction.NORTHWEST;
                        wait[26] = true;
                        currented[26] = null;
                        setChecked(26);

                        if (dest[26]) return 26;

                        addToQueue(26);
                    }
                    int currentTile = moveWithCurrent(26);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[26];
                        dirs[currentTile] = currents[26];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[26] = cost + cooldowns[26];
                    dirs[26] = Direction.NORTHWEST;
                    currented[26] = null;
                    wait[26] = false;
                    setChecked(26);

                    if (dest[26]) return 26;

                    addToQueue(26);
                }
            }
            if(toCheck35){//debugPoint(35, rc);
                if(currents[35]!=Direction.CENTER&&cost%10+cooldowns[35]>9) {
                    if (cost%10>0&&cooldowns[35]<10&&currents[34]==Direction.CENTER) {
                        costs[35] = cooldowns[35]+(cost+9)/10*10;
                        dirs[35] = Direction.NORTH;
                        wait[35] = true;
                        currented[35] = null;
                        setChecked(35);

                        if (dest[35]) return 35;

                        addToQueue(35);
                    }
                    int currentTile = moveWithCurrent(35);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[35];
                        dirs[currentTile] = currents[35];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[35] = cost + cooldowns[35];
                    dirs[35] = Direction.NORTH;
                    currented[35] = null;
                    wait[35] = false;
                    setChecked(35);

                    if (dest[35]) return 35;

                    addToQueue(35);
                }
            }
            if(toCheck44){//debugPoint(44, rc);
                if(currents[44]!=Direction.CENTER&&cost%10+cooldowns[44]>9) {
                    if (cost%10>0&&cooldowns[44]<10&&currents[34]==Direction.CENTER) {
                        costs[44] = cooldowns[44]+(cost+9)/10*10;
                        dirs[44] = Direction.NORTHEAST;
                        wait[44] = true;
                        currented[44] = null;
                        setChecked(44);

                        if (dest[44]) return 44;

                        addToQueue(44);
                    }
                    int currentTile = moveWithCurrent(44);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[44];
                        dirs[currentTile] = currents[44];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[44] = cost + cooldowns[44];
                    dirs[44] = Direction.NORTHEAST;
                    currented[44] = null;
                    wait[44] = false;
                    setChecked(44);

                    if (dest[44]) return 44;

                    addToQueue(44);
                }
            }
            if(toCheck43){//debugPoint(43, rc);
                if(currents[43]!=Direction.CENTER&&cost%10+cooldowns[43]>9) {
                    if (cost%10>0&&cooldowns[43]<10&&currents[34]==Direction.CENTER) {
                        costs[43] = cooldowns[43]+(cost+9)/10*10;
                        dirs[43] = Direction.EAST;
                        wait[43] = true;
                        currented[43] = null;
                        setChecked(43);

                        if (dest[43]) return 43;

                        addToQueue(43);
                    }
                    int currentTile = moveWithCurrent(43);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[43];
                        dirs[currentTile] = currents[43];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[43] = cost + cooldowns[43];
                    dirs[43] = Direction.EAST;
                    currented[43] = null;
                    wait[43] = false;
                    setChecked(43);

                    if (dest[43]) return 43;

                    addToQueue(43);
                }
            }
            if(toCheck42){//debugPoint(42, rc);
                if(currents[42]!=Direction.CENTER&&cost%10+cooldowns[42]>9) {
                    if (cost%10>0&&cooldowns[42]<10&&currents[34]==Direction.CENTER) {
                        costs[42] = cooldowns[42]+(cost+9)/10*10;
                        dirs[42] = Direction.SOUTHEAST;
                        wait[42] = true;
                        currented[42] = null;
                        setChecked(42);

                        if (dest[42]) return 42;

                        addToQueue(42);
                    }
                    int currentTile = moveWithCurrent(42);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[42];
                        dirs[currentTile] = currents[42];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[42] = cost + cooldowns[42];
                    dirs[42] = Direction.SOUTHEAST;
                    currented[42] = null;
                    wait[42] = false;
                    setChecked(42);

                    if (dest[42]) return 42;

                    addToQueue(42);
                }
            }
            if(toCheck33){//debugPoint(33, rc);
                if(currents[33]!=Direction.CENTER&&cost%10+cooldowns[33]>9) {
                    if (cost%10>0&&cooldowns[33]<10&&currents[34]==Direction.CENTER) {
                        costs[33] = cooldowns[33]+(cost+9)/10*10;
                        dirs[33] = Direction.SOUTH;
                        wait[33] = true;
                        currented[33] = null;
                        setChecked(33);

                        if (dest[33]) return 33;

                        addToQueue(33);
                    }
                    int currentTile = moveWithCurrent(33);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[33];
                        dirs[currentTile] = currents[33];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[33] = cost + cooldowns[33];
                    dirs[33] = Direction.SOUTH;
                    currented[33] = null;
                    wait[33] = false;
                    setChecked(33);

                    if (dest[33]) return 33;

                    addToQueue(33);
                }
            }
            if(toCheck24){//debugPoint(24, rc);
                if(currents[24]!=Direction.CENTER&&cost%10+cooldowns[24]>9) {
                    if (cost%10>0&&cooldowns[24]<10&&currents[34]==Direction.CENTER) {
                        costs[24] = cooldowns[24]+(cost+9)/10*10;
                        dirs[24] = Direction.SOUTHWEST;
                        wait[24] = true;
                        currented[24] = null;
                        setChecked(24);

                        if (dest[24]) return 24;

                        addToQueue(24);
                    }
                    int currentTile = moveWithCurrent(24);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[24];
                        dirs[currentTile] = currents[24];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[24] = cost + cooldowns[24];
                    dirs[24] = Direction.SOUTHWEST;
                    currented[24] = null;
                    wait[24] = false;
                    setChecked(24);

                    if (dest[24]) return 24;

                    addToQueue(24);
                }
            }
            break;case 35:
        cost=costs[35];if(toCheck26){//debugPoint(26, rc);
                if(currents[26]!=Direction.CENTER&&cost%10+cooldowns[26]>9) {
                    if (cost%10>0&&cooldowns[26]<10&&currents[35]==Direction.CENTER) {
                        costs[26] = cooldowns[26]+(cost+9)/10*10;
                        dirs[26] = Direction.WEST;
                        wait[26] = true;
                        currented[26] = null;
                        setChecked(26);

                        if (dest[26]) return 26;

                        addToQueue(26);
                    }
                    int currentTile = moveWithCurrent(26);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[26];
                        dirs[currentTile] = currents[26];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[26] = cost + cooldowns[26];
                    dirs[26] = Direction.WEST;
                    currented[26] = null;
                    wait[26] = false;
                    setChecked(26);

                    if (dest[26]) return 26;

                    addToQueue(26);
                }
            }
            if(toCheck27){//debugPoint(27, rc);
                if(currents[27]!=Direction.CENTER&&cost%10+cooldowns[27]>9) {
                    if (cost%10>0&&cooldowns[27]<10&&currents[35]==Direction.CENTER) {
                        costs[27] = cooldowns[27]+(cost+9)/10*10;
                        dirs[27] = Direction.NORTHWEST;
                        wait[27] = true;
                        currented[27] = null;
                        setChecked(27);

                        if (dest[27]) return 27;

                        addToQueue(27);
                    }
                    int currentTile = moveWithCurrent(27);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[27];
                        dirs[currentTile] = currents[27];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[27] = cost + cooldowns[27];
                    dirs[27] = Direction.NORTHWEST;
                    currented[27] = null;
                    wait[27] = false;
                    setChecked(27);

                    if (dest[27]) return 27;

                    addToQueue(27);
                }
            }
            if(toCheck36){//debugPoint(36, rc);
                if(currents[36]!=Direction.CENTER&&cost%10+cooldowns[36]>9) {
                    if (cost%10>0&&cooldowns[36]<10&&currents[35]==Direction.CENTER) {
                        costs[36] = cooldowns[36]+(cost+9)/10*10;
                        dirs[36] = Direction.NORTH;
                        wait[36] = true;
                        currented[36] = null;
                        setChecked(36);

                        if (dest[36]) return 36;

                        addToQueue(36);
                    }
                    int currentTile = moveWithCurrent(36);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[36];
                        dirs[currentTile] = currents[36];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[36] = cost + cooldowns[36];
                    dirs[36] = Direction.NORTH;
                    currented[36] = null;
                    wait[36] = false;
                    setChecked(36);

                    if (dest[36]) return 36;

                    addToQueue(36);
                }
            }
            if(toCheck45){//debugPoint(45, rc);
                if(currents[45]!=Direction.CENTER&&cost%10+cooldowns[45]>9) {
                    if (cost%10>0&&cooldowns[45]<10&&currents[35]==Direction.CENTER) {
                        costs[45] = cooldowns[45]+(cost+9)/10*10;
                        dirs[45] = Direction.NORTHEAST;
                        wait[45] = true;
                        currented[45] = null;
                        setChecked(45);

                        if (dest[45]) return 45;

                        addToQueue(45);
                    }
                    int currentTile = moveWithCurrent(45);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[45];
                        dirs[currentTile] = currents[45];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[45] = cost + cooldowns[45];
                    dirs[45] = Direction.NORTHEAST;
                    currented[45] = null;
                    wait[45] = false;
                    setChecked(45);

                    if (dest[45]) return 45;

                    addToQueue(45);
                }
            }
            if(toCheck44){//debugPoint(44, rc);
                if(currents[44]!=Direction.CENTER&&cost%10+cooldowns[44]>9) {
                    if (cost%10>0&&cooldowns[44]<10&&currents[35]==Direction.CENTER) {
                        costs[44] = cooldowns[44]+(cost+9)/10*10;
                        dirs[44] = Direction.EAST;
                        wait[44] = true;
                        currented[44] = null;
                        setChecked(44);

                        if (dest[44]) return 44;

                        addToQueue(44);
                    }
                    int currentTile = moveWithCurrent(44);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[44];
                        dirs[currentTile] = currents[44];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[44] = cost + cooldowns[44];
                    dirs[44] = Direction.EAST;
                    currented[44] = null;
                    wait[44] = false;
                    setChecked(44);

                    if (dest[44]) return 44;

                    addToQueue(44);
                }
            }
            if(toCheck43){//debugPoint(43, rc);
                if(currents[43]!=Direction.CENTER&&cost%10+cooldowns[43]>9) {
                    if (cost%10>0&&cooldowns[43]<10&&currents[35]==Direction.CENTER) {
                        costs[43] = cooldowns[43]+(cost+9)/10*10;
                        dirs[43] = Direction.SOUTHEAST;
                        wait[43] = true;
                        currented[43] = null;
                        setChecked(43);

                        if (dest[43]) return 43;

                        addToQueue(43);
                    }
                    int currentTile = moveWithCurrent(43);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[43];
                        dirs[currentTile] = currents[43];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[43] = cost + cooldowns[43];
                    dirs[43] = Direction.SOUTHEAST;
                    currented[43] = null;
                    wait[43] = false;
                    setChecked(43);

                    if (dest[43]) return 43;

                    addToQueue(43);
                }
            }
            if(toCheck34){//debugPoint(34, rc);
                if(currents[34]!=Direction.CENTER&&cost%10+cooldowns[34]>9) {
                    if (cost%10>0&&cooldowns[34]<10&&currents[35]==Direction.CENTER) {
                        costs[34] = cooldowns[34]+(cost+9)/10*10;
                        dirs[34] = Direction.SOUTH;
                        wait[34] = true;
                        currented[34] = null;
                        setChecked(34);

                        if (dest[34]) return 34;

                        addToQueue(34);
                    }
                    int currentTile = moveWithCurrent(34);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[34];
                        dirs[currentTile] = currents[34];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[34] = cost + cooldowns[34];
                    dirs[34] = Direction.SOUTH;
                    currented[34] = null;
                    wait[34] = false;
                    setChecked(34);

                    if (dest[34]) return 34;

                    addToQueue(34);
                }
            }
            if(toCheck25){//debugPoint(25, rc);
                if(currents[25]!=Direction.CENTER&&cost%10+cooldowns[25]>9) {
                    if (cost%10>0&&cooldowns[25]<10&&currents[35]==Direction.CENTER) {
                        costs[25] = cooldowns[25]+(cost+9)/10*10;
                        dirs[25] = Direction.SOUTHWEST;
                        wait[25] = true;
                        currented[25] = null;
                        setChecked(25);

                        if (dest[25]) return 25;

                        addToQueue(25);
                    }
                    int currentTile = moveWithCurrent(25);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[25];
                        dirs[currentTile] = currents[25];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[25] = cost + cooldowns[25];
                    dirs[25] = Direction.SOUTHWEST;
                    currented[25] = null;
                    wait[25] = false;
                    setChecked(25);

                    if (dest[25]) return 25;

                    addToQueue(25);
                }
            }
            break;case 36:
        cost=costs[36];if(toCheck27){//debugPoint(27, rc);
                if(currents[27]!=Direction.CENTER&&cost%10+cooldowns[27]>9) {
                    if (cost%10>0&&cooldowns[27]<10&&currents[36]==Direction.CENTER) {
                        costs[27] = cooldowns[27]+(cost+9)/10*10;
                        dirs[27] = Direction.WEST;
                        wait[27] = true;
                        currented[27] = null;
                        setChecked(27);

                        if (dest[27]) return 27;

                        addToQueue(27);
                    }
                    int currentTile = moveWithCurrent(27);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[27];
                        dirs[currentTile] = currents[27];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[27] = cost + cooldowns[27];
                    dirs[27] = Direction.WEST;
                    currented[27] = null;
                    wait[27] = false;
                    setChecked(27);

                    if (dest[27]) return 27;

                    addToQueue(27);
                }
            }
            if(toCheck28){//debugPoint(28, rc);
                if(currents[28]!=Direction.CENTER&&cost%10+cooldowns[28]>9) {
                    if (cost%10>0&&cooldowns[28]<10&&currents[36]==Direction.CENTER) {
                        costs[28] = cooldowns[28]+(cost+9)/10*10;
                        dirs[28] = Direction.NORTHWEST;
                        wait[28] = true;
                        currented[28] = null;
                        setChecked(28);

                        if (dest[28]) return 28;

                        addToQueue(28);
                    }
                    int currentTile = moveWithCurrent(28);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[28];
                        dirs[currentTile] = currents[28];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[28] = cost + cooldowns[28];
                    dirs[28] = Direction.NORTHWEST;
                    currented[28] = null;
                    wait[28] = false;
                    setChecked(28);

                    if (dest[28]) return 28;

                    addToQueue(28);
                }
            }
            if(toCheck37){//debugPoint(37, rc);
                if(currents[37]!=Direction.CENTER&&cost%10+cooldowns[37]>9) {
                    if (cost%10>0&&cooldowns[37]<10&&currents[36]==Direction.CENTER) {
                        costs[37] = cooldowns[37]+(cost+9)/10*10;
                        dirs[37] = Direction.NORTH;
                        wait[37] = true;
                        currented[37] = null;
                        setChecked(37);

                        if (dest[37]) return 37;

                        addToQueue(37);
                    }
                    int currentTile = moveWithCurrent(37);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[37];
                        dirs[currentTile] = currents[37];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[37] = cost + cooldowns[37];
                    dirs[37] = Direction.NORTH;
                    currented[37] = null;
                    wait[37] = false;
                    setChecked(37);

                    if (dest[37]) return 37;

                    addToQueue(37);
                }
            }
            if(toCheck46){//debugPoint(46, rc);
                if(currents[46]!=Direction.CENTER&&cost%10+cooldowns[46]>9) {
                    if (cost%10>0&&cooldowns[46]<10&&currents[36]==Direction.CENTER) {
                        costs[46] = cooldowns[46]+(cost+9)/10*10;
                        dirs[46] = Direction.NORTHEAST;
                        wait[46] = true;
                        currented[46] = null;
                        setChecked(46);

                        if (dest[46]) return 46;

                        addToQueue(46);
                    }
                    int currentTile = moveWithCurrent(46);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[46];
                        dirs[currentTile] = currents[46];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[46] = cost + cooldowns[46];
                    dirs[46] = Direction.NORTHEAST;
                    currented[46] = null;
                    wait[46] = false;
                    setChecked(46);

                    if (dest[46]) return 46;

                    addToQueue(46);
                }
            }
            if(toCheck45){//debugPoint(45, rc);
                if(currents[45]!=Direction.CENTER&&cost%10+cooldowns[45]>9) {
                    if (cost%10>0&&cooldowns[45]<10&&currents[36]==Direction.CENTER) {
                        costs[45] = cooldowns[45]+(cost+9)/10*10;
                        dirs[45] = Direction.EAST;
                        wait[45] = true;
                        currented[45] = null;
                        setChecked(45);

                        if (dest[45]) return 45;

                        addToQueue(45);
                    }
                    int currentTile = moveWithCurrent(45);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[45];
                        dirs[currentTile] = currents[45];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[45] = cost + cooldowns[45];
                    dirs[45] = Direction.EAST;
                    currented[45] = null;
                    wait[45] = false;
                    setChecked(45);

                    if (dest[45]) return 45;

                    addToQueue(45);
                }
            }
            if(toCheck44){//debugPoint(44, rc);
                if(currents[44]!=Direction.CENTER&&cost%10+cooldowns[44]>9) {
                    if (cost%10>0&&cooldowns[44]<10&&currents[36]==Direction.CENTER) {
                        costs[44] = cooldowns[44]+(cost+9)/10*10;
                        dirs[44] = Direction.SOUTHEAST;
                        wait[44] = true;
                        currented[44] = null;
                        setChecked(44);

                        if (dest[44]) return 44;

                        addToQueue(44);
                    }
                    int currentTile = moveWithCurrent(44);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[44];
                        dirs[currentTile] = currents[44];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[44] = cost + cooldowns[44];
                    dirs[44] = Direction.SOUTHEAST;
                    currented[44] = null;
                    wait[44] = false;
                    setChecked(44);

                    if (dest[44]) return 44;

                    addToQueue(44);
                }
            }
            if(toCheck35){//debugPoint(35, rc);
                if(currents[35]!=Direction.CENTER&&cost%10+cooldowns[35]>9) {
                    if (cost%10>0&&cooldowns[35]<10&&currents[36]==Direction.CENTER) {
                        costs[35] = cooldowns[35]+(cost+9)/10*10;
                        dirs[35] = Direction.SOUTH;
                        wait[35] = true;
                        currented[35] = null;
                        setChecked(35);

                        if (dest[35]) return 35;

                        addToQueue(35);
                    }
                    int currentTile = moveWithCurrent(35);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[35];
                        dirs[currentTile] = currents[35];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[35] = cost + cooldowns[35];
                    dirs[35] = Direction.SOUTH;
                    currented[35] = null;
                    wait[35] = false;
                    setChecked(35);

                    if (dest[35]) return 35;

                    addToQueue(35);
                }
            }
            if(toCheck26){//debugPoint(26, rc);
                if(currents[26]!=Direction.CENTER&&cost%10+cooldowns[26]>9) {
                    if (cost%10>0&&cooldowns[26]<10&&currents[36]==Direction.CENTER) {
                        costs[26] = cooldowns[26]+(cost+9)/10*10;
                        dirs[26] = Direction.SOUTHWEST;
                        wait[26] = true;
                        currented[26] = null;
                        setChecked(26);

                        if (dest[26]) return 26;

                        addToQueue(26);
                    }
                    int currentTile = moveWithCurrent(26);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[26];
                        dirs[currentTile] = currents[26];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[26] = cost + cooldowns[26];
                    dirs[26] = Direction.SOUTHWEST;
                    currented[26] = null;
                    wait[26] = false;
                    setChecked(26);

                    if (dest[26]) return 26;

                    addToQueue(26);
                }
            }
            break;case 37:
        cost=costs[37];if(toCheck28){//debugPoint(28, rc);
                if(currents[28]!=Direction.CENTER&&cost%10+cooldowns[28]>9) {
                    if (cost%10>0&&cooldowns[28]<10&&currents[37]==Direction.CENTER) {
                        costs[28] = cooldowns[28]+(cost+9)/10*10;
                        dirs[28] = Direction.WEST;
                        wait[28] = true;
                        currented[28] = null;
                        setChecked(28);

                        if (dest[28]) return 28;

                        addToQueue(28);
                    }
                    int currentTile = moveWithCurrent(28);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[28];
                        dirs[currentTile] = currents[28];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[28] = cost + cooldowns[28];
                    dirs[28] = Direction.WEST;
                    currented[28] = null;
                    wait[28] = false;
                    setChecked(28);

                    if (dest[28]) return 28;

                    addToQueue(28);
                }
            }
            if(toCheck29){//debugPoint(29, rc);
                if(currents[29]!=Direction.CENTER&&cost%10+cooldowns[29]>9) {
                    if (cost%10>0&&cooldowns[29]<10&&currents[37]==Direction.CENTER) {
                        costs[29] = cooldowns[29]+(cost+9)/10*10;
                        dirs[29] = Direction.NORTHWEST;
                        wait[29] = true;
                        currented[29] = null;
                        setChecked(29);

                        if (dest[29]) return 29;

                        addToQueue(29);
                    }
                    int currentTile = moveWithCurrent(29);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[29];
                        dirs[currentTile] = currents[29];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[29] = cost + cooldowns[29];
                    dirs[29] = Direction.NORTHWEST;
                    currented[29] = null;
                    wait[29] = false;
                    setChecked(29);

                    if (dest[29]) return 29;

                    addToQueue(29);
                }
            }
            if(toCheck38){//debugPoint(38, rc);
                if(currents[38]!=Direction.CENTER&&cost%10+cooldowns[38]>9) {
                    if (cost%10>0&&cooldowns[38]<10&&currents[37]==Direction.CENTER) {
                        costs[38] = cooldowns[38]+(cost+9)/10*10;
                        dirs[38] = Direction.NORTH;
                        wait[38] = true;
                        currented[38] = null;
                        setChecked(38);

                        if (dest[38]) return 38;

                        addToQueue(38);
                    }
                    int currentTile = moveWithCurrent(38);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[38];
                        dirs[currentTile] = currents[38];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[38] = cost + cooldowns[38];
                    dirs[38] = Direction.NORTH;
                    currented[38] = null;
                    wait[38] = false;
                    setChecked(38);

                    if (dest[38]) return 38;

                    addToQueue(38);
                }
            }
            if(toCheck47){//debugPoint(47, rc);
                if(currents[47]!=Direction.CENTER&&cost%10+cooldowns[47]>9) {
                    if (cost%10>0&&cooldowns[47]<10&&currents[37]==Direction.CENTER) {
                        costs[47] = cooldowns[47]+(cost+9)/10*10;
                        dirs[47] = Direction.NORTHEAST;
                        wait[47] = true;
                        currented[47] = null;
                        setChecked(47);

                        if (dest[47]) return 47;

                        addToQueue(47);
                    }
                    int currentTile = moveWithCurrent(47);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[47];
                        dirs[currentTile] = currents[47];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[47] = cost + cooldowns[47];
                    dirs[47] = Direction.NORTHEAST;
                    currented[47] = null;
                    wait[47] = false;
                    setChecked(47);

                    if (dest[47]) return 47;

                    addToQueue(47);
                }
            }
            if(toCheck46){//debugPoint(46, rc);
                if(currents[46]!=Direction.CENTER&&cost%10+cooldowns[46]>9) {
                    if (cost%10>0&&cooldowns[46]<10&&currents[37]==Direction.CENTER) {
                        costs[46] = cooldowns[46]+(cost+9)/10*10;
                        dirs[46] = Direction.EAST;
                        wait[46] = true;
                        currented[46] = null;
                        setChecked(46);

                        if (dest[46]) return 46;

                        addToQueue(46);
                    }
                    int currentTile = moveWithCurrent(46);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[46];
                        dirs[currentTile] = currents[46];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[46] = cost + cooldowns[46];
                    dirs[46] = Direction.EAST;
                    currented[46] = null;
                    wait[46] = false;
                    setChecked(46);

                    if (dest[46]) return 46;

                    addToQueue(46);
                }
            }
            if(toCheck45){//debugPoint(45, rc);
                if(currents[45]!=Direction.CENTER&&cost%10+cooldowns[45]>9) {
                    if (cost%10>0&&cooldowns[45]<10&&currents[37]==Direction.CENTER) {
                        costs[45] = cooldowns[45]+(cost+9)/10*10;
                        dirs[45] = Direction.SOUTHEAST;
                        wait[45] = true;
                        currented[45] = null;
                        setChecked(45);

                        if (dest[45]) return 45;

                        addToQueue(45);
                    }
                    int currentTile = moveWithCurrent(45);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[45];
                        dirs[currentTile] = currents[45];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[45] = cost + cooldowns[45];
                    dirs[45] = Direction.SOUTHEAST;
                    currented[45] = null;
                    wait[45] = false;
                    setChecked(45);

                    if (dest[45]) return 45;

                    addToQueue(45);
                }
            }
            if(toCheck36){//debugPoint(36, rc);
                if(currents[36]!=Direction.CENTER&&cost%10+cooldowns[36]>9) {
                    if (cost%10>0&&cooldowns[36]<10&&currents[37]==Direction.CENTER) {
                        costs[36] = cooldowns[36]+(cost+9)/10*10;
                        dirs[36] = Direction.SOUTH;
                        wait[36] = true;
                        currented[36] = null;
                        setChecked(36);

                        if (dest[36]) return 36;

                        addToQueue(36);
                    }
                    int currentTile = moveWithCurrent(36);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[36];
                        dirs[currentTile] = currents[36];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[36] = cost + cooldowns[36];
                    dirs[36] = Direction.SOUTH;
                    currented[36] = null;
                    wait[36] = false;
                    setChecked(36);

                    if (dest[36]) return 36;

                    addToQueue(36);
                }
            }
            if(toCheck27){//debugPoint(27, rc);
                if(currents[27]!=Direction.CENTER&&cost%10+cooldowns[27]>9) {
                    if (cost%10>0&&cooldowns[27]<10&&currents[37]==Direction.CENTER) {
                        costs[27] = cooldowns[27]+(cost+9)/10*10;
                        dirs[27] = Direction.SOUTHWEST;
                        wait[27] = true;
                        currented[27] = null;
                        setChecked(27);

                        if (dest[27]) return 27;

                        addToQueue(27);
                    }
                    int currentTile = moveWithCurrent(27);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[27];
                        dirs[currentTile] = currents[27];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[27] = cost + cooldowns[27];
                    dirs[27] = Direction.SOUTHWEST;
                    currented[27] = null;
                    wait[27] = false;
                    setChecked(27);

                    if (dest[27]) return 27;

                    addToQueue(27);
                }
            }
            break;case 38:
        cost=costs[38];if(toCheck29){//debugPoint(29, rc);
                if(currents[29]!=Direction.CENTER&&cost%10+cooldowns[29]>9) {
                    if (cost%10>0&&cooldowns[29]<10&&currents[38]==Direction.CENTER) {
                        costs[29] = cooldowns[29]+(cost+9)/10*10;
                        dirs[29] = Direction.WEST;
                        wait[29] = true;
                        currented[29] = null;
                        setChecked(29);

                        if (dest[29]) return 29;

                        addToQueue(29);
                    }
                    int currentTile = moveWithCurrent(29);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[29];
                        dirs[currentTile] = currents[29];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[29] = cost + cooldowns[29];
                    dirs[29] = Direction.WEST;
                    currented[29] = null;
                    wait[29] = false;
                    setChecked(29);

                    if (dest[29]) return 29;

                    addToQueue(29);
                }
            }
            if(toCheck47){//debugPoint(47, rc);
                if(currents[47]!=Direction.CENTER&&cost%10+cooldowns[47]>9) {
                    if (cost%10>0&&cooldowns[47]<10&&currents[38]==Direction.CENTER) {
                        costs[47] = cooldowns[47]+(cost+9)/10*10;
                        dirs[47] = Direction.EAST;
                        wait[47] = true;
                        currented[47] = null;
                        setChecked(47);

                        if (dest[47]) return 47;

                        addToQueue(47);
                    }
                    int currentTile = moveWithCurrent(47);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[47];
                        dirs[currentTile] = currents[47];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[47] = cost + cooldowns[47];
                    dirs[47] = Direction.EAST;
                    currented[47] = null;
                    wait[47] = false;
                    setChecked(47);

                    if (dest[47]) return 47;

                    addToQueue(47);
                }
            }
            if(toCheck46){//debugPoint(46, rc);
                if(currents[46]!=Direction.CENTER&&cost%10+cooldowns[46]>9) {
                    if (cost%10>0&&cooldowns[46]<10&&currents[38]==Direction.CENTER) {
                        costs[46] = cooldowns[46]+(cost+9)/10*10;
                        dirs[46] = Direction.SOUTHEAST;
                        wait[46] = true;
                        currented[46] = null;
                        setChecked(46);

                        if (dest[46]) return 46;

                        addToQueue(46);
                    }
                    int currentTile = moveWithCurrent(46);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[46];
                        dirs[currentTile] = currents[46];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[46] = cost + cooldowns[46];
                    dirs[46] = Direction.SOUTHEAST;
                    currented[46] = null;
                    wait[46] = false;
                    setChecked(46);

                    if (dest[46]) return 46;

                    addToQueue(46);
                }
            }
            if(toCheck37){//debugPoint(37, rc);
                if(currents[37]!=Direction.CENTER&&cost%10+cooldowns[37]>9) {
                    if (cost%10>0&&cooldowns[37]<10&&currents[38]==Direction.CENTER) {
                        costs[37] = cooldowns[37]+(cost+9)/10*10;
                        dirs[37] = Direction.SOUTH;
                        wait[37] = true;
                        currented[37] = null;
                        setChecked(37);

                        if (dest[37]) return 37;

                        addToQueue(37);
                    }
                    int currentTile = moveWithCurrent(37);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[37];
                        dirs[currentTile] = currents[37];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[37] = cost + cooldowns[37];
                    dirs[37] = Direction.SOUTH;
                    currented[37] = null;
                    wait[37] = false;
                    setChecked(37);

                    if (dest[37]) return 37;

                    addToQueue(37);
                }
            }
            if(toCheck28){//debugPoint(28, rc);
                if(currents[28]!=Direction.CENTER&&cost%10+cooldowns[28]>9) {
                    if (cost%10>0&&cooldowns[28]<10&&currents[38]==Direction.CENTER) {
                        costs[28] = cooldowns[28]+(cost+9)/10*10;
                        dirs[28] = Direction.SOUTHWEST;
                        wait[28] = true;
                        currented[28] = null;
                        setChecked(28);

                        if (dest[28]) return 28;

                        addToQueue(28);
                    }
                    int currentTile = moveWithCurrent(28);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[28];
                        dirs[currentTile] = currents[28];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[28] = cost + cooldowns[28];
                    dirs[28] = Direction.SOUTHWEST;
                    currented[28] = null;
                    wait[28] = false;
                    setChecked(28);

                    if (dest[28]) return 28;

                    addToQueue(28);
                }
            }
            break;
        }
    return -1;
    }
    public static int dijkstraSub3(RobotController rc, int n) {int cost; switch(n) {case 39:
        cost=costs[39];if(toCheck30){//debugPoint(30, rc);
                if(currents[30]!=Direction.CENTER&&cost%10+cooldowns[30]>9) {
                    if (cost%10>0&&cooldowns[30]<10&&currents[39]==Direction.CENTER) {
                        costs[30] = cooldowns[30]+(cost+9)/10*10;
                        dirs[30] = Direction.WEST;
                        wait[30] = true;
                        currented[30] = null;
                        setChecked(30);

                        if (dest[30]) return 30;

                        addToQueue(30);
                    }
                    int currentTile = moveWithCurrent(30);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[30];
                        dirs[currentTile] = currents[30];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[30] = cost + cooldowns[30];
                    dirs[30] = Direction.WEST;
                    currented[30] = null;
                    wait[30] = false;
                    setChecked(30);

                    if (dest[30]) return 30;

                    addToQueue(30);
                }
            }
            if(toCheck31){//debugPoint(31, rc);
                if(currents[31]!=Direction.CENTER&&cost%10+cooldowns[31]>9) {
                    if (cost%10>0&&cooldowns[31]<10&&currents[39]==Direction.CENTER) {
                        costs[31] = cooldowns[31]+(cost+9)/10*10;
                        dirs[31] = Direction.NORTHWEST;
                        wait[31] = true;
                        currented[31] = null;
                        setChecked(31);

                        if (dest[31]) return 31;

                        addToQueue(31);
                    }
                    int currentTile = moveWithCurrent(31);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[31];
                        dirs[currentTile] = currents[31];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[31] = cost + cooldowns[31];
                    dirs[31] = Direction.NORTHWEST;
                    currented[31] = null;
                    wait[31] = false;
                    setChecked(31);

                    if (dest[31]) return 31;

                    addToQueue(31);
                }
            }
            if(toCheck40){//debugPoint(40, rc);
                if(currents[40]!=Direction.CENTER&&cost%10+cooldowns[40]>9) {
                    if (cost%10>0&&cooldowns[40]<10&&currents[39]==Direction.CENTER) {
                        costs[40] = cooldowns[40]+(cost+9)/10*10;
                        dirs[40] = Direction.NORTH;
                        wait[40] = true;
                        currented[40] = null;
                        setChecked(40);

                        if (dest[40]) return 40;

                        addToQueue(40);
                    }
                    int currentTile = moveWithCurrent(40);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[40];
                        dirs[currentTile] = currents[40];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[40] = cost + cooldowns[40];
                    dirs[40] = Direction.NORTH;
                    currented[40] = null;
                    wait[40] = false;
                    setChecked(40);

                    if (dest[40]) return 40;

                    addToQueue(40);
                }
            }
            if(toCheck49){//debugPoint(49, rc);
                if(currents[49]!=Direction.CENTER&&cost%10+cooldowns[49]>9) {
                    if (cost%10>0&&cooldowns[49]<10&&currents[39]==Direction.CENTER) {
                        costs[49] = cooldowns[49]+(cost+9)/10*10;
                        dirs[49] = Direction.NORTHEAST;
                        wait[49] = true;
                        currented[49] = null;
                        setChecked(49);

                        if (dest[49]) return 49;

                        addToQueue(49);
                    }
                    int currentTile = moveWithCurrent(49);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[49];
                        dirs[currentTile] = currents[49];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[49] = cost + cooldowns[49];
                    dirs[49] = Direction.NORTHEAST;
                    currented[49] = null;
                    wait[49] = false;
                    setChecked(49);

                    if (dest[49]) return 49;

                    addToQueue(49);
                }
            }
            if(toCheck48){//debugPoint(48, rc);
                if(currents[48]!=Direction.CENTER&&cost%10+cooldowns[48]>9) {
                    if (cost%10>0&&cooldowns[48]<10&&currents[39]==Direction.CENTER) {
                        costs[48] = cooldowns[48]+(cost+9)/10*10;
                        dirs[48] = Direction.EAST;
                        wait[48] = true;
                        currented[48] = null;
                        setChecked(48);

                        if (dest[48]) return 48;

                        addToQueue(48);
                    }
                    int currentTile = moveWithCurrent(48);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[48];
                        dirs[currentTile] = currents[48];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[48] = cost + cooldowns[48];
                    dirs[48] = Direction.EAST;
                    currented[48] = null;
                    wait[48] = false;
                    setChecked(48);

                    if (dest[48]) return 48;

                    addToQueue(48);
                }
            }
            break;case 40:
        cost=costs[40];if(toCheck31){//debugPoint(31, rc);
                if(currents[31]!=Direction.CENTER&&cost%10+cooldowns[31]>9) {
                    if (cost%10>0&&cooldowns[31]<10&&currents[40]==Direction.CENTER) {
                        costs[31] = cooldowns[31]+(cost+9)/10*10;
                        dirs[31] = Direction.WEST;
                        wait[31] = true;
                        currented[31] = null;
                        setChecked(31);

                        if (dest[31]) return 31;

                        addToQueue(31);
                    }
                    int currentTile = moveWithCurrent(31);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[31];
                        dirs[currentTile] = currents[31];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[31] = cost + cooldowns[31];
                    dirs[31] = Direction.WEST;
                    currented[31] = null;
                    wait[31] = false;
                    setChecked(31);

                    if (dest[31]) return 31;

                    addToQueue(31);
                }
            }
            if(toCheck32){//debugPoint(32, rc);
                if(currents[32]!=Direction.CENTER&&cost%10+cooldowns[32]>9) {
                    if (cost%10>0&&cooldowns[32]<10&&currents[40]==Direction.CENTER) {
                        costs[32] = cooldowns[32]+(cost+9)/10*10;
                        dirs[32] = Direction.NORTHWEST;
                        wait[32] = true;
                        currented[32] = null;
                        setChecked(32);

                        if (dest[32]) return 32;

                        addToQueue(32);
                    }
                    int currentTile = moveWithCurrent(32);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[32];
                        dirs[currentTile] = currents[32];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[32] = cost + cooldowns[32];
                    dirs[32] = Direction.NORTHWEST;
                    currented[32] = null;
                    wait[32] = false;
                    setChecked(32);

                    if (dest[32]) return 32;

                    addToQueue(32);
                }
            }
            if(toCheck41){//debugPoint(41, rc);
                if(currents[41]!=Direction.CENTER&&cost%10+cooldowns[41]>9) {
                    if (cost%10>0&&cooldowns[41]<10&&currents[40]==Direction.CENTER) {
                        costs[41] = cooldowns[41]+(cost+9)/10*10;
                        dirs[41] = Direction.NORTH;
                        wait[41] = true;
                        currented[41] = null;
                        setChecked(41);

                        if (dest[41]) return 41;

                        addToQueue(41);
                    }
                    int currentTile = moveWithCurrent(41);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[41];
                        dirs[currentTile] = currents[41];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[41] = cost + cooldowns[41];
                    dirs[41] = Direction.NORTH;
                    currented[41] = null;
                    wait[41] = false;
                    setChecked(41);

                    if (dest[41]) return 41;

                    addToQueue(41);
                }
            }
            if(toCheck50){//debugPoint(50, rc);
                if(currents[50]!=Direction.CENTER&&cost%10+cooldowns[50]>9) {
                    if (cost%10>0&&cooldowns[50]<10&&currents[40]==Direction.CENTER) {
                        costs[50] = cooldowns[50]+(cost+9)/10*10;
                        dirs[50] = Direction.NORTHEAST;
                        wait[50] = true;
                        currented[50] = null;
                        setChecked(50);

                        if (dest[50]) return 50;

                        addToQueue(50);
                    }
                    int currentTile = moveWithCurrent(50);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[50];
                        dirs[currentTile] = currents[50];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[50] = cost + cooldowns[50];
                    dirs[50] = Direction.NORTHEAST;
                    currented[50] = null;
                    wait[50] = false;
                    setChecked(50);

                    if (dest[50]) return 50;

                    addToQueue(50);
                }
            }
            if(toCheck49){//debugPoint(49, rc);
                if(currents[49]!=Direction.CENTER&&cost%10+cooldowns[49]>9) {
                    if (cost%10>0&&cooldowns[49]<10&&currents[40]==Direction.CENTER) {
                        costs[49] = cooldowns[49]+(cost+9)/10*10;
                        dirs[49] = Direction.EAST;
                        wait[49] = true;
                        currented[49] = null;
                        setChecked(49);

                        if (dest[49]) return 49;

                        addToQueue(49);
                    }
                    int currentTile = moveWithCurrent(49);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[49];
                        dirs[currentTile] = currents[49];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[49] = cost + cooldowns[49];
                    dirs[49] = Direction.EAST;
                    currented[49] = null;
                    wait[49] = false;
                    setChecked(49);

                    if (dest[49]) return 49;

                    addToQueue(49);
                }
            }
            if(toCheck48){//debugPoint(48, rc);
                if(currents[48]!=Direction.CENTER&&cost%10+cooldowns[48]>9) {
                    if (cost%10>0&&cooldowns[48]<10&&currents[40]==Direction.CENTER) {
                        costs[48] = cooldowns[48]+(cost+9)/10*10;
                        dirs[48] = Direction.SOUTHEAST;
                        wait[48] = true;
                        currented[48] = null;
                        setChecked(48);

                        if (dest[48]) return 48;

                        addToQueue(48);
                    }
                    int currentTile = moveWithCurrent(48);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[48];
                        dirs[currentTile] = currents[48];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[48] = cost + cooldowns[48];
                    dirs[48] = Direction.SOUTHEAST;
                    currented[48] = null;
                    wait[48] = false;
                    setChecked(48);

                    if (dest[48]) return 48;

                    addToQueue(48);
                }
            }
            if(toCheck39){//debugPoint(39, rc);
                if(currents[39]!=Direction.CENTER&&cost%10+cooldowns[39]>9) {
                    if (cost%10>0&&cooldowns[39]<10&&currents[40]==Direction.CENTER) {
                        costs[39] = cooldowns[39]+(cost+9)/10*10;
                        dirs[39] = Direction.SOUTH;
                        wait[39] = true;
                        currented[39] = null;
                        setChecked(39);

                        if (dest[39]) return 39;

                        addToQueue(39);
                    }
                    int currentTile = moveWithCurrent(39);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[39];
                        dirs[currentTile] = currents[39];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[39] = cost + cooldowns[39];
                    dirs[39] = Direction.SOUTH;
                    currented[39] = null;
                    wait[39] = false;
                    setChecked(39);

                    if (dest[39]) return 39;

                    addToQueue(39);
                }
            }
            if(toCheck30){//debugPoint(30, rc);
                if(currents[30]!=Direction.CENTER&&cost%10+cooldowns[30]>9) {
                    if (cost%10>0&&cooldowns[30]<10&&currents[40]==Direction.CENTER) {
                        costs[30] = cooldowns[30]+(cost+9)/10*10;
                        dirs[30] = Direction.SOUTHWEST;
                        wait[30] = true;
                        currented[30] = null;
                        setChecked(30);

                        if (dest[30]) return 30;

                        addToQueue(30);
                    }
                    int currentTile = moveWithCurrent(30);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[30];
                        dirs[currentTile] = currents[30];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[30] = cost + cooldowns[30];
                    dirs[30] = Direction.SOUTHWEST;
                    currented[30] = null;
                    wait[30] = false;
                    setChecked(30);

                    if (dest[30]) return 30;

                    addToQueue(30);
                }
            }
            break;case 41:
        cost=costs[41];if(toCheck32){//debugPoint(32, rc);
                if(currents[32]!=Direction.CENTER&&cost%10+cooldowns[32]>9) {
                    if (cost%10>0&&cooldowns[32]<10&&currents[41]==Direction.CENTER) {
                        costs[32] = cooldowns[32]+(cost+9)/10*10;
                        dirs[32] = Direction.WEST;
                        wait[32] = true;
                        currented[32] = null;
                        setChecked(32);

                        if (dest[32]) return 32;

                        addToQueue(32);
                    }
                    int currentTile = moveWithCurrent(32);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[32];
                        dirs[currentTile] = currents[32];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[32] = cost + cooldowns[32];
                    dirs[32] = Direction.WEST;
                    currented[32] = null;
                    wait[32] = false;
                    setChecked(32);

                    if (dest[32]) return 32;

                    addToQueue(32);
                }
            }
            if(toCheck33){//debugPoint(33, rc);
                if(currents[33]!=Direction.CENTER&&cost%10+cooldowns[33]>9) {
                    if (cost%10>0&&cooldowns[33]<10&&currents[41]==Direction.CENTER) {
                        costs[33] = cooldowns[33]+(cost+9)/10*10;
                        dirs[33] = Direction.NORTHWEST;
                        wait[33] = true;
                        currented[33] = null;
                        setChecked(33);

                        if (dest[33]) return 33;

                        addToQueue(33);
                    }
                    int currentTile = moveWithCurrent(33);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[33];
                        dirs[currentTile] = currents[33];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[33] = cost + cooldowns[33];
                    dirs[33] = Direction.NORTHWEST;
                    currented[33] = null;
                    wait[33] = false;
                    setChecked(33);

                    if (dest[33]) return 33;

                    addToQueue(33);
                }
            }
            if(toCheck42){//debugPoint(42, rc);
                if(currents[42]!=Direction.CENTER&&cost%10+cooldowns[42]>9) {
                    if (cost%10>0&&cooldowns[42]<10&&currents[41]==Direction.CENTER) {
                        costs[42] = cooldowns[42]+(cost+9)/10*10;
                        dirs[42] = Direction.NORTH;
                        wait[42] = true;
                        currented[42] = null;
                        setChecked(42);

                        if (dest[42]) return 42;

                        addToQueue(42);
                    }
                    int currentTile = moveWithCurrent(42);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[42];
                        dirs[currentTile] = currents[42];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[42] = cost + cooldowns[42];
                    dirs[42] = Direction.NORTH;
                    currented[42] = null;
                    wait[42] = false;
                    setChecked(42);

                    if (dest[42]) return 42;

                    addToQueue(42);
                }
            }
            if(toCheck51){//debugPoint(51, rc);
                if(currents[51]!=Direction.CENTER&&cost%10+cooldowns[51]>9) {
                    if (cost%10>0&&cooldowns[51]<10&&currents[41]==Direction.CENTER) {
                        costs[51] = cooldowns[51]+(cost+9)/10*10;
                        dirs[51] = Direction.NORTHEAST;
                        wait[51] = true;
                        currented[51] = null;
                        setChecked(51);

                        if (dest[51]) return 51;

                        addToQueue(51);
                    }
                    int currentTile = moveWithCurrent(51);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[51];
                        dirs[currentTile] = currents[51];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[51] = cost + cooldowns[51];
                    dirs[51] = Direction.NORTHEAST;
                    currented[51] = null;
                    wait[51] = false;
                    setChecked(51);

                    if (dest[51]) return 51;

                    addToQueue(51);
                }
            }
            if(toCheck50){//debugPoint(50, rc);
                if(currents[50]!=Direction.CENTER&&cost%10+cooldowns[50]>9) {
                    if (cost%10>0&&cooldowns[50]<10&&currents[41]==Direction.CENTER) {
                        costs[50] = cooldowns[50]+(cost+9)/10*10;
                        dirs[50] = Direction.EAST;
                        wait[50] = true;
                        currented[50] = null;
                        setChecked(50);

                        if (dest[50]) return 50;

                        addToQueue(50);
                    }
                    int currentTile = moveWithCurrent(50);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[50];
                        dirs[currentTile] = currents[50];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[50] = cost + cooldowns[50];
                    dirs[50] = Direction.EAST;
                    currented[50] = null;
                    wait[50] = false;
                    setChecked(50);

                    if (dest[50]) return 50;

                    addToQueue(50);
                }
            }
            if(toCheck49){//debugPoint(49, rc);
                if(currents[49]!=Direction.CENTER&&cost%10+cooldowns[49]>9) {
                    if (cost%10>0&&cooldowns[49]<10&&currents[41]==Direction.CENTER) {
                        costs[49] = cooldowns[49]+(cost+9)/10*10;
                        dirs[49] = Direction.SOUTHEAST;
                        wait[49] = true;
                        currented[49] = null;
                        setChecked(49);

                        if (dest[49]) return 49;

                        addToQueue(49);
                    }
                    int currentTile = moveWithCurrent(49);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[49];
                        dirs[currentTile] = currents[49];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[49] = cost + cooldowns[49];
                    dirs[49] = Direction.SOUTHEAST;
                    currented[49] = null;
                    wait[49] = false;
                    setChecked(49);

                    if (dest[49]) return 49;

                    addToQueue(49);
                }
            }
            if(toCheck40){//debugPoint(40, rc);
                if(currents[40]!=Direction.CENTER&&cost%10+cooldowns[40]>9) {
                    if (cost%10>0&&cooldowns[40]<10&&currents[41]==Direction.CENTER) {
                        costs[40] = cooldowns[40]+(cost+9)/10*10;
                        dirs[40] = Direction.SOUTH;
                        wait[40] = true;
                        currented[40] = null;
                        setChecked(40);

                        if (dest[40]) return 40;

                        addToQueue(40);
                    }
                    int currentTile = moveWithCurrent(40);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[40];
                        dirs[currentTile] = currents[40];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[40] = cost + cooldowns[40];
                    dirs[40] = Direction.SOUTH;
                    currented[40] = null;
                    wait[40] = false;
                    setChecked(40);

                    if (dest[40]) return 40;

                    addToQueue(40);
                }
            }
            if(toCheck31){//debugPoint(31, rc);
                if(currents[31]!=Direction.CENTER&&cost%10+cooldowns[31]>9) {
                    if (cost%10>0&&cooldowns[31]<10&&currents[41]==Direction.CENTER) {
                        costs[31] = cooldowns[31]+(cost+9)/10*10;
                        dirs[31] = Direction.SOUTHWEST;
                        wait[31] = true;
                        currented[31] = null;
                        setChecked(31);

                        if (dest[31]) return 31;

                        addToQueue(31);
                    }
                    int currentTile = moveWithCurrent(31);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[31];
                        dirs[currentTile] = currents[31];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[31] = cost + cooldowns[31];
                    dirs[31] = Direction.SOUTHWEST;
                    currented[31] = null;
                    wait[31] = false;
                    setChecked(31);

                    if (dest[31]) return 31;

                    addToQueue(31);
                }
            }
            break;case 42:
        cost=costs[42];if(toCheck33){//debugPoint(33, rc);
                if(currents[33]!=Direction.CENTER&&cost%10+cooldowns[33]>9) {
                    if (cost%10>0&&cooldowns[33]<10&&currents[42]==Direction.CENTER) {
                        costs[33] = cooldowns[33]+(cost+9)/10*10;
                        dirs[33] = Direction.WEST;
                        wait[33] = true;
                        currented[33] = null;
                        setChecked(33);

                        if (dest[33]) return 33;

                        addToQueue(33);
                    }
                    int currentTile = moveWithCurrent(33);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[33];
                        dirs[currentTile] = currents[33];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[33] = cost + cooldowns[33];
                    dirs[33] = Direction.WEST;
                    currented[33] = null;
                    wait[33] = false;
                    setChecked(33);

                    if (dest[33]) return 33;

                    addToQueue(33);
                }
            }
            if(toCheck34){//debugPoint(34, rc);
                if(currents[34]!=Direction.CENTER&&cost%10+cooldowns[34]>9) {
                    if (cost%10>0&&cooldowns[34]<10&&currents[42]==Direction.CENTER) {
                        costs[34] = cooldowns[34]+(cost+9)/10*10;
                        dirs[34] = Direction.NORTHWEST;
                        wait[34] = true;
                        currented[34] = null;
                        setChecked(34);

                        if (dest[34]) return 34;

                        addToQueue(34);
                    }
                    int currentTile = moveWithCurrent(34);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[34];
                        dirs[currentTile] = currents[34];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[34] = cost + cooldowns[34];
                    dirs[34] = Direction.NORTHWEST;
                    currented[34] = null;
                    wait[34] = false;
                    setChecked(34);

                    if (dest[34]) return 34;

                    addToQueue(34);
                }
            }
            if(toCheck43){//debugPoint(43, rc);
                if(currents[43]!=Direction.CENTER&&cost%10+cooldowns[43]>9) {
                    if (cost%10>0&&cooldowns[43]<10&&currents[42]==Direction.CENTER) {
                        costs[43] = cooldowns[43]+(cost+9)/10*10;
                        dirs[43] = Direction.NORTH;
                        wait[43] = true;
                        currented[43] = null;
                        setChecked(43);

                        if (dest[43]) return 43;

                        addToQueue(43);
                    }
                    int currentTile = moveWithCurrent(43);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[43];
                        dirs[currentTile] = currents[43];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[43] = cost + cooldowns[43];
                    dirs[43] = Direction.NORTH;
                    currented[43] = null;
                    wait[43] = false;
                    setChecked(43);

                    if (dest[43]) return 43;

                    addToQueue(43);
                }
            }
            if(toCheck52){//debugPoint(52, rc);
                if(currents[52]!=Direction.CENTER&&cost%10+cooldowns[52]>9) {
                    if (cost%10>0&&cooldowns[52]<10&&currents[42]==Direction.CENTER) {
                        costs[52] = cooldowns[52]+(cost+9)/10*10;
                        dirs[52] = Direction.NORTHEAST;
                        wait[52] = true;
                        currented[52] = null;
                        setChecked(52);

                        if (dest[52]) return 52;

                        addToQueue(52);
                    }
                    int currentTile = moveWithCurrent(52);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[52];
                        dirs[currentTile] = currents[52];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[52] = cost + cooldowns[52];
                    dirs[52] = Direction.NORTHEAST;
                    currented[52] = null;
                    wait[52] = false;
                    setChecked(52);

                    if (dest[52]) return 52;

                    addToQueue(52);
                }
            }
            if(toCheck51){//debugPoint(51, rc);
                if(currents[51]!=Direction.CENTER&&cost%10+cooldowns[51]>9) {
                    if (cost%10>0&&cooldowns[51]<10&&currents[42]==Direction.CENTER) {
                        costs[51] = cooldowns[51]+(cost+9)/10*10;
                        dirs[51] = Direction.EAST;
                        wait[51] = true;
                        currented[51] = null;
                        setChecked(51);

                        if (dest[51]) return 51;

                        addToQueue(51);
                    }
                    int currentTile = moveWithCurrent(51);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[51];
                        dirs[currentTile] = currents[51];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[51] = cost + cooldowns[51];
                    dirs[51] = Direction.EAST;
                    currented[51] = null;
                    wait[51] = false;
                    setChecked(51);

                    if (dest[51]) return 51;

                    addToQueue(51);
                }
            }
            if(toCheck50){//debugPoint(50, rc);
                if(currents[50]!=Direction.CENTER&&cost%10+cooldowns[50]>9) {
                    if (cost%10>0&&cooldowns[50]<10&&currents[42]==Direction.CENTER) {
                        costs[50] = cooldowns[50]+(cost+9)/10*10;
                        dirs[50] = Direction.SOUTHEAST;
                        wait[50] = true;
                        currented[50] = null;
                        setChecked(50);

                        if (dest[50]) return 50;

                        addToQueue(50);
                    }
                    int currentTile = moveWithCurrent(50);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[50];
                        dirs[currentTile] = currents[50];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[50] = cost + cooldowns[50];
                    dirs[50] = Direction.SOUTHEAST;
                    currented[50] = null;
                    wait[50] = false;
                    setChecked(50);

                    if (dest[50]) return 50;

                    addToQueue(50);
                }
            }
            if(toCheck41){//debugPoint(41, rc);
                if(currents[41]!=Direction.CENTER&&cost%10+cooldowns[41]>9) {
                    if (cost%10>0&&cooldowns[41]<10&&currents[42]==Direction.CENTER) {
                        costs[41] = cooldowns[41]+(cost+9)/10*10;
                        dirs[41] = Direction.SOUTH;
                        wait[41] = true;
                        currented[41] = null;
                        setChecked(41);

                        if (dest[41]) return 41;

                        addToQueue(41);
                    }
                    int currentTile = moveWithCurrent(41);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[41];
                        dirs[currentTile] = currents[41];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[41] = cost + cooldowns[41];
                    dirs[41] = Direction.SOUTH;
                    currented[41] = null;
                    wait[41] = false;
                    setChecked(41);

                    if (dest[41]) return 41;

                    addToQueue(41);
                }
            }
            if(toCheck32){//debugPoint(32, rc);
                if(currents[32]!=Direction.CENTER&&cost%10+cooldowns[32]>9) {
                    if (cost%10>0&&cooldowns[32]<10&&currents[42]==Direction.CENTER) {
                        costs[32] = cooldowns[32]+(cost+9)/10*10;
                        dirs[32] = Direction.SOUTHWEST;
                        wait[32] = true;
                        currented[32] = null;
                        setChecked(32);

                        if (dest[32]) return 32;

                        addToQueue(32);
                    }
                    int currentTile = moveWithCurrent(32);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[32];
                        dirs[currentTile] = currents[32];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[32] = cost + cooldowns[32];
                    dirs[32] = Direction.SOUTHWEST;
                    currented[32] = null;
                    wait[32] = false;
                    setChecked(32);

                    if (dest[32]) return 32;

                    addToQueue(32);
                }
            }
            break;case 43:
        cost=costs[43];if(toCheck34){//debugPoint(34, rc);
                if(currents[34]!=Direction.CENTER&&cost%10+cooldowns[34]>9) {
                    if (cost%10>0&&cooldowns[34]<10&&currents[43]==Direction.CENTER) {
                        costs[34] = cooldowns[34]+(cost+9)/10*10;
                        dirs[34] = Direction.WEST;
                        wait[34] = true;
                        currented[34] = null;
                        setChecked(34);

                        if (dest[34]) return 34;

                        addToQueue(34);
                    }
                    int currentTile = moveWithCurrent(34);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[34];
                        dirs[currentTile] = currents[34];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[34] = cost + cooldowns[34];
                    dirs[34] = Direction.WEST;
                    currented[34] = null;
                    wait[34] = false;
                    setChecked(34);

                    if (dest[34]) return 34;

                    addToQueue(34);
                }
            }
            if(toCheck35){//debugPoint(35, rc);
                if(currents[35]!=Direction.CENTER&&cost%10+cooldowns[35]>9) {
                    if (cost%10>0&&cooldowns[35]<10&&currents[43]==Direction.CENTER) {
                        costs[35] = cooldowns[35]+(cost+9)/10*10;
                        dirs[35] = Direction.NORTHWEST;
                        wait[35] = true;
                        currented[35] = null;
                        setChecked(35);

                        if (dest[35]) return 35;

                        addToQueue(35);
                    }
                    int currentTile = moveWithCurrent(35);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[35];
                        dirs[currentTile] = currents[35];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[35] = cost + cooldowns[35];
                    dirs[35] = Direction.NORTHWEST;
                    currented[35] = null;
                    wait[35] = false;
                    setChecked(35);

                    if (dest[35]) return 35;

                    addToQueue(35);
                }
            }
            if(toCheck44){//debugPoint(44, rc);
                if(currents[44]!=Direction.CENTER&&cost%10+cooldowns[44]>9) {
                    if (cost%10>0&&cooldowns[44]<10&&currents[43]==Direction.CENTER) {
                        costs[44] = cooldowns[44]+(cost+9)/10*10;
                        dirs[44] = Direction.NORTH;
                        wait[44] = true;
                        currented[44] = null;
                        setChecked(44);

                        if (dest[44]) return 44;

                        addToQueue(44);
                    }
                    int currentTile = moveWithCurrent(44);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[44];
                        dirs[currentTile] = currents[44];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[44] = cost + cooldowns[44];
                    dirs[44] = Direction.NORTH;
                    currented[44] = null;
                    wait[44] = false;
                    setChecked(44);

                    if (dest[44]) return 44;

                    addToQueue(44);
                }
            }
            if(toCheck53){//debugPoint(53, rc);
                if(currents[53]!=Direction.CENTER&&cost%10+cooldowns[53]>9) {
                    if (cost%10>0&&cooldowns[53]<10&&currents[43]==Direction.CENTER) {
                        costs[53] = cooldowns[53]+(cost+9)/10*10;
                        dirs[53] = Direction.NORTHEAST;
                        wait[53] = true;
                        currented[53] = null;
                        setChecked(53);

                        if (dest[53]) return 53;

                        addToQueue(53);
                    }
                    int currentTile = moveWithCurrent(53);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[53];
                        dirs[currentTile] = currents[53];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[53] = cost + cooldowns[53];
                    dirs[53] = Direction.NORTHEAST;
                    currented[53] = null;
                    wait[53] = false;
                    setChecked(53);

                    if (dest[53]) return 53;

                    addToQueue(53);
                }
            }
            if(toCheck52){//debugPoint(52, rc);
                if(currents[52]!=Direction.CENTER&&cost%10+cooldowns[52]>9) {
                    if (cost%10>0&&cooldowns[52]<10&&currents[43]==Direction.CENTER) {
                        costs[52] = cooldowns[52]+(cost+9)/10*10;
                        dirs[52] = Direction.EAST;
                        wait[52] = true;
                        currented[52] = null;
                        setChecked(52);

                        if (dest[52]) return 52;

                        addToQueue(52);
                    }
                    int currentTile = moveWithCurrent(52);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[52];
                        dirs[currentTile] = currents[52];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[52] = cost + cooldowns[52];
                    dirs[52] = Direction.EAST;
                    currented[52] = null;
                    wait[52] = false;
                    setChecked(52);

                    if (dest[52]) return 52;

                    addToQueue(52);
                }
            }
            if(toCheck51){//debugPoint(51, rc);
                if(currents[51]!=Direction.CENTER&&cost%10+cooldowns[51]>9) {
                    if (cost%10>0&&cooldowns[51]<10&&currents[43]==Direction.CENTER) {
                        costs[51] = cooldowns[51]+(cost+9)/10*10;
                        dirs[51] = Direction.SOUTHEAST;
                        wait[51] = true;
                        currented[51] = null;
                        setChecked(51);

                        if (dest[51]) return 51;

                        addToQueue(51);
                    }
                    int currentTile = moveWithCurrent(51);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[51];
                        dirs[currentTile] = currents[51];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[51] = cost + cooldowns[51];
                    dirs[51] = Direction.SOUTHEAST;
                    currented[51] = null;
                    wait[51] = false;
                    setChecked(51);

                    if (dest[51]) return 51;

                    addToQueue(51);
                }
            }
            if(toCheck42){//debugPoint(42, rc);
                if(currents[42]!=Direction.CENTER&&cost%10+cooldowns[42]>9) {
                    if (cost%10>0&&cooldowns[42]<10&&currents[43]==Direction.CENTER) {
                        costs[42] = cooldowns[42]+(cost+9)/10*10;
                        dirs[42] = Direction.SOUTH;
                        wait[42] = true;
                        currented[42] = null;
                        setChecked(42);

                        if (dest[42]) return 42;

                        addToQueue(42);
                    }
                    int currentTile = moveWithCurrent(42);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[42];
                        dirs[currentTile] = currents[42];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[42] = cost + cooldowns[42];
                    dirs[42] = Direction.SOUTH;
                    currented[42] = null;
                    wait[42] = false;
                    setChecked(42);

                    if (dest[42]) return 42;

                    addToQueue(42);
                }
            }
            if(toCheck33){//debugPoint(33, rc);
                if(currents[33]!=Direction.CENTER&&cost%10+cooldowns[33]>9) {
                    if (cost%10>0&&cooldowns[33]<10&&currents[43]==Direction.CENTER) {
                        costs[33] = cooldowns[33]+(cost+9)/10*10;
                        dirs[33] = Direction.SOUTHWEST;
                        wait[33] = true;
                        currented[33] = null;
                        setChecked(33);

                        if (dest[33]) return 33;

                        addToQueue(33);
                    }
                    int currentTile = moveWithCurrent(33);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[33];
                        dirs[currentTile] = currents[33];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[33] = cost + cooldowns[33];
                    dirs[33] = Direction.SOUTHWEST;
                    currented[33] = null;
                    wait[33] = false;
                    setChecked(33);

                    if (dest[33]) return 33;

                    addToQueue(33);
                }
            }
            break;case 44:
        cost=costs[44];if(toCheck35){//debugPoint(35, rc);
                if(currents[35]!=Direction.CENTER&&cost%10+cooldowns[35]>9) {
                    if (cost%10>0&&cooldowns[35]<10&&currents[44]==Direction.CENTER) {
                        costs[35] = cooldowns[35]+(cost+9)/10*10;
                        dirs[35] = Direction.WEST;
                        wait[35] = true;
                        currented[35] = null;
                        setChecked(35);

                        if (dest[35]) return 35;

                        addToQueue(35);
                    }
                    int currentTile = moveWithCurrent(35);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[35];
                        dirs[currentTile] = currents[35];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[35] = cost + cooldowns[35];
                    dirs[35] = Direction.WEST;
                    currented[35] = null;
                    wait[35] = false;
                    setChecked(35);

                    if (dest[35]) return 35;

                    addToQueue(35);
                }
            }
            if(toCheck36){//debugPoint(36, rc);
                if(currents[36]!=Direction.CENTER&&cost%10+cooldowns[36]>9) {
                    if (cost%10>0&&cooldowns[36]<10&&currents[44]==Direction.CENTER) {
                        costs[36] = cooldowns[36]+(cost+9)/10*10;
                        dirs[36] = Direction.NORTHWEST;
                        wait[36] = true;
                        currented[36] = null;
                        setChecked(36);

                        if (dest[36]) return 36;

                        addToQueue(36);
                    }
                    int currentTile = moveWithCurrent(36);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[36];
                        dirs[currentTile] = currents[36];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[36] = cost + cooldowns[36];
                    dirs[36] = Direction.NORTHWEST;
                    currented[36] = null;
                    wait[36] = false;
                    setChecked(36);

                    if (dest[36]) return 36;

                    addToQueue(36);
                }
            }
            if(toCheck45){//debugPoint(45, rc);
                if(currents[45]!=Direction.CENTER&&cost%10+cooldowns[45]>9) {
                    if (cost%10>0&&cooldowns[45]<10&&currents[44]==Direction.CENTER) {
                        costs[45] = cooldowns[45]+(cost+9)/10*10;
                        dirs[45] = Direction.NORTH;
                        wait[45] = true;
                        currented[45] = null;
                        setChecked(45);

                        if (dest[45]) return 45;

                        addToQueue(45);
                    }
                    int currentTile = moveWithCurrent(45);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[45];
                        dirs[currentTile] = currents[45];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[45] = cost + cooldowns[45];
                    dirs[45] = Direction.NORTH;
                    currented[45] = null;
                    wait[45] = false;
                    setChecked(45);

                    if (dest[45]) return 45;

                    addToQueue(45);
                }
            }
            if(toCheck54){//debugPoint(54, rc);
                if(currents[54]!=Direction.CENTER&&cost%10+cooldowns[54]>9) {
                    if (cost%10>0&&cooldowns[54]<10&&currents[44]==Direction.CENTER) {
                        costs[54] = cooldowns[54]+(cost+9)/10*10;
                        dirs[54] = Direction.NORTHEAST;
                        wait[54] = true;
                        currented[54] = null;
                        setChecked(54);

                        if (dest[54]) return 54;

                        addToQueue(54);
                    }
                    int currentTile = moveWithCurrent(54);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[54];
                        dirs[currentTile] = currents[54];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[54] = cost + cooldowns[54];
                    dirs[54] = Direction.NORTHEAST;
                    currented[54] = null;
                    wait[54] = false;
                    setChecked(54);

                    if (dest[54]) return 54;

                    addToQueue(54);
                }
            }
            if(toCheck53){//debugPoint(53, rc);
                if(currents[53]!=Direction.CENTER&&cost%10+cooldowns[53]>9) {
                    if (cost%10>0&&cooldowns[53]<10&&currents[44]==Direction.CENTER) {
                        costs[53] = cooldowns[53]+(cost+9)/10*10;
                        dirs[53] = Direction.EAST;
                        wait[53] = true;
                        currented[53] = null;
                        setChecked(53);

                        if (dest[53]) return 53;

                        addToQueue(53);
                    }
                    int currentTile = moveWithCurrent(53);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[53];
                        dirs[currentTile] = currents[53];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[53] = cost + cooldowns[53];
                    dirs[53] = Direction.EAST;
                    currented[53] = null;
                    wait[53] = false;
                    setChecked(53);

                    if (dest[53]) return 53;

                    addToQueue(53);
                }
            }
            if(toCheck52){//debugPoint(52, rc);
                if(currents[52]!=Direction.CENTER&&cost%10+cooldowns[52]>9) {
                    if (cost%10>0&&cooldowns[52]<10&&currents[44]==Direction.CENTER) {
                        costs[52] = cooldowns[52]+(cost+9)/10*10;
                        dirs[52] = Direction.SOUTHEAST;
                        wait[52] = true;
                        currented[52] = null;
                        setChecked(52);

                        if (dest[52]) return 52;

                        addToQueue(52);
                    }
                    int currentTile = moveWithCurrent(52);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[52];
                        dirs[currentTile] = currents[52];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[52] = cost + cooldowns[52];
                    dirs[52] = Direction.SOUTHEAST;
                    currented[52] = null;
                    wait[52] = false;
                    setChecked(52);

                    if (dest[52]) return 52;

                    addToQueue(52);
                }
            }
            if(toCheck43){//debugPoint(43, rc);
                if(currents[43]!=Direction.CENTER&&cost%10+cooldowns[43]>9) {
                    if (cost%10>0&&cooldowns[43]<10&&currents[44]==Direction.CENTER) {
                        costs[43] = cooldowns[43]+(cost+9)/10*10;
                        dirs[43] = Direction.SOUTH;
                        wait[43] = true;
                        currented[43] = null;
                        setChecked(43);

                        if (dest[43]) return 43;

                        addToQueue(43);
                    }
                    int currentTile = moveWithCurrent(43);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[43];
                        dirs[currentTile] = currents[43];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[43] = cost + cooldowns[43];
                    dirs[43] = Direction.SOUTH;
                    currented[43] = null;
                    wait[43] = false;
                    setChecked(43);

                    if (dest[43]) return 43;

                    addToQueue(43);
                }
            }
            if(toCheck34){//debugPoint(34, rc);
                if(currents[34]!=Direction.CENTER&&cost%10+cooldowns[34]>9) {
                    if (cost%10>0&&cooldowns[34]<10&&currents[44]==Direction.CENTER) {
                        costs[34] = cooldowns[34]+(cost+9)/10*10;
                        dirs[34] = Direction.SOUTHWEST;
                        wait[34] = true;
                        currented[34] = null;
                        setChecked(34);

                        if (dest[34]) return 34;

                        addToQueue(34);
                    }
                    int currentTile = moveWithCurrent(34);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[34];
                        dirs[currentTile] = currents[34];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[34] = cost + cooldowns[34];
                    dirs[34] = Direction.SOUTHWEST;
                    currented[34] = null;
                    wait[34] = false;
                    setChecked(34);

                    if (dest[34]) return 34;

                    addToQueue(34);
                }
            }
            break;case 45:
        cost=costs[45];if(toCheck36){//debugPoint(36, rc);
                if(currents[36]!=Direction.CENTER&&cost%10+cooldowns[36]>9) {
                    if (cost%10>0&&cooldowns[36]<10&&currents[45]==Direction.CENTER) {
                        costs[36] = cooldowns[36]+(cost+9)/10*10;
                        dirs[36] = Direction.WEST;
                        wait[36] = true;
                        currented[36] = null;
                        setChecked(36);

                        if (dest[36]) return 36;

                        addToQueue(36);
                    }
                    int currentTile = moveWithCurrent(36);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[36];
                        dirs[currentTile] = currents[36];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[36] = cost + cooldowns[36];
                    dirs[36] = Direction.WEST;
                    currented[36] = null;
                    wait[36] = false;
                    setChecked(36);

                    if (dest[36]) return 36;

                    addToQueue(36);
                }
            }
            if(toCheck37){//debugPoint(37, rc);
                if(currents[37]!=Direction.CENTER&&cost%10+cooldowns[37]>9) {
                    if (cost%10>0&&cooldowns[37]<10&&currents[45]==Direction.CENTER) {
                        costs[37] = cooldowns[37]+(cost+9)/10*10;
                        dirs[37] = Direction.NORTHWEST;
                        wait[37] = true;
                        currented[37] = null;
                        setChecked(37);

                        if (dest[37]) return 37;

                        addToQueue(37);
                    }
                    int currentTile = moveWithCurrent(37);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[37];
                        dirs[currentTile] = currents[37];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[37] = cost + cooldowns[37];
                    dirs[37] = Direction.NORTHWEST;
                    currented[37] = null;
                    wait[37] = false;
                    setChecked(37);

                    if (dest[37]) return 37;

                    addToQueue(37);
                }
            }
            if(toCheck46){//debugPoint(46, rc);
                if(currents[46]!=Direction.CENTER&&cost%10+cooldowns[46]>9) {
                    if (cost%10>0&&cooldowns[46]<10&&currents[45]==Direction.CENTER) {
                        costs[46] = cooldowns[46]+(cost+9)/10*10;
                        dirs[46] = Direction.NORTH;
                        wait[46] = true;
                        currented[46] = null;
                        setChecked(46);

                        if (dest[46]) return 46;

                        addToQueue(46);
                    }
                    int currentTile = moveWithCurrent(46);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[46];
                        dirs[currentTile] = currents[46];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[46] = cost + cooldowns[46];
                    dirs[46] = Direction.NORTH;
                    currented[46] = null;
                    wait[46] = false;
                    setChecked(46);

                    if (dest[46]) return 46;

                    addToQueue(46);
                }
            }
            if(toCheck55){//debugPoint(55, rc);
                if(currents[55]!=Direction.CENTER&&cost%10+cooldowns[55]>9) {
                    if (cost%10>0&&cooldowns[55]<10&&currents[45]==Direction.CENTER) {
                        costs[55] = cooldowns[55]+(cost+9)/10*10;
                        dirs[55] = Direction.NORTHEAST;
                        wait[55] = true;
                        currented[55] = null;
                        setChecked(55);

                        if (dest[55]) return 55;

                        addToQueue(55);
                    }
                    int currentTile = moveWithCurrent(55);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[55];
                        dirs[currentTile] = currents[55];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[55] = cost + cooldowns[55];
                    dirs[55] = Direction.NORTHEAST;
                    currented[55] = null;
                    wait[55] = false;
                    setChecked(55);

                    if (dest[55]) return 55;

                    addToQueue(55);
                }
            }
            if(toCheck54){//debugPoint(54, rc);
                if(currents[54]!=Direction.CENTER&&cost%10+cooldowns[54]>9) {
                    if (cost%10>0&&cooldowns[54]<10&&currents[45]==Direction.CENTER) {
                        costs[54] = cooldowns[54]+(cost+9)/10*10;
                        dirs[54] = Direction.EAST;
                        wait[54] = true;
                        currented[54] = null;
                        setChecked(54);

                        if (dest[54]) return 54;

                        addToQueue(54);
                    }
                    int currentTile = moveWithCurrent(54);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[54];
                        dirs[currentTile] = currents[54];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[54] = cost + cooldowns[54];
                    dirs[54] = Direction.EAST;
                    currented[54] = null;
                    wait[54] = false;
                    setChecked(54);

                    if (dest[54]) return 54;

                    addToQueue(54);
                }
            }
            if(toCheck53){//debugPoint(53, rc);
                if(currents[53]!=Direction.CENTER&&cost%10+cooldowns[53]>9) {
                    if (cost%10>0&&cooldowns[53]<10&&currents[45]==Direction.CENTER) {
                        costs[53] = cooldowns[53]+(cost+9)/10*10;
                        dirs[53] = Direction.SOUTHEAST;
                        wait[53] = true;
                        currented[53] = null;
                        setChecked(53);

                        if (dest[53]) return 53;

                        addToQueue(53);
                    }
                    int currentTile = moveWithCurrent(53);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[53];
                        dirs[currentTile] = currents[53];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[53] = cost + cooldowns[53];
                    dirs[53] = Direction.SOUTHEAST;
                    currented[53] = null;
                    wait[53] = false;
                    setChecked(53);

                    if (dest[53]) return 53;

                    addToQueue(53);
                }
            }
            if(toCheck44){//debugPoint(44, rc);
                if(currents[44]!=Direction.CENTER&&cost%10+cooldowns[44]>9) {
                    if (cost%10>0&&cooldowns[44]<10&&currents[45]==Direction.CENTER) {
                        costs[44] = cooldowns[44]+(cost+9)/10*10;
                        dirs[44] = Direction.SOUTH;
                        wait[44] = true;
                        currented[44] = null;
                        setChecked(44);

                        if (dest[44]) return 44;

                        addToQueue(44);
                    }
                    int currentTile = moveWithCurrent(44);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[44];
                        dirs[currentTile] = currents[44];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[44] = cost + cooldowns[44];
                    dirs[44] = Direction.SOUTH;
                    currented[44] = null;
                    wait[44] = false;
                    setChecked(44);

                    if (dest[44]) return 44;

                    addToQueue(44);
                }
            }
            if(toCheck35){//debugPoint(35, rc);
                if(currents[35]!=Direction.CENTER&&cost%10+cooldowns[35]>9) {
                    if (cost%10>0&&cooldowns[35]<10&&currents[45]==Direction.CENTER) {
                        costs[35] = cooldowns[35]+(cost+9)/10*10;
                        dirs[35] = Direction.SOUTHWEST;
                        wait[35] = true;
                        currented[35] = null;
                        setChecked(35);

                        if (dest[35]) return 35;

                        addToQueue(35);
                    }
                    int currentTile = moveWithCurrent(35);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[35];
                        dirs[currentTile] = currents[35];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[35] = cost + cooldowns[35];
                    dirs[35] = Direction.SOUTHWEST;
                    currented[35] = null;
                    wait[35] = false;
                    setChecked(35);

                    if (dest[35]) return 35;

                    addToQueue(35);
                }
            }
            break;case 46:
        cost=costs[46];if(toCheck37){//debugPoint(37, rc);
                if(currents[37]!=Direction.CENTER&&cost%10+cooldowns[37]>9) {
                    if (cost%10>0&&cooldowns[37]<10&&currents[46]==Direction.CENTER) {
                        costs[37] = cooldowns[37]+(cost+9)/10*10;
                        dirs[37] = Direction.WEST;
                        wait[37] = true;
                        currented[37] = null;
                        setChecked(37);

                        if (dest[37]) return 37;

                        addToQueue(37);
                    }
                    int currentTile = moveWithCurrent(37);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[37];
                        dirs[currentTile] = currents[37];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[37] = cost + cooldowns[37];
                    dirs[37] = Direction.WEST;
                    currented[37] = null;
                    wait[37] = false;
                    setChecked(37);

                    if (dest[37]) return 37;

                    addToQueue(37);
                }
            }
            if(toCheck38){//debugPoint(38, rc);
                if(currents[38]!=Direction.CENTER&&cost%10+cooldowns[38]>9) {
                    if (cost%10>0&&cooldowns[38]<10&&currents[46]==Direction.CENTER) {
                        costs[38] = cooldowns[38]+(cost+9)/10*10;
                        dirs[38] = Direction.NORTHWEST;
                        wait[38] = true;
                        currented[38] = null;
                        setChecked(38);

                        if (dest[38]) return 38;

                        addToQueue(38);
                    }
                    int currentTile = moveWithCurrent(38);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[38];
                        dirs[currentTile] = currents[38];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[38] = cost + cooldowns[38];
                    dirs[38] = Direction.NORTHWEST;
                    currented[38] = null;
                    wait[38] = false;
                    setChecked(38);

                    if (dest[38]) return 38;

                    addToQueue(38);
                }
            }
            if(toCheck47){//debugPoint(47, rc);
                if(currents[47]!=Direction.CENTER&&cost%10+cooldowns[47]>9) {
                    if (cost%10>0&&cooldowns[47]<10&&currents[46]==Direction.CENTER) {
                        costs[47] = cooldowns[47]+(cost+9)/10*10;
                        dirs[47] = Direction.NORTH;
                        wait[47] = true;
                        currented[47] = null;
                        setChecked(47);

                        if (dest[47]) return 47;

                        addToQueue(47);
                    }
                    int currentTile = moveWithCurrent(47);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[47];
                        dirs[currentTile] = currents[47];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[47] = cost + cooldowns[47];
                    dirs[47] = Direction.NORTH;
                    currented[47] = null;
                    wait[47] = false;
                    setChecked(47);

                    if (dest[47]) return 47;

                    addToQueue(47);
                }
            }
            if(toCheck56){//debugPoint(56, rc);
                if(currents[56]!=Direction.CENTER&&cost%10+cooldowns[56]>9) {
                    if (cost%10>0&&cooldowns[56]<10&&currents[46]==Direction.CENTER) {
                        costs[56] = cooldowns[56]+(cost+9)/10*10;
                        dirs[56] = Direction.NORTHEAST;
                        wait[56] = true;
                        currented[56] = null;
                        setChecked(56);

                        if (dest[56]) return 56;

                        addToQueue(56);
                    }
                    int currentTile = moveWithCurrent(56);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[56];
                        dirs[currentTile] = currents[56];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[56] = cost + cooldowns[56];
                    dirs[56] = Direction.NORTHEAST;
                    currented[56] = null;
                    wait[56] = false;
                    setChecked(56);

                    if (dest[56]) return 56;

                    addToQueue(56);
                }
            }
            if(toCheck55){//debugPoint(55, rc);
                if(currents[55]!=Direction.CENTER&&cost%10+cooldowns[55]>9) {
                    if (cost%10>0&&cooldowns[55]<10&&currents[46]==Direction.CENTER) {
                        costs[55] = cooldowns[55]+(cost+9)/10*10;
                        dirs[55] = Direction.EAST;
                        wait[55] = true;
                        currented[55] = null;
                        setChecked(55);

                        if (dest[55]) return 55;

                        addToQueue(55);
                    }
                    int currentTile = moveWithCurrent(55);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[55];
                        dirs[currentTile] = currents[55];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[55] = cost + cooldowns[55];
                    dirs[55] = Direction.EAST;
                    currented[55] = null;
                    wait[55] = false;
                    setChecked(55);

                    if (dest[55]) return 55;

                    addToQueue(55);
                }
            }
            if(toCheck54){//debugPoint(54, rc);
                if(currents[54]!=Direction.CENTER&&cost%10+cooldowns[54]>9) {
                    if (cost%10>0&&cooldowns[54]<10&&currents[46]==Direction.CENTER) {
                        costs[54] = cooldowns[54]+(cost+9)/10*10;
                        dirs[54] = Direction.SOUTHEAST;
                        wait[54] = true;
                        currented[54] = null;
                        setChecked(54);

                        if (dest[54]) return 54;

                        addToQueue(54);
                    }
                    int currentTile = moveWithCurrent(54);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[54];
                        dirs[currentTile] = currents[54];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[54] = cost + cooldowns[54];
                    dirs[54] = Direction.SOUTHEAST;
                    currented[54] = null;
                    wait[54] = false;
                    setChecked(54);

                    if (dest[54]) return 54;

                    addToQueue(54);
                }
            }
            if(toCheck45){//debugPoint(45, rc);
                if(currents[45]!=Direction.CENTER&&cost%10+cooldowns[45]>9) {
                    if (cost%10>0&&cooldowns[45]<10&&currents[46]==Direction.CENTER) {
                        costs[45] = cooldowns[45]+(cost+9)/10*10;
                        dirs[45] = Direction.SOUTH;
                        wait[45] = true;
                        currented[45] = null;
                        setChecked(45);

                        if (dest[45]) return 45;

                        addToQueue(45);
                    }
                    int currentTile = moveWithCurrent(45);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[45];
                        dirs[currentTile] = currents[45];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[45] = cost + cooldowns[45];
                    dirs[45] = Direction.SOUTH;
                    currented[45] = null;
                    wait[45] = false;
                    setChecked(45);

                    if (dest[45]) return 45;

                    addToQueue(45);
                }
            }
            if(toCheck36){//debugPoint(36, rc);
                if(currents[36]!=Direction.CENTER&&cost%10+cooldowns[36]>9) {
                    if (cost%10>0&&cooldowns[36]<10&&currents[46]==Direction.CENTER) {
                        costs[36] = cooldowns[36]+(cost+9)/10*10;
                        dirs[36] = Direction.SOUTHWEST;
                        wait[36] = true;
                        currented[36] = null;
                        setChecked(36);

                        if (dest[36]) return 36;

                        addToQueue(36);
                    }
                    int currentTile = moveWithCurrent(36);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[36];
                        dirs[currentTile] = currents[36];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[36] = cost + cooldowns[36];
                    dirs[36] = Direction.SOUTHWEST;
                    currented[36] = null;
                    wait[36] = false;
                    setChecked(36);

                    if (dest[36]) return 36;

                    addToQueue(36);
                }
            }
            break;case 47:
        cost=costs[47];if(toCheck38){//debugPoint(38, rc);
                if(currents[38]!=Direction.CENTER&&cost%10+cooldowns[38]>9) {
                    if (cost%10>0&&cooldowns[38]<10&&currents[47]==Direction.CENTER) {
                        costs[38] = cooldowns[38]+(cost+9)/10*10;
                        dirs[38] = Direction.WEST;
                        wait[38] = true;
                        currented[38] = null;
                        setChecked(38);

                        if (dest[38]) return 38;

                        addToQueue(38);
                    }
                    int currentTile = moveWithCurrent(38);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[38];
                        dirs[currentTile] = currents[38];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[38] = cost + cooldowns[38];
                    dirs[38] = Direction.WEST;
                    currented[38] = null;
                    wait[38] = false;
                    setChecked(38);

                    if (dest[38]) return 38;

                    addToQueue(38);
                }
            }
            if(toCheck56){//debugPoint(56, rc);
                if(currents[56]!=Direction.CENTER&&cost%10+cooldowns[56]>9) {
                    if (cost%10>0&&cooldowns[56]<10&&currents[47]==Direction.CENTER) {
                        costs[56] = cooldowns[56]+(cost+9)/10*10;
                        dirs[56] = Direction.EAST;
                        wait[56] = true;
                        currented[56] = null;
                        setChecked(56);

                        if (dest[56]) return 56;

                        addToQueue(56);
                    }
                    int currentTile = moveWithCurrent(56);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[56];
                        dirs[currentTile] = currents[56];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[56] = cost + cooldowns[56];
                    dirs[56] = Direction.EAST;
                    currented[56] = null;
                    wait[56] = false;
                    setChecked(56);

                    if (dest[56]) return 56;

                    addToQueue(56);
                }
            }
            if(toCheck55){//debugPoint(55, rc);
                if(currents[55]!=Direction.CENTER&&cost%10+cooldowns[55]>9) {
                    if (cost%10>0&&cooldowns[55]<10&&currents[47]==Direction.CENTER) {
                        costs[55] = cooldowns[55]+(cost+9)/10*10;
                        dirs[55] = Direction.SOUTHEAST;
                        wait[55] = true;
                        currented[55] = null;
                        setChecked(55);

                        if (dest[55]) return 55;

                        addToQueue(55);
                    }
                    int currentTile = moveWithCurrent(55);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[55];
                        dirs[currentTile] = currents[55];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[55] = cost + cooldowns[55];
                    dirs[55] = Direction.SOUTHEAST;
                    currented[55] = null;
                    wait[55] = false;
                    setChecked(55);

                    if (dest[55]) return 55;

                    addToQueue(55);
                }
            }
            if(toCheck46){//debugPoint(46, rc);
                if(currents[46]!=Direction.CENTER&&cost%10+cooldowns[46]>9) {
                    if (cost%10>0&&cooldowns[46]<10&&currents[47]==Direction.CENTER) {
                        costs[46] = cooldowns[46]+(cost+9)/10*10;
                        dirs[46] = Direction.SOUTH;
                        wait[46] = true;
                        currented[46] = null;
                        setChecked(46);

                        if (dest[46]) return 46;

                        addToQueue(46);
                    }
                    int currentTile = moveWithCurrent(46);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[46];
                        dirs[currentTile] = currents[46];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[46] = cost + cooldowns[46];
                    dirs[46] = Direction.SOUTH;
                    currented[46] = null;
                    wait[46] = false;
                    setChecked(46);

                    if (dest[46]) return 46;

                    addToQueue(46);
                }
            }
            if(toCheck37){//debugPoint(37, rc);
                if(currents[37]!=Direction.CENTER&&cost%10+cooldowns[37]>9) {
                    if (cost%10>0&&cooldowns[37]<10&&currents[47]==Direction.CENTER) {
                        costs[37] = cooldowns[37]+(cost+9)/10*10;
                        dirs[37] = Direction.SOUTHWEST;
                        wait[37] = true;
                        currented[37] = null;
                        setChecked(37);

                        if (dest[37]) return 37;

                        addToQueue(37);
                    }
                    int currentTile = moveWithCurrent(37);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[37];
                        dirs[currentTile] = currents[37];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[37] = cost + cooldowns[37];
                    dirs[37] = Direction.SOUTHWEST;
                    currented[37] = null;
                    wait[37] = false;
                    setChecked(37);

                    if (dest[37]) return 37;

                    addToQueue(37);
                }
            }
            break;case 48:
        cost=costs[48];if(toCheck39){//debugPoint(39, rc);
                if(currents[39]!=Direction.CENTER&&cost%10+cooldowns[39]>9) {
                    if (cost%10>0&&cooldowns[39]<10&&currents[48]==Direction.CENTER) {
                        costs[39] = cooldowns[39]+(cost+9)/10*10;
                        dirs[39] = Direction.WEST;
                        wait[39] = true;
                        currented[39] = null;
                        setChecked(39);

                        if (dest[39]) return 39;

                        addToQueue(39);
                    }
                    int currentTile = moveWithCurrent(39);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[39];
                        dirs[currentTile] = currents[39];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[39] = cost + cooldowns[39];
                    dirs[39] = Direction.WEST;
                    currented[39] = null;
                    wait[39] = false;
                    setChecked(39);

                    if (dest[39]) return 39;

                    addToQueue(39);
                }
            }
            if(toCheck40){//debugPoint(40, rc);
                if(currents[40]!=Direction.CENTER&&cost%10+cooldowns[40]>9) {
                    if (cost%10>0&&cooldowns[40]<10&&currents[48]==Direction.CENTER) {
                        costs[40] = cooldowns[40]+(cost+9)/10*10;
                        dirs[40] = Direction.NORTHWEST;
                        wait[40] = true;
                        currented[40] = null;
                        setChecked(40);

                        if (dest[40]) return 40;

                        addToQueue(40);
                    }
                    int currentTile = moveWithCurrent(40);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[40];
                        dirs[currentTile] = currents[40];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[40] = cost + cooldowns[40];
                    dirs[40] = Direction.NORTHWEST;
                    currented[40] = null;
                    wait[40] = false;
                    setChecked(40);

                    if (dest[40]) return 40;

                    addToQueue(40);
                }
            }
            if(toCheck49){//debugPoint(49, rc);
                if(currents[49]!=Direction.CENTER&&cost%10+cooldowns[49]>9) {
                    if (cost%10>0&&cooldowns[49]<10&&currents[48]==Direction.CENTER) {
                        costs[49] = cooldowns[49]+(cost+9)/10*10;
                        dirs[49] = Direction.NORTH;
                        wait[49] = true;
                        currented[49] = null;
                        setChecked(49);

                        if (dest[49]) return 49;

                        addToQueue(49);
                    }
                    int currentTile = moveWithCurrent(49);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[49];
                        dirs[currentTile] = currents[49];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[49] = cost + cooldowns[49];
                    dirs[49] = Direction.NORTH;
                    currented[49] = null;
                    wait[49] = false;
                    setChecked(49);

                    if (dest[49]) return 49;

                    addToQueue(49);
                }
            }
            if(toCheck57){//debugPoint(57, rc);
                if(currents[57]!=Direction.CENTER&&cost%10+cooldowns[57]>9) {
                    if (cost%10>0&&cooldowns[57]<10&&currents[48]==Direction.CENTER) {
                        costs[57] = cooldowns[57]+(cost+9)/10*10;
                        dirs[57] = Direction.NORTHEAST;
                        wait[57] = true;
                        currented[57] = null;
                        setChecked(57);

                        if (dest[57]) return 57;

                        addToQueue(57);
                    }
                    int currentTile = moveWithCurrent(57);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[57];
                        dirs[currentTile] = currents[57];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[57] = cost + cooldowns[57];
                    dirs[57] = Direction.NORTHEAST;
                    currented[57] = null;
                    wait[57] = false;
                    setChecked(57);

                    if (dest[57]) return 57;

                    addToQueue(57);
                }
            }
            break;case 49:
        cost=costs[49];if(toCheck40){//debugPoint(40, rc);
                if(currents[40]!=Direction.CENTER&&cost%10+cooldowns[40]>9) {
                    if (cost%10>0&&cooldowns[40]<10&&currents[49]==Direction.CENTER) {
                        costs[40] = cooldowns[40]+(cost+9)/10*10;
                        dirs[40] = Direction.WEST;
                        wait[40] = true;
                        currented[40] = null;
                        setChecked(40);

                        if (dest[40]) return 40;

                        addToQueue(40);
                    }
                    int currentTile = moveWithCurrent(40);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[40];
                        dirs[currentTile] = currents[40];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[40] = cost + cooldowns[40];
                    dirs[40] = Direction.WEST;
                    currented[40] = null;
                    wait[40] = false;
                    setChecked(40);

                    if (dest[40]) return 40;

                    addToQueue(40);
                }
            }
            if(toCheck41){//debugPoint(41, rc);
                if(currents[41]!=Direction.CENTER&&cost%10+cooldowns[41]>9) {
                    if (cost%10>0&&cooldowns[41]<10&&currents[49]==Direction.CENTER) {
                        costs[41] = cooldowns[41]+(cost+9)/10*10;
                        dirs[41] = Direction.NORTHWEST;
                        wait[41] = true;
                        currented[41] = null;
                        setChecked(41);

                        if (dest[41]) return 41;

                        addToQueue(41);
                    }
                    int currentTile = moveWithCurrent(41);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[41];
                        dirs[currentTile] = currents[41];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[41] = cost + cooldowns[41];
                    dirs[41] = Direction.NORTHWEST;
                    currented[41] = null;
                    wait[41] = false;
                    setChecked(41);

                    if (dest[41]) return 41;

                    addToQueue(41);
                }
            }
            if(toCheck50){//debugPoint(50, rc);
                if(currents[50]!=Direction.CENTER&&cost%10+cooldowns[50]>9) {
                    if (cost%10>0&&cooldowns[50]<10&&currents[49]==Direction.CENTER) {
                        costs[50] = cooldowns[50]+(cost+9)/10*10;
                        dirs[50] = Direction.NORTH;
                        wait[50] = true;
                        currented[50] = null;
                        setChecked(50);

                        if (dest[50]) return 50;

                        addToQueue(50);
                    }
                    int currentTile = moveWithCurrent(50);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[50];
                        dirs[currentTile] = currents[50];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[50] = cost + cooldowns[50];
                    dirs[50] = Direction.NORTH;
                    currented[50] = null;
                    wait[50] = false;
                    setChecked(50);

                    if (dest[50]) return 50;

                    addToQueue(50);
                }
            }
            if(toCheck58){//debugPoint(58, rc);
                if(currents[58]!=Direction.CENTER&&cost%10+cooldowns[58]>9) {
                    if (cost%10>0&&cooldowns[58]<10&&currents[49]==Direction.CENTER) {
                        costs[58] = cooldowns[58]+(cost+9)/10*10;
                        dirs[58] = Direction.NORTHEAST;
                        wait[58] = true;
                        currented[58] = null;
                        setChecked(58);

                        if (dest[58]) return 58;

                        addToQueue(58);
                    }
                    int currentTile = moveWithCurrent(58);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[58];
                        dirs[currentTile] = currents[58];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[58] = cost + cooldowns[58];
                    dirs[58] = Direction.NORTHEAST;
                    currented[58] = null;
                    wait[58] = false;
                    setChecked(58);

                    if (dest[58]) return 58;

                    addToQueue(58);
                }
            }
            if(toCheck57){//debugPoint(57, rc);
                if(currents[57]!=Direction.CENTER&&cost%10+cooldowns[57]>9) {
                    if (cost%10>0&&cooldowns[57]<10&&currents[49]==Direction.CENTER) {
                        costs[57] = cooldowns[57]+(cost+9)/10*10;
                        dirs[57] = Direction.EAST;
                        wait[57] = true;
                        currented[57] = null;
                        setChecked(57);

                        if (dest[57]) return 57;

                        addToQueue(57);
                    }
                    int currentTile = moveWithCurrent(57);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[57];
                        dirs[currentTile] = currents[57];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[57] = cost + cooldowns[57];
                    dirs[57] = Direction.EAST;
                    currented[57] = null;
                    wait[57] = false;
                    setChecked(57);

                    if (dest[57]) return 57;

                    addToQueue(57);
                }
            }
            if(toCheck48){//debugPoint(48, rc);
                if(currents[48]!=Direction.CENTER&&cost%10+cooldowns[48]>9) {
                    if (cost%10>0&&cooldowns[48]<10&&currents[49]==Direction.CENTER) {
                        costs[48] = cooldowns[48]+(cost+9)/10*10;
                        dirs[48] = Direction.SOUTH;
                        wait[48] = true;
                        currented[48] = null;
                        setChecked(48);

                        if (dest[48]) return 48;

                        addToQueue(48);
                    }
                    int currentTile = moveWithCurrent(48);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[48];
                        dirs[currentTile] = currents[48];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[48] = cost + cooldowns[48];
                    dirs[48] = Direction.SOUTH;
                    currented[48] = null;
                    wait[48] = false;
                    setChecked(48);

                    if (dest[48]) return 48;

                    addToQueue(48);
                }
            }
            if(toCheck39){//debugPoint(39, rc);
                if(currents[39]!=Direction.CENTER&&cost%10+cooldowns[39]>9) {
                    if (cost%10>0&&cooldowns[39]<10&&currents[49]==Direction.CENTER) {
                        costs[39] = cooldowns[39]+(cost+9)/10*10;
                        dirs[39] = Direction.SOUTHWEST;
                        wait[39] = true;
                        currented[39] = null;
                        setChecked(39);

                        if (dest[39]) return 39;

                        addToQueue(39);
                    }
                    int currentTile = moveWithCurrent(39);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[39];
                        dirs[currentTile] = currents[39];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[39] = cost + cooldowns[39];
                    dirs[39] = Direction.SOUTHWEST;
                    currented[39] = null;
                    wait[39] = false;
                    setChecked(39);

                    if (dest[39]) return 39;

                    addToQueue(39);
                }
            }
            break;case 50:
        cost=costs[50];if(toCheck41){//debugPoint(41, rc);
                if(currents[41]!=Direction.CENTER&&cost%10+cooldowns[41]>9) {
                    if (cost%10>0&&cooldowns[41]<10&&currents[50]==Direction.CENTER) {
                        costs[41] = cooldowns[41]+(cost+9)/10*10;
                        dirs[41] = Direction.WEST;
                        wait[41] = true;
                        currented[41] = null;
                        setChecked(41);

                        if (dest[41]) return 41;

                        addToQueue(41);
                    }
                    int currentTile = moveWithCurrent(41);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[41];
                        dirs[currentTile] = currents[41];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[41] = cost + cooldowns[41];
                    dirs[41] = Direction.WEST;
                    currented[41] = null;
                    wait[41] = false;
                    setChecked(41);

                    if (dest[41]) return 41;

                    addToQueue(41);
                }
            }
            if(toCheck42){//debugPoint(42, rc);
                if(currents[42]!=Direction.CENTER&&cost%10+cooldowns[42]>9) {
                    if (cost%10>0&&cooldowns[42]<10&&currents[50]==Direction.CENTER) {
                        costs[42] = cooldowns[42]+(cost+9)/10*10;
                        dirs[42] = Direction.NORTHWEST;
                        wait[42] = true;
                        currented[42] = null;
                        setChecked(42);

                        if (dest[42]) return 42;

                        addToQueue(42);
                    }
                    int currentTile = moveWithCurrent(42);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[42];
                        dirs[currentTile] = currents[42];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[42] = cost + cooldowns[42];
                    dirs[42] = Direction.NORTHWEST;
                    currented[42] = null;
                    wait[42] = false;
                    setChecked(42);

                    if (dest[42]) return 42;

                    addToQueue(42);
                }
            }
            if(toCheck51){//debugPoint(51, rc);
                if(currents[51]!=Direction.CENTER&&cost%10+cooldowns[51]>9) {
                    if (cost%10>0&&cooldowns[51]<10&&currents[50]==Direction.CENTER) {
                        costs[51] = cooldowns[51]+(cost+9)/10*10;
                        dirs[51] = Direction.NORTH;
                        wait[51] = true;
                        currented[51] = null;
                        setChecked(51);

                        if (dest[51]) return 51;

                        addToQueue(51);
                    }
                    int currentTile = moveWithCurrent(51);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[51];
                        dirs[currentTile] = currents[51];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[51] = cost + cooldowns[51];
                    dirs[51] = Direction.NORTH;
                    currented[51] = null;
                    wait[51] = false;
                    setChecked(51);

                    if (dest[51]) return 51;

                    addToQueue(51);
                }
            }
            if(toCheck59){//debugPoint(59, rc);
                if(currents[59]!=Direction.CENTER&&cost%10+cooldowns[59]>9) {
                    if (cost%10>0&&cooldowns[59]<10&&currents[50]==Direction.CENTER) {
                        costs[59] = cooldowns[59]+(cost+9)/10*10;
                        dirs[59] = Direction.NORTHEAST;
                        wait[59] = true;
                        currented[59] = null;
                        setChecked(59);

                        if (dest[59]) return 59;

                        addToQueue(59);
                    }
                    int currentTile = moveWithCurrent(59);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[59];
                        dirs[currentTile] = currents[59];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[59] = cost + cooldowns[59];
                    dirs[59] = Direction.NORTHEAST;
                    currented[59] = null;
                    wait[59] = false;
                    setChecked(59);

                    if (dest[59]) return 59;

                    addToQueue(59);
                }
            }
            if(toCheck58){//debugPoint(58, rc);
                if(currents[58]!=Direction.CENTER&&cost%10+cooldowns[58]>9) {
                    if (cost%10>0&&cooldowns[58]<10&&currents[50]==Direction.CENTER) {
                        costs[58] = cooldowns[58]+(cost+9)/10*10;
                        dirs[58] = Direction.EAST;
                        wait[58] = true;
                        currented[58] = null;
                        setChecked(58);

                        if (dest[58]) return 58;

                        addToQueue(58);
                    }
                    int currentTile = moveWithCurrent(58);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[58];
                        dirs[currentTile] = currents[58];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[58] = cost + cooldowns[58];
                    dirs[58] = Direction.EAST;
                    currented[58] = null;
                    wait[58] = false;
                    setChecked(58);

                    if (dest[58]) return 58;

                    addToQueue(58);
                }
            }
            if(toCheck57){//debugPoint(57, rc);
                if(currents[57]!=Direction.CENTER&&cost%10+cooldowns[57]>9) {
                    if (cost%10>0&&cooldowns[57]<10&&currents[50]==Direction.CENTER) {
                        costs[57] = cooldowns[57]+(cost+9)/10*10;
                        dirs[57] = Direction.SOUTHEAST;
                        wait[57] = true;
                        currented[57] = null;
                        setChecked(57);

                        if (dest[57]) return 57;

                        addToQueue(57);
                    }
                    int currentTile = moveWithCurrent(57);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[57];
                        dirs[currentTile] = currents[57];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[57] = cost + cooldowns[57];
                    dirs[57] = Direction.SOUTHEAST;
                    currented[57] = null;
                    wait[57] = false;
                    setChecked(57);

                    if (dest[57]) return 57;

                    addToQueue(57);
                }
            }
            if(toCheck49){//debugPoint(49, rc);
                if(currents[49]!=Direction.CENTER&&cost%10+cooldowns[49]>9) {
                    if (cost%10>0&&cooldowns[49]<10&&currents[50]==Direction.CENTER) {
                        costs[49] = cooldowns[49]+(cost+9)/10*10;
                        dirs[49] = Direction.SOUTH;
                        wait[49] = true;
                        currented[49] = null;
                        setChecked(49);

                        if (dest[49]) return 49;

                        addToQueue(49);
                    }
                    int currentTile = moveWithCurrent(49);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[49];
                        dirs[currentTile] = currents[49];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[49] = cost + cooldowns[49];
                    dirs[49] = Direction.SOUTH;
                    currented[49] = null;
                    wait[49] = false;
                    setChecked(49);

                    if (dest[49]) return 49;

                    addToQueue(49);
                }
            }
            if(toCheck40){//debugPoint(40, rc);
                if(currents[40]!=Direction.CENTER&&cost%10+cooldowns[40]>9) {
                    if (cost%10>0&&cooldowns[40]<10&&currents[50]==Direction.CENTER) {
                        costs[40] = cooldowns[40]+(cost+9)/10*10;
                        dirs[40] = Direction.SOUTHWEST;
                        wait[40] = true;
                        currented[40] = null;
                        setChecked(40);

                        if (dest[40]) return 40;

                        addToQueue(40);
                    }
                    int currentTile = moveWithCurrent(40);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[40];
                        dirs[currentTile] = currents[40];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[40] = cost + cooldowns[40];
                    dirs[40] = Direction.SOUTHWEST;
                    currented[40] = null;
                    wait[40] = false;
                    setChecked(40);

                    if (dest[40]) return 40;

                    addToQueue(40);
                }
            }
            break;case 51:
        cost=costs[51];if(toCheck42){//debugPoint(42, rc);
                if(currents[42]!=Direction.CENTER&&cost%10+cooldowns[42]>9) {
                    if (cost%10>0&&cooldowns[42]<10&&currents[51]==Direction.CENTER) {
                        costs[42] = cooldowns[42]+(cost+9)/10*10;
                        dirs[42] = Direction.WEST;
                        wait[42] = true;
                        currented[42] = null;
                        setChecked(42);

                        if (dest[42]) return 42;

                        addToQueue(42);
                    }
                    int currentTile = moveWithCurrent(42);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[42];
                        dirs[currentTile] = currents[42];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[42] = cost + cooldowns[42];
                    dirs[42] = Direction.WEST;
                    currented[42] = null;
                    wait[42] = false;
                    setChecked(42);

                    if (dest[42]) return 42;

                    addToQueue(42);
                }
            }
            if(toCheck43){//debugPoint(43, rc);
                if(currents[43]!=Direction.CENTER&&cost%10+cooldowns[43]>9) {
                    if (cost%10>0&&cooldowns[43]<10&&currents[51]==Direction.CENTER) {
                        costs[43] = cooldowns[43]+(cost+9)/10*10;
                        dirs[43] = Direction.NORTHWEST;
                        wait[43] = true;
                        currented[43] = null;
                        setChecked(43);

                        if (dest[43]) return 43;

                        addToQueue(43);
                    }
                    int currentTile = moveWithCurrent(43);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[43];
                        dirs[currentTile] = currents[43];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[43] = cost + cooldowns[43];
                    dirs[43] = Direction.NORTHWEST;
                    currented[43] = null;
                    wait[43] = false;
                    setChecked(43);

                    if (dest[43]) return 43;

                    addToQueue(43);
                }
            }
            if(toCheck52){//debugPoint(52, rc);
                if(currents[52]!=Direction.CENTER&&cost%10+cooldowns[52]>9) {
                    if (cost%10>0&&cooldowns[52]<10&&currents[51]==Direction.CENTER) {
                        costs[52] = cooldowns[52]+(cost+9)/10*10;
                        dirs[52] = Direction.NORTH;
                        wait[52] = true;
                        currented[52] = null;
                        setChecked(52);

                        if (dest[52]) return 52;

                        addToQueue(52);
                    }
                    int currentTile = moveWithCurrent(52);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[52];
                        dirs[currentTile] = currents[52];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[52] = cost + cooldowns[52];
                    dirs[52] = Direction.NORTH;
                    currented[52] = null;
                    wait[52] = false;
                    setChecked(52);

                    if (dest[52]) return 52;

                    addToQueue(52);
                }
            }
            if(toCheck60){//debugPoint(60, rc);
                if(currents[60]!=Direction.CENTER&&cost%10+cooldowns[60]>9) {
                    if (cost%10>0&&cooldowns[60]<10&&currents[51]==Direction.CENTER) {
                        costs[60] = cooldowns[60]+(cost+9)/10*10;
                        dirs[60] = Direction.NORTHEAST;
                        wait[60] = true;
                        currented[60] = null;
                        setChecked(60);

                        if (dest[60]) return 60;

                        addToQueue(60);
                    }
                    int currentTile = moveWithCurrent(60);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[60];
                        dirs[currentTile] = currents[60];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[60] = cost + cooldowns[60];
                    dirs[60] = Direction.NORTHEAST;
                    currented[60] = null;
                    wait[60] = false;
                    setChecked(60);

                    if (dest[60]) return 60;

                    addToQueue(60);
                }
            }
            if(toCheck59){//debugPoint(59, rc);
                if(currents[59]!=Direction.CENTER&&cost%10+cooldowns[59]>9) {
                    if (cost%10>0&&cooldowns[59]<10&&currents[51]==Direction.CENTER) {
                        costs[59] = cooldowns[59]+(cost+9)/10*10;
                        dirs[59] = Direction.EAST;
                        wait[59] = true;
                        currented[59] = null;
                        setChecked(59);

                        if (dest[59]) return 59;

                        addToQueue(59);
                    }
                    int currentTile = moveWithCurrent(59);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[59];
                        dirs[currentTile] = currents[59];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[59] = cost + cooldowns[59];
                    dirs[59] = Direction.EAST;
                    currented[59] = null;
                    wait[59] = false;
                    setChecked(59);

                    if (dest[59]) return 59;

                    addToQueue(59);
                }
            }
            if(toCheck58){//debugPoint(58, rc);
                if(currents[58]!=Direction.CENTER&&cost%10+cooldowns[58]>9) {
                    if (cost%10>0&&cooldowns[58]<10&&currents[51]==Direction.CENTER) {
                        costs[58] = cooldowns[58]+(cost+9)/10*10;
                        dirs[58] = Direction.SOUTHEAST;
                        wait[58] = true;
                        currented[58] = null;
                        setChecked(58);

                        if (dest[58]) return 58;

                        addToQueue(58);
                    }
                    int currentTile = moveWithCurrent(58);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[58];
                        dirs[currentTile] = currents[58];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[58] = cost + cooldowns[58];
                    dirs[58] = Direction.SOUTHEAST;
                    currented[58] = null;
                    wait[58] = false;
                    setChecked(58);

                    if (dest[58]) return 58;

                    addToQueue(58);
                }
            }
            if(toCheck50){//debugPoint(50, rc);
                if(currents[50]!=Direction.CENTER&&cost%10+cooldowns[50]>9) {
                    if (cost%10>0&&cooldowns[50]<10&&currents[51]==Direction.CENTER) {
                        costs[50] = cooldowns[50]+(cost+9)/10*10;
                        dirs[50] = Direction.SOUTH;
                        wait[50] = true;
                        currented[50] = null;
                        setChecked(50);

                        if (dest[50]) return 50;

                        addToQueue(50);
                    }
                    int currentTile = moveWithCurrent(50);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[50];
                        dirs[currentTile] = currents[50];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[50] = cost + cooldowns[50];
                    dirs[50] = Direction.SOUTH;
                    currented[50] = null;
                    wait[50] = false;
                    setChecked(50);

                    if (dest[50]) return 50;

                    addToQueue(50);
                }
            }
            if(toCheck41){//debugPoint(41, rc);
                if(currents[41]!=Direction.CENTER&&cost%10+cooldowns[41]>9) {
                    if (cost%10>0&&cooldowns[41]<10&&currents[51]==Direction.CENTER) {
                        costs[41] = cooldowns[41]+(cost+9)/10*10;
                        dirs[41] = Direction.SOUTHWEST;
                        wait[41] = true;
                        currented[41] = null;
                        setChecked(41);

                        if (dest[41]) return 41;

                        addToQueue(41);
                    }
                    int currentTile = moveWithCurrent(41);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[41];
                        dirs[currentTile] = currents[41];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[41] = cost + cooldowns[41];
                    dirs[41] = Direction.SOUTHWEST;
                    currented[41] = null;
                    wait[41] = false;
                    setChecked(41);

                    if (dest[41]) return 41;

                    addToQueue(41);
                }
            }
            break;
        }
    return -1;
    }
    public static int dijkstraSub4(RobotController rc, int n) {int cost; switch(n) {case 52:
        cost=costs[52];if(toCheck43){//debugPoint(43, rc);
                if(currents[43]!=Direction.CENTER&&cost%10+cooldowns[43]>9) {
                    if (cost%10>0&&cooldowns[43]<10&&currents[52]==Direction.CENTER) {
                        costs[43] = cooldowns[43]+(cost+9)/10*10;
                        dirs[43] = Direction.WEST;
                        wait[43] = true;
                        currented[43] = null;
                        setChecked(43);

                        if (dest[43]) return 43;

                        addToQueue(43);
                    }
                    int currentTile = moveWithCurrent(43);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[43];
                        dirs[currentTile] = currents[43];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[43] = cost + cooldowns[43];
                    dirs[43] = Direction.WEST;
                    currented[43] = null;
                    wait[43] = false;
                    setChecked(43);

                    if (dest[43]) return 43;

                    addToQueue(43);
                }
            }
            if(toCheck44){//debugPoint(44, rc);
                if(currents[44]!=Direction.CENTER&&cost%10+cooldowns[44]>9) {
                    if (cost%10>0&&cooldowns[44]<10&&currents[52]==Direction.CENTER) {
                        costs[44] = cooldowns[44]+(cost+9)/10*10;
                        dirs[44] = Direction.NORTHWEST;
                        wait[44] = true;
                        currented[44] = null;
                        setChecked(44);

                        if (dest[44]) return 44;

                        addToQueue(44);
                    }
                    int currentTile = moveWithCurrent(44);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[44];
                        dirs[currentTile] = currents[44];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[44] = cost + cooldowns[44];
                    dirs[44] = Direction.NORTHWEST;
                    currented[44] = null;
                    wait[44] = false;
                    setChecked(44);

                    if (dest[44]) return 44;

                    addToQueue(44);
                }
            }
            if(toCheck53){//debugPoint(53, rc);
                if(currents[53]!=Direction.CENTER&&cost%10+cooldowns[53]>9) {
                    if (cost%10>0&&cooldowns[53]<10&&currents[52]==Direction.CENTER) {
                        costs[53] = cooldowns[53]+(cost+9)/10*10;
                        dirs[53] = Direction.NORTH;
                        wait[53] = true;
                        currented[53] = null;
                        setChecked(53);

                        if (dest[53]) return 53;

                        addToQueue(53);
                    }
                    int currentTile = moveWithCurrent(53);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[53];
                        dirs[currentTile] = currents[53];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[53] = cost + cooldowns[53];
                    dirs[53] = Direction.NORTH;
                    currented[53] = null;
                    wait[53] = false;
                    setChecked(53);

                    if (dest[53]) return 53;

                    addToQueue(53);
                }
            }
            if(toCheck61){//debugPoint(61, rc);
                if(currents[61]!=Direction.CENTER&&cost%10+cooldowns[61]>9) {
                    if (cost%10>0&&cooldowns[61]<10&&currents[52]==Direction.CENTER) {
                        costs[61] = cooldowns[61]+(cost+9)/10*10;
                        dirs[61] = Direction.NORTHEAST;
                        wait[61] = true;
                        currented[61] = null;
                        setChecked(61);

                        if (dest[61]) return 61;

                        addToQueue(61);
                    }
                    int currentTile = moveWithCurrent(61);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[61];
                        dirs[currentTile] = currents[61];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[61] = cost + cooldowns[61];
                    dirs[61] = Direction.NORTHEAST;
                    currented[61] = null;
                    wait[61] = false;
                    setChecked(61);

                    if (dest[61]) return 61;

                    addToQueue(61);
                }
            }
            if(toCheck60){//debugPoint(60, rc);
                if(currents[60]!=Direction.CENTER&&cost%10+cooldowns[60]>9) {
                    if (cost%10>0&&cooldowns[60]<10&&currents[52]==Direction.CENTER) {
                        costs[60] = cooldowns[60]+(cost+9)/10*10;
                        dirs[60] = Direction.EAST;
                        wait[60] = true;
                        currented[60] = null;
                        setChecked(60);

                        if (dest[60]) return 60;

                        addToQueue(60);
                    }
                    int currentTile = moveWithCurrent(60);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[60];
                        dirs[currentTile] = currents[60];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[60] = cost + cooldowns[60];
                    dirs[60] = Direction.EAST;
                    currented[60] = null;
                    wait[60] = false;
                    setChecked(60);

                    if (dest[60]) return 60;

                    addToQueue(60);
                }
            }
            if(toCheck59){//debugPoint(59, rc);
                if(currents[59]!=Direction.CENTER&&cost%10+cooldowns[59]>9) {
                    if (cost%10>0&&cooldowns[59]<10&&currents[52]==Direction.CENTER) {
                        costs[59] = cooldowns[59]+(cost+9)/10*10;
                        dirs[59] = Direction.SOUTHEAST;
                        wait[59] = true;
                        currented[59] = null;
                        setChecked(59);

                        if (dest[59]) return 59;

                        addToQueue(59);
                    }
                    int currentTile = moveWithCurrent(59);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[59];
                        dirs[currentTile] = currents[59];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[59] = cost + cooldowns[59];
                    dirs[59] = Direction.SOUTHEAST;
                    currented[59] = null;
                    wait[59] = false;
                    setChecked(59);

                    if (dest[59]) return 59;

                    addToQueue(59);
                }
            }
            if(toCheck51){//debugPoint(51, rc);
                if(currents[51]!=Direction.CENTER&&cost%10+cooldowns[51]>9) {
                    if (cost%10>0&&cooldowns[51]<10&&currents[52]==Direction.CENTER) {
                        costs[51] = cooldowns[51]+(cost+9)/10*10;
                        dirs[51] = Direction.SOUTH;
                        wait[51] = true;
                        currented[51] = null;
                        setChecked(51);

                        if (dest[51]) return 51;

                        addToQueue(51);
                    }
                    int currentTile = moveWithCurrent(51);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[51];
                        dirs[currentTile] = currents[51];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[51] = cost + cooldowns[51];
                    dirs[51] = Direction.SOUTH;
                    currented[51] = null;
                    wait[51] = false;
                    setChecked(51);

                    if (dest[51]) return 51;

                    addToQueue(51);
                }
            }
            if(toCheck42){//debugPoint(42, rc);
                if(currents[42]!=Direction.CENTER&&cost%10+cooldowns[42]>9) {
                    if (cost%10>0&&cooldowns[42]<10&&currents[52]==Direction.CENTER) {
                        costs[42] = cooldowns[42]+(cost+9)/10*10;
                        dirs[42] = Direction.SOUTHWEST;
                        wait[42] = true;
                        currented[42] = null;
                        setChecked(42);

                        if (dest[42]) return 42;

                        addToQueue(42);
                    }
                    int currentTile = moveWithCurrent(42);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[42];
                        dirs[currentTile] = currents[42];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[42] = cost + cooldowns[42];
                    dirs[42] = Direction.SOUTHWEST;
                    currented[42] = null;
                    wait[42] = false;
                    setChecked(42);

                    if (dest[42]) return 42;

                    addToQueue(42);
                }
            }
            break;case 53:
        cost=costs[53];if(toCheck44){//debugPoint(44, rc);
                if(currents[44]!=Direction.CENTER&&cost%10+cooldowns[44]>9) {
                    if (cost%10>0&&cooldowns[44]<10&&currents[53]==Direction.CENTER) {
                        costs[44] = cooldowns[44]+(cost+9)/10*10;
                        dirs[44] = Direction.WEST;
                        wait[44] = true;
                        currented[44] = null;
                        setChecked(44);

                        if (dest[44]) return 44;

                        addToQueue(44);
                    }
                    int currentTile = moveWithCurrent(44);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[44];
                        dirs[currentTile] = currents[44];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[44] = cost + cooldowns[44];
                    dirs[44] = Direction.WEST;
                    currented[44] = null;
                    wait[44] = false;
                    setChecked(44);

                    if (dest[44]) return 44;

                    addToQueue(44);
                }
            }
            if(toCheck45){//debugPoint(45, rc);
                if(currents[45]!=Direction.CENTER&&cost%10+cooldowns[45]>9) {
                    if (cost%10>0&&cooldowns[45]<10&&currents[53]==Direction.CENTER) {
                        costs[45] = cooldowns[45]+(cost+9)/10*10;
                        dirs[45] = Direction.NORTHWEST;
                        wait[45] = true;
                        currented[45] = null;
                        setChecked(45);

                        if (dest[45]) return 45;

                        addToQueue(45);
                    }
                    int currentTile = moveWithCurrent(45);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[45];
                        dirs[currentTile] = currents[45];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[45] = cost + cooldowns[45];
                    dirs[45] = Direction.NORTHWEST;
                    currented[45] = null;
                    wait[45] = false;
                    setChecked(45);

                    if (dest[45]) return 45;

                    addToQueue(45);
                }
            }
            if(toCheck54){//debugPoint(54, rc);
                if(currents[54]!=Direction.CENTER&&cost%10+cooldowns[54]>9) {
                    if (cost%10>0&&cooldowns[54]<10&&currents[53]==Direction.CENTER) {
                        costs[54] = cooldowns[54]+(cost+9)/10*10;
                        dirs[54] = Direction.NORTH;
                        wait[54] = true;
                        currented[54] = null;
                        setChecked(54);

                        if (dest[54]) return 54;

                        addToQueue(54);
                    }
                    int currentTile = moveWithCurrent(54);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[54];
                        dirs[currentTile] = currents[54];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[54] = cost + cooldowns[54];
                    dirs[54] = Direction.NORTH;
                    currented[54] = null;
                    wait[54] = false;
                    setChecked(54);

                    if (dest[54]) return 54;

                    addToQueue(54);
                }
            }
            if(toCheck62){//debugPoint(62, rc);
                if(currents[62]!=Direction.CENTER&&cost%10+cooldowns[62]>9) {
                    if (cost%10>0&&cooldowns[62]<10&&currents[53]==Direction.CENTER) {
                        costs[62] = cooldowns[62]+(cost+9)/10*10;
                        dirs[62] = Direction.NORTHEAST;
                        wait[62] = true;
                        currented[62] = null;
                        setChecked(62);

                        if (dest[62]) return 62;

                        addToQueue(62);
                    }
                    int currentTile = moveWithCurrent(62);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[62];
                        dirs[currentTile] = currents[62];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[62] = cost + cooldowns[62];
                    dirs[62] = Direction.NORTHEAST;
                    currented[62] = null;
                    wait[62] = false;
                    setChecked(62);

                    if (dest[62]) return 62;

                    addToQueue(62);
                }
            }
            if(toCheck61){//debugPoint(61, rc);
                if(currents[61]!=Direction.CENTER&&cost%10+cooldowns[61]>9) {
                    if (cost%10>0&&cooldowns[61]<10&&currents[53]==Direction.CENTER) {
                        costs[61] = cooldowns[61]+(cost+9)/10*10;
                        dirs[61] = Direction.EAST;
                        wait[61] = true;
                        currented[61] = null;
                        setChecked(61);

                        if (dest[61]) return 61;

                        addToQueue(61);
                    }
                    int currentTile = moveWithCurrent(61);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[61];
                        dirs[currentTile] = currents[61];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[61] = cost + cooldowns[61];
                    dirs[61] = Direction.EAST;
                    currented[61] = null;
                    wait[61] = false;
                    setChecked(61);

                    if (dest[61]) return 61;

                    addToQueue(61);
                }
            }
            if(toCheck60){//debugPoint(60, rc);
                if(currents[60]!=Direction.CENTER&&cost%10+cooldowns[60]>9) {
                    if (cost%10>0&&cooldowns[60]<10&&currents[53]==Direction.CENTER) {
                        costs[60] = cooldowns[60]+(cost+9)/10*10;
                        dirs[60] = Direction.SOUTHEAST;
                        wait[60] = true;
                        currented[60] = null;
                        setChecked(60);

                        if (dest[60]) return 60;

                        addToQueue(60);
                    }
                    int currentTile = moveWithCurrent(60);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[60];
                        dirs[currentTile] = currents[60];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[60] = cost + cooldowns[60];
                    dirs[60] = Direction.SOUTHEAST;
                    currented[60] = null;
                    wait[60] = false;
                    setChecked(60);

                    if (dest[60]) return 60;

                    addToQueue(60);
                }
            }
            if(toCheck52){//debugPoint(52, rc);
                if(currents[52]!=Direction.CENTER&&cost%10+cooldowns[52]>9) {
                    if (cost%10>0&&cooldowns[52]<10&&currents[53]==Direction.CENTER) {
                        costs[52] = cooldowns[52]+(cost+9)/10*10;
                        dirs[52] = Direction.SOUTH;
                        wait[52] = true;
                        currented[52] = null;
                        setChecked(52);

                        if (dest[52]) return 52;

                        addToQueue(52);
                    }
                    int currentTile = moveWithCurrent(52);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[52];
                        dirs[currentTile] = currents[52];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[52] = cost + cooldowns[52];
                    dirs[52] = Direction.SOUTH;
                    currented[52] = null;
                    wait[52] = false;
                    setChecked(52);

                    if (dest[52]) return 52;

                    addToQueue(52);
                }
            }
            if(toCheck43){//debugPoint(43, rc);
                if(currents[43]!=Direction.CENTER&&cost%10+cooldowns[43]>9) {
                    if (cost%10>0&&cooldowns[43]<10&&currents[53]==Direction.CENTER) {
                        costs[43] = cooldowns[43]+(cost+9)/10*10;
                        dirs[43] = Direction.SOUTHWEST;
                        wait[43] = true;
                        currented[43] = null;
                        setChecked(43);

                        if (dest[43]) return 43;

                        addToQueue(43);
                    }
                    int currentTile = moveWithCurrent(43);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[43];
                        dirs[currentTile] = currents[43];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[43] = cost + cooldowns[43];
                    dirs[43] = Direction.SOUTHWEST;
                    currented[43] = null;
                    wait[43] = false;
                    setChecked(43);

                    if (dest[43]) return 43;

                    addToQueue(43);
                }
            }
            break;case 54:
        cost=costs[54];if(toCheck45){//debugPoint(45, rc);
                if(currents[45]!=Direction.CENTER&&cost%10+cooldowns[45]>9) {
                    if (cost%10>0&&cooldowns[45]<10&&currents[54]==Direction.CENTER) {
                        costs[45] = cooldowns[45]+(cost+9)/10*10;
                        dirs[45] = Direction.WEST;
                        wait[45] = true;
                        currented[45] = null;
                        setChecked(45);

                        if (dest[45]) return 45;

                        addToQueue(45);
                    }
                    int currentTile = moveWithCurrent(45);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[45];
                        dirs[currentTile] = currents[45];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[45] = cost + cooldowns[45];
                    dirs[45] = Direction.WEST;
                    currented[45] = null;
                    wait[45] = false;
                    setChecked(45);

                    if (dest[45]) return 45;

                    addToQueue(45);
                }
            }
            if(toCheck46){//debugPoint(46, rc);
                if(currents[46]!=Direction.CENTER&&cost%10+cooldowns[46]>9) {
                    if (cost%10>0&&cooldowns[46]<10&&currents[54]==Direction.CENTER) {
                        costs[46] = cooldowns[46]+(cost+9)/10*10;
                        dirs[46] = Direction.NORTHWEST;
                        wait[46] = true;
                        currented[46] = null;
                        setChecked(46);

                        if (dest[46]) return 46;

                        addToQueue(46);
                    }
                    int currentTile = moveWithCurrent(46);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[46];
                        dirs[currentTile] = currents[46];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[46] = cost + cooldowns[46];
                    dirs[46] = Direction.NORTHWEST;
                    currented[46] = null;
                    wait[46] = false;
                    setChecked(46);

                    if (dest[46]) return 46;

                    addToQueue(46);
                }
            }
            if(toCheck55){//debugPoint(55, rc);
                if(currents[55]!=Direction.CENTER&&cost%10+cooldowns[55]>9) {
                    if (cost%10>0&&cooldowns[55]<10&&currents[54]==Direction.CENTER) {
                        costs[55] = cooldowns[55]+(cost+9)/10*10;
                        dirs[55] = Direction.NORTH;
                        wait[55] = true;
                        currented[55] = null;
                        setChecked(55);

                        if (dest[55]) return 55;

                        addToQueue(55);
                    }
                    int currentTile = moveWithCurrent(55);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[55];
                        dirs[currentTile] = currents[55];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[55] = cost + cooldowns[55];
                    dirs[55] = Direction.NORTH;
                    currented[55] = null;
                    wait[55] = false;
                    setChecked(55);

                    if (dest[55]) return 55;

                    addToQueue(55);
                }
            }
            if(toCheck63){//debugPoint(63, rc);
                if(currents[63]!=Direction.CENTER&&cost%10+cooldowns[63]>9) {
                    if (cost%10>0&&cooldowns[63]<10&&currents[54]==Direction.CENTER) {
                        costs[63] = cooldowns[63]+(cost+9)/10*10;
                        dirs[63] = Direction.NORTHEAST;
                        wait[63] = true;
                        currented[63] = null;
                        setChecked(63);

                        if (dest[63]) return 63;

                        addToQueue(63);
                    }
                    int currentTile = moveWithCurrent(63);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[63];
                        dirs[currentTile] = currents[63];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[63] = cost + cooldowns[63];
                    dirs[63] = Direction.NORTHEAST;
                    currented[63] = null;
                    wait[63] = false;
                    setChecked(63);

                    if (dest[63]) return 63;

                    addToQueue(63);
                }
            }
            if(toCheck62){//debugPoint(62, rc);
                if(currents[62]!=Direction.CENTER&&cost%10+cooldowns[62]>9) {
                    if (cost%10>0&&cooldowns[62]<10&&currents[54]==Direction.CENTER) {
                        costs[62] = cooldowns[62]+(cost+9)/10*10;
                        dirs[62] = Direction.EAST;
                        wait[62] = true;
                        currented[62] = null;
                        setChecked(62);

                        if (dest[62]) return 62;

                        addToQueue(62);
                    }
                    int currentTile = moveWithCurrent(62);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[62];
                        dirs[currentTile] = currents[62];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[62] = cost + cooldowns[62];
                    dirs[62] = Direction.EAST;
                    currented[62] = null;
                    wait[62] = false;
                    setChecked(62);

                    if (dest[62]) return 62;

                    addToQueue(62);
                }
            }
            if(toCheck61){//debugPoint(61, rc);
                if(currents[61]!=Direction.CENTER&&cost%10+cooldowns[61]>9) {
                    if (cost%10>0&&cooldowns[61]<10&&currents[54]==Direction.CENTER) {
                        costs[61] = cooldowns[61]+(cost+9)/10*10;
                        dirs[61] = Direction.SOUTHEAST;
                        wait[61] = true;
                        currented[61] = null;
                        setChecked(61);

                        if (dest[61]) return 61;

                        addToQueue(61);
                    }
                    int currentTile = moveWithCurrent(61);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[61];
                        dirs[currentTile] = currents[61];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[61] = cost + cooldowns[61];
                    dirs[61] = Direction.SOUTHEAST;
                    currented[61] = null;
                    wait[61] = false;
                    setChecked(61);

                    if (dest[61]) return 61;

                    addToQueue(61);
                }
            }
            if(toCheck53){//debugPoint(53, rc);
                if(currents[53]!=Direction.CENTER&&cost%10+cooldowns[53]>9) {
                    if (cost%10>0&&cooldowns[53]<10&&currents[54]==Direction.CENTER) {
                        costs[53] = cooldowns[53]+(cost+9)/10*10;
                        dirs[53] = Direction.SOUTH;
                        wait[53] = true;
                        currented[53] = null;
                        setChecked(53);

                        if (dest[53]) return 53;

                        addToQueue(53);
                    }
                    int currentTile = moveWithCurrent(53);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[53];
                        dirs[currentTile] = currents[53];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[53] = cost + cooldowns[53];
                    dirs[53] = Direction.SOUTH;
                    currented[53] = null;
                    wait[53] = false;
                    setChecked(53);

                    if (dest[53]) return 53;

                    addToQueue(53);
                }
            }
            if(toCheck44){//debugPoint(44, rc);
                if(currents[44]!=Direction.CENTER&&cost%10+cooldowns[44]>9) {
                    if (cost%10>0&&cooldowns[44]<10&&currents[54]==Direction.CENTER) {
                        costs[44] = cooldowns[44]+(cost+9)/10*10;
                        dirs[44] = Direction.SOUTHWEST;
                        wait[44] = true;
                        currented[44] = null;
                        setChecked(44);

                        if (dest[44]) return 44;

                        addToQueue(44);
                    }
                    int currentTile = moveWithCurrent(44);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[44];
                        dirs[currentTile] = currents[44];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[44] = cost + cooldowns[44];
                    dirs[44] = Direction.SOUTHWEST;
                    currented[44] = null;
                    wait[44] = false;
                    setChecked(44);

                    if (dest[44]) return 44;

                    addToQueue(44);
                }
            }
            break;case 55:
        cost=costs[55];if(toCheck46){//debugPoint(46, rc);
                if(currents[46]!=Direction.CENTER&&cost%10+cooldowns[46]>9) {
                    if (cost%10>0&&cooldowns[46]<10&&currents[55]==Direction.CENTER) {
                        costs[46] = cooldowns[46]+(cost+9)/10*10;
                        dirs[46] = Direction.WEST;
                        wait[46] = true;
                        currented[46] = null;
                        setChecked(46);

                        if (dest[46]) return 46;

                        addToQueue(46);
                    }
                    int currentTile = moveWithCurrent(46);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[46];
                        dirs[currentTile] = currents[46];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[46] = cost + cooldowns[46];
                    dirs[46] = Direction.WEST;
                    currented[46] = null;
                    wait[46] = false;
                    setChecked(46);

                    if (dest[46]) return 46;

                    addToQueue(46);
                }
            }
            if(toCheck47){//debugPoint(47, rc);
                if(currents[47]!=Direction.CENTER&&cost%10+cooldowns[47]>9) {
                    if (cost%10>0&&cooldowns[47]<10&&currents[55]==Direction.CENTER) {
                        costs[47] = cooldowns[47]+(cost+9)/10*10;
                        dirs[47] = Direction.NORTHWEST;
                        wait[47] = true;
                        currented[47] = null;
                        setChecked(47);

                        if (dest[47]) return 47;

                        addToQueue(47);
                    }
                    int currentTile = moveWithCurrent(47);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[47];
                        dirs[currentTile] = currents[47];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[47] = cost + cooldowns[47];
                    dirs[47] = Direction.NORTHWEST;
                    currented[47] = null;
                    wait[47] = false;
                    setChecked(47);

                    if (dest[47]) return 47;

                    addToQueue(47);
                }
            }
            if(toCheck56){//debugPoint(56, rc);
                if(currents[56]!=Direction.CENTER&&cost%10+cooldowns[56]>9) {
                    if (cost%10>0&&cooldowns[56]<10&&currents[55]==Direction.CENTER) {
                        costs[56] = cooldowns[56]+(cost+9)/10*10;
                        dirs[56] = Direction.NORTH;
                        wait[56] = true;
                        currented[56] = null;
                        setChecked(56);

                        if (dest[56]) return 56;

                        addToQueue(56);
                    }
                    int currentTile = moveWithCurrent(56);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[56];
                        dirs[currentTile] = currents[56];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[56] = cost + cooldowns[56];
                    dirs[56] = Direction.NORTH;
                    currented[56] = null;
                    wait[56] = false;
                    setChecked(56);

                    if (dest[56]) return 56;

                    addToQueue(56);
                }
            }
            if(toCheck63){//debugPoint(63, rc);
                if(currents[63]!=Direction.CENTER&&cost%10+cooldowns[63]>9) {
                    if (cost%10>0&&cooldowns[63]<10&&currents[55]==Direction.CENTER) {
                        costs[63] = cooldowns[63]+(cost+9)/10*10;
                        dirs[63] = Direction.EAST;
                        wait[63] = true;
                        currented[63] = null;
                        setChecked(63);

                        if (dest[63]) return 63;

                        addToQueue(63);
                    }
                    int currentTile = moveWithCurrent(63);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[63];
                        dirs[currentTile] = currents[63];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[63] = cost + cooldowns[63];
                    dirs[63] = Direction.EAST;
                    currented[63] = null;
                    wait[63] = false;
                    setChecked(63);

                    if (dest[63]) return 63;

                    addToQueue(63);
                }
            }
            if(toCheck62){//debugPoint(62, rc);
                if(currents[62]!=Direction.CENTER&&cost%10+cooldowns[62]>9) {
                    if (cost%10>0&&cooldowns[62]<10&&currents[55]==Direction.CENTER) {
                        costs[62] = cooldowns[62]+(cost+9)/10*10;
                        dirs[62] = Direction.SOUTHEAST;
                        wait[62] = true;
                        currented[62] = null;
                        setChecked(62);

                        if (dest[62]) return 62;

                        addToQueue(62);
                    }
                    int currentTile = moveWithCurrent(62);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[62];
                        dirs[currentTile] = currents[62];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[62] = cost + cooldowns[62];
                    dirs[62] = Direction.SOUTHEAST;
                    currented[62] = null;
                    wait[62] = false;
                    setChecked(62);

                    if (dest[62]) return 62;

                    addToQueue(62);
                }
            }
            if(toCheck54){//debugPoint(54, rc);
                if(currents[54]!=Direction.CENTER&&cost%10+cooldowns[54]>9) {
                    if (cost%10>0&&cooldowns[54]<10&&currents[55]==Direction.CENTER) {
                        costs[54] = cooldowns[54]+(cost+9)/10*10;
                        dirs[54] = Direction.SOUTH;
                        wait[54] = true;
                        currented[54] = null;
                        setChecked(54);

                        if (dest[54]) return 54;

                        addToQueue(54);
                    }
                    int currentTile = moveWithCurrent(54);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[54];
                        dirs[currentTile] = currents[54];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[54] = cost + cooldowns[54];
                    dirs[54] = Direction.SOUTH;
                    currented[54] = null;
                    wait[54] = false;
                    setChecked(54);

                    if (dest[54]) return 54;

                    addToQueue(54);
                }
            }
            if(toCheck45){//debugPoint(45, rc);
                if(currents[45]!=Direction.CENTER&&cost%10+cooldowns[45]>9) {
                    if (cost%10>0&&cooldowns[45]<10&&currents[55]==Direction.CENTER) {
                        costs[45] = cooldowns[45]+(cost+9)/10*10;
                        dirs[45] = Direction.SOUTHWEST;
                        wait[45] = true;
                        currented[45] = null;
                        setChecked(45);

                        if (dest[45]) return 45;

                        addToQueue(45);
                    }
                    int currentTile = moveWithCurrent(45);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[45];
                        dirs[currentTile] = currents[45];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[45] = cost + cooldowns[45];
                    dirs[45] = Direction.SOUTHWEST;
                    currented[45] = null;
                    wait[45] = false;
                    setChecked(45);

                    if (dest[45]) return 45;

                    addToQueue(45);
                }
            }
            break;case 56:
        cost=costs[56];if(toCheck47){//debugPoint(47, rc);
                if(currents[47]!=Direction.CENTER&&cost%10+cooldowns[47]>9) {
                    if (cost%10>0&&cooldowns[47]<10&&currents[56]==Direction.CENTER) {
                        costs[47] = cooldowns[47]+(cost+9)/10*10;
                        dirs[47] = Direction.WEST;
                        wait[47] = true;
                        currented[47] = null;
                        setChecked(47);

                        if (dest[47]) return 47;

                        addToQueue(47);
                    }
                    int currentTile = moveWithCurrent(47);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[47];
                        dirs[currentTile] = currents[47];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[47] = cost + cooldowns[47];
                    dirs[47] = Direction.WEST;
                    currented[47] = null;
                    wait[47] = false;
                    setChecked(47);

                    if (dest[47]) return 47;

                    addToQueue(47);
                }
            }
            if(toCheck63){//debugPoint(63, rc);
                if(currents[63]!=Direction.CENTER&&cost%10+cooldowns[63]>9) {
                    if (cost%10>0&&cooldowns[63]<10&&currents[56]==Direction.CENTER) {
                        costs[63] = cooldowns[63]+(cost+9)/10*10;
                        dirs[63] = Direction.SOUTHEAST;
                        wait[63] = true;
                        currented[63] = null;
                        setChecked(63);

                        if (dest[63]) return 63;

                        addToQueue(63);
                    }
                    int currentTile = moveWithCurrent(63);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[63];
                        dirs[currentTile] = currents[63];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[63] = cost + cooldowns[63];
                    dirs[63] = Direction.SOUTHEAST;
                    currented[63] = null;
                    wait[63] = false;
                    setChecked(63);

                    if (dest[63]) return 63;

                    addToQueue(63);
                }
            }
            if(toCheck55){//debugPoint(55, rc);
                if(currents[55]!=Direction.CENTER&&cost%10+cooldowns[55]>9) {
                    if (cost%10>0&&cooldowns[55]<10&&currents[56]==Direction.CENTER) {
                        costs[55] = cooldowns[55]+(cost+9)/10*10;
                        dirs[55] = Direction.SOUTH;
                        wait[55] = true;
                        currented[55] = null;
                        setChecked(55);

                        if (dest[55]) return 55;

                        addToQueue(55);
                    }
                    int currentTile = moveWithCurrent(55);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[55];
                        dirs[currentTile] = currents[55];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[55] = cost + cooldowns[55];
                    dirs[55] = Direction.SOUTH;
                    currented[55] = null;
                    wait[55] = false;
                    setChecked(55);

                    if (dest[55]) return 55;

                    addToQueue(55);
                }
            }
            if(toCheck46){//debugPoint(46, rc);
                if(currents[46]!=Direction.CENTER&&cost%10+cooldowns[46]>9) {
                    if (cost%10>0&&cooldowns[46]<10&&currents[56]==Direction.CENTER) {
                        costs[46] = cooldowns[46]+(cost+9)/10*10;
                        dirs[46] = Direction.SOUTHWEST;
                        wait[46] = true;
                        currented[46] = null;
                        setChecked(46);

                        if (dest[46]) return 46;

                        addToQueue(46);
                    }
                    int currentTile = moveWithCurrent(46);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[46];
                        dirs[currentTile] = currents[46];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[46] = cost + cooldowns[46];
                    dirs[46] = Direction.SOUTHWEST;
                    currented[46] = null;
                    wait[46] = false;
                    setChecked(46);

                    if (dest[46]) return 46;

                    addToQueue(46);
                }
            }
            break;case 57:
        cost=costs[57];if(toCheck49){//debugPoint(49, rc);
                if(currents[49]!=Direction.CENTER&&cost%10+cooldowns[49]>9) {
                    if (cost%10>0&&cooldowns[49]<10&&currents[57]==Direction.CENTER) {
                        costs[49] = cooldowns[49]+(cost+9)/10*10;
                        dirs[49] = Direction.WEST;
                        wait[49] = true;
                        currented[49] = null;
                        setChecked(49);

                        if (dest[49]) return 49;

                        addToQueue(49);
                    }
                    int currentTile = moveWithCurrent(49);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[49];
                        dirs[currentTile] = currents[49];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[49] = cost + cooldowns[49];
                    dirs[49] = Direction.WEST;
                    currented[49] = null;
                    wait[49] = false;
                    setChecked(49);

                    if (dest[49]) return 49;

                    addToQueue(49);
                }
            }
            if(toCheck50){//debugPoint(50, rc);
                if(currents[50]!=Direction.CENTER&&cost%10+cooldowns[50]>9) {
                    if (cost%10>0&&cooldowns[50]<10&&currents[57]==Direction.CENTER) {
                        costs[50] = cooldowns[50]+(cost+9)/10*10;
                        dirs[50] = Direction.NORTHWEST;
                        wait[50] = true;
                        currented[50] = null;
                        setChecked(50);

                        if (dest[50]) return 50;

                        addToQueue(50);
                    }
                    int currentTile = moveWithCurrent(50);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[50];
                        dirs[currentTile] = currents[50];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[50] = cost + cooldowns[50];
                    dirs[50] = Direction.NORTHWEST;
                    currented[50] = null;
                    wait[50] = false;
                    setChecked(50);

                    if (dest[50]) return 50;

                    addToQueue(50);
                }
            }
            if(toCheck58){//debugPoint(58, rc);
                if(currents[58]!=Direction.CENTER&&cost%10+cooldowns[58]>9) {
                    if (cost%10>0&&cooldowns[58]<10&&currents[57]==Direction.CENTER) {
                        costs[58] = cooldowns[58]+(cost+9)/10*10;
                        dirs[58] = Direction.NORTH;
                        wait[58] = true;
                        currented[58] = null;
                        setChecked(58);

                        if (dest[58]) return 58;

                        addToQueue(58);
                    }
                    int currentTile = moveWithCurrent(58);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[58];
                        dirs[currentTile] = currents[58];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[58] = cost + cooldowns[58];
                    dirs[58] = Direction.NORTH;
                    currented[58] = null;
                    wait[58] = false;
                    setChecked(58);

                    if (dest[58]) return 58;

                    addToQueue(58);
                }
            }
            if(toCheck64){//debugPoint(64, rc);
                if(currents[64]!=Direction.CENTER&&cost%10+cooldowns[64]>9) {
                    if (cost%10>0&&cooldowns[64]<10&&currents[57]==Direction.CENTER) {
                        costs[64] = cooldowns[64]+(cost+9)/10*10;
                        dirs[64] = Direction.NORTHEAST;
                        wait[64] = true;
                        currented[64] = null;
                        setChecked(64);

                        if (dest[64]) return 64;

                        addToQueue(64);
                    }
                    int currentTile = moveWithCurrent(64);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[64];
                        dirs[currentTile] = currents[64];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[64] = cost + cooldowns[64];
                    dirs[64] = Direction.NORTHEAST;
                    currented[64] = null;
                    wait[64] = false;
                    setChecked(64);

                    if (dest[64]) return 64;

                    addToQueue(64);
                }
            }
            if(toCheck48){//debugPoint(48, rc);
                if(currents[48]!=Direction.CENTER&&cost%10+cooldowns[48]>9) {
                    if (cost%10>0&&cooldowns[48]<10&&currents[57]==Direction.CENTER) {
                        costs[48] = cooldowns[48]+(cost+9)/10*10;
                        dirs[48] = Direction.SOUTHWEST;
                        wait[48] = true;
                        currented[48] = null;
                        setChecked(48);

                        if (dest[48]) return 48;

                        addToQueue(48);
                    }
                    int currentTile = moveWithCurrent(48);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[48];
                        dirs[currentTile] = currents[48];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[48] = cost + cooldowns[48];
                    dirs[48] = Direction.SOUTHWEST;
                    currented[48] = null;
                    wait[48] = false;
                    setChecked(48);

                    if (dest[48]) return 48;

                    addToQueue(48);
                }
            }
            break;case 58:
        cost=costs[58];if(toCheck50){//debugPoint(50, rc);
                if(currents[50]!=Direction.CENTER&&cost%10+cooldowns[50]>9) {
                    if (cost%10>0&&cooldowns[50]<10&&currents[58]==Direction.CENTER) {
                        costs[50] = cooldowns[50]+(cost+9)/10*10;
                        dirs[50] = Direction.WEST;
                        wait[50] = true;
                        currented[50] = null;
                        setChecked(50);

                        if (dest[50]) return 50;

                        addToQueue(50);
                    }
                    int currentTile = moveWithCurrent(50);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[50];
                        dirs[currentTile] = currents[50];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[50] = cost + cooldowns[50];
                    dirs[50] = Direction.WEST;
                    currented[50] = null;
                    wait[50] = false;
                    setChecked(50);

                    if (dest[50]) return 50;

                    addToQueue(50);
                }
            }
            if(toCheck51){//debugPoint(51, rc);
                if(currents[51]!=Direction.CENTER&&cost%10+cooldowns[51]>9) {
                    if (cost%10>0&&cooldowns[51]<10&&currents[58]==Direction.CENTER) {
                        costs[51] = cooldowns[51]+(cost+9)/10*10;
                        dirs[51] = Direction.NORTHWEST;
                        wait[51] = true;
                        currented[51] = null;
                        setChecked(51);

                        if (dest[51]) return 51;

                        addToQueue(51);
                    }
                    int currentTile = moveWithCurrent(51);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[51];
                        dirs[currentTile] = currents[51];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[51] = cost + cooldowns[51];
                    dirs[51] = Direction.NORTHWEST;
                    currented[51] = null;
                    wait[51] = false;
                    setChecked(51);

                    if (dest[51]) return 51;

                    addToQueue(51);
                }
            }
            if(toCheck59){//debugPoint(59, rc);
                if(currents[59]!=Direction.CENTER&&cost%10+cooldowns[59]>9) {
                    if (cost%10>0&&cooldowns[59]<10&&currents[58]==Direction.CENTER) {
                        costs[59] = cooldowns[59]+(cost+9)/10*10;
                        dirs[59] = Direction.NORTH;
                        wait[59] = true;
                        currented[59] = null;
                        setChecked(59);

                        if (dest[59]) return 59;

                        addToQueue(59);
                    }
                    int currentTile = moveWithCurrent(59);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[59];
                        dirs[currentTile] = currents[59];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[59] = cost + cooldowns[59];
                    dirs[59] = Direction.NORTH;
                    currented[59] = null;
                    wait[59] = false;
                    setChecked(59);

                    if (dest[59]) return 59;

                    addToQueue(59);
                }
            }
            if(toCheck65){//debugPoint(65, rc);
                if(currents[65]!=Direction.CENTER&&cost%10+cooldowns[65]>9) {
                    if (cost%10>0&&cooldowns[65]<10&&currents[58]==Direction.CENTER) {
                        costs[65] = cooldowns[65]+(cost+9)/10*10;
                        dirs[65] = Direction.NORTHEAST;
                        wait[65] = true;
                        currented[65] = null;
                        setChecked(65);

                        if (dest[65]) return 65;

                        addToQueue(65);
                    }
                    int currentTile = moveWithCurrent(65);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[65];
                        dirs[currentTile] = currents[65];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[65] = cost + cooldowns[65];
                    dirs[65] = Direction.NORTHEAST;
                    currented[65] = null;
                    wait[65] = false;
                    setChecked(65);

                    if (dest[65]) return 65;

                    addToQueue(65);
                }
            }
            if(toCheck64){//debugPoint(64, rc);
                if(currents[64]!=Direction.CENTER&&cost%10+cooldowns[64]>9) {
                    if (cost%10>0&&cooldowns[64]<10&&currents[58]==Direction.CENTER) {
                        costs[64] = cooldowns[64]+(cost+9)/10*10;
                        dirs[64] = Direction.EAST;
                        wait[64] = true;
                        currented[64] = null;
                        setChecked(64);

                        if (dest[64]) return 64;

                        addToQueue(64);
                    }
                    int currentTile = moveWithCurrent(64);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[64];
                        dirs[currentTile] = currents[64];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[64] = cost + cooldowns[64];
                    dirs[64] = Direction.EAST;
                    currented[64] = null;
                    wait[64] = false;
                    setChecked(64);

                    if (dest[64]) return 64;

                    addToQueue(64);
                }
            }
            if(toCheck57){//debugPoint(57, rc);
                if(currents[57]!=Direction.CENTER&&cost%10+cooldowns[57]>9) {
                    if (cost%10>0&&cooldowns[57]<10&&currents[58]==Direction.CENTER) {
                        costs[57] = cooldowns[57]+(cost+9)/10*10;
                        dirs[57] = Direction.SOUTH;
                        wait[57] = true;
                        currented[57] = null;
                        setChecked(57);

                        if (dest[57]) return 57;

                        addToQueue(57);
                    }
                    int currentTile = moveWithCurrent(57);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[57];
                        dirs[currentTile] = currents[57];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[57] = cost + cooldowns[57];
                    dirs[57] = Direction.SOUTH;
                    currented[57] = null;
                    wait[57] = false;
                    setChecked(57);

                    if (dest[57]) return 57;

                    addToQueue(57);
                }
            }
            if(toCheck49){//debugPoint(49, rc);
                if(currents[49]!=Direction.CENTER&&cost%10+cooldowns[49]>9) {
                    if (cost%10>0&&cooldowns[49]<10&&currents[58]==Direction.CENTER) {
                        costs[49] = cooldowns[49]+(cost+9)/10*10;
                        dirs[49] = Direction.SOUTHWEST;
                        wait[49] = true;
                        currented[49] = null;
                        setChecked(49);

                        if (dest[49]) return 49;

                        addToQueue(49);
                    }
                    int currentTile = moveWithCurrent(49);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[49];
                        dirs[currentTile] = currents[49];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[49] = cost + cooldowns[49];
                    dirs[49] = Direction.SOUTHWEST;
                    currented[49] = null;
                    wait[49] = false;
                    setChecked(49);

                    if (dest[49]) return 49;

                    addToQueue(49);
                }
            }
            break;case 59:
        cost=costs[59];if(toCheck51){//debugPoint(51, rc);
                if(currents[51]!=Direction.CENTER&&cost%10+cooldowns[51]>9) {
                    if (cost%10>0&&cooldowns[51]<10&&currents[59]==Direction.CENTER) {
                        costs[51] = cooldowns[51]+(cost+9)/10*10;
                        dirs[51] = Direction.WEST;
                        wait[51] = true;
                        currented[51] = null;
                        setChecked(51);

                        if (dest[51]) return 51;

                        addToQueue(51);
                    }
                    int currentTile = moveWithCurrent(51);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[51];
                        dirs[currentTile] = currents[51];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[51] = cost + cooldowns[51];
                    dirs[51] = Direction.WEST;
                    currented[51] = null;
                    wait[51] = false;
                    setChecked(51);

                    if (dest[51]) return 51;

                    addToQueue(51);
                }
            }
            if(toCheck52){//debugPoint(52, rc);
                if(currents[52]!=Direction.CENTER&&cost%10+cooldowns[52]>9) {
                    if (cost%10>0&&cooldowns[52]<10&&currents[59]==Direction.CENTER) {
                        costs[52] = cooldowns[52]+(cost+9)/10*10;
                        dirs[52] = Direction.NORTHWEST;
                        wait[52] = true;
                        currented[52] = null;
                        setChecked(52);

                        if (dest[52]) return 52;

                        addToQueue(52);
                    }
                    int currentTile = moveWithCurrent(52);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[52];
                        dirs[currentTile] = currents[52];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[52] = cost + cooldowns[52];
                    dirs[52] = Direction.NORTHWEST;
                    currented[52] = null;
                    wait[52] = false;
                    setChecked(52);

                    if (dest[52]) return 52;

                    addToQueue(52);
                }
            }
            if(toCheck60){//debugPoint(60, rc);
                if(currents[60]!=Direction.CENTER&&cost%10+cooldowns[60]>9) {
                    if (cost%10>0&&cooldowns[60]<10&&currents[59]==Direction.CENTER) {
                        costs[60] = cooldowns[60]+(cost+9)/10*10;
                        dirs[60] = Direction.NORTH;
                        wait[60] = true;
                        currented[60] = null;
                        setChecked(60);

                        if (dest[60]) return 60;

                        addToQueue(60);
                    }
                    int currentTile = moveWithCurrent(60);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[60];
                        dirs[currentTile] = currents[60];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[60] = cost + cooldowns[60];
                    dirs[60] = Direction.NORTH;
                    currented[60] = null;
                    wait[60] = false;
                    setChecked(60);

                    if (dest[60]) return 60;

                    addToQueue(60);
                }
            }
            if(toCheck66){//debugPoint(66, rc);
                if(currents[66]!=Direction.CENTER&&cost%10+cooldowns[66]>9) {
                    if (cost%10>0&&cooldowns[66]<10&&currents[59]==Direction.CENTER) {
                        costs[66] = cooldowns[66]+(cost+9)/10*10;
                        dirs[66] = Direction.NORTHEAST;
                        wait[66] = true;
                        currented[66] = null;
                        setChecked(66);

                        if (dest[66]) return 66;

                        addToQueue(66);
                    }
                    int currentTile = moveWithCurrent(66);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[66];
                        dirs[currentTile] = currents[66];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[66] = cost + cooldowns[66];
                    dirs[66] = Direction.NORTHEAST;
                    currented[66] = null;
                    wait[66] = false;
                    setChecked(66);

                    if (dest[66]) return 66;

                    addToQueue(66);
                }
            }
            if(toCheck65){//debugPoint(65, rc);
                if(currents[65]!=Direction.CENTER&&cost%10+cooldowns[65]>9) {
                    if (cost%10>0&&cooldowns[65]<10&&currents[59]==Direction.CENTER) {
                        costs[65] = cooldowns[65]+(cost+9)/10*10;
                        dirs[65] = Direction.EAST;
                        wait[65] = true;
                        currented[65] = null;
                        setChecked(65);

                        if (dest[65]) return 65;

                        addToQueue(65);
                    }
                    int currentTile = moveWithCurrent(65);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[65];
                        dirs[currentTile] = currents[65];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[65] = cost + cooldowns[65];
                    dirs[65] = Direction.EAST;
                    currented[65] = null;
                    wait[65] = false;
                    setChecked(65);

                    if (dest[65]) return 65;

                    addToQueue(65);
                }
            }
            if(toCheck64){//debugPoint(64, rc);
                if(currents[64]!=Direction.CENTER&&cost%10+cooldowns[64]>9) {
                    if (cost%10>0&&cooldowns[64]<10&&currents[59]==Direction.CENTER) {
                        costs[64] = cooldowns[64]+(cost+9)/10*10;
                        dirs[64] = Direction.SOUTHEAST;
                        wait[64] = true;
                        currented[64] = null;
                        setChecked(64);

                        if (dest[64]) return 64;

                        addToQueue(64);
                    }
                    int currentTile = moveWithCurrent(64);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[64];
                        dirs[currentTile] = currents[64];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[64] = cost + cooldowns[64];
                    dirs[64] = Direction.SOUTHEAST;
                    currented[64] = null;
                    wait[64] = false;
                    setChecked(64);

                    if (dest[64]) return 64;

                    addToQueue(64);
                }
            }
            if(toCheck58){//debugPoint(58, rc);
                if(currents[58]!=Direction.CENTER&&cost%10+cooldowns[58]>9) {
                    if (cost%10>0&&cooldowns[58]<10&&currents[59]==Direction.CENTER) {
                        costs[58] = cooldowns[58]+(cost+9)/10*10;
                        dirs[58] = Direction.SOUTH;
                        wait[58] = true;
                        currented[58] = null;
                        setChecked(58);

                        if (dest[58]) return 58;

                        addToQueue(58);
                    }
                    int currentTile = moveWithCurrent(58);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[58];
                        dirs[currentTile] = currents[58];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[58] = cost + cooldowns[58];
                    dirs[58] = Direction.SOUTH;
                    currented[58] = null;
                    wait[58] = false;
                    setChecked(58);

                    if (dest[58]) return 58;

                    addToQueue(58);
                }
            }
            if(toCheck50){//debugPoint(50, rc);
                if(currents[50]!=Direction.CENTER&&cost%10+cooldowns[50]>9) {
                    if (cost%10>0&&cooldowns[50]<10&&currents[59]==Direction.CENTER) {
                        costs[50] = cooldowns[50]+(cost+9)/10*10;
                        dirs[50] = Direction.SOUTHWEST;
                        wait[50] = true;
                        currented[50] = null;
                        setChecked(50);

                        if (dest[50]) return 50;

                        addToQueue(50);
                    }
                    int currentTile = moveWithCurrent(50);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[50];
                        dirs[currentTile] = currents[50];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[50] = cost + cooldowns[50];
                    dirs[50] = Direction.SOUTHWEST;
                    currented[50] = null;
                    wait[50] = false;
                    setChecked(50);

                    if (dest[50]) return 50;

                    addToQueue(50);
                }
            }
            break;case 60:
        cost=costs[60];if(toCheck52){//debugPoint(52, rc);
                if(currents[52]!=Direction.CENTER&&cost%10+cooldowns[52]>9) {
                    if (cost%10>0&&cooldowns[52]<10&&currents[60]==Direction.CENTER) {
                        costs[52] = cooldowns[52]+(cost+9)/10*10;
                        dirs[52] = Direction.WEST;
                        wait[52] = true;
                        currented[52] = null;
                        setChecked(52);

                        if (dest[52]) return 52;

                        addToQueue(52);
                    }
                    int currentTile = moveWithCurrent(52);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[52];
                        dirs[currentTile] = currents[52];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[52] = cost + cooldowns[52];
                    dirs[52] = Direction.WEST;
                    currented[52] = null;
                    wait[52] = false;
                    setChecked(52);

                    if (dest[52]) return 52;

                    addToQueue(52);
                }
            }
            if(toCheck53){//debugPoint(53, rc);
                if(currents[53]!=Direction.CENTER&&cost%10+cooldowns[53]>9) {
                    if (cost%10>0&&cooldowns[53]<10&&currents[60]==Direction.CENTER) {
                        costs[53] = cooldowns[53]+(cost+9)/10*10;
                        dirs[53] = Direction.NORTHWEST;
                        wait[53] = true;
                        currented[53] = null;
                        setChecked(53);

                        if (dest[53]) return 53;

                        addToQueue(53);
                    }
                    int currentTile = moveWithCurrent(53);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[53];
                        dirs[currentTile] = currents[53];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[53] = cost + cooldowns[53];
                    dirs[53] = Direction.NORTHWEST;
                    currented[53] = null;
                    wait[53] = false;
                    setChecked(53);

                    if (dest[53]) return 53;

                    addToQueue(53);
                }
            }
            if(toCheck61){//debugPoint(61, rc);
                if(currents[61]!=Direction.CENTER&&cost%10+cooldowns[61]>9) {
                    if (cost%10>0&&cooldowns[61]<10&&currents[60]==Direction.CENTER) {
                        costs[61] = cooldowns[61]+(cost+9)/10*10;
                        dirs[61] = Direction.NORTH;
                        wait[61] = true;
                        currented[61] = null;
                        setChecked(61);

                        if (dest[61]) return 61;

                        addToQueue(61);
                    }
                    int currentTile = moveWithCurrent(61);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[61];
                        dirs[currentTile] = currents[61];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[61] = cost + cooldowns[61];
                    dirs[61] = Direction.NORTH;
                    currented[61] = null;
                    wait[61] = false;
                    setChecked(61);

                    if (dest[61]) return 61;

                    addToQueue(61);
                }
            }
            if(toCheck67){//debugPoint(67, rc);
                if(currents[67]!=Direction.CENTER&&cost%10+cooldowns[67]>9) {
                    if (cost%10>0&&cooldowns[67]<10&&currents[60]==Direction.CENTER) {
                        costs[67] = cooldowns[67]+(cost+9)/10*10;
                        dirs[67] = Direction.NORTHEAST;
                        wait[67] = true;
                        currented[67] = null;
                        setChecked(67);

                        if (dest[67]) return 67;

                        addToQueue(67);
                    }
                    int currentTile = moveWithCurrent(67);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[67];
                        dirs[currentTile] = currents[67];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[67] = cost + cooldowns[67];
                    dirs[67] = Direction.NORTHEAST;
                    currented[67] = null;
                    wait[67] = false;
                    setChecked(67);

                    if (dest[67]) return 67;

                    addToQueue(67);
                }
            }
            if(toCheck66){//debugPoint(66, rc);
                if(currents[66]!=Direction.CENTER&&cost%10+cooldowns[66]>9) {
                    if (cost%10>0&&cooldowns[66]<10&&currents[60]==Direction.CENTER) {
                        costs[66] = cooldowns[66]+(cost+9)/10*10;
                        dirs[66] = Direction.EAST;
                        wait[66] = true;
                        currented[66] = null;
                        setChecked(66);

                        if (dest[66]) return 66;

                        addToQueue(66);
                    }
                    int currentTile = moveWithCurrent(66);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[66];
                        dirs[currentTile] = currents[66];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[66] = cost + cooldowns[66];
                    dirs[66] = Direction.EAST;
                    currented[66] = null;
                    wait[66] = false;
                    setChecked(66);

                    if (dest[66]) return 66;

                    addToQueue(66);
                }
            }
            if(toCheck65){//debugPoint(65, rc);
                if(currents[65]!=Direction.CENTER&&cost%10+cooldowns[65]>9) {
                    if (cost%10>0&&cooldowns[65]<10&&currents[60]==Direction.CENTER) {
                        costs[65] = cooldowns[65]+(cost+9)/10*10;
                        dirs[65] = Direction.SOUTHEAST;
                        wait[65] = true;
                        currented[65] = null;
                        setChecked(65);

                        if (dest[65]) return 65;

                        addToQueue(65);
                    }
                    int currentTile = moveWithCurrent(65);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[65];
                        dirs[currentTile] = currents[65];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[65] = cost + cooldowns[65];
                    dirs[65] = Direction.SOUTHEAST;
                    currented[65] = null;
                    wait[65] = false;
                    setChecked(65);

                    if (dest[65]) return 65;

                    addToQueue(65);
                }
            }
            if(toCheck59){//debugPoint(59, rc);
                if(currents[59]!=Direction.CENTER&&cost%10+cooldowns[59]>9) {
                    if (cost%10>0&&cooldowns[59]<10&&currents[60]==Direction.CENTER) {
                        costs[59] = cooldowns[59]+(cost+9)/10*10;
                        dirs[59] = Direction.SOUTH;
                        wait[59] = true;
                        currented[59] = null;
                        setChecked(59);

                        if (dest[59]) return 59;

                        addToQueue(59);
                    }
                    int currentTile = moveWithCurrent(59);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[59];
                        dirs[currentTile] = currents[59];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[59] = cost + cooldowns[59];
                    dirs[59] = Direction.SOUTH;
                    currented[59] = null;
                    wait[59] = false;
                    setChecked(59);

                    if (dest[59]) return 59;

                    addToQueue(59);
                }
            }
            if(toCheck51){//debugPoint(51, rc);
                if(currents[51]!=Direction.CENTER&&cost%10+cooldowns[51]>9) {
                    if (cost%10>0&&cooldowns[51]<10&&currents[60]==Direction.CENTER) {
                        costs[51] = cooldowns[51]+(cost+9)/10*10;
                        dirs[51] = Direction.SOUTHWEST;
                        wait[51] = true;
                        currented[51] = null;
                        setChecked(51);

                        if (dest[51]) return 51;

                        addToQueue(51);
                    }
                    int currentTile = moveWithCurrent(51);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[51];
                        dirs[currentTile] = currents[51];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[51] = cost + cooldowns[51];
                    dirs[51] = Direction.SOUTHWEST;
                    currented[51] = null;
                    wait[51] = false;
                    setChecked(51);

                    if (dest[51]) return 51;

                    addToQueue(51);
                }
            }
            break;case 61:
        cost=costs[61];if(toCheck53){//debugPoint(53, rc);
                if(currents[53]!=Direction.CENTER&&cost%10+cooldowns[53]>9) {
                    if (cost%10>0&&cooldowns[53]<10&&currents[61]==Direction.CENTER) {
                        costs[53] = cooldowns[53]+(cost+9)/10*10;
                        dirs[53] = Direction.WEST;
                        wait[53] = true;
                        currented[53] = null;
                        setChecked(53);

                        if (dest[53]) return 53;

                        addToQueue(53);
                    }
                    int currentTile = moveWithCurrent(53);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[53];
                        dirs[currentTile] = currents[53];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[53] = cost + cooldowns[53];
                    dirs[53] = Direction.WEST;
                    currented[53] = null;
                    wait[53] = false;
                    setChecked(53);

                    if (dest[53]) return 53;

                    addToQueue(53);
                }
            }
            if(toCheck54){//debugPoint(54, rc);
                if(currents[54]!=Direction.CENTER&&cost%10+cooldowns[54]>9) {
                    if (cost%10>0&&cooldowns[54]<10&&currents[61]==Direction.CENTER) {
                        costs[54] = cooldowns[54]+(cost+9)/10*10;
                        dirs[54] = Direction.NORTHWEST;
                        wait[54] = true;
                        currented[54] = null;
                        setChecked(54);

                        if (dest[54]) return 54;

                        addToQueue(54);
                    }
                    int currentTile = moveWithCurrent(54);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[54];
                        dirs[currentTile] = currents[54];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[54] = cost + cooldowns[54];
                    dirs[54] = Direction.NORTHWEST;
                    currented[54] = null;
                    wait[54] = false;
                    setChecked(54);

                    if (dest[54]) return 54;

                    addToQueue(54);
                }
            }
            if(toCheck62){//debugPoint(62, rc);
                if(currents[62]!=Direction.CENTER&&cost%10+cooldowns[62]>9) {
                    if (cost%10>0&&cooldowns[62]<10&&currents[61]==Direction.CENTER) {
                        costs[62] = cooldowns[62]+(cost+9)/10*10;
                        dirs[62] = Direction.NORTH;
                        wait[62] = true;
                        currented[62] = null;
                        setChecked(62);

                        if (dest[62]) return 62;

                        addToQueue(62);
                    }
                    int currentTile = moveWithCurrent(62);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[62];
                        dirs[currentTile] = currents[62];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[62] = cost + cooldowns[62];
                    dirs[62] = Direction.NORTH;
                    currented[62] = null;
                    wait[62] = false;
                    setChecked(62);

                    if (dest[62]) return 62;

                    addToQueue(62);
                }
            }
            if(toCheck68){//debugPoint(68, rc);
                if(currents[68]!=Direction.CENTER&&cost%10+cooldowns[68]>9) {
                    if (cost%10>0&&cooldowns[68]<10&&currents[61]==Direction.CENTER) {
                        costs[68] = cooldowns[68]+(cost+9)/10*10;
                        dirs[68] = Direction.NORTHEAST;
                        wait[68] = true;
                        currented[68] = null;
                        setChecked(68);

                        if (dest[68]) return 68;

                        addToQueue(68);
                    }
                    int currentTile = moveWithCurrent(68);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[68];
                        dirs[currentTile] = currents[68];
                        currented[currentTile] = Direction.NORTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[68] = cost + cooldowns[68];
                    dirs[68] = Direction.NORTHEAST;
                    currented[68] = null;
                    wait[68] = false;
                    setChecked(68);

                    if (dest[68]) return 68;

                    addToQueue(68);
                }
            }
            if(toCheck67){//debugPoint(67, rc);
                if(currents[67]!=Direction.CENTER&&cost%10+cooldowns[67]>9) {
                    if (cost%10>0&&cooldowns[67]<10&&currents[61]==Direction.CENTER) {
                        costs[67] = cooldowns[67]+(cost+9)/10*10;
                        dirs[67] = Direction.EAST;
                        wait[67] = true;
                        currented[67] = null;
                        setChecked(67);

                        if (dest[67]) return 67;

                        addToQueue(67);
                    }
                    int currentTile = moveWithCurrent(67);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[67];
                        dirs[currentTile] = currents[67];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[67] = cost + cooldowns[67];
                    dirs[67] = Direction.EAST;
                    currented[67] = null;
                    wait[67] = false;
                    setChecked(67);

                    if (dest[67]) return 67;

                    addToQueue(67);
                }
            }
            if(toCheck66){//debugPoint(66, rc);
                if(currents[66]!=Direction.CENTER&&cost%10+cooldowns[66]>9) {
                    if (cost%10>0&&cooldowns[66]<10&&currents[61]==Direction.CENTER) {
                        costs[66] = cooldowns[66]+(cost+9)/10*10;
                        dirs[66] = Direction.SOUTHEAST;
                        wait[66] = true;
                        currented[66] = null;
                        setChecked(66);

                        if (dest[66]) return 66;

                        addToQueue(66);
                    }
                    int currentTile = moveWithCurrent(66);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[66];
                        dirs[currentTile] = currents[66];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[66] = cost + cooldowns[66];
                    dirs[66] = Direction.SOUTHEAST;
                    currented[66] = null;
                    wait[66] = false;
                    setChecked(66);

                    if (dest[66]) return 66;

                    addToQueue(66);
                }
            }
            if(toCheck60){//debugPoint(60, rc);
                if(currents[60]!=Direction.CENTER&&cost%10+cooldowns[60]>9) {
                    if (cost%10>0&&cooldowns[60]<10&&currents[61]==Direction.CENTER) {
                        costs[60] = cooldowns[60]+(cost+9)/10*10;
                        dirs[60] = Direction.SOUTH;
                        wait[60] = true;
                        currented[60] = null;
                        setChecked(60);

                        if (dest[60]) return 60;

                        addToQueue(60);
                    }
                    int currentTile = moveWithCurrent(60);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[60];
                        dirs[currentTile] = currents[60];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[60] = cost + cooldowns[60];
                    dirs[60] = Direction.SOUTH;
                    currented[60] = null;
                    wait[60] = false;
                    setChecked(60);

                    if (dest[60]) return 60;

                    addToQueue(60);
                }
            }
            if(toCheck52){//debugPoint(52, rc);
                if(currents[52]!=Direction.CENTER&&cost%10+cooldowns[52]>9) {
                    if (cost%10>0&&cooldowns[52]<10&&currents[61]==Direction.CENTER) {
                        costs[52] = cooldowns[52]+(cost+9)/10*10;
                        dirs[52] = Direction.SOUTHWEST;
                        wait[52] = true;
                        currented[52] = null;
                        setChecked(52);

                        if (dest[52]) return 52;

                        addToQueue(52);
                    }
                    int currentTile = moveWithCurrent(52);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[52];
                        dirs[currentTile] = currents[52];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[52] = cost + cooldowns[52];
                    dirs[52] = Direction.SOUTHWEST;
                    currented[52] = null;
                    wait[52] = false;
                    setChecked(52);

                    if (dest[52]) return 52;

                    addToQueue(52);
                }
            }
            break;case 62:
        cost=costs[62];if(toCheck54){//debugPoint(54, rc);
                if(currents[54]!=Direction.CENTER&&cost%10+cooldowns[54]>9) {
                    if (cost%10>0&&cooldowns[54]<10&&currents[62]==Direction.CENTER) {
                        costs[54] = cooldowns[54]+(cost+9)/10*10;
                        dirs[54] = Direction.WEST;
                        wait[54] = true;
                        currented[54] = null;
                        setChecked(54);

                        if (dest[54]) return 54;

                        addToQueue(54);
                    }
                    int currentTile = moveWithCurrent(54);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[54];
                        dirs[currentTile] = currents[54];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[54] = cost + cooldowns[54];
                    dirs[54] = Direction.WEST;
                    currented[54] = null;
                    wait[54] = false;
                    setChecked(54);

                    if (dest[54]) return 54;

                    addToQueue(54);
                }
            }
            if(toCheck55){//debugPoint(55, rc);
                if(currents[55]!=Direction.CENTER&&cost%10+cooldowns[55]>9) {
                    if (cost%10>0&&cooldowns[55]<10&&currents[62]==Direction.CENTER) {
                        costs[55] = cooldowns[55]+(cost+9)/10*10;
                        dirs[55] = Direction.NORTHWEST;
                        wait[55] = true;
                        currented[55] = null;
                        setChecked(55);

                        if (dest[55]) return 55;

                        addToQueue(55);
                    }
                    int currentTile = moveWithCurrent(55);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[55];
                        dirs[currentTile] = currents[55];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[55] = cost + cooldowns[55];
                    dirs[55] = Direction.NORTHWEST;
                    currented[55] = null;
                    wait[55] = false;
                    setChecked(55);

                    if (dest[55]) return 55;

                    addToQueue(55);
                }
            }
            if(toCheck63){//debugPoint(63, rc);
                if(currents[63]!=Direction.CENTER&&cost%10+cooldowns[63]>9) {
                    if (cost%10>0&&cooldowns[63]<10&&currents[62]==Direction.CENTER) {
                        costs[63] = cooldowns[63]+(cost+9)/10*10;
                        dirs[63] = Direction.NORTH;
                        wait[63] = true;
                        currented[63] = null;
                        setChecked(63);

                        if (dest[63]) return 63;

                        addToQueue(63);
                    }
                    int currentTile = moveWithCurrent(63);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[63];
                        dirs[currentTile] = currents[63];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[63] = cost + cooldowns[63];
                    dirs[63] = Direction.NORTH;
                    currented[63] = null;
                    wait[63] = false;
                    setChecked(63);

                    if (dest[63]) return 63;

                    addToQueue(63);
                }
            }
            if(toCheck68){//debugPoint(68, rc);
                if(currents[68]!=Direction.CENTER&&cost%10+cooldowns[68]>9) {
                    if (cost%10>0&&cooldowns[68]<10&&currents[62]==Direction.CENTER) {
                        costs[68] = cooldowns[68]+(cost+9)/10*10;
                        dirs[68] = Direction.EAST;
                        wait[68] = true;
                        currented[68] = null;
                        setChecked(68);

                        if (dest[68]) return 68;

                        addToQueue(68);
                    }
                    int currentTile = moveWithCurrent(68);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[68];
                        dirs[currentTile] = currents[68];
                        currented[currentTile] = Direction.EAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[68] = cost + cooldowns[68];
                    dirs[68] = Direction.EAST;
                    currented[68] = null;
                    wait[68] = false;
                    setChecked(68);

                    if (dest[68]) return 68;

                    addToQueue(68);
                }
            }
            if(toCheck67){//debugPoint(67, rc);
                if(currents[67]!=Direction.CENTER&&cost%10+cooldowns[67]>9) {
                    if (cost%10>0&&cooldowns[67]<10&&currents[62]==Direction.CENTER) {
                        costs[67] = cooldowns[67]+(cost+9)/10*10;
                        dirs[67] = Direction.SOUTHEAST;
                        wait[67] = true;
                        currented[67] = null;
                        setChecked(67);

                        if (dest[67]) return 67;

                        addToQueue(67);
                    }
                    int currentTile = moveWithCurrent(67);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[67];
                        dirs[currentTile] = currents[67];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[67] = cost + cooldowns[67];
                    dirs[67] = Direction.SOUTHEAST;
                    currented[67] = null;
                    wait[67] = false;
                    setChecked(67);

                    if (dest[67]) return 67;

                    addToQueue(67);
                }
            }
            if(toCheck61){//debugPoint(61, rc);
                if(currents[61]!=Direction.CENTER&&cost%10+cooldowns[61]>9) {
                    if (cost%10>0&&cooldowns[61]<10&&currents[62]==Direction.CENTER) {
                        costs[61] = cooldowns[61]+(cost+9)/10*10;
                        dirs[61] = Direction.SOUTH;
                        wait[61] = true;
                        currented[61] = null;
                        setChecked(61);

                        if (dest[61]) return 61;

                        addToQueue(61);
                    }
                    int currentTile = moveWithCurrent(61);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[61];
                        dirs[currentTile] = currents[61];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[61] = cost + cooldowns[61];
                    dirs[61] = Direction.SOUTH;
                    currented[61] = null;
                    wait[61] = false;
                    setChecked(61);

                    if (dest[61]) return 61;

                    addToQueue(61);
                }
            }
            if(toCheck53){//debugPoint(53, rc);
                if(currents[53]!=Direction.CENTER&&cost%10+cooldowns[53]>9) {
                    if (cost%10>0&&cooldowns[53]<10&&currents[62]==Direction.CENTER) {
                        costs[53] = cooldowns[53]+(cost+9)/10*10;
                        dirs[53] = Direction.SOUTHWEST;
                        wait[53] = true;
                        currented[53] = null;
                        setChecked(53);

                        if (dest[53]) return 53;

                        addToQueue(53);
                    }
                    int currentTile = moveWithCurrent(53);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[53];
                        dirs[currentTile] = currents[53];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[53] = cost + cooldowns[53];
                    dirs[53] = Direction.SOUTHWEST;
                    currented[53] = null;
                    wait[53] = false;
                    setChecked(53);

                    if (dest[53]) return 53;

                    addToQueue(53);
                }
            }
            break;case 63:
        cost=costs[63];if(toCheck55){//debugPoint(55, rc);
                if(currents[55]!=Direction.CENTER&&cost%10+cooldowns[55]>9) {
                    if (cost%10>0&&cooldowns[55]<10&&currents[63]==Direction.CENTER) {
                        costs[55] = cooldowns[55]+(cost+9)/10*10;
                        dirs[55] = Direction.WEST;
                        wait[55] = true;
                        currented[55] = null;
                        setChecked(55);

                        if (dest[55]) return 55;

                        addToQueue(55);
                    }
                    int currentTile = moveWithCurrent(55);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[55];
                        dirs[currentTile] = currents[55];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[55] = cost + cooldowns[55];
                    dirs[55] = Direction.WEST;
                    currented[55] = null;
                    wait[55] = false;
                    setChecked(55);

                    if (dest[55]) return 55;

                    addToQueue(55);
                }
            }
            if(toCheck56){//debugPoint(56, rc);
                if(currents[56]!=Direction.CENTER&&cost%10+cooldowns[56]>9) {
                    if (cost%10>0&&cooldowns[56]<10&&currents[63]==Direction.CENTER) {
                        costs[56] = cooldowns[56]+(cost+9)/10*10;
                        dirs[56] = Direction.NORTHWEST;
                        wait[56] = true;
                        currented[56] = null;
                        setChecked(56);

                        if (dest[56]) return 56;

                        addToQueue(56);
                    }
                    int currentTile = moveWithCurrent(56);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[56];
                        dirs[currentTile] = currents[56];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[56] = cost + cooldowns[56];
                    dirs[56] = Direction.NORTHWEST;
                    currented[56] = null;
                    wait[56] = false;
                    setChecked(56);

                    if (dest[56]) return 56;

                    addToQueue(56);
                }
            }
            if(toCheck68){//debugPoint(68, rc);
                if(currents[68]!=Direction.CENTER&&cost%10+cooldowns[68]>9) {
                    if (cost%10>0&&cooldowns[68]<10&&currents[63]==Direction.CENTER) {
                        costs[68] = cooldowns[68]+(cost+9)/10*10;
                        dirs[68] = Direction.SOUTHEAST;
                        wait[68] = true;
                        currented[68] = null;
                        setChecked(68);

                        if (dest[68]) return 68;

                        addToQueue(68);
                    }
                    int currentTile = moveWithCurrent(68);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[68];
                        dirs[currentTile] = currents[68];
                        currented[currentTile] = Direction.SOUTHEAST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[68] = cost + cooldowns[68];
                    dirs[68] = Direction.SOUTHEAST;
                    currented[68] = null;
                    wait[68] = false;
                    setChecked(68);

                    if (dest[68]) return 68;

                    addToQueue(68);
                }
            }
            if(toCheck62){//debugPoint(62, rc);
                if(currents[62]!=Direction.CENTER&&cost%10+cooldowns[62]>9) {
                    if (cost%10>0&&cooldowns[62]<10&&currents[63]==Direction.CENTER) {
                        costs[62] = cooldowns[62]+(cost+9)/10*10;
                        dirs[62] = Direction.SOUTH;
                        wait[62] = true;
                        currented[62] = null;
                        setChecked(62);

                        if (dest[62]) return 62;

                        addToQueue(62);
                    }
                    int currentTile = moveWithCurrent(62);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[62];
                        dirs[currentTile] = currents[62];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[62] = cost + cooldowns[62];
                    dirs[62] = Direction.SOUTH;
                    currented[62] = null;
                    wait[62] = false;
                    setChecked(62);

                    if (dest[62]) return 62;

                    addToQueue(62);
                }
            }
            if(toCheck54){//debugPoint(54, rc);
                if(currents[54]!=Direction.CENTER&&cost%10+cooldowns[54]>9) {
                    if (cost%10>0&&cooldowns[54]<10&&currents[63]==Direction.CENTER) {
                        costs[54] = cooldowns[54]+(cost+9)/10*10;
                        dirs[54] = Direction.SOUTHWEST;
                        wait[54] = true;
                        currented[54] = null;
                        setChecked(54);

                        if (dest[54]) return 54;

                        addToQueue(54);
                    }
                    int currentTile = moveWithCurrent(54);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[54];
                        dirs[currentTile] = currents[54];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[54] = cost + cooldowns[54];
                    dirs[54] = Direction.SOUTHWEST;
                    currented[54] = null;
                    wait[54] = false;
                    setChecked(54);

                    if (dest[54]) return 54;

                    addToQueue(54);
                }
            }
            break;case 64:
        cost=costs[64];if(toCheck58){//debugPoint(58, rc);
                if(currents[58]!=Direction.CENTER&&cost%10+cooldowns[58]>9) {
                    if (cost%10>0&&cooldowns[58]<10&&currents[64]==Direction.CENTER) {
                        costs[58] = cooldowns[58]+(cost+9)/10*10;
                        dirs[58] = Direction.WEST;
                        wait[58] = true;
                        currented[58] = null;
                        setChecked(58);

                        if (dest[58]) return 58;

                        addToQueue(58);
                    }
                    int currentTile = moveWithCurrent(58);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[58];
                        dirs[currentTile] = currents[58];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[58] = cost + cooldowns[58];
                    dirs[58] = Direction.WEST;
                    currented[58] = null;
                    wait[58] = false;
                    setChecked(58);

                    if (dest[58]) return 58;

                    addToQueue(58);
                }
            }
            if(toCheck59){//debugPoint(59, rc);
                if(currents[59]!=Direction.CENTER&&cost%10+cooldowns[59]>9) {
                    if (cost%10>0&&cooldowns[59]<10&&currents[64]==Direction.CENTER) {
                        costs[59] = cooldowns[59]+(cost+9)/10*10;
                        dirs[59] = Direction.NORTHWEST;
                        wait[59] = true;
                        currented[59] = null;
                        setChecked(59);

                        if (dest[59]) return 59;

                        addToQueue(59);
                    }
                    int currentTile = moveWithCurrent(59);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[59];
                        dirs[currentTile] = currents[59];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[59] = cost + cooldowns[59];
                    dirs[59] = Direction.NORTHWEST;
                    currented[59] = null;
                    wait[59] = false;
                    setChecked(59);

                    if (dest[59]) return 59;

                    addToQueue(59);
                }
            }
            if(toCheck65){//debugPoint(65, rc);
                if(currents[65]!=Direction.CENTER&&cost%10+cooldowns[65]>9) {
                    if (cost%10>0&&cooldowns[65]<10&&currents[64]==Direction.CENTER) {
                        costs[65] = cooldowns[65]+(cost+9)/10*10;
                        dirs[65] = Direction.NORTH;
                        wait[65] = true;
                        currented[65] = null;
                        setChecked(65);

                        if (dest[65]) return 65;

                        addToQueue(65);
                    }
                    int currentTile = moveWithCurrent(65);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[65];
                        dirs[currentTile] = currents[65];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[65] = cost + cooldowns[65];
                    dirs[65] = Direction.NORTH;
                    currented[65] = null;
                    wait[65] = false;
                    setChecked(65);

                    if (dest[65]) return 65;

                    addToQueue(65);
                }
            }
            if(toCheck57){//debugPoint(57, rc);
                if(currents[57]!=Direction.CENTER&&cost%10+cooldowns[57]>9) {
                    if (cost%10>0&&cooldowns[57]<10&&currents[64]==Direction.CENTER) {
                        costs[57] = cooldowns[57]+(cost+9)/10*10;
                        dirs[57] = Direction.SOUTHWEST;
                        wait[57] = true;
                        currented[57] = null;
                        setChecked(57);

                        if (dest[57]) return 57;

                        addToQueue(57);
                    }
                    int currentTile = moveWithCurrent(57);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[57];
                        dirs[currentTile] = currents[57];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[57] = cost + cooldowns[57];
                    dirs[57] = Direction.SOUTHWEST;
                    currented[57] = null;
                    wait[57] = false;
                    setChecked(57);

                    if (dest[57]) return 57;

                    addToQueue(57);
                }
            }
            break;
        }
    return -1;
    }
    public static int dijkstraSub5(RobotController rc, int n) {int cost; switch(n) {case 65:
        cost=costs[65];if(toCheck59){//debugPoint(59, rc);
                if(currents[59]!=Direction.CENTER&&cost%10+cooldowns[59]>9) {
                    if (cost%10>0&&cooldowns[59]<10&&currents[65]==Direction.CENTER) {
                        costs[59] = cooldowns[59]+(cost+9)/10*10;
                        dirs[59] = Direction.WEST;
                        wait[59] = true;
                        currented[59] = null;
                        setChecked(59);

                        if (dest[59]) return 59;

                        addToQueue(59);
                    }
                    int currentTile = moveWithCurrent(59);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[59];
                        dirs[currentTile] = currents[59];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[59] = cost + cooldowns[59];
                    dirs[59] = Direction.WEST;
                    currented[59] = null;
                    wait[59] = false;
                    setChecked(59);

                    if (dest[59]) return 59;

                    addToQueue(59);
                }
            }
            if(toCheck60){//debugPoint(60, rc);
                if(currents[60]!=Direction.CENTER&&cost%10+cooldowns[60]>9) {
                    if (cost%10>0&&cooldowns[60]<10&&currents[65]==Direction.CENTER) {
                        costs[60] = cooldowns[60]+(cost+9)/10*10;
                        dirs[60] = Direction.NORTHWEST;
                        wait[60] = true;
                        currented[60] = null;
                        setChecked(60);

                        if (dest[60]) return 60;

                        addToQueue(60);
                    }
                    int currentTile = moveWithCurrent(60);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[60];
                        dirs[currentTile] = currents[60];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[60] = cost + cooldowns[60];
                    dirs[60] = Direction.NORTHWEST;
                    currented[60] = null;
                    wait[60] = false;
                    setChecked(60);

                    if (dest[60]) return 60;

                    addToQueue(60);
                }
            }
            if(toCheck66){//debugPoint(66, rc);
                if(currents[66]!=Direction.CENTER&&cost%10+cooldowns[66]>9) {
                    if (cost%10>0&&cooldowns[66]<10&&currents[65]==Direction.CENTER) {
                        costs[66] = cooldowns[66]+(cost+9)/10*10;
                        dirs[66] = Direction.NORTH;
                        wait[66] = true;
                        currented[66] = null;
                        setChecked(66);

                        if (dest[66]) return 66;

                        addToQueue(66);
                    }
                    int currentTile = moveWithCurrent(66);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[66];
                        dirs[currentTile] = currents[66];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[66] = cost + cooldowns[66];
                    dirs[66] = Direction.NORTH;
                    currented[66] = null;
                    wait[66] = false;
                    setChecked(66);

                    if (dest[66]) return 66;

                    addToQueue(66);
                }
            }
            if(toCheck64){//debugPoint(64, rc);
                if(currents[64]!=Direction.CENTER&&cost%10+cooldowns[64]>9) {
                    if (cost%10>0&&cooldowns[64]<10&&currents[65]==Direction.CENTER) {
                        costs[64] = cooldowns[64]+(cost+9)/10*10;
                        dirs[64] = Direction.SOUTH;
                        wait[64] = true;
                        currented[64] = null;
                        setChecked(64);

                        if (dest[64]) return 64;

                        addToQueue(64);
                    }
                    int currentTile = moveWithCurrent(64);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[64];
                        dirs[currentTile] = currents[64];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[64] = cost + cooldowns[64];
                    dirs[64] = Direction.SOUTH;
                    currented[64] = null;
                    wait[64] = false;
                    setChecked(64);

                    if (dest[64]) return 64;

                    addToQueue(64);
                }
            }
            if(toCheck58){//debugPoint(58, rc);
                if(currents[58]!=Direction.CENTER&&cost%10+cooldowns[58]>9) {
                    if (cost%10>0&&cooldowns[58]<10&&currents[65]==Direction.CENTER) {
                        costs[58] = cooldowns[58]+(cost+9)/10*10;
                        dirs[58] = Direction.SOUTHWEST;
                        wait[58] = true;
                        currented[58] = null;
                        setChecked(58);

                        if (dest[58]) return 58;

                        addToQueue(58);
                    }
                    int currentTile = moveWithCurrent(58);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[58];
                        dirs[currentTile] = currents[58];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[58] = cost + cooldowns[58];
                    dirs[58] = Direction.SOUTHWEST;
                    currented[58] = null;
                    wait[58] = false;
                    setChecked(58);

                    if (dest[58]) return 58;

                    addToQueue(58);
                }
            }
            break;case 66:
        cost=costs[66];if(toCheck60){//debugPoint(60, rc);
                if(currents[60]!=Direction.CENTER&&cost%10+cooldowns[60]>9) {
                    if (cost%10>0&&cooldowns[60]<10&&currents[66]==Direction.CENTER) {
                        costs[60] = cooldowns[60]+(cost+9)/10*10;
                        dirs[60] = Direction.WEST;
                        wait[60] = true;
                        currented[60] = null;
                        setChecked(60);

                        if (dest[60]) return 60;

                        addToQueue(60);
                    }
                    int currentTile = moveWithCurrent(60);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[60];
                        dirs[currentTile] = currents[60];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[60] = cost + cooldowns[60];
                    dirs[60] = Direction.WEST;
                    currented[60] = null;
                    wait[60] = false;
                    setChecked(60);

                    if (dest[60]) return 60;

                    addToQueue(60);
                }
            }
            if(toCheck61){//debugPoint(61, rc);
                if(currents[61]!=Direction.CENTER&&cost%10+cooldowns[61]>9) {
                    if (cost%10>0&&cooldowns[61]<10&&currents[66]==Direction.CENTER) {
                        costs[61] = cooldowns[61]+(cost+9)/10*10;
                        dirs[61] = Direction.NORTHWEST;
                        wait[61] = true;
                        currented[61] = null;
                        setChecked(61);

                        if (dest[61]) return 61;

                        addToQueue(61);
                    }
                    int currentTile = moveWithCurrent(61);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[61];
                        dirs[currentTile] = currents[61];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[61] = cost + cooldowns[61];
                    dirs[61] = Direction.NORTHWEST;
                    currented[61] = null;
                    wait[61] = false;
                    setChecked(61);

                    if (dest[61]) return 61;

                    addToQueue(61);
                }
            }
            if(toCheck67){//debugPoint(67, rc);
                if(currents[67]!=Direction.CENTER&&cost%10+cooldowns[67]>9) {
                    if (cost%10>0&&cooldowns[67]<10&&currents[66]==Direction.CENTER) {
                        costs[67] = cooldowns[67]+(cost+9)/10*10;
                        dirs[67] = Direction.NORTH;
                        wait[67] = true;
                        currented[67] = null;
                        setChecked(67);

                        if (dest[67]) return 67;

                        addToQueue(67);
                    }
                    int currentTile = moveWithCurrent(67);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[67];
                        dirs[currentTile] = currents[67];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[67] = cost + cooldowns[67];
                    dirs[67] = Direction.NORTH;
                    currented[67] = null;
                    wait[67] = false;
                    setChecked(67);

                    if (dest[67]) return 67;

                    addToQueue(67);
                }
            }
            if(toCheck65){//debugPoint(65, rc);
                if(currents[65]!=Direction.CENTER&&cost%10+cooldowns[65]>9) {
                    if (cost%10>0&&cooldowns[65]<10&&currents[66]==Direction.CENTER) {
                        costs[65] = cooldowns[65]+(cost+9)/10*10;
                        dirs[65] = Direction.SOUTH;
                        wait[65] = true;
                        currented[65] = null;
                        setChecked(65);

                        if (dest[65]) return 65;

                        addToQueue(65);
                    }
                    int currentTile = moveWithCurrent(65);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[65];
                        dirs[currentTile] = currents[65];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[65] = cost + cooldowns[65];
                    dirs[65] = Direction.SOUTH;
                    currented[65] = null;
                    wait[65] = false;
                    setChecked(65);

                    if (dest[65]) return 65;

                    addToQueue(65);
                }
            }
            if(toCheck59){//debugPoint(59, rc);
                if(currents[59]!=Direction.CENTER&&cost%10+cooldowns[59]>9) {
                    if (cost%10>0&&cooldowns[59]<10&&currents[66]==Direction.CENTER) {
                        costs[59] = cooldowns[59]+(cost+9)/10*10;
                        dirs[59] = Direction.SOUTHWEST;
                        wait[59] = true;
                        currented[59] = null;
                        setChecked(59);

                        if (dest[59]) return 59;

                        addToQueue(59);
                    }
                    int currentTile = moveWithCurrent(59);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[59];
                        dirs[currentTile] = currents[59];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[59] = cost + cooldowns[59];
                    dirs[59] = Direction.SOUTHWEST;
                    currented[59] = null;
                    wait[59] = false;
                    setChecked(59);

                    if (dest[59]) return 59;

                    addToQueue(59);
                }
            }
            break;case 67:
        cost=costs[67];if(toCheck61){//debugPoint(61, rc);
                if(currents[61]!=Direction.CENTER&&cost%10+cooldowns[61]>9) {
                    if (cost%10>0&&cooldowns[61]<10&&currents[67]==Direction.CENTER) {
                        costs[61] = cooldowns[61]+(cost+9)/10*10;
                        dirs[61] = Direction.WEST;
                        wait[61] = true;
                        currented[61] = null;
                        setChecked(61);

                        if (dest[61]) return 61;

                        addToQueue(61);
                    }
                    int currentTile = moveWithCurrent(61);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[61];
                        dirs[currentTile] = currents[61];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[61] = cost + cooldowns[61];
                    dirs[61] = Direction.WEST;
                    currented[61] = null;
                    wait[61] = false;
                    setChecked(61);

                    if (dest[61]) return 61;

                    addToQueue(61);
                }
            }
            if(toCheck62){//debugPoint(62, rc);
                if(currents[62]!=Direction.CENTER&&cost%10+cooldowns[62]>9) {
                    if (cost%10>0&&cooldowns[62]<10&&currents[67]==Direction.CENTER) {
                        costs[62] = cooldowns[62]+(cost+9)/10*10;
                        dirs[62] = Direction.NORTHWEST;
                        wait[62] = true;
                        currented[62] = null;
                        setChecked(62);

                        if (dest[62]) return 62;

                        addToQueue(62);
                    }
                    int currentTile = moveWithCurrent(62);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[62];
                        dirs[currentTile] = currents[62];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[62] = cost + cooldowns[62];
                    dirs[62] = Direction.NORTHWEST;
                    currented[62] = null;
                    wait[62] = false;
                    setChecked(62);

                    if (dest[62]) return 62;

                    addToQueue(62);
                }
            }
            if(toCheck68){//debugPoint(68, rc);
                if(currents[68]!=Direction.CENTER&&cost%10+cooldowns[68]>9) {
                    if (cost%10>0&&cooldowns[68]<10&&currents[67]==Direction.CENTER) {
                        costs[68] = cooldowns[68]+(cost+9)/10*10;
                        dirs[68] = Direction.NORTH;
                        wait[68] = true;
                        currented[68] = null;
                        setChecked(68);

                        if (dest[68]) return 68;

                        addToQueue(68);
                    }
                    int currentTile = moveWithCurrent(68);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[68];
                        dirs[currentTile] = currents[68];
                        currented[currentTile] = Direction.NORTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[68] = cost + cooldowns[68];
                    dirs[68] = Direction.NORTH;
                    currented[68] = null;
                    wait[68] = false;
                    setChecked(68);

                    if (dest[68]) return 68;

                    addToQueue(68);
                }
            }
            if(toCheck66){//debugPoint(66, rc);
                if(currents[66]!=Direction.CENTER&&cost%10+cooldowns[66]>9) {
                    if (cost%10>0&&cooldowns[66]<10&&currents[67]==Direction.CENTER) {
                        costs[66] = cooldowns[66]+(cost+9)/10*10;
                        dirs[66] = Direction.SOUTH;
                        wait[66] = true;
                        currented[66] = null;
                        setChecked(66);

                        if (dest[66]) return 66;

                        addToQueue(66);
                    }
                    int currentTile = moveWithCurrent(66);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[66];
                        dirs[currentTile] = currents[66];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[66] = cost + cooldowns[66];
                    dirs[66] = Direction.SOUTH;
                    currented[66] = null;
                    wait[66] = false;
                    setChecked(66);

                    if (dest[66]) return 66;

                    addToQueue(66);
                }
            }
            if(toCheck60){//debugPoint(60, rc);
                if(currents[60]!=Direction.CENTER&&cost%10+cooldowns[60]>9) {
                    if (cost%10>0&&cooldowns[60]<10&&currents[67]==Direction.CENTER) {
                        costs[60] = cooldowns[60]+(cost+9)/10*10;
                        dirs[60] = Direction.SOUTHWEST;
                        wait[60] = true;
                        currented[60] = null;
                        setChecked(60);

                        if (dest[60]) return 60;

                        addToQueue(60);
                    }
                    int currentTile = moveWithCurrent(60);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[60];
                        dirs[currentTile] = currents[60];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[60] = cost + cooldowns[60];
                    dirs[60] = Direction.SOUTHWEST;
                    currented[60] = null;
                    wait[60] = false;
                    setChecked(60);

                    if (dest[60]) return 60;

                    addToQueue(60);
                }
            }
            break;case 68:
        cost=costs[68];if(toCheck62){//debugPoint(62, rc);
                if(currents[62]!=Direction.CENTER&&cost%10+cooldowns[62]>9) {
                    if (cost%10>0&&cooldowns[62]<10&&currents[68]==Direction.CENTER) {
                        costs[62] = cooldowns[62]+(cost+9)/10*10;
                        dirs[62] = Direction.WEST;
                        wait[62] = true;
                        currented[62] = null;
                        setChecked(62);

                        if (dest[62]) return 62;

                        addToQueue(62);
                    }
                    int currentTile = moveWithCurrent(62);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[62];
                        dirs[currentTile] = currents[62];
                        currented[currentTile] = Direction.WEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[62] = cost + cooldowns[62];
                    dirs[62] = Direction.WEST;
                    currented[62] = null;
                    wait[62] = false;
                    setChecked(62);

                    if (dest[62]) return 62;

                    addToQueue(62);
                }
            }
            if(toCheck63){//debugPoint(63, rc);
                if(currents[63]!=Direction.CENTER&&cost%10+cooldowns[63]>9) {
                    if (cost%10>0&&cooldowns[63]<10&&currents[68]==Direction.CENTER) {
                        costs[63] = cooldowns[63]+(cost+9)/10*10;
                        dirs[63] = Direction.NORTHWEST;
                        wait[63] = true;
                        currented[63] = null;
                        setChecked(63);

                        if (dest[63]) return 63;

                        addToQueue(63);
                    }
                    int currentTile = moveWithCurrent(63);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[63];
                        dirs[currentTile] = currents[63];
                        currented[currentTile] = Direction.NORTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[63] = cost + cooldowns[63];
                    dirs[63] = Direction.NORTHWEST;
                    currented[63] = null;
                    wait[63] = false;
                    setChecked(63);

                    if (dest[63]) return 63;

                    addToQueue(63);
                }
            }
            if(toCheck67){//debugPoint(67, rc);
                if(currents[67]!=Direction.CENTER&&cost%10+cooldowns[67]>9) {
                    if (cost%10>0&&cooldowns[67]<10&&currents[68]==Direction.CENTER) {
                        costs[67] = cooldowns[67]+(cost+9)/10*10;
                        dirs[67] = Direction.SOUTH;
                        wait[67] = true;
                        currented[67] = null;
                        setChecked(67);

                        if (dest[67]) return 67;

                        addToQueue(67);
                    }
                    int currentTile = moveWithCurrent(67);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[67];
                        dirs[currentTile] = currents[67];
                        currented[currentTile] = Direction.SOUTH;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[67] = cost + cooldowns[67];
                    dirs[67] = Direction.SOUTH;
                    currented[67] = null;
                    wait[67] = false;
                    setChecked(67);

                    if (dest[67]) return 67;

                    addToQueue(67);
                }
            }
            if(toCheck61){//debugPoint(61, rc);
                if(currents[61]!=Direction.CENTER&&cost%10+cooldowns[61]>9) {
                    if (cost%10>0&&cooldowns[61]<10&&currents[68]==Direction.CENTER) {
                        costs[61] = cooldowns[61]+(cost+9)/10*10;
                        dirs[61] = Direction.SOUTHWEST;
                        wait[61] = true;
                        currented[61] = null;
                        setChecked(61);

                        if (dest[61]) return 61;

                        addToQueue(61);
                    }
                    int currentTile = moveWithCurrent(61);
                    if (getToCheck(currentTile)) {
                        costs[currentTile] = cost + cooldowns[61];
                        dirs[currentTile] = currents[61];
                        currented[currentTile] = Direction.SOUTHWEST;
                        wait[currentTile] = false;
                        setChecked(currentTile);

                        if (dest[currentTile]) return currentTile;

                        addToQueue(currentTile);
                    }
                } else {
                    costs[61] = cost + cooldowns[61];
                    dirs[61] = Direction.SOUTHWEST;
                    currented[61] = null;
                    wait[61] = false;
                    setChecked(61);

                    if (dest[61]) return 61;

                    addToQueue(61);
                }
            }
            break;
        }
    return -1;
    }
    public static int dijkstra(RobotController rc) {
        int cost = rc.getMovementCooldownTurns();
        if (cost >= 10) {
            return Integer.MAX_VALUE;
        }

        costs[34] = cost;
        addToQueue(34);
        toCheck34 = false;

        int currentTile;

        while(queueHead > 0) {
            int ret;
            switch(popFromQueue()) {
                case 0: ret = dijkstraSub0(rc, 0);
break;
case 1: ret = dijkstraSub0(rc, 1);
break;
case 2: ret = dijkstraSub0(rc, 2);
break;
case 3: ret = dijkstraSub0(rc, 3);
break;
case 4: ret = dijkstraSub0(rc, 4);
break;
case 5: ret = dijkstraSub0(rc, 5);
break;
case 6: ret = dijkstraSub0(rc, 6);
break;
case 7: ret = dijkstraSub0(rc, 7);
break;
case 8: ret = dijkstraSub0(rc, 8);
break;
case 9: ret = dijkstraSub0(rc, 9);
break;
case 10: ret = dijkstraSub0(rc, 10);
break;
case 11: ret = dijkstraSub0(rc, 11);
break;
case 12: ret = dijkstraSub0(rc, 12);
break;
case 13: ret = dijkstraSub1(rc, 13);
break;
case 14: ret = dijkstraSub1(rc, 14);
break;
case 15: ret = dijkstraSub1(rc, 15);
break;
case 16: ret = dijkstraSub1(rc, 16);
break;
case 17: ret = dijkstraSub1(rc, 17);
break;
case 18: ret = dijkstraSub1(rc, 18);
break;
case 19: ret = dijkstraSub1(rc, 19);
break;
case 20: ret = dijkstraSub1(rc, 20);
break;
case 21: ret = dijkstraSub1(rc, 21);
break;
case 22: ret = dijkstraSub1(rc, 22);
break;
case 23: ret = dijkstraSub1(rc, 23);
break;
case 24: ret = dijkstraSub1(rc, 24);
break;
case 25: ret = dijkstraSub1(rc, 25);
break;
case 26: ret = dijkstraSub2(rc, 26);
break;
case 27: ret = dijkstraSub2(rc, 27);
break;
case 28: ret = dijkstraSub2(rc, 28);
break;
case 29: ret = dijkstraSub2(rc, 29);
break;
case 30: ret = dijkstraSub2(rc, 30);
break;
case 31: ret = dijkstraSub2(rc, 31);
break;
case 32: ret = dijkstraSub2(rc, 32);
break;
case 33: ret = dijkstraSub2(rc, 33);
break;
case 34: ret = dijkstraSub2(rc, 34);
break;
case 35: ret = dijkstraSub2(rc, 35);
break;
case 36: ret = dijkstraSub2(rc, 36);
break;
case 37: ret = dijkstraSub2(rc, 37);
break;
case 38: ret = dijkstraSub2(rc, 38);
break;
case 39: ret = dijkstraSub3(rc, 39);
break;
case 40: ret = dijkstraSub3(rc, 40);
break;
case 41: ret = dijkstraSub3(rc, 41);
break;
case 42: ret = dijkstraSub3(rc, 42);
break;
case 43: ret = dijkstraSub3(rc, 43);
break;
case 44: ret = dijkstraSub3(rc, 44);
break;
case 45: ret = dijkstraSub3(rc, 45);
break;
case 46: ret = dijkstraSub3(rc, 46);
break;
case 47: ret = dijkstraSub3(rc, 47);
break;
case 48: ret = dijkstraSub3(rc, 48);
break;
case 49: ret = dijkstraSub3(rc, 49);
break;
case 50: ret = dijkstraSub3(rc, 50);
break;
case 51: ret = dijkstraSub3(rc, 51);
break;
case 52: ret = dijkstraSub4(rc, 52);
break;
case 53: ret = dijkstraSub4(rc, 53);
break;
case 54: ret = dijkstraSub4(rc, 54);
break;
case 55: ret = dijkstraSub4(rc, 55);
break;
case 56: ret = dijkstraSub4(rc, 56);
break;
case 57: ret = dijkstraSub4(rc, 57);
break;
case 58: ret = dijkstraSub4(rc, 58);
break;
case 59: ret = dijkstraSub4(rc, 59);
break;
case 60: ret = dijkstraSub4(rc, 60);
break;
case 61: ret = dijkstraSub4(rc, 61);
break;
case 62: ret = dijkstraSub4(rc, 62);
break;
case 63: ret = dijkstraSub4(rc, 63);
break;
case 64: ret = dijkstraSub4(rc, 64);
break;
case 65: ret = dijkstraSub5(rc, 65);
break;
case 66: ret = dijkstraSub5(rc, 66);
break;
case 67: ret = dijkstraSub5(rc, 67);
break;
case 68: ret = dijkstraSub5(rc, 68);
break;
default: ret=-1;} if (ret >= 0) return ret; } return -1; }public static Direction[] reconstructPath(int dest, RobotController rc) {
        if (dest == -1) {
            return new Direction[] { Direction.CENTER };
        }

        int start = 34;
        Direction[] path = new Direction[100];
        int i = 0;
        while (dest != start) {
            debugPoint(dest, rc);
            Direction dir = dirs[dest];
            if (currented[dest] == null || currents[translateDir(dest, dir.opposite())] == Direction.CENTER) {
                path[i] = dir;
                if (wait[dest]) {
                    i++;
                    path[i] = Direction.CENTER;
                }
            } else {
                path[i] = currented[dest];
                if (wait[dest]) {
                    i++;
                    path[i] = Direction.CENTER;
                }
                dest = translateDir(dest, currented[dest].opposite());
            }

            i++;
            dest = translateDir(dest, dir.opposite());
        }

        // fix order of path
        Direction[] ordered = new Direction[i];
        for (int j = i; --j >= 0;) {
            ordered[j] = path[i - j - 1];
        }
        return ordered;
    }
    public static void addToQueue(int n) {
    int cost = costs[n];
    switch(queueHead) {
case 0:
    queue0 = n;
    break;
case 1:
    if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    break;
case 2:
    if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    break;
case 3:
    if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    break;
case 4:
    if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    break;
case 5:
    if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    break;
case 6:
    if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    break;
case 7:
    if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    break;
case 8:
    if(costs[queue3] > cost) {
        queue8 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue8 = n;
    }
    break;
case 9:
    if(costs[queue4] > cost) {
        queue9 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue9 = n;
    }
    break;
case 10:
    if(costs[queue4] > cost) {
        queue10 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue10 = n;
    }
    break;
case 11:
    if(costs[queue5] > cost) {
        queue11 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue11 = n;
    }
    break;
case 12:
    if(costs[queue5] > cost) {
        queue12 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue12 = n;
    }
    break;
case 13:
    if(costs[queue6] > cost) {
        queue13 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue13 = n;
    }
    break;
case 14:
    if(costs[queue6] > cost) {
        queue14 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue14 = n;
    }
    break;
case 15:
    if(costs[queue7] > cost) {
        queue15 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue15 = n;
    }
    break;
case 16:
    if(costs[queue7] > cost) {
        queue16 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue16 = n;
    }
    break;
case 17:
    if(costs[queue8] > cost) {
        queue17 = queue8;
        if(costs[queue3] > cost) {
        queue8 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue8 = n;
    }
    } else {
        queue17 = n;
    }
    break;
case 18:
    if(costs[queue8] > cost) {
        queue18 = queue8;
        if(costs[queue3] > cost) {
        queue8 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue8 = n;
    }
    } else {
        queue18 = n;
    }
    break;
case 19:
    if(costs[queue9] > cost) {
        queue19 = queue9;
        if(costs[queue4] > cost) {
        queue9 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue9 = n;
    }
    } else {
        queue19 = n;
    }
    break;
case 20:
    if(costs[queue9] > cost) {
        queue20 = queue9;
        if(costs[queue4] > cost) {
        queue9 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue9 = n;
    }
    } else {
        queue20 = n;
    }
    break;
case 21:
    if(costs[queue10] > cost) {
        queue21 = queue10;
        if(costs[queue4] > cost) {
        queue10 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue10 = n;
    }
    } else {
        queue21 = n;
    }
    break;
case 22:
    if(costs[queue10] > cost) {
        queue22 = queue10;
        if(costs[queue4] > cost) {
        queue10 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue10 = n;
    }
    } else {
        queue22 = n;
    }
    break;
case 23:
    if(costs[queue11] > cost) {
        queue23 = queue11;
        if(costs[queue5] > cost) {
        queue11 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue11 = n;
    }
    } else {
        queue23 = n;
    }
    break;
case 24:
    if(costs[queue11] > cost) {
        queue24 = queue11;
        if(costs[queue5] > cost) {
        queue11 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue11 = n;
    }
    } else {
        queue24 = n;
    }
    break;
case 25:
    if(costs[queue12] > cost) {
        queue25 = queue12;
        if(costs[queue5] > cost) {
        queue12 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue12 = n;
    }
    } else {
        queue25 = n;
    }
    break;
case 26:
    if(costs[queue12] > cost) {
        queue26 = queue12;
        if(costs[queue5] > cost) {
        queue12 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue12 = n;
    }
    } else {
        queue26 = n;
    }
    break;
case 27:
    if(costs[queue13] > cost) {
        queue27 = queue13;
        if(costs[queue6] > cost) {
        queue13 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue13 = n;
    }
    } else {
        queue27 = n;
    }
    break;
case 28:
    if(costs[queue13] > cost) {
        queue28 = queue13;
        if(costs[queue6] > cost) {
        queue13 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue13 = n;
    }
    } else {
        queue28 = n;
    }
    break;
case 29:
    if(costs[queue14] > cost) {
        queue29 = queue14;
        if(costs[queue6] > cost) {
        queue14 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue14 = n;
    }
    } else {
        queue29 = n;
    }
    break;
case 30:
    if(costs[queue14] > cost) {
        queue30 = queue14;
        if(costs[queue6] > cost) {
        queue14 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue14 = n;
    }
    } else {
        queue30 = n;
    }
    break;
case 31:
    if(costs[queue15] > cost) {
        queue31 = queue15;
        if(costs[queue7] > cost) {
        queue15 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue15 = n;
    }
    } else {
        queue31 = n;
    }
    break;
case 32:
    if(costs[queue15] > cost) {
        queue32 = queue15;
        if(costs[queue7] > cost) {
        queue15 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue15 = n;
    }
    } else {
        queue32 = n;
    }
    break;
case 33:
    if(costs[queue16] > cost) {
        queue33 = queue16;
        if(costs[queue7] > cost) {
        queue16 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue16 = n;
    }
    } else {
        queue33 = n;
    }
    break;
case 34:
    if(costs[queue16] > cost) {
        queue34 = queue16;
        if(costs[queue7] > cost) {
        queue16 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue16 = n;
    }
    } else {
        queue34 = n;
    }
    break;
case 35:
    if(costs[queue17] > cost) {
        queue35 = queue17;
        if(costs[queue8] > cost) {
        queue17 = queue8;
        if(costs[queue3] > cost) {
        queue8 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue8 = n;
    }
    } else {
        queue17 = n;
    }
    } else {
        queue35 = n;
    }
    break;
case 36:
    if(costs[queue17] > cost) {
        queue36 = queue17;
        if(costs[queue8] > cost) {
        queue17 = queue8;
        if(costs[queue3] > cost) {
        queue8 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue8 = n;
    }
    } else {
        queue17 = n;
    }
    } else {
        queue36 = n;
    }
    break;
case 37:
    if(costs[queue18] > cost) {
        queue37 = queue18;
        if(costs[queue8] > cost) {
        queue18 = queue8;
        if(costs[queue3] > cost) {
        queue8 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue8 = n;
    }
    } else {
        queue18 = n;
    }
    } else {
        queue37 = n;
    }
    break;
case 38:
    if(costs[queue18] > cost) {
        queue38 = queue18;
        if(costs[queue8] > cost) {
        queue18 = queue8;
        if(costs[queue3] > cost) {
        queue8 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue8 = n;
    }
    } else {
        queue18 = n;
    }
    } else {
        queue38 = n;
    }
    break;
case 39:
    if(costs[queue19] > cost) {
        queue39 = queue19;
        if(costs[queue9] > cost) {
        queue19 = queue9;
        if(costs[queue4] > cost) {
        queue9 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue9 = n;
    }
    } else {
        queue19 = n;
    }
    } else {
        queue39 = n;
    }
    break;
case 40:
    if(costs[queue19] > cost) {
        queue40 = queue19;
        if(costs[queue9] > cost) {
        queue19 = queue9;
        if(costs[queue4] > cost) {
        queue9 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue9 = n;
    }
    } else {
        queue19 = n;
    }
    } else {
        queue40 = n;
    }
    break;
case 41:
    if(costs[queue20] > cost) {
        queue41 = queue20;
        if(costs[queue9] > cost) {
        queue20 = queue9;
        if(costs[queue4] > cost) {
        queue9 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue9 = n;
    }
    } else {
        queue20 = n;
    }
    } else {
        queue41 = n;
    }
    break;
case 42:
    if(costs[queue20] > cost) {
        queue42 = queue20;
        if(costs[queue9] > cost) {
        queue20 = queue9;
        if(costs[queue4] > cost) {
        queue9 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue9 = n;
    }
    } else {
        queue20 = n;
    }
    } else {
        queue42 = n;
    }
    break;
case 43:
    if(costs[queue21] > cost) {
        queue43 = queue21;
        if(costs[queue10] > cost) {
        queue21 = queue10;
        if(costs[queue4] > cost) {
        queue10 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue10 = n;
    }
    } else {
        queue21 = n;
    }
    } else {
        queue43 = n;
    }
    break;
case 44:
    if(costs[queue21] > cost) {
        queue44 = queue21;
        if(costs[queue10] > cost) {
        queue21 = queue10;
        if(costs[queue4] > cost) {
        queue10 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue10 = n;
    }
    } else {
        queue21 = n;
    }
    } else {
        queue44 = n;
    }
    break;
case 45:
    if(costs[queue22] > cost) {
        queue45 = queue22;
        if(costs[queue10] > cost) {
        queue22 = queue10;
        if(costs[queue4] > cost) {
        queue10 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue10 = n;
    }
    } else {
        queue22 = n;
    }
    } else {
        queue45 = n;
    }
    break;
case 46:
    if(costs[queue22] > cost) {
        queue46 = queue22;
        if(costs[queue10] > cost) {
        queue22 = queue10;
        if(costs[queue4] > cost) {
        queue10 = queue4;
        if(costs[queue1] > cost) {
        queue4 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue4 = n;
    }
    } else {
        queue10 = n;
    }
    } else {
        queue22 = n;
    }
    } else {
        queue46 = n;
    }
    break;
case 47:
    if(costs[queue23] > cost) {
        queue47 = queue23;
        if(costs[queue11] > cost) {
        queue23 = queue11;
        if(costs[queue5] > cost) {
        queue11 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue11 = n;
    }
    } else {
        queue23 = n;
    }
    } else {
        queue47 = n;
    }
    break;
case 48:
    if(costs[queue23] > cost) {
        queue48 = queue23;
        if(costs[queue11] > cost) {
        queue23 = queue11;
        if(costs[queue5] > cost) {
        queue11 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue11 = n;
    }
    } else {
        queue23 = n;
    }
    } else {
        queue48 = n;
    }
    break;
case 49:
    if(costs[queue24] > cost) {
        queue49 = queue24;
        if(costs[queue11] > cost) {
        queue24 = queue11;
        if(costs[queue5] > cost) {
        queue11 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue11 = n;
    }
    } else {
        queue24 = n;
    }
    } else {
        queue49 = n;
    }
    break;
case 50:
    if(costs[queue24] > cost) {
        queue50 = queue24;
        if(costs[queue11] > cost) {
        queue24 = queue11;
        if(costs[queue5] > cost) {
        queue11 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue11 = n;
    }
    } else {
        queue24 = n;
    }
    } else {
        queue50 = n;
    }
    break;
case 51:
    if(costs[queue25] > cost) {
        queue51 = queue25;
        if(costs[queue12] > cost) {
        queue25 = queue12;
        if(costs[queue5] > cost) {
        queue12 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue12 = n;
    }
    } else {
        queue25 = n;
    }
    } else {
        queue51 = n;
    }
    break;
case 52:
    if(costs[queue25] > cost) {
        queue52 = queue25;
        if(costs[queue12] > cost) {
        queue25 = queue12;
        if(costs[queue5] > cost) {
        queue12 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue12 = n;
    }
    } else {
        queue25 = n;
    }
    } else {
        queue52 = n;
    }
    break;
case 53:
    if(costs[queue26] > cost) {
        queue53 = queue26;
        if(costs[queue12] > cost) {
        queue26 = queue12;
        if(costs[queue5] > cost) {
        queue12 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue12 = n;
    }
    } else {
        queue26 = n;
    }
    } else {
        queue53 = n;
    }
    break;
case 54:
    if(costs[queue26] > cost) {
        queue54 = queue26;
        if(costs[queue12] > cost) {
        queue26 = queue12;
        if(costs[queue5] > cost) {
        queue12 = queue5;
        if(costs[queue2] > cost) {
        queue5 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue5 = n;
    }
    } else {
        queue12 = n;
    }
    } else {
        queue26 = n;
    }
    } else {
        queue54 = n;
    }
    break;
case 55:
    if(costs[queue27] > cost) {
        queue55 = queue27;
        if(costs[queue13] > cost) {
        queue27 = queue13;
        if(costs[queue6] > cost) {
        queue13 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue13 = n;
    }
    } else {
        queue27 = n;
    }
    } else {
        queue55 = n;
    }
    break;
case 56:
    if(costs[queue27] > cost) {
        queue56 = queue27;
        if(costs[queue13] > cost) {
        queue27 = queue13;
        if(costs[queue6] > cost) {
        queue13 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue13 = n;
    }
    } else {
        queue27 = n;
    }
    } else {
        queue56 = n;
    }
    break;
case 57:
    if(costs[queue28] > cost) {
        queue57 = queue28;
        if(costs[queue13] > cost) {
        queue28 = queue13;
        if(costs[queue6] > cost) {
        queue13 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue13 = n;
    }
    } else {
        queue28 = n;
    }
    } else {
        queue57 = n;
    }
    break;
case 58:
    if(costs[queue28] > cost) {
        queue58 = queue28;
        if(costs[queue13] > cost) {
        queue28 = queue13;
        if(costs[queue6] > cost) {
        queue13 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue13 = n;
    }
    } else {
        queue28 = n;
    }
    } else {
        queue58 = n;
    }
    break;
case 59:
    if(costs[queue29] > cost) {
        queue59 = queue29;
        if(costs[queue14] > cost) {
        queue29 = queue14;
        if(costs[queue6] > cost) {
        queue14 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue14 = n;
    }
    } else {
        queue29 = n;
    }
    } else {
        queue59 = n;
    }
    break;
case 60:
    if(costs[queue29] > cost) {
        queue60 = queue29;
        if(costs[queue14] > cost) {
        queue29 = queue14;
        if(costs[queue6] > cost) {
        queue14 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue14 = n;
    }
    } else {
        queue29 = n;
    }
    } else {
        queue60 = n;
    }
    break;
case 61:
    if(costs[queue30] > cost) {
        queue61 = queue30;
        if(costs[queue14] > cost) {
        queue30 = queue14;
        if(costs[queue6] > cost) {
        queue14 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue14 = n;
    }
    } else {
        queue30 = n;
    }
    } else {
        queue61 = n;
    }
    break;
case 62:
    if(costs[queue30] > cost) {
        queue62 = queue30;
        if(costs[queue14] > cost) {
        queue30 = queue14;
        if(costs[queue6] > cost) {
        queue14 = queue6;
        if(costs[queue2] > cost) {
        queue6 = queue2;
        if(costs[queue0] > cost) {
        queue2 = queue0;
        queue0 = n;
    } else {
        queue2 = n;
    }
    } else {
        queue6 = n;
    }
    } else {
        queue14 = n;
    }
    } else {
        queue30 = n;
    }
    } else {
        queue62 = n;
    }
    break;
case 63:
    if(costs[queue31] > cost) {
        queue63 = queue31;
        if(costs[queue15] > cost) {
        queue31 = queue15;
        if(costs[queue7] > cost) {
        queue15 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue15 = n;
    }
    } else {
        queue31 = n;
    }
    } else {
        queue63 = n;
    }
    break;
case 64:
    if(costs[queue31] > cost) {
        queue64 = queue31;
        if(costs[queue15] > cost) {
        queue31 = queue15;
        if(costs[queue7] > cost) {
        queue15 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue15 = n;
    }
    } else {
        queue31 = n;
    }
    } else {
        queue64 = n;
    }
    break;
case 65:
    if(costs[queue32] > cost) {
        queue65 = queue32;
        if(costs[queue15] > cost) {
        queue32 = queue15;
        if(costs[queue7] > cost) {
        queue15 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue15 = n;
    }
    } else {
        queue32 = n;
    }
    } else {
        queue65 = n;
    }
    break;
case 66:
    if(costs[queue32] > cost) {
        queue66 = queue32;
        if(costs[queue15] > cost) {
        queue32 = queue15;
        if(costs[queue7] > cost) {
        queue15 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue15 = n;
    }
    } else {
        queue32 = n;
    }
    } else {
        queue66 = n;
    }
    break;
case 67:
    if(costs[queue33] > cost) {
        queue67 = queue33;
        if(costs[queue16] > cost) {
        queue33 = queue16;
        if(costs[queue7] > cost) {
        queue16 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue16 = n;
    }
    } else {
        queue33 = n;
    }
    } else {
        queue67 = n;
    }
    break;
case 68:
    if(costs[queue33] > cost) {
        queue68 = queue33;
        if(costs[queue16] > cost) {
        queue33 = queue16;
        if(costs[queue7] > cost) {
        queue16 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue16 = n;
    }
    } else {
        queue33 = n;
    }
    } else {
        queue68 = n;
    }
    break;
default:
    if(costs[queue33] > cost) {
        queue68 = queue33;
        if(costs[queue16] > cost) {
        queue33 = queue16;
        if(costs[queue7] > cost) {
        queue16 = queue7;
        if(costs[queue3] > cost) {
        queue7 = queue3;
        if(costs[queue1] > cost) {
        queue3 = queue1;
        if(costs[queue0] > cost) {
        queue1 = queue0;
        queue0 = n;
    } else {
        queue1 = n;
    }
    } else {
        queue3 = n;
    }
    } else {
        queue7 = n;
    }
    } else {
        queue16 = n;
    }
    } else {
        queue33 = n;
    }
    } else {
        queue68 = n;
    }
    break;}queueHead++;}public static int popFromQueue() {
    int index = queue0;
    queueHead--;
    int replace, replaceCost;
    switch (queueHead) {
        case 0: 
            replace = queue0;
            replaceCost = costs[queue0];
            queue0 = 69;
            break;
        case 1: 
            replace = queue1;
            replaceCost = costs[queue1];
            queue0 = 69;
            break;
        case 2: 
            replace = queue2;
            replaceCost = costs[queue2];
            queue0 = 69;
            break;
        case 3: 
            replace = queue3;
            replaceCost = costs[queue3];
            queue0 = 69;
            break;
        case 4: 
            replace = queue4;
            replaceCost = costs[queue4];
            queue0 = 69;
            break;
        case 5: 
            replace = queue5;
            replaceCost = costs[queue5];
            queue0 = 69;
            break;
        case 6: 
            replace = queue6;
            replaceCost = costs[queue6];
            queue0 = 69;
            break;
        case 7: 
            replace = queue7;
            replaceCost = costs[queue7];
            queue0 = 69;
            break;
        case 8: 
            replace = queue8;
            replaceCost = costs[queue8];
            queue0 = 69;
            break;
        case 9: 
            replace = queue9;
            replaceCost = costs[queue9];
            queue0 = 69;
            break;
        case 10: 
            replace = queue10;
            replaceCost = costs[queue10];
            queue0 = 69;
            break;
        case 11: 
            replace = queue11;
            replaceCost = costs[queue11];
            queue0 = 69;
            break;
        case 12: 
            replace = queue12;
            replaceCost = costs[queue12];
            queue0 = 69;
            break;
        case 13: 
            replace = queue13;
            replaceCost = costs[queue13];
            queue0 = 69;
            break;
        case 14: 
            replace = queue14;
            replaceCost = costs[queue14];
            queue0 = 69;
            break;
        case 15: 
            replace = queue15;
            replaceCost = costs[queue15];
            queue0 = 69;
            break;
        case 16: 
            replace = queue16;
            replaceCost = costs[queue16];
            queue0 = 69;
            break;
        case 17: 
            replace = queue17;
            replaceCost = costs[queue17];
            queue0 = 69;
            break;
        case 18: 
            replace = queue18;
            replaceCost = costs[queue18];
            queue0 = 69;
            break;
        case 19: 
            replace = queue19;
            replaceCost = costs[queue19];
            queue0 = 69;
            break;
        case 20: 
            replace = queue20;
            replaceCost = costs[queue20];
            queue0 = 69;
            break;
        case 21: 
            replace = queue21;
            replaceCost = costs[queue21];
            queue0 = 69;
            break;
        case 22: 
            replace = queue22;
            replaceCost = costs[queue22];
            queue0 = 69;
            break;
        case 23: 
            replace = queue23;
            replaceCost = costs[queue23];
            queue0 = 69;
            break;
        case 24: 
            replace = queue24;
            replaceCost = costs[queue24];
            queue0 = 69;
            break;
        case 25: 
            replace = queue25;
            replaceCost = costs[queue25];
            queue0 = 69;
            break;
        case 26: 
            replace = queue26;
            replaceCost = costs[queue26];
            queue0 = 69;
            break;
        case 27: 
            replace = queue27;
            replaceCost = costs[queue27];
            queue0 = 69;
            break;
        case 28: 
            replace = queue28;
            replaceCost = costs[queue28];
            queue0 = 69;
            break;
        case 29: 
            replace = queue29;
            replaceCost = costs[queue29];
            queue0 = 69;
            break;
        case 30: 
            replace = queue30;
            replaceCost = costs[queue30];
            queue0 = 69;
            break;
        case 31: 
            replace = queue31;
            replaceCost = costs[queue31];
            queue0 = 69;
            break;
        case 32: 
            replace = queue32;
            replaceCost = costs[queue32];
            queue0 = 69;
            break;
        case 33: 
            replace = queue33;
            replaceCost = costs[queue33];
            queue0 = 69;
            break;
        case 34: 
            replace = queue34;
            replaceCost = costs[queue34];
            queue0 = 69;
            break;
        case 35: 
            replace = queue35;
            replaceCost = costs[queue35];
            queue0 = 69;
            break;
        case 36: 
            replace = queue36;
            replaceCost = costs[queue36];
            queue0 = 69;
            break;
        case 37: 
            replace = queue37;
            replaceCost = costs[queue37];
            queue0 = 69;
            break;
        case 38: 
            replace = queue38;
            replaceCost = costs[queue38];
            queue0 = 69;
            break;
        case 39: 
            replace = queue39;
            replaceCost = costs[queue39];
            queue0 = 69;
            break;
        case 40: 
            replace = queue40;
            replaceCost = costs[queue40];
            queue0 = 69;
            break;
        case 41: 
            replace = queue41;
            replaceCost = costs[queue41];
            queue0 = 69;
            break;
        case 42: 
            replace = queue42;
            replaceCost = costs[queue42];
            queue0 = 69;
            break;
        case 43: 
            replace = queue43;
            replaceCost = costs[queue43];
            queue0 = 69;
            break;
        case 44: 
            replace = queue44;
            replaceCost = costs[queue44];
            queue0 = 69;
            break;
        case 45: 
            replace = queue45;
            replaceCost = costs[queue45];
            queue0 = 69;
            break;
        case 46: 
            replace = queue46;
            replaceCost = costs[queue46];
            queue0 = 69;
            break;
        case 47: 
            replace = queue47;
            replaceCost = costs[queue47];
            queue0 = 69;
            break;
        case 48: 
            replace = queue48;
            replaceCost = costs[queue48];
            queue0 = 69;
            break;
        case 49: 
            replace = queue49;
            replaceCost = costs[queue49];
            queue0 = 69;
            break;
        case 50: 
            replace = queue50;
            replaceCost = costs[queue50];
            queue0 = 69;
            break;
        case 51: 
            replace = queue51;
            replaceCost = costs[queue51];
            queue0 = 69;
            break;
        case 52: 
            replace = queue52;
            replaceCost = costs[queue52];
            queue0 = 69;
            break;
        case 53: 
            replace = queue53;
            replaceCost = costs[queue53];
            queue0 = 69;
            break;
        case 54: 
            replace = queue54;
            replaceCost = costs[queue54];
            queue0 = 69;
            break;
        case 55: 
            replace = queue55;
            replaceCost = costs[queue55];
            queue0 = 69;
            break;
        case 56: 
            replace = queue56;
            replaceCost = costs[queue56];
            queue0 = 69;
            break;
        case 57: 
            replace = queue57;
            replaceCost = costs[queue57];
            queue0 = 69;
            break;
        case 58: 
            replace = queue58;
            replaceCost = costs[queue58];
            queue0 = 69;
            break;
        case 59: 
            replace = queue59;
            replaceCost = costs[queue59];
            queue0 = 69;
            break;
        case 60: 
            replace = queue60;
            replaceCost = costs[queue60];
            queue0 = 69;
            break;
        case 61: 
            replace = queue61;
            replaceCost = costs[queue61];
            queue0 = 69;
            break;
        case 62: 
            replace = queue62;
            replaceCost = costs[queue62];
            queue0 = 69;
            break;
        case 63: 
            replace = queue63;
            replaceCost = costs[queue63];
            queue0 = 69;
            break;
        case 64: 
            replace = queue64;
            replaceCost = costs[queue64];
            queue0 = 69;
            break;
        case 65: 
            replace = queue65;
            replaceCost = costs[queue65];
            queue0 = 69;
            break;
        case 66: 
            replace = queue66;
            replaceCost = costs[queue66];
            queue0 = 69;
            break;
        case 67: 
            replace = queue67;
            replaceCost = costs[queue67];
            queue0 = 69;
            break;
        case 68: 
            replace = queue68;
            replaceCost = costs[queue68];
            queue0 = 69;
            break;
        default:
			replace = queue68;
			replaceCost = costs[queue68];
			queue68 = 69;}    if(costs[queue1] < costs[queue2]) {
        if(costs[queue1] < replaceCost) {
            queue0 = queue1;
                if(costs[queue3] < costs[queue4]) {
        if(costs[queue3] < replaceCost) {
            queue1 = queue3;
                if(costs[queue7] < costs[queue8]) {
        if(costs[queue7] < replaceCost) {
            queue3 = queue7;
                if(costs[queue15] < costs[queue16]) {
        if(costs[queue15] < replaceCost) {
            queue7 = queue15;
                if(costs[queue31] < costs[queue32]) {
        if(costs[queue31] < replaceCost) {
            queue15 = queue31;
                if(costs[queue63] < costs[queue64]) {
        if(costs[queue63] < replaceCost) {
            queue31 = queue63;
            queue63 = replace;
        } else {
            queue31 = replace;
        }
    } else {
        if(costs[queue64] < replaceCost) {
            queue31 = queue64;
            queue64 = replace;
        } else {
            queue31 = replace;
        }
    }
    
        } else {
            queue15 = replace;
        }
    } else {
        if(costs[queue32] < replaceCost) {
            queue15 = queue32;
                if(costs[queue65] < costs[queue66]) {
        if(costs[queue65] < replaceCost) {
            queue32 = queue65;
            queue65 = replace;
        } else {
            queue32 = replace;
        }
    } else {
        if(costs[queue66] < replaceCost) {
            queue32 = queue66;
            queue66 = replace;
        } else {
            queue32 = replace;
        }
    }
    
        } else {
            queue15 = replace;
        }
    }
    
        } else {
            queue7 = replace;
        }
    } else {
        if(costs[queue16] < replaceCost) {
            queue7 = queue16;
                if(costs[queue33] < costs[queue34]) {
        if(costs[queue33] < replaceCost) {
            queue16 = queue33;
                if(costs[queue67] < costs[queue68]) {
        if(costs[queue67] < replaceCost) {
            queue33 = queue67;
            queue67 = replace;
        } else {
            queue33 = replace;
        }
    } else {
        if(costs[queue68] < replaceCost) {
            queue33 = queue68;
            queue68 = replace;
        } else {
            queue33 = replace;
        }
    }
    
        } else {
            queue16 = replace;
        }
    } else {
        if(costs[queue34] < replaceCost) {
            queue16 = queue34;
            queue34 = replace;
        } else {
            queue16 = replace;
        }
    }
    
        } else {
            queue7 = replace;
        }
    }
    
        } else {
            queue3 = replace;
        }
    } else {
        if(costs[queue8] < replaceCost) {
            queue3 = queue8;
                if(costs[queue17] < costs[queue18]) {
        if(costs[queue17] < replaceCost) {
            queue8 = queue17;
                if(costs[queue35] < costs[queue36]) {
        if(costs[queue35] < replaceCost) {
            queue17 = queue35;
            queue35 = replace;
        } else {
            queue17 = replace;
        }
    } else {
        if(costs[queue36] < replaceCost) {
            queue17 = queue36;
            queue36 = replace;
        } else {
            queue17 = replace;
        }
    }
    
        } else {
            queue8 = replace;
        }
    } else {
        if(costs[queue18] < replaceCost) {
            queue8 = queue18;
                if(costs[queue37] < costs[queue38]) {
        if(costs[queue37] < replaceCost) {
            queue18 = queue37;
            queue37 = replace;
        } else {
            queue18 = replace;
        }
    } else {
        if(costs[queue38] < replaceCost) {
            queue18 = queue38;
            queue38 = replace;
        } else {
            queue18 = replace;
        }
    }
    
        } else {
            queue8 = replace;
        }
    }
    
        } else {
            queue3 = replace;
        }
    }
    
        } else {
            queue1 = replace;
        }
    } else {
        if(costs[queue4] < replaceCost) {
            queue1 = queue4;
                if(costs[queue9] < costs[queue10]) {
        if(costs[queue9] < replaceCost) {
            queue4 = queue9;
                if(costs[queue19] < costs[queue20]) {
        if(costs[queue19] < replaceCost) {
            queue9 = queue19;
                if(costs[queue39] < costs[queue40]) {
        if(costs[queue39] < replaceCost) {
            queue19 = queue39;
            queue39 = replace;
        } else {
            queue19 = replace;
        }
    } else {
        if(costs[queue40] < replaceCost) {
            queue19 = queue40;
            queue40 = replace;
        } else {
            queue19 = replace;
        }
    }
    
        } else {
            queue9 = replace;
        }
    } else {
        if(costs[queue20] < replaceCost) {
            queue9 = queue20;
                if(costs[queue41] < costs[queue42]) {
        if(costs[queue41] < replaceCost) {
            queue20 = queue41;
            queue41 = replace;
        } else {
            queue20 = replace;
        }
    } else {
        if(costs[queue42] < replaceCost) {
            queue20 = queue42;
            queue42 = replace;
        } else {
            queue20 = replace;
        }
    }
    
        } else {
            queue9 = replace;
        }
    }
    
        } else {
            queue4 = replace;
        }
    } else {
        if(costs[queue10] < replaceCost) {
            queue4 = queue10;
                if(costs[queue21] < costs[queue22]) {
        if(costs[queue21] < replaceCost) {
            queue10 = queue21;
                if(costs[queue43] < costs[queue44]) {
        if(costs[queue43] < replaceCost) {
            queue21 = queue43;
            queue43 = replace;
        } else {
            queue21 = replace;
        }
    } else {
        if(costs[queue44] < replaceCost) {
            queue21 = queue44;
            queue44 = replace;
        } else {
            queue21 = replace;
        }
    }
    
        } else {
            queue10 = replace;
        }
    } else {
        if(costs[queue22] < replaceCost) {
            queue10 = queue22;
                if(costs[queue45] < costs[queue46]) {
        if(costs[queue45] < replaceCost) {
            queue22 = queue45;
            queue45 = replace;
        } else {
            queue22 = replace;
        }
    } else {
        if(costs[queue46] < replaceCost) {
            queue22 = queue46;
            queue46 = replace;
        } else {
            queue22 = replace;
        }
    }
    
        } else {
            queue10 = replace;
        }
    }
    
        } else {
            queue4 = replace;
        }
    }
    
        } else {
            queue1 = replace;
        }
    }
    
        } else {
            queue0 = replace;
        }
    } else {
        if(costs[queue2] < replaceCost) {
            queue0 = queue2;
                if(costs[queue5] < costs[queue6]) {
        if(costs[queue5] < replaceCost) {
            queue2 = queue5;
                if(costs[queue11] < costs[queue12]) {
        if(costs[queue11] < replaceCost) {
            queue5 = queue11;
                if(costs[queue23] < costs[queue24]) {
        if(costs[queue23] < replaceCost) {
            queue11 = queue23;
                if(costs[queue47] < costs[queue48]) {
        if(costs[queue47] < replaceCost) {
            queue23 = queue47;
            queue47 = replace;
        } else {
            queue23 = replace;
        }
    } else {
        if(costs[queue48] < replaceCost) {
            queue23 = queue48;
            queue48 = replace;
        } else {
            queue23 = replace;
        }
    }
    
        } else {
            queue11 = replace;
        }
    } else {
        if(costs[queue24] < replaceCost) {
            queue11 = queue24;
                if(costs[queue49] < costs[queue50]) {
        if(costs[queue49] < replaceCost) {
            queue24 = queue49;
            queue49 = replace;
        } else {
            queue24 = replace;
        }
    } else {
        if(costs[queue50] < replaceCost) {
            queue24 = queue50;
            queue50 = replace;
        } else {
            queue24 = replace;
        }
    }
    
        } else {
            queue11 = replace;
        }
    }
    
        } else {
            queue5 = replace;
        }
    } else {
        if(costs[queue12] < replaceCost) {
            queue5 = queue12;
                if(costs[queue25] < costs[queue26]) {
        if(costs[queue25] < replaceCost) {
            queue12 = queue25;
                if(costs[queue51] < costs[queue52]) {
        if(costs[queue51] < replaceCost) {
            queue25 = queue51;
            queue51 = replace;
        } else {
            queue25 = replace;
        }
    } else {
        if(costs[queue52] < replaceCost) {
            queue25 = queue52;
            queue52 = replace;
        } else {
            queue25 = replace;
        }
    }
    
        } else {
            queue12 = replace;
        }
    } else {
        if(costs[queue26] < replaceCost) {
            queue12 = queue26;
                if(costs[queue53] < costs[queue54]) {
        if(costs[queue53] < replaceCost) {
            queue26 = queue53;
            queue53 = replace;
        } else {
            queue26 = replace;
        }
    } else {
        if(costs[queue54] < replaceCost) {
            queue26 = queue54;
            queue54 = replace;
        } else {
            queue26 = replace;
        }
    }
    
        } else {
            queue12 = replace;
        }
    }
    
        } else {
            queue5 = replace;
        }
    }
    
        } else {
            queue2 = replace;
        }
    } else {
        if(costs[queue6] < replaceCost) {
            queue2 = queue6;
                if(costs[queue13] < costs[queue14]) {
        if(costs[queue13] < replaceCost) {
            queue6 = queue13;
                if(costs[queue27] < costs[queue28]) {
        if(costs[queue27] < replaceCost) {
            queue13 = queue27;
                if(costs[queue55] < costs[queue56]) {
        if(costs[queue55] < replaceCost) {
            queue27 = queue55;
            queue55 = replace;
        } else {
            queue27 = replace;
        }
    } else {
        if(costs[queue56] < replaceCost) {
            queue27 = queue56;
            queue56 = replace;
        } else {
            queue27 = replace;
        }
    }
    
        } else {
            queue13 = replace;
        }
    } else {
        if(costs[queue28] < replaceCost) {
            queue13 = queue28;
                if(costs[queue57] < costs[queue58]) {
        if(costs[queue57] < replaceCost) {
            queue28 = queue57;
            queue57 = replace;
        } else {
            queue28 = replace;
        }
    } else {
        if(costs[queue58] < replaceCost) {
            queue28 = queue58;
            queue58 = replace;
        } else {
            queue28 = replace;
        }
    }
    
        } else {
            queue13 = replace;
        }
    }
    
        } else {
            queue6 = replace;
        }
    } else {
        if(costs[queue14] < replaceCost) {
            queue6 = queue14;
                if(costs[queue29] < costs[queue30]) {
        if(costs[queue29] < replaceCost) {
            queue14 = queue29;
                if(costs[queue59] < costs[queue60]) {
        if(costs[queue59] < replaceCost) {
            queue29 = queue59;
            queue59 = replace;
        } else {
            queue29 = replace;
        }
    } else {
        if(costs[queue60] < replaceCost) {
            queue29 = queue60;
            queue60 = replace;
        } else {
            queue29 = replace;
        }
    }
    
        } else {
            queue14 = replace;
        }
    } else {
        if(costs[queue30] < replaceCost) {
            queue14 = queue30;
                if(costs[queue61] < costs[queue62]) {
        if(costs[queue61] < replaceCost) {
            queue30 = queue61;
            queue61 = replace;
        } else {
            queue30 = replace;
        }
    } else {
        if(costs[queue62] < replaceCost) {
            queue30 = queue62;
            queue62 = replace;
        } else {
            queue30 = replace;
        }
    }
    
        } else {
            queue14 = replace;
        }
    }
    
        } else {
            queue6 = replace;
        }
    }
    
        } else {
            queue2 = replace;
        }
    }
    
        } else {
            queue0 = replace;
        }
    }
    return index;
}public static int[] decode(int encoded) { switch(encoded) {case 0: return new int[] { -4, -2 };case 1: return new int[] { -4, -1 };case 2: return new int[] { -4, 0 };case 3: return new int[] { -4, 1 };case 4: return new int[] { -4, 2 };case 5: return new int[] { -3, -3 };case 6: return new int[] { -3, -2 };case 7: return new int[] { -3, -1 };case 8: return new int[] { -3, 0 };case 9: return new int[] { -3, 1 };case 10: return new int[] { -3, 2 };case 11: return new int[] { -3, 3 };case 12: return new int[] { -2, -4 };case 13: return new int[] { -2, -3 };case 14: return new int[] { -2, -2 };case 15: return new int[] { -2, -1 };case 16: return new int[] { -2, 0 };case 17: return new int[] { -2, 1 };case 18: return new int[] { -2, 2 };case 19: return new int[] { -2, 3 };case 20: return new int[] { -2, 4 };case 21: return new int[] { -1, -4 };case 22: return new int[] { -1, -3 };case 23: return new int[] { -1, -2 };case 24: return new int[] { -1, -1 };case 25: return new int[] { -1, 0 };case 26: return new int[] { -1, 1 };case 27: return new int[] { -1, 2 };case 28: return new int[] { -1, 3 };case 29: return new int[] { -1, 4 };case 30: return new int[] { 0, -4 };case 31: return new int[] { 0, -3 };case 32: return new int[] { 0, -2 };case 33: return new int[] { 0, -1 };case 34: return new int[] { 0, 0 };case 35: return new int[] { 0, 1 };case 36: return new int[] { 0, 2 };case 37: return new int[] { 0, 3 };case 38: return new int[] { 0, 4 };case 39: return new int[] { 1, -4 };case 40: return new int[] { 1, -3 };case 41: return new int[] { 1, -2 };case 42: return new int[] { 1, -1 };case 43: return new int[] { 1, 0 };case 44: return new int[] { 1, 1 };case 45: return new int[] { 1, 2 };case 46: return new int[] { 1, 3 };case 47: return new int[] { 1, 4 };case 48: return new int[] { 2, -4 };case 49: return new int[] { 2, -3 };case 50: return new int[] { 2, -2 };case 51: return new int[] { 2, -1 };case 52: return new int[] { 2, 0 };case 53: return new int[] { 2, 1 };case 54: return new int[] { 2, 2 };case 55: return new int[] { 2, 3 };case 56: return new int[] { 2, 4 };case 57: return new int[] { 3, -3 };case 58: return new int[] { 3, -2 };case 59: return new int[] { 3, -1 };case 60: return new int[] { 3, 0 };case 61: return new int[] { 3, 1 };case 62: return new int[] { 3, 2 };case 63: return new int[] { 3, 3 };case 64: return new int[] { 4, -2 };case 65: return new int[] { 4, -1 };case 66: return new int[] { 4, 0 };case 67: return new int[] { 4, 1 };case 68: return new int[] { 4, 2 };
default: return new int[] { 0, 0 };}}public static void debugPoint(int enc, RobotController rc) {
        int[] diff = decode(enc);
        rc.setIndicatorDot(rc.getLocation().translate(diff[0], diff[1]), color, color, color);
        color += 5;
    }}
