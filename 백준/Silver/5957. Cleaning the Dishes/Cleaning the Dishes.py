import sys

N = int(sys.stdin.readline().strip())   # 설거지 개수
start = [N-i for i in range(N)]         # 세척전
wash = []                               # 설거지
dry = []                                # 건조대
while True:
    C_i, D_i = map(int, sys.stdin.readline().split())  # 세척 or 건조, 개수

    if C_i == 1:
        for i in range(D_i):
            wash.append(start.pop())
    elif C_i == 2:
        for j in range(D_i):
            dry.append(wash.pop())

    if len(dry) == N:
        dry.reverse()
        for i in range(N):
            print(dry[i])
        break

