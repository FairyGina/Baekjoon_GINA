import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
nb=[0]+list(map(int,input().split()))
bk=-1
for i in range(n):
    nb[i+1]+=nb[i]
    if nb[i+1]>=m and bk<0:
        bk=i+1
if bk<0: print(0)
else:
    mn,ft=bk,0
    while bk<=n:
        tn=nb[bk]-nb[ft]
        if tn>=m:
            mn=min(mn,bk-ft)
            ft+=1
        else: bk+=1
    print(mn)