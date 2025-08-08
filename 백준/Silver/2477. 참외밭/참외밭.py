import sys
def input(): return sys.stdin.readline().rstrip()
my=(0,0,0,1,-1)
mx=(0,1,-1,0,0)
board=[[False]*1001 for _ in range(1001)]
y,x=500,500
board[y][x]=True
km=int(input())
miny,minx,maxy,maxx=1001,1001,0,0
for i in range(6):
    nb,m=map(int,input().split())
    for _ in range(m):
        y+=my[nb]
        x+=mx[nb]
        board[y][x]=True
    if miny>y: miny=y
    if minx>x: minx=x
    if maxy<y: maxy=y
    if maxx<x: maxx=x

bl=True
ylt=0
xlt=-1
for row in range(miny,maxy+1):
    if board[row][minx]!=board[row][maxx]:
        ylt+=1
        if bl:
            if not board[row][minx]:
                for col in range(minx,maxx+1):
                    xlt+=1
                    if board[row][col]: break
            else:
                for col in range(maxx,minx-1,-1):
                    if board[row][col]: break
                    xlt+=1
                xlt+=1
            bl=False
print(km*((maxy-miny)*(maxx-minx)-(ylt*xlt)))