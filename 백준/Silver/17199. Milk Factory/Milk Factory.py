import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

def main():
    n=int(input())
    nb=list(set() for _ in range(n+1))
    for _ in range(n-1):
        a,b=map(int,input().split())
        nb[b].add(a)

    for i in range(1,n+1):
        vt=[1]*(n+1)
        dq=[]
        dq.append(i)
        vt[i]=0
        while dq:
            x=dq.pop()
            for v in nb[x]:
                if vt[v]:
                    vt[v]=0
                    dq.append(v)
        if sum(vt)==1:
            return i
    return -1
print(main())