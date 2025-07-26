import sys
sys.setrecursionlimit(10**6)
def input(): return sys.stdin.readline().rstrip()
my=(-1,0,1,0)
mx=(0,1,0,-1)
ans="NO"
m,n=map(int,input().split())
board=[list(map(int,input())) for _ in range(m)]
def per(y,x):
    if y==m-1:
        return True
    board[y][x]=2
    for i in range(4):
        ty=y+my[i]
        tx=x+mx[i]
        if 0<=ty<m and 0<=tx<n and not board[ty][tx]:
            if per(ty,tx): return True
    return False

for i in range(n):
    if not board[0][i]:
        if per(0,i):
            ans="YES"
            break

print(ans)