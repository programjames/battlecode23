package fourthbot.coordination;

public enum Mode {
	/*
	 * This enum lists a lot of modes a robot could have. A mode encompasses several turns, but isn't as long lasting
	 * as a job. For example, Carrier's job could be to gather resources, and could switch between the modes of mining
	 * and returning materials to the headquarters.
	 */

	// Carrier specific modes
	FIND_RESOURCES, GOTO_RESOURCES, GOTO_HQ, GIVE_HQ_RESOURCES, DRAW_RESOURCES_FROM_WELL, IN_DANGER, GIVE_WELL_RESOURCES,

	// Attacking modes
	FIND_ENEMY, ATTACK, RETREAT, STAY_STILL, HEAL;
}
