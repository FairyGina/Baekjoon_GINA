import sys
def input(): return sys.stdin.readline().rstrip()
my=(-1,1,0,0)
mx=(0,0,-1,1)
r,c=map(int,input().split())
ume=[list(input()) for _ in range(r)]
cu=[row[:] for row in ume]
for y in range(r):
    for x in range(c):
        if ume[y][x]=='X':
            ct=0
            for m in range(4):
                ty=y+my[m]
                tx=x+mx[m]
                if ty<0 or ty>=r or tx<0 or tx>=c or ume[ty][tx]=='.': ct+=1
            if ct>2:
                cu[y][x]='.'

sy,sx,ey,ex=r-1,c-1,0,0
for y in range(r):
    for x in range(c):
        if cu[y][x]=='X':
            if sx>x: sx=x
            if ex<x: ex=x
            if sy>y: sy=y
            if ey<y: ey=y

for i in range(sy,ey+1):
    print(''.join(cu[i][sx:ex+1]))