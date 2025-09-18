import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
def bfs(n):
    dq,tq=deque(),deque()
    dq.append([n])
    sv=0
    while dq:
        tq.clear()
        sv=(sv+1)%2
        while dq:
            n=dq.pop()
            for i in n:
                if vt[i]<0:
                    vt[i]=sv
                    tq.append(nb[i])
        dq=deque(tq)
    
def ck():
    for i in range(1,v+1):
        n=vt[i]
        for j in nb[i]:
            if vt[j]==n: return "NO"
    return "YES"

op=[]
for _ in range(int(input())):
    v,e=map(int,input().split())
    vt,nb=[-1]*(v+1),list([] for _ in range(v+1))
    for i in range(e):
        a,b=map(int,input().split())
        nb[a].append(b)
        nb[b].append(a)
    for i in range(1,v+1):
        if vt[i]<0:
            bfs(i)
    op.append(ck())
print('\n'.join(op))