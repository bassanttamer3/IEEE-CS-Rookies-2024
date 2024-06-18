n, m = map(int, input().split())


count_n = [0] * 5
for i in range(1, n + 1):
    count_n[i % 5] += 1


count_m = [0] * 5
for i in range(1, m + 1):
    count_m[i % 5] += 1


result = (
    count_n[0] * count_m[0] +
    count_n[1] * count_m[4] +
    count_n[2] * count_m[3] +
    count_n[3] * count_m[2] +
    count_n[4] * count_m[1]
)

print(result)
