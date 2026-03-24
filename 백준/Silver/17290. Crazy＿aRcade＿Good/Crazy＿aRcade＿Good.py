from collections import deque

import sys
def input(): return sys.stdin.readline().rstrip()

py,px=map(int,input().split())
py,px=py-1,px-1

board=[list(input()) for _ in range(10)]

dq=deque()
for i in range(10):
    for j in range(10):
        if board[i][j]=='o':
            dq.append((i,j))

while dq:
    y,x=dq.pop()
    for i in range(10):
        board[y][i]='o'
        board[i][x]='o'

minct=10**9
for i in range(10):
    for j in range(10):
        if board[i][j]=='x':
            minct=min(minct,abs(i-py)+abs(j-px))

print(minct)