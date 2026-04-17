from collections import deque
import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
graph=list([] for _ in range(n+1))

for _ in range(n-1):
    a,b=map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)


dq=deque()
dq.append(1)

op=[0]*(n+1)
op[1]=1
while dq:
    x=dq.popleft()
    for i in graph[x]:
        if not op[i]:
            op[i]=x
            dq.append(i)

print('\n'.join(map(str,op[2:])))