import sys

while True:
    n, m, k = map(int, sys.stdin.readline().split()) # n명, k번 반복, m번째 제외
    cnt = 0
    if n == 0 and m == 0 and k == 0:
        break

    caller = [i+1 for i in range(n)]

    for i in range(k):
        cnt = (cnt + m - 1) % len(caller)
        if i == k-1:
            print(caller.pop(cnt))
            break
        caller.pop(cnt)
