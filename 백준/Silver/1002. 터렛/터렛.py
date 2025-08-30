import math
op=[]
for _ in range(int(input())):
    x1,y1,r1,x2,y2,r2=map(int,input().split())
    d=math.sqrt((x2-x1)**2+(y2-y1)**2)
    if d==0:
        if r1==r2: d=-1
        else: d=0
    else:
        if d>r1+r2: d=0
        elif d==r1+r2: d=1
        elif d<abs(r1-r2): d=0
        elif d==abs(r1-r2): d=1
        else: d=2
    op.append(str(d))
print('\n'.join(op))