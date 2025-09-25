import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
def check(sr,sc,n):
    pp=board[sr][sc]
    for r in range(sr,sr+n):
        for c in range(sc,sc+n):
            if board[r][c]!=pp:
                return -1
    return pp
n=int(input())
board=[list(map(int,input().split())) for _ in range(n)]
dq=deque()
dq.append((0,0,n))
ct1,ct2=0,0
while dq:
    sr,sc,n=dq.pop()
    res=check(sr,sc,n)
    if res<0:
        n//=2
        dq.append((sr,sc,n))
        dq.append((sr+n,sc,n))
        dq.append((sr,sc+n,n))
        dq.append((sr+n,sc+n,n))
    elif res: ct1+=1
    else: ct2+=1
print(ct2)
print(ct1)