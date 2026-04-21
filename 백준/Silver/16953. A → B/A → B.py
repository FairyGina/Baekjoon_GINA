from collections import deque

import sys
def input(): return sys.stdin.readline().rstrip()

def bfs():
    dq=deque()
    dq.append((n,1))

    lm=10**9+1
    while dq:
        x,ct=dq.popleft()
        if x>lm: continue
        
        if x==m:
            return ct
        
        dq.append((x*2,ct+1))
        dq.append((x*10+1,ct+1))

    return -1

n,m=map(int,input().split())
print(bfs())