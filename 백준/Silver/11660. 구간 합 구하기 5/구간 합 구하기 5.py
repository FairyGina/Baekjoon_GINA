import sys
def input(): return sys.stdin.readline().rstrip()

n,m=map(int,input().split())
board=[list(map(int,input().split())) for _ in range(n)]
num=[[0]*(n+1) for _ in range(n+1)]

for i in range(n):
    for j in range(n):
        num[i+1][j+1]=board[i][j]+num[i+1][j]+num[i][j+1]-num[i][j]
op=[]
for _ in range(m):
    y1,x1,y2,x2=map(int,input().split())
    tn=num[y2][x2]-num[y2][x1-1]-num[y1-1][x2]+num[y1-1][x1-1]
    op.append(str(tn))

print('\n'.join(op))