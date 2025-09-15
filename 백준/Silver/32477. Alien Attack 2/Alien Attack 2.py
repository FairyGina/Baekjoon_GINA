import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
vt=[True]*(n+1)
hm=list(set() for _ in range(n+1))
for i in range(m):
    a,b=map(int,input().split())
    hm[a].add(b)
    hm[b].add(a)
dq=deque()
mx=1
for nb in range(1,n+1):
    if vt[nb]:
        ct=0
        dq.clear()
        dq.append(hm[nb])
        while dq:
            tn=dq.popleft()
            for i in tn:
                if vt[i]:
                    vt[i]=False
                    dq.appendleft(hm[i])
                    ct+=1
        if mx<ct: mx=ct
print(mx)