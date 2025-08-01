import sys
from collections import deque

def input(): return sys.stdin.readline().rstrip()
op=[]

q=deque()
n,k,p=map(int,input().split(" "))
for i in range(1,k+1):
    q.append(i)

ct=0
while q:
    ct+=1
    t=q.popleft()
    if ct%n==0:
        ct=0
        op.append(t)
        if not q: break
    for i in range(p):
        t=q.popleft()
        q.append(t)
op.sort()
print('\n'.join(map(str,op)))