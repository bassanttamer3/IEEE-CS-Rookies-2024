n = int(input())
ratings_before = []
ratings_after = []

for _ in range(n):
    before, after = map(int, input().split())
    ratings_before.append(before)
    ratings_after.append(after)

if any(ratings_before[i] != ratings_after[i] for i in range(n)):
    print("rated")
elif any(ratings_before[i] < ratings_before[i + 1] for i in range(n - 1)):
    print("unrated")
else:
    print("maybe")
