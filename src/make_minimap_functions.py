def make_set_chunk():
    parts = ["""
    switch (chunkIndex) {
    """.strip()]
    for chunk in range(144):
        parts.append("case " + str(chunk) +
            ": chunk" + str(chunk) + " = value;diff" + str(chunk // 16) + " = true;return;")
    parts.append("default: return;}")
    return "\n".join(parts)

def make_get_chunk():
    parts = ["""
    switch (chunkIndex) {
    """.strip()]
    for chunk in range(144):
        parts.append("case " + str(chunk) +
            ": return chunk" + str(chunk) + ";")
    parts.append("default: return -1;}")
    return "\n".join(parts)

def make_int_list():
    return "int " + ", ".join(f"chunk{i}" for i in range(144)) + " = 0;"
def make_diff_list():
    return "boolean " + ", ".join(f"diff{i}" for i in range(36)) + " = false;"

def make_pull():
    parts = ["int in;"]
    for index in range(36):
        a = index * 4
        b, c, d = a + 1, a + 2, a + 3
        parts.append(
        f"""
		in = rc.readSharedArray({index});
		chunk{a} = in & 0b1111;
		chunk{b} = (in >> 4) & 0b1111;
		chunk{c} = (in >> 8) & 0b1111;
		chunk{d} = (in >> 12) & 0b1111;
        """.strip()
        )
    return "\n".join(parts)

    
print(make_set_chunk())