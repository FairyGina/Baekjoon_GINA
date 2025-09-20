import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
def bfs():
    mv=[-1,1,0]

    n,k=map(int,input().split())
    if n==k:
        print(f"0\n{n}")
        return

    lm=max(n,k)+2
    
    op=[]
    dt=-1
    vt=[-1]*lm
    
    dq=deque()
    dq.append(n)
    while dq:
        dt+=1
        for _ in range(len(dq)):
            x=dq.popleft()
            if x==k:
                print(dt)
                idx=x
                while idx!=n:
                    op.append(str(idx))
                    idx=vt[idx]
                op.append(str(n))
                print(' '.join(op[::-1]))
                return
            mv[2]=x
            for mx in mv:
                tx=x+mx
                if 0<=tx<lm and vt[tx]<0:
                    dq.append(tx)
                    vt[tx]=x
bfs()