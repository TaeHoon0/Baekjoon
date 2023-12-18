import collections
import sys

N, M, V = map(int, sys.stdin.readline().split()) # 정점의 개수, 간선의 개수, 탐색의 시작 위치
graph = {key: [] for key in range(1, N+1)}

# 두 정점의 연결 입력, 양방향
for i in range(M):
    a, b = map(int, sys.stdin.readline().split())
    if b not in graph[a]:
        graph[a].append(b)
    if a not in graph[b]:
        graph[b].append(a)

# dfs
def DFS(start):
    stack = [start]
    visited = []

    while stack:
        now = stack.pop()
        if now not in visited:
            visited.append(now)
            temp = []
            for v in graph[now]:
                if v not in visited:
                    temp.append(v)
            temp.sort(reverse=True)
            stack += temp
    visited_str = [str(i) for i in visited]
    return ' '.join(visited_str)


def BFS(start):
    q = collections.deque([start])
    visited = [start]

    while q:
        now = q.popleft()
        temp = []
        for v in graph[now]:
            if v not in visited:
                temp.append(v)

        temp.sort()
        q += temp
        for next in temp:
            visited.append(next)

    visited_str = [str(i) for i in visited]
    return ' '.join(visited_str)

print(DFS(V))
print(BFS(V))