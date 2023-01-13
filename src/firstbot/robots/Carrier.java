package firstbot.robots;

import battlecode.common.*;
import firstbot.coordination.*;
import firstbot.navigation.*;

public class Carrier extends Unit {
	int ad; // amount of adamantium we're carrying
	int mn; // amount of mana we're carrying
	int ex; // amount of elixir we're carrying
	Anchor anchor; // the anchor we're carrying
	int totalResources; // total amount of resources we're carrying
	int totalCarryWeight; // total weight of everything we're carrying

	CarrierNavigator navigator;

	Job job;
	Mode mode;

	public Carrier(RobotController rc) {
		super(rc);
	}

	@Override
	public void setup() {
		super.setup();
		job = Job.GATHER_RESOURCES;
		mode = Mode.FIND_RESOURCES;
		navigator = new CarrierNavigator(this, rc);
	}

	@Override
	public void beginTurn() throws GameActionException {
		super.beginTurn();

		ad = rc.getResourceAmount(ResourceType.ADAMANTIUM);
		mn = rc.getResourceAmount(ResourceType.MANA);
		ex = rc.getResourceAmount(ResourceType.ELIXIR);
		anchor = rc.getAnchor();

		totalResources = ad + mn + ex;
		totalCarryWeight = totalResources + (anchor == null ? 0 : 40);

		// Determine what job we should be doing. NOTE: THIS SHOULDN'T CHANGE OFTEN.
		findBestJob();
	}

	@Override
	public void runTurn() throws GameActionException {
		/*
		 * The place where the main decisions are made
		 */

		/*
		 * GATHER RESOURCES & DEPOSIT THEM Every turn, the carrier should try to pick up
		 * and deposite resources if it can. We're going to do this before and after
		 * moving (because it might move to a spot where it can pick up resources or
		 * deposit and we can shave off an otherwise wasted turn). See end of round for
		 * same command
		 * 
		 * TODO: Take it into account that we DO NOT want to deposite resources or
		 * gather them if we're under attack
		 */
		while (depositToNearbyHQ() | pickupFromNearbyWell())
			; // single | is intentional so both are attempted

		switch (job) {
		case GATHER_RESOURCES:
			switch (mode) {
			case FIND_RESOURCES:
			case GOTO_RESOURCES:
				navigator.navigateToWell();
				break;
			case GOTO_HQ:
				navigator.navigateToHQ();
				break;
			default:
				break;
			}
			break;
		default:
			break;
		}

		while (depositToNearbyHQ() | pickupFromNearbyWell())
			; // single | is intentional so both are attempted
	}

	private boolean pickupFromNearbyWell() throws GameActionException {
		/*
		 * If possible, pick up resources from a nearby well
		 * 
		 * Return true if we pick up resources and false otherwise.
		 */
		if (!rc.isActionReady())
			return false; // can't take actions

		if (totalCarryWeight >= 40)
			return false; // already full

		WellInfo[] nearbyWells = rc.senseNearbyWells(pos, 2); // get adjacent wells
		if (nearbyWells.length == 0)
			return false; // there are no wells

		/*
		 * Determine the best well to extract from. The ranking right now is the
		 * following: 1. Upgraded adamantium or mana well 2. Elixir well 3. Normal
		 * adamantium or mana well
		 */

		WellInfo bestWell = nearbyWells[0];
		for (WellInfo well : nearbyWells) {
			if (well.isUpgraded()) {
				bestWell = well;
				break;
			}
			if (well.getResourceType() == ResourceType.ELIXIR) {
				bestWell = well;
			}
		}

		// Pick up as much as we can
		int amountToCollect = Math.min(40 - totalCarryWeight, bestWell.getRate());
		MapLocation wellLocation = bestWell.getMapLocation();

		rc.collectResource(wellLocation, amountToCollect);
		return true;
	}

	private boolean depositToNearbyHQ() throws GameActionException {
		/*
		 * If possible, deposit resources to a nearby headquarters
		 */
		if (!rc.isActionReady())
			return false; // can't take actions
		if (totalResources <= 0)
			return false; // No resources to deposit

		/*
		 * Determine the best HQ to deposit to. Right now it's basically random.
		 */
		RobotInfo[] nearbyRobots = rc.senseNearbyRobots(pos, 2, myTeam);
		RobotInfo bestHQ = null;
		for (RobotInfo robot : nearbyRobots) {
			if (robot.type != RobotType.HEADQUARTERS)
				continue;
			if (bestHQ == null) {
				bestHQ = robot;
				continue;
			}
			if (rng.nextBoolean()) {
				bestHQ = robot;
				continue;
			}
		}

		if (bestHQ == null)
			return false; // No nearby HQs

		/*
		 * Choose which resource to deposit. Right now this is whichever resource we
		 * have the most of.
		 */
		ResourceType bestType = (ad > mn ? (ad > ex ? ResourceType.ADAMANTIUM : ResourceType.ELIXIR)
				: (mn > ex ? ResourceType.MANA : ResourceType.ELIXIR));

		MapLocation hqLocation = bestHQ.location;
		switch (bestType) {
		case ADAMANTIUM:
			rc.transferResource(hqLocation, bestType, ad);
			return true;
		case ELIXIR:
			rc.transferResource(hqLocation, bestType, ex);
			return true;
		case MANA:
			rc.transferResource(hqLocation, bestType, mn);
			return true;
		default:
			return false;
		}
	}

	private void findBestJob() {
		/*
		 * Determine what job we should be doing. Jobs can be things like scouting,
		 * gathering resources, transferring resources to the headquarters, etc.
		 * 
		 * THIS SHOULD NOT CHANGE OFTEN. Think of jobs as high level things that take
		 * >20 rounds to complete. It should be something like scouting out the enemy,
		 * or gathering resources, etc. Jobs should not be something like "run away" or
		 * "path to this location". Those are too low level and temporary. I think I'm
		 * going to use the term *mode* to describe those kinds of things. Jobs should
		 * also be relatively unit specific. You don't ask a Carrier to "support troops"
		 * or a Booster to "deploy an anchor".
		 */

		switch (job) {
		case GATHER_RESOURCES:
		default:
			if (totalCarryWeight >= 40) {
				// We can't carry any more, so return to the HQ
				mode = Mode.GOTO_HQ;
				break;
			}
			if (totalCarryWeight <= 0) {
				// We've transferred everything we have, so go out and
				// gather more resources!
				if (navigator != null && navigator.myWellLocation != null) {
					mode = Mode.GOTO_RESOURCES;
				} else {
					mode = Mode.FIND_RESOURCES;
				}
			}
			break;
		}
	}
}
