t = int(input())
count = 0

for _ in range(t):
    a, b, c = map(int, input().split())
    surecount = a + b + c

    if surecount >= 2:
        count += 1

print(count)
