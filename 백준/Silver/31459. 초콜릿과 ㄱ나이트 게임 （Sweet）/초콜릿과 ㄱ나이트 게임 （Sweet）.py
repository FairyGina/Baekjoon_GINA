import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    x,y,r,c=map(int,input().split())
    if x<=r or y<=c: op.append(str(x*y))
    else:
        ct=0
        stx,sty=0,0
        while(stx<y and sty<x):
            add=x-sty
            for i in range(c):
                if stx>=y: break
                stx+=1
                ct+=add
            add=y-stx
            for i in range(r):
                if sty>=x: break
                sty+=1
                ct+=add
            stx+=c
            sty+=r
        op.append(str(ct))

print('\n'.join(op))