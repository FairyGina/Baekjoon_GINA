import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
def bfs():
    mv=[-1,1,0]

    n,k=map(int,input().split())
    if n==k:
        print("0\n1")
        return

    lm=10**5+1
    dt,bl,ct=-1,1,0
    vt=[1]*lm
    dq,tq=deque(),[]
    dq.append(n)
    while bl:
        dt+=1
        for _ in range(len(dq)):
            x=dq.popleft()
            if x==k:
                bl=0
                ct+=1
            mv[2]=x
            for mx in mv:
                tx=x+mx
                if 0<=tx<lm and vt[tx]:
                    dq.append(tx)
                    tq.append(tx)
        while tq:
            vt[tq.pop()]=0
    print(f"{dt}\n{ct}")
bfs()