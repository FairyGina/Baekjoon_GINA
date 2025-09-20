import sys
def input(): return sys.stdin.readline().rstrip()
ip=list(map(int,input().split(':')))
hl,ml=[],[]
while ip[0]<100:
    hl.append(ip[0])
    ip[0]+=24
while ip[1]<100:
    ml.append(ip[1])
    ip[1]+=60
minct=10**6
for h in hl:
    for m in ml:
        time=f"{h:02d}"+f"{m:02d}"
        ct=0
        nb=int(time[0])-1
        if nb<0: sy,sx=3,1
        else: sy,sx=nb//3,nb%3
        for i in range(1,4):
            nb=int(time[i])-1
            if nb<0: y,x=3,1
            else: y,x=nb//3,nb%3
            ct+=abs(y-sy)+abs(x-sx)
            sy,sx=y,x
        if ct<minct:
            minct=ct
            a,b=h,m
print(f"{a:02d}:{b:02d}")