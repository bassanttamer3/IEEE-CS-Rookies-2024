x = int(input())
bacteria_count = 0

while x > 0:
    if x % 2 == 1:
        bacteria_count += 1
    x //= 2

print(bacteria_count)
