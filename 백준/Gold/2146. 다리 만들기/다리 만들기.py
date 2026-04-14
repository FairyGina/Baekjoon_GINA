from collections import deque
import sys
def input(): return sys.stdin.readline().rstrip()

mv=[(-1,0),(1,0),(0,-1),(0,1)]

def bfs():
    tid=cct-2
    while dq:
        y,x=dq.pop()
        for my,mx in mv:
            ty,tx=y+my,x+mx
            if 0<=ty<n and 0<=tx<n:
                if board[ty][tx]==1:
                    board[ty][tx]=cct
                    dq.append((ty,tx))
                elif board[ty][tx]==0:
                    arr[tid].add((ty,tx))

def bfs2(cnb):
    sdq=deque()
    while dq:
        y,x=dq.popleft()
        ct=board[y][x]
        for my,mx in mv:
            ty,tx=y+my,x+mx
            if 0<=ty<n and 0<=tx<n:
                if board[ty][tx]==0:
                    board[ty][tx]=ct-1
                    dq.append((ty,tx))
                    sdq.append((ty,tx))
                elif board[ty][tx]>0 and board[ty][tx]!=cnb:
                    while sdq:
                        y,x=sdq.pop()
                        board[y][x]=0
                    return -ct
    while sdq:
        y,x=sdq.pop()
        board[y][x]=0
    return -1

n=int(input())
board=[list(map(int,input().split())) for _ in range(n)]
dq=deque()
arr=[]

cct=1
for i in range(n):
    for j in range(n):
        if board[i][j]==1:
            cct+=1
            board[i][j]=cct
            
            arr.append(set())
            dq.clear()
            dq.append((i,j))
            bfs()

minct=10**8
for i,tc in enumerate(arr,start=2):
    dq.clear()
    for c in tc:
        y,x=c[0],c[1]
        board[y][x]=-1
        dq.append((y,x))
    
    tb=bfs2(i)
    minct=min(minct,tb)
    for c in tc:
        y,x=c[0],c[1]
        board[y][x]=0
        
print(minct)