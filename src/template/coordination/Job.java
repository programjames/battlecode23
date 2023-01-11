package template.coordination;

public enum Job {
	/*
	 * This enum lists a lot of jobs a robot could have. Feel free to make any jobs
	 * you want--even very niche ones.
	 */

	// General purpose jobs
	SCOUT_ENEMY, ATTACK_ENEMY, DEFEND_HEADQUARTERS,

	// Carrier specific jobs
	GATHER_RESOURCES, TRANSFER_RESOURCES_TO_HQ, DEPLOY_ANCHOR;
}