import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
n,m,r=map(int,input().split())
nb=list([] for _ in range(n+1))
vt=[0]*(n+1)
for i in range(m):
    a,b=map(int,input().split())
    nb[a].append(b)
    nb[b].append(a)
for i in range(n+1): nb[i].sort(reverse=True)
dq=deque()
dq.append([r])
ct=0
while dq:
    for i in dq.popleft():
        if vt[i]<1:
            dq.append(nb[i])
            ct+=1
            vt[i]=ct
print('\n'.join(map(str,vt[1:])))