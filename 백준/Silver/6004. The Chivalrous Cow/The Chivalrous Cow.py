from collections import deque
import sys
def input(): return sys.stdin.readline().rstrip()

def bfs():
    mv=[(-1,-2),(-2,-1),(-2,1),(-1,2),(1,-2),(2,-1),(2,1),(1,2)]
    dq=deque()
    tay,tax=-1,-1
    
    m,n=map(int,input().split())
    board=[list(input()) for _ in range(n)]
    vt=[[0]*m for _ in range(n)]
    
    for i in range(n):
        for j in range(m):
            if board[i][j]=='K':
                dq.append((i,j,0))
            elif board[i][j]=='H':
                tay,tax=i,j
    
    while dq:
        y,x,ct=dq.popleft()
        for my,mx in mv:
            ty,tx=y+my,x+mx
            if 0<=ty<n and 0<=tx<m and not vt[ty][tx]:
                if ty==tay and tx==tax:
                    return ct+1
                vt[ty][tx]=ct+1
                dq.append((ty,tx,ct+1))

print(bfs())