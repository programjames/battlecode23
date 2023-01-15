def make_fuzzy():
    parts = [
        """public Direction getFuzzyMoveDirection(int fuzziness) {
		/*
		 * Return the direction that points closest to our destination that we can
		 * legally move to.
		 */
		Direction direction = robot.pos.directionTo(destination);
        Direction dirRight = direction;
        Direction dirLeft = direction;
        Direction moveDir = Direction.CENTER;
		switch(fuzziness) {"""
    ]
    for x in range(5):
        parts.append(f"case {x}:")
        if x == 4:
            parts.append("default:")
        parts.append("""if (rc.canMove(direction)) {
			moveDir = direction;
            break;
		}""")
        if x == 0:
            parts.append("break;")
        if x > 0:
            for i in range(x):
                parts.append("dirRight = dirRight.rotateRight();")
                parts.append("""if (rc.canMove(dirRight)) {
                    moveDir = dirRight;
                    break;
                }""")
                if i < 3:
                    parts.append("dirLeft = dirLeft.rotateLeft();")
                    parts.append("""if (rc.canMove(dirLeft)) {
                        moveDir = dirLeft;
                        break;
                    }""")
            parts.append("break;")
    parts.append("}")
    parts.append("""if (moveDir == lastMoveDirection.opposite()) {
        direction = lastMoveDirection;
        if (rc.canMove(direction)) return direction;
        if (fuzziness >= 2) {
        dirRight = direction.rotateRight();
        if (rc.canMove(dirRight)) return dirRight;
        dirLeft = direction.rotateLeft();
        if (rc.canMove(dirLeft)) return dirLeft;
        }
        return Direction.CENTER; // Moving is probably counter-productive here
        }""")
    parts.append("return moveDir;")
    parts.append("}")
    return "\n".join(parts)

print(make_fuzzy())