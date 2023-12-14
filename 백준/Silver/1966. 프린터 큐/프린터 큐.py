import sys
from collections import deque

T = int(sys.stdin.readline())

for case in range(T):
    N, M = map(int, sys.stdin.readline().split())
    dq = deque(list(map(int, sys.stdin.readline().split())))
    cnt = 0
    while dq:
        fst = max(dq)           # 현재 큐 안의 우선순위 1위
        front = dq.popleft()
        M -= 1                  # popleft()를 통해 위치가 왼쪽으로 한 칸씩 이동

        if fst == front:        # 뽑은 숫자가 제일 큰 경우
            cnt += 1            # 큐에서 나가기 때문에 + 1
            if M < 0:           # M = 0 이면 내가 정한 숫자
                print(cnt)
                break
        else:                   # 제일 큰 숫자가 아니라면
            dq.append(front)    # 제일 뒤로
            if M < 0:            # 가장 큰 숫자가 아닌데 앞에서 뽑힐 경우
                M = len(dq) - 1 # 가장 뒤로 위치를 옮김