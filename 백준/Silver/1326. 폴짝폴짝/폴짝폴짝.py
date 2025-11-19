import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

n=int(input())
nb=list(map(int,input().split()))
a,b=map(lambda x: int(x)-1,input().split())

vt=[-1]*n
dq=deque()

dq.append((a,nb[a]))
vt[a]=0
while dq:
    idx,x=dq.popleft()
    if idx==b: break
    start=idx%x
    for i in range(start,n,x):
        if vt[i]<0:
            vt[i]=vt[idx]+1
            dq.append((i,nb[i]))

print(vt[b])