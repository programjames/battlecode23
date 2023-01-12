r2 = int(input("Vision radius? "))
r = 1 + int(r2**0.5)
locs = [(x, y) for x in range(-r, 1+r) for y in range(-r, 1+r) if x**2+y**2 < r2]
print(f"There are {len(locs)} locations:")
print("{", ", ".join(f"{{ {x}, {y} }}" for x, y in locs), "}")

# Switch statement for inside this vision radius

def encode(x, y):
    return 11 * y + x + 60

print("switch(encodedValue) {\n" + "\n".join(f"case {e}:" for e in sorted(encode(x, y) for x, y in locs)) + "\nreturn true;\ndefault:\nreturn false;\n}")