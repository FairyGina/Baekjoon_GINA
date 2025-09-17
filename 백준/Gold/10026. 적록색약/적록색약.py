import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
mv=((-1,0),(1,0),(0,-1),(0,1))
n=int(input())
color=list(input() for _ in range(n))
vt=list([True]*n for _ in range(n))
dq=deque()
ct1,ct2=0,0
for r in range(n):
    for c in range(n):
        if vt[r][c]:
            ct1+=1
            dq.clear()
            p=color[r][c]
            dq.append((r,c))
            while dq:
                y,x=dq.popleft()
                for i in range(4):
                    ty,tx=y+mv[i][0],x+mv[i][1]
                    if 0<=ty<n and 0<=tx<n and vt[ty][tx] and color[ty][tx]==p:
                        vt[ty][tx]=False
                        dq.append((ty,tx))
vt=list([True]*n for _ in range(n))
for r in range(n):
    for c in range(n):
        if vt[r][c]:
            ct2+=1
            dq.clear()
            if color[r][c]=='R' or color[r][c]=='G': p=('R','G')
            else: p=[color[r][c]]
            dq.append((r,c))
            while dq:
                y,x=dq.popleft()
                for i in range(4):
                    ty,tx=y+mv[i][0],x+mv[i][1]
                    if 0<=ty<n and 0<=tx<n and vt[ty][tx] and color[ty][tx] in p:
                        vt[ty][tx]=False
                        dq.append((ty,tx))
print(ct1,ct2)