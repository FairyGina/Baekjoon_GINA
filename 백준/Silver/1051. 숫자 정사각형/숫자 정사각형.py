import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
board=list(input() for _ in range(n))
lt,ct=min(n,m),0
for l in range(lt,-1,-1):
    for r in range(n-l):
        for c in range(m-l):
            if board[r][c]==board[r+l][c]==board[r][c+l]==board[r+l][c+l]:
                ct=l+1
    if ct>0: break
print(ct*ct)