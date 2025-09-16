import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
def bfs():
    my,mx=(-1,1,0,0),(0,0,-1,1)
    dq,tq=deque(),deque()
    dt=0
    dq.append((0,0))
    while dq:
        dt+=1
        tq.clear()
        while dq:
            y,x=dq.popleft()
            if y==n and x==m: return dt
            for i in range(4):
                ty,tx=y+my[i],x+mx[i]
                if 0<=ty<=n and 0<=tx<=m and vt[ty][tx] and board[ty][tx]=='1':
                    vt[ty][tx]=False
                    tq.append((ty,tx))
        dq=deque(tq)
    return 0
n,m=map(int,input().split())
board=list(input() for _ in range(n))
vt=list([True]*m for _ in range(n))
n-=1
m-=1
print(bfs())