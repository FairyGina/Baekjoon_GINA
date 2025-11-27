import sys
def input(): return sys.stdin.readline().rstrip()

def f1(y,x,ylen,xlen):
    return boardnum[y+ylen][x+xlen]-boardnum[y][x+xlen]-boardnum[y+ylen][x]+boardnum[y][x]

def f2(idx,nlen,mlen):
    for i in range(n-nlen+1):
        for j in range(m-mlen+1):
            num[idx][i][j]=f1(i,j,nlen,mlen)
        
n,m=map(int,input().split())
a,b,c=map(int,input().split())

board=[list(map(int,input().split())) for _ in range(n)]

boardnum=[[0]*(m+1) for _ in range(n+1)]

for i in range(1,n+1):
    for j in range(1,m+1):
        boardnum[i][j]=(
            boardnum[i-1][j]+
            boardnum[i][j-1]-
            boardnum[i-1][j-1]+
            board[i-1][j-1]
        )
num=[[[0]*m for _ in range(n)] for _ in range(4)]

f2(0,a,b)
f2(1,b,a)
f2(2,a,c)
f2(3,c,a)

minct=sys.maxsize
for i in range(n-a+1):
    for j in range(m-b-c+1):
        total=num[0][i][j]+num[2][i][j+b]
        if minct>total:
            minct=total

for i in range(n-a-b+1):
    for j in range(m-c-a+1):
        total=num[2][i][j]+num[1][i+a][j+c]
        if minct>total:
            minct=total

for i in range(n-a-c+1):
    for j in range(m-b-a+1):
        total=num[0][i][j]+num[3][i+a][j+b]
        if minct>total:
            minct=total
    
print(minct)