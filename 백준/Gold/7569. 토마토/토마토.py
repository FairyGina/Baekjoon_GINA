import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
mz,my,mx=(-1,1,0,0,0,0),(0,0,-1,1,0,0),(0,0,0,0,-1,1)
m,n,h=map(int,input().split())
tomato=[[list(map(int,input().split())) for _ in range(n)] for __ in range(h)]
lm,ct=0,0
dq,tq=deque(),deque()
for d in range(h):
    for r in range(n):
        for c in range(m):
            if tomato[d][r][c]==0: lm+=1
            elif tomato[d][r][c]==1: dq.append((d,r,c))
while dq:
    tq.clear()
    ct+=1    
    while dq:
        z,y,x=dq.popleft()
        for i in range(6):
            tz,ty,tx=z+mz[i],y+my[i],x+mx[i]
            if 0<=tz<h and 0<=ty<n and 0<=tx<m and tomato[tz][ty][tx]==0:
                lm-=1
                tomato[tz][ty][tx]=-1
                tq.append((tz,ty,tx))
    dq=deque(tq)
if lm>0:
    ct=0
print(ct-1)