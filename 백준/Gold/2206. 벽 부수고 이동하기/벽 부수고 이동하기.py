import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

def bfs():
    mv=((-1,0),(1,0),(0,-1),(0,1))

    n,m=map(int,input().split())
    if n==1 and m==1: return 1
    
    board=list(input() for _ in range(n))
    vt1,vt2=list([True]*m for _ in range(n)),list([True]*m for _ in range(n))

    dq1,dq2,tq1,tq2=deque(),deque(),deque(),deque()
    dq1.append((0,0))
    vt1[0][0]=False

    ct=0
    n-=1
    m-=1
    while dq1 or dq2:
        ct+=1
        tq1.clear()
        tq2.clear()
        while dq1:
            y,x=dq1.popleft()
            for i in range(4):
                ty,tx=y+mv[i][0],x+mv[i][1]
                if 0<=ty<=n and 0<=tx<=m and vt1[ty][tx]:
                    if ty==n and tx==m: return ct+1
                    vt1[ty][tx]=False
                    if board[ty][tx]=='0':
                        tq1.append((ty,tx))
                    elif vt2[ty][tx]:
                        vt2[ty][tx]=False
                        tq2.append((ty,tx))
        while dq2:
            y,x=dq2.popleft()
            for i in range(4):
                ty,tx=y+mv[i][0],x+mv[i][1]
                if 0<=ty<=n and 0<=tx<=m and vt2[ty][tx] and board[ty][tx]=='0':
                    if ty==n and tx==m: return ct+1
                    vt2[ty][tx]=False
                    tq2.append((ty,tx))
        
        dq1=deque(tq1)
        dq2=deque(tq2)
    return -1
print(bfs())