import sys
def input(): return sys.stdin.readline().rstrip()

board=[[0]*101 for _ in range(101)]

for _ in range(int(input())):
    x,y=map(int,input().split())
    for my in range(y,y+10):
        for mx in range(x,x+10):
            board[my][mx]=1

num=0
for i in range(101):
    for j in range(101):
        num+=board[i][j]

print(num)