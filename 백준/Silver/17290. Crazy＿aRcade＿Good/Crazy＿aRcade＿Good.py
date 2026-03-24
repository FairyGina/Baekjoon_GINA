import sys
def input(): return sys.stdin.readline().rstrip()

py,px=map(int,input().split())
py,px=py-1,px-1

board=[list(input()) for _ in range(10)]
vt=[[0]*10 for _ in range(2)]

for i in range(10):
    for j in range(10):
        if board[i][j]=='o':
            vt[0][i]=1
            vt[1][j]=1

for i in range(10):
    if vt[0][i]:
        for j in range(10):
            board[i][j]='o'
    if vt[1][i]:
        for j in range(10):
            board[j][i]='o'

minct=10**9
for i in range(10):
    for j in range(10):
        if board[i][j]=='x':
            minct=min(minct,abs(i-py)+abs(j-px))

print(minct)