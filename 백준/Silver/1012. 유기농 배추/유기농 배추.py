import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
my,mx=(-1,1,0,0),(0,0,-1,1)
dq=deque()
op=[]
for __ in range(int(input())):
    m,n,k=map(int,input().split())
    nc=list([False]*m for _ in range(n))
    for i in range(k):
        x,y=map(int,input().split())
        nc[y][x]=True
    ct=0
    for r in range(n):
        for c in range(m):
            if nc[r][c]:
                ct+=1
                dq.clear()
                dq.append((r,c))
                while dq:
                    y,x=dq.popleft()
                    for i in range(4):
                        ty,tx=y+my[i],x+mx[i]
                        if 0<=ty<n and 0<=tx<m and nc[ty][tx]:
                            nc[ty][tx]=False
                            dq.append((ty,tx))
    op.append(str(ct))
print('\n'.join(op))