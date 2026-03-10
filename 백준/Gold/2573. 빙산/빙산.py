from collections import deque

import sys
def input(): return sys.stdin.readline().rstrip()

mv=[(-1,0),(1,0),(0,-1),(0,1)]

def bfs():
    dq=deque()
    year=0
    while True:
        year+=1
        dq.clear()
        
        for i in range(n):
            for j in range(m):
                ct=0
                if board[i][j]>0:
                    for my,mx in mv:
                        ty,tx=i+my,j+mx
                        if 0<=ty<n and 0<=tx<m and board[ty][tx]==0:
                            ct+=1
                    dq.append((i,j,ct))
        
        while dq:
            i,j,ct=dq.pop()
            board[i][j]=max(board[i][j]-ct,0)
        
        ct=0
        for i in range(n):
            for j in range(m):
                if board[i][j]>0 and not vt[i][j]:
                    ct+=1
                    vt[i][j]=1
                    dq.append((i,j))
                    save.append((i,j))
                    
                    while dq:
                        y,x=dq.pop()
                        for my,mx in mv:
                            ty,tx=y+my,x+mx
                            if 0<=ty<n and 0<=x<m and board[ty][tx]>0 and not vt[ty][tx]:
                                vt[ty][tx]=1
                                dq.append((ty,tx))
                                save.append((ty,tx))
                    
        while save:
            y,x=save.pop()
            vt[y][x]=0
        
        if ct==0: return 0
        elif ct>=2:
            return year

n,m=map(int,input().split())
board=[list(map(int,input().split())) for _ in range(n)]
vt=[[0]*m for _ in range(n)]
save=deque()

print(bfs())