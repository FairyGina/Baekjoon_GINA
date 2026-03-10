from collections import deque

import sys
def input(): return sys.stdin.readline().rstrip()

mv=[(-1,0),(1,0),(0,-1),(0,1)]

n=int(input())
board=[list(map(int,input().split())) for _ in range(n)]

maxct=0
dq=deque()
for hei in range(101):
    bor=[[0]*n for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if board[i][j]<hei:
                bor[i][j]=1
    
    dq.clear()
    ct=0
    for i in range(n):
        for j in range(n):
            if not bor[i][j]:
                ct+=1
                bor[i][j]=1
                dq.append((i,j))
                while dq:
                    y,x=dq.popleft()
                    for my,mx in mv:
                        ty,tx=y+my,x+mx
                        if 0<=ty<n and 0<=tx<n and not bor[ty][tx]:
                            bor[ty][tx]=1
                            dq.append((ty,tx))

    maxct=max(maxct,ct)

print(maxct)