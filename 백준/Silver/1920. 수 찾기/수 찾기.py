import sys

A = {}
B = []
N = sys.stdin.readline().split()
n = sys.stdin.readline().split()

for num in n:
    A[num] = num

M = sys.stdin.readline().split()
m = sys.stdin.readline().split()

for num in m:
    if num in A:
        print(1)
    else:
        print(0)