import sys
def input(): return sys.stdin.readline().rstrip()

def memove(odidx):
    global y,x
    ty,tx=y+mvarr[odidx][0],x+mvarr[odidx][1]
    if 0<=ty<N and 0<=tx<N and board[ty][tx]=='.':
        board[y][x]='.'
        board[ty][tx]='@'
        y=ty
        x=tx
        
def colorf():
    c,idx=x,1
    for r in range(y-ink,y):
        for i in range(c,c+idx):
            if(0<=r<N and 0<=i<N):
                if(board[r][i]!='@' and board[r][i]!='.'): board[r][i]=color
        idx+=2
        c-=1
    c,idx=x-ink,2*ink+1
    for r in range(y,y+ink+1):
        for i in range(c,c+idx):
            if(0<=r<N and 0<=i<N):
                if(board[r][i]!='@' and board[r][i]!='.'): board[r][i]=color
        idx-=2
        c+=1

mvarr=[(-1,0),(1,0),(0,-1),(0,1)]
I,N,K=map(int,input().split())
inkarr=input()
board=[list(input()) for _ in range(N)]
ip=input()

y,x=0,0
save=[]
for i in range(N):
    for j in range(N):
        if board[i][j]=='@':
            y=i
            x=j
        elif board[i][j]=='#':
            save.append((i,j))

orderlist="UDLRJj"
ink=0
inkidx=0
color=inkarr[inkidx]

for cip in ip:
    odidx=orderlist.find(cip)
    if(odidx<4): memove(odidx)
    elif(odidx<5):
        color=inkarr[inkidx]
        colorf()
        ink=0
        inkidx=(inkidx+1)%len(inkarr)
    else: ink+=1

op=[]
for r in board:
    op.append(''.join(r))

print('\n'.join(op))