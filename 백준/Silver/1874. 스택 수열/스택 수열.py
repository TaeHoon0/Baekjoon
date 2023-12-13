import sys

nums = int(sys.stdin.readline())
stack = []
ans = []
cnt = 1
chk = True

for i in range(nums):
    num = int(sys.stdin.readline())

    while cnt <= num:       #입력 받은 숫자까지 스택에 push
        stack.append(cnt)
        ans.append('+')
        cnt += 1
    if stack[-1] == num:    #스택의 맨 위와 같다면 pop
        stack.pop()
        ans.append('-')
    else:                   #불가능하므로 NO
        chk = False
        break

if not chk:
    print('NO')
else:
    for a in ans:
        print(a)
