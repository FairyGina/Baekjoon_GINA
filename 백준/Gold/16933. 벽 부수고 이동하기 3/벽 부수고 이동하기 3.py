import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

def bfs():
    mv=((-1,0),(1,0),(0,-1),(0,1))
    n,m,k=map(int,input().split())
    if n==1 and m==1: return 1
    miro=list(input() for _ in range(n))
    vt=list([[[0]*m for _ in range(n)] for _1 in range(k+1)] for _2 in range(2))

    rvt=list([11]*m for _ in range(n))
    day=True
    dq=deque()
    dq.append((0,0,0))
    
    vt[0][0][0][0]=1
    rvt[0][0]=0
    
    dt=1
    while dq:
        dt+=1
        day=not day
        for _ in range(len(dq)):
            y,x,d=dq.popleft()
            for my,mx in mv:
                ty,tx=y+my,x+mx
                if ty==n-1 and tx==m-1: return dt
                if 0<=ty<n and 0<=tx<m:
                    nd=d+(miro[ty][tx]=='1')
                    if nd>k: continue
                    if vt[0][nd][ty][tx]==1 or rvt[ty][tx]<nd: continue
                    if miro[ty][tx]=='1' and day and vt[1][nd][ty][tx]==0:
                        dq.append((y,x,nd-1))
                        continue
                    vt[0][nd][ty][tx]=1
                    dq.append((ty,tx,nd))
                    rvt[ty][tx]=nd
                        
    return -1

print(bfs())