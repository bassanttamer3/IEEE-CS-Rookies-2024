def main():
    n = int(input().strip())
    s = input().strip()

    i = 0
    while i < n:
        if s[i] != '.':
            if s[i] == 'R':
                while i < n and s[i] == 'R':
                    i += 1
                print(i, i + 1)
            else:
                print(i + 1, i)
            break
        i += 1

if __name__ == "__main__":
    main()
