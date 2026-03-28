from collections import deque

import sys
def input(): return sys.stdin.readline().rstrip()
mv=[(-1,0),(1,0),(0,-1),(0,1)]

def bfs():
    dq.clear()
    for i in range(n):
        for j in range(n):
            if board[i][j]=='s':
                dq.append((i,j,0))
                break
    for i in range(n):
        for j in range(n):
            if board[i][j]=='d':
                tary,tarx=i,j
                break
        
    while dq:
        y,x,ct=dq.popleft()
        if tary==y and tarx==x:
            return ct
        for my,mx in mv:
            ty,tx=y+my,x+mx
            if 0<=ty<n and 0<=tx<n and board[ty][tx]!='*':
                board[ty][tx]='*'
                dq.append((ty,tx,ct+1))
    return -1

op=[]
dq=deque()
for _ in range(int(input())):
    n=int(input())
    board=[list(input()) for _ in range(n)]
    op.append(str(bfs()))

print('\n'.join(op))