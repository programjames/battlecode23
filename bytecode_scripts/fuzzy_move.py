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
		switch(fuzziness) {"""
    ]
    for x in range(5):
        parts.append(f"case {x}:")
        if x == 4:
            parts.append("default:")
        parts.append("""if (rc.canMove(direction)) {
			return direction;
		}""")
        if x == 0:
            parts.append("return Direction.CENTER;")
        if x > 0:
            for i in range(x):
                parts.append("dirRight = dirRight.rotateRight();")
                if i == 1:
                    parts.append("""if (rc.canMove(dirRight)) {
                        if (dirRight == lastMoveDirection.opposite()) {
                            return dirLeft.rotateLeft();
                        }
                        return dirRight;
                    }""")
                else:
                    parts.append("""if (rc.canMove(dirRight)) {
                        return dirRight;
                    }""")
                if i < 4:
                    parts.append("dirLeft = dirLeft.rotateLeft();")
                    
                    if i == 1:
                        parts.append("""if (rc.canMove(dirLeft)) {
                            if (dirLeft == lastMoveDirection.opposite()) {
                                return dirRight;
                            }
                            return dirLeft;
                        }""")
                    else:
                        parts.append("""if (rc.canMove(dirLeft)) {
                            return dirLeft;
                        }""")
            parts.append("return Direction.CENTER;")
    parts.append("}")
    parts.append("}")
    return "\n".join(parts)

print(make_fuzzy())