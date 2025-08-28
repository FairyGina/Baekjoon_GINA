import sys
def input(): return sys.stdin.readline().rstrip()
def pn():
    for i in range(2,int(1299710**0.5)):
        if bl[i]:
            for j in range(i*i,1299710,i):
                bl[j]=False
def find(n):
    lf,rt=0,99999
    while lf<=rt:
        m=(lf+rt)//2
        if pnb[m]==n: return '0'
        elif pnb[m]<n: lf=m+1
        else: rt=m-1
    return str(pnb[lf]-pnb[rt])
        
bl=[True]*1299710
bl[0]=bl[1]=False
op=[]
pn()
pnb=[]
for i in range(1299710):
    if bl[i]: pnb.append(i)
for _ in range(int(input())):
    k=int(input())
    op.append(find(k))
print('\n'.join(op))