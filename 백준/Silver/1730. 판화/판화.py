import sys
def input(): return sys.stdin.readline().rstrip()
def wt(y,x,c):
    if board[y][x]=='.':
        if c==0: board[y][x]='|'
        else: board[y][x]='-'
    else:
        if board[y][x]=='|' and c==1: board[y][x]='+'
        elif board[y][x]=='-' and c==0: board[y][x]='+'
my,mx=(-1,1,0,0),(0,0,-1,1)
nc={'U':0,'D':1,'L':2,'R':3}
n=int(input())
board=list(['.']*n for _ in range(n))
rb=input()
y,x=0,0
for c in rb:
    ty,tx,sv=y+my[nc[c]],x+mx[nc[c]],nc[c]//2
    if ty<0 or ty>=n or tx<0 or tx>=n: continue
    wt(y,x,sv)
    wt(ty,tx,sv)
    y,x=ty,tx
for c in board:
    print(''.join(c))