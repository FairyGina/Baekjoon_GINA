import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    mv=[(0,1),(-1,0),(0,-1),(1,0)]

    m,n=map(int,input().split())
    y,x,dir=0,0,0
    for _ in range(n):
        ip=input().split()
        if ip[0]=="MOVE":
            d=int(ip[1])
            ty,tx=y+mv[dir][0]*d,x+mv[dir][1]*d
            if 0<=ty<=m and 0<=tx<=m:
                y,x=ty,tx
            else: return [-1]
        else:
            d=int(ip[1])
            if d==0:
                dir=(dir+3)%4
            else:
                dir=(dir+1)%4

    return (x,y)

ans=f1()
if ans[0]<0: print(ans[0])
else: print(ans[0],ans[1])