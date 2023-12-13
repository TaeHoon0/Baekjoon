import sys

def solution(strs):
    stack = []

    for ps in strs:
        if ps == '(':        # 여는 괄호일 때
            stack.append(str)
        else:
            if not stack:
                return 'NO'
            elif stack:
                stack.pop()

    if stack:
        return 'NO'
    else:
        return 'YES'

N = int(sys.stdin.readline())

for i in range(N):
    strs = sys.stdin.readline().strip()
    print(solution(strs))