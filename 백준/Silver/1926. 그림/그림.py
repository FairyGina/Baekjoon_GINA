import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
my,mx=(-1,1,0,0),(0,0,-1,1)
n,m=map(int,input().split())
draw=list(input().split() for _ in range(n))
vt=list([True]*m for _ in range(n))
count,et=0,0
for r in range(n):
    for c in range(m):
        if draw[r][c]=='1' and vt[r][c]:
            count+=1
            ct=0
            dq=deque()
            dq.append(r)
            dq.append(c)
            vt[r][c]=False
            while dq:
                ct+=1
                y,x=dq.popleft(),dq.popleft()
                for i in range(4):
                    ty,tx=y+my[i],x+mx[i]
                    if 0<=ty<n and 0<=tx<m and vt[ty][tx] and draw[ty][tx]=='1':
                        dq.append(ty)
                        dq.append(tx)
                        vt[ty][tx]=False
            et=max(et,ct)
print(count)
print(et)