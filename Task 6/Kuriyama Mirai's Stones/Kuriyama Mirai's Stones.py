n = int(input())
stones = list(map(int, input().split()))


stones_sorted = sorted(stones)
prefix_sum_original = [0] * (n + 1)
prefix_sum_sorted = [0] * (n + 1)

for i in range(n):
    prefix_sum_original[i + 1] = prefix_sum_original[i] + stones[i]
    prefix_sum_sorted[i + 1] = prefix_sum_sorted[i] + stones_sorted[i]

m = int(input())


for _ in range(m):
    query = list(map(int, input().split()))
    type_, l, r = query

    if type_ == 1:
        print(prefix_sum_original[r] - prefix_sum_original[l - 1])
    else:
        print(prefix_sum_sorted[r] - prefix_sum_sorted[l - 1])
