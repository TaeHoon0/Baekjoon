import sys

N, M = map(int, sys.stdin.readline().split())
memo = {}

for i in range(N):
    site, pwd = sys.stdin.readline().split()
    if site not in memo:
        memo[site] = pwd

for i in range(M):
    site = sys.stdin.readline().strip()
    print(memo[site])
