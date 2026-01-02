import sys
def input(): return sys.stdin.readline().rstrip()

ans=[0]*5

def f1(ip):
    ct=0
    for c in ip:
        if c=='*': ct+=1
    ans[ct]+=1
    
n,m=map(int,input().split())
board=[input() for _ in range(5*n)]
for i in range(n):
    for j in range(m):
        y,x=i*5+1,j*5+1
        mk=[]
        for r in range(4):
            mk.append(board[y+r][x])
        f1(mk)

print(' '.join(map(str,ans)))