n =int(input())
coins =list(map(int,input().split()))

coins.sort(reverse=True)
total = sum(coins)
half_total = total / 2
count = 0
sum_values = 0
for coin in coins:
    sum_values += coin
    count += 1
    if sum_values > half_total:
        break


print(count)