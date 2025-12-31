import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

n=int(input())
graph=[[] for _ in range(n)]

for _ in range(n-1):
    a,b,c=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
    graph[a].append(c)
    graph[c].append(a)

dq=deque()
vt=[0]*n
vt[1]=1

dq.clear()
dq.append(1)

maxct=0
while dq:
    x=dq.pop()
    for v in graph[x]:
        if v==0:
            maxct=max(maxct,vt[x])
        elif not vt[v]:
            dq.append(v)
            vt[v]=vt[x]+1

print(maxct)