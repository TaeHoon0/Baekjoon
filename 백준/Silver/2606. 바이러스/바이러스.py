import sys

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())
linked = [[] for _ in range(n+1)]
virus = []

for i in range(m):
    com1, com2 = map(int, sys.stdin.readline().split())
    # 양방향 연결
    linked[com1].append(com2)
    linked[com2].append(com1)

def detect(com):
    virus.append(com)

    for adj in linked[com]:  # 연결된 컴퓨터
        if adj not in virus:  # 바이러스에 감염되었는가
            detect(adj)

    return len(virus) - 1

print(detect(1))
