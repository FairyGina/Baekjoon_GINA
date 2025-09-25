import sys
def input(): return sys.stdin.readline().rstrip()
board=[[0]*100 for _ in range(100)]
for _ in range(4):
    x1,y1,x2,y2=map(int,input().split())
    for i in range(y1,y2):
        for j in range(x1,x2):
            board[i][j]=1
ct=0
for i in range(100):
    ct+=sum(board[i])
print(ct)