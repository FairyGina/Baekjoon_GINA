import sys
def input(): return sys.stdin.readline().rstrip()
w,h,n=map(int,input().split())
stx,sty=map(int,input().split())
board=[list(input()) for _ in range(h)]

for i in range(h):
    for j in range(w):
        if board[i][j]=='-':
            board[i][j]='L'
        elif board[i][j]=='|':
            board[i][j]='U'

op=[]
for i in range(n):
    y,x=sty,stx
    while True:
        if y>=h or y<0 or x>=w or x<0 or board[y][x]=='.':
            op.append(f"{x} {y}")
            break
        
        tg=board[y][x]
        if tg=='^':
            y-=1
        elif tg=='<':
            x-=1
        elif tg=='>':
            x+=1
        elif tg=='v':
            y+=1
            
        elif tg=='R':
            board[y][x]='L'
            x+=1
        elif tg=='L':
            board[y][x]='R'
            x-=1
        elif tg=='U':
            board[y][x]='D'
            y-=1
        elif tg=='D':
            board[y][x]='U'
            y+=1
            
print('\n'.join(op))