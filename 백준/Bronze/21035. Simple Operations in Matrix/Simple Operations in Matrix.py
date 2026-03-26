import sys
def input(): return sys.stdin.readline().rstrip()

n,m=map(int,input().split())
board=[list(map(int,input().split())) for _ in range(n)]

for _ in range(int(input())):
    ip=input().split()
    lm,nb=int(ip[1])-1,int(ip[2])
    
    if ip[0]=='row':
        for i in range(m):
            board[lm][i]+=nb
    else:
        for i in range(n):
            board[i][lm]+=nb

minx,maxx,num=board[0][0],board[0][0],0

for i in board:
    for j in i:
        num+=j
        minx=min(minx,j)
        maxx=max(maxx,j)

print(num,minx,maxx)