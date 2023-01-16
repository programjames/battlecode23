def count_up_friendlies():
    parts = [
        """nearbyCarriers = 0;
		allyStrength = 0;"""
    ]
    parts.append("""switch(closeFriends.length) {
			default:""")
    for i in range(1, 111)[::-1]:
        parts.append(f"""
        case {i}:
        r = closeFriends[{i - 1}];
        switch (r.type) {{
            case BOOSTER:
                allyStrength += 5;
                break;
            case CARRIER:
                nearbyCarriers++;
                if (r.getResourceAmount(ResourceType.ADAMANTIUM) + r.getResourceAmount(ResourceType.MANA) >= 20) {{
                    allyStrength += 2;
                }}
                break;
            case DESTABILIZER:
                allyStrength += 8;
                break;
            case LAUNCHER:
                allyStrength += 7;
                break;
            default:
                break;
        }}
        """.replace("\n", "").replace("\t", "").replace("  ", " ").replace("  ", " ").replace("  ", " ").replace("  ", " "))
    parts.append("case 0: break;")
    parts.append("}")
    return "\n".join(parts)

def count_up_enemies():
    parts = ["threatLevel = 0;"]
    parts.append("""switch(enemies.length) {
			default:""")
    for i in range(1, 111)[::-1]:
        parts.append(f"""
        case {i}:
        r = enemies[{i - 1}];
        if (threatLevel >= 20) {{
            break;
        }}
        switch (r.type) {{
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
        }}
        """.replace("\n", "").replace("\t", "").replace("  ", " ").replace("  ", " ").replace("  ", " ").replace("  ", " "))
    parts.append("case 0: break;")
    parts.append("}")
    return "\n".join(parts)

def count_up_nearby_strengths():
    parts = [
        """private void countUpNearbyStrengths() {
		/*
		 * This is a helper function for beginTurn(). It unrolls a few loops that are used
		 * to count up things like the number of nearby carriers, the strength of nearby allies,
		 * and the threat level of enemies.
		 */"""
    ]
    parts.append("RobotInfo r;")
    parts.append(count_up_friendlies())
    parts.append(count_up_enemies())
    parts.append("}")
    return "\n".join(parts)

print(count_up_nearby_strengths())