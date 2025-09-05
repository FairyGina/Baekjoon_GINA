import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
dq=deque()
n,m=map(int,input().split())
nb=list(map(int,input().split()))
for b in range(1,n+1):
    dq.append(b)
ct=0
for b in nb:
    idx=dq.index(b)
    if idx<=len(dq)//2:
        ct+=idx
        for i in range(idx):
            dq.append(dq.popleft())
        dq.popleft()
    else:
        rp=len(dq)-idx
        ct+=rp
        for i in range(rp-1):
            dq.appendleft(dq.pop())
        dq.pop()
print(ct)