import sys

N = int(sys.stdin.readline().strip())
coordinates = []

for _ in range(N):
    x, y = map(int, sys.stdin.readline().split())
    coordinates.append([x, y])

coordinates.sort()

for i in range(len(coordinates)):
    print(f"{coordinates[i][0]} {coordinates[i][1]}")