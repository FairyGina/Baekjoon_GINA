import sys
import copy
from collections import deque
def input(): return sys.stdin.readline().rstrip()
my=(-1,0,1,0)
mx=(0,1,0,-1)
q=deque()
def per():
    while q:
        y=q.popleft()
        x=q.popleft()
        if y==m-1: return True
        for i in range(4):
            ty=y+my[i]
            tx=x+mx[i]
            if 0<=ty<m and 0<=tx<n and not board[ty][tx]:
                q.append(ty)
                q.append(tx)
                board[ty][tx]=1
    return False
    
m,n=map(int,input().split())
board=[list(map(int,input())) for _ in range(m)]

bl=True
for i in range(n):
    q.clear()
    if not board[0][i]:
        q.append(0)
        q.append(i)
        if per():
            print("YES")
            bl=False
            break
            
if bl: print("NO")