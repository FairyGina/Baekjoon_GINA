import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
move=((-1,0),(1,0),(0,-1),(0,1))
n,m,k=map(int,input().split())
board=list([True]*m for _ in range(n))
for _ in range(k):
    x1,y1,x2,y2=map(int,input().split())
    for r in range(y1,y2):
        for c in range(x1,x2):
            board[r][c]=False
op=[]
count=0
dq,tq=deque(),deque()
for r in range(n):
    for c in range(m):
        if board[r][c]:
            count+=1
            ct=1
            dq.clear()
            dq.append((r,c))
            board[r][c]=False
            while dq:
                while dq:
                    y,x=dq.pop()
                    for i in range(4):
                        ty,tx=y+move[i][0],x+move[i][1]
                        if 0<=ty<n and 0<=tx<m and board[ty][tx]:
                            ct+=1
                            board[ty][tx]=False
                            dq.append((ty,tx))
            op.append(ct)
print(count)
op.sort()
print(' '.join(map(str,op)))