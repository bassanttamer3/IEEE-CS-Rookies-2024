n = int(input())
string = input()
A = 0
D = 0

for char in string:
    if char == "A":
        A += 1
    elif char == "D":
        D += 1

if A > D:
    print("Anton")
elif D > A:
    print("Danik")
else:
    print("Friendship")
