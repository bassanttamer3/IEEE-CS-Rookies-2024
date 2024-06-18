
s = input()
time = int(s, 2)
missed_trains = 0
next_train = 1
while next_train< time:
    next_train *= 4
    missed_trains += 1
print(missed_trains)
