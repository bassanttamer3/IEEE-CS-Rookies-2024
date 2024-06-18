n, k = map(int, input().split())
count = 0
for _ in range(n):
    number = input()
    is_k_good = True
    for i in range(k + 1):
        if str(i) not in number:
            is_k_good = False
            break
    if is_k_good:
        count += 1

print(count)
