import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
my,mx=(-1,1,0,0),(0,0,-1,1)
def bfs():
    dq=deque([(a,b)])
    dt=0
    vt[a][b]=0
    while dq:
        y,x=dq.popleft()
        dt=vt[y][x]+1
        if y==c and x==d: return dt-1
        for i in range(4):
            for j in range(1,k+1):
                ty=y+j*my[i]
                tx=x+j*mx[i]
                if ty<0 or ty>=n or tx<0 or tx>=m or board[ty][tx]=='#':
                    break
                elif vt[ty][tx]>-1:
                    if vt[ty][tx]<dt: break
                    continue
                vt[ty][tx]=dt
                dq.append((ty,tx))
    return -1
n,m,k=map(int,input().split())
board=list(input() for _ in range(n))
vt=list([-1]*m for _ in range(n))
a,b,c,d=map(lambda x:int(x)-1,input().split())
print(bfs())