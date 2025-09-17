import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
n=int(input())
k=int(input())

cp=list([] for _ in range(n+1))
vt=[True]*(n+1)

for _ in range(k):
    a,b=map(int,input().split())
    cp[a].append(b)
    cp[b].append(a)
dq=deque()
dq.append([1])
ct=0
while dq:
    for i in dq.popleft():
        if vt[i]:
            vt[i]=False
            ct+=1
            dq.append(cp[i])
print(ct-1)