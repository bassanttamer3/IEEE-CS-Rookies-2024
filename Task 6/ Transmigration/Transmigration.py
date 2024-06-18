import sys

input = sys.stdin.read


def main():
    data = input().splitlines()
    n, m, k = map(float, data[0].split())
    n = int(n)
    m = int(m)
    k = float(k)

    mp = {}

    index = 1
    for i in range(n):
        skill, level = data[index].split()
        level = int(level)
        if level * k >= 100:
            mp[skill] = int(level * (k + 1e-9))
        index += 1

    for i in range(m):
        sk = data[index].strip()
        if sk not in mp:
            mp[sk] = 0
        index += 1

    sorted_skills = sorted(mp.items())

    print(len(sorted_skills))
    for skill, level in sorted_skills:
        print(skill, level)


if __name__ == "__main__":
    main()