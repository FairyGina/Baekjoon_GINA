import sys
ct=0
nb=[0]*5
vt=[False]*10
def sc(dt):
    global ct
    if dt==5:
        tnb=''.join(map(str,nb))
        tx=str(int(tnb)*9)
        if len(tx)==5:
            tvt=vt[:]
            for ch in tx:
                d=int(ch)
                if tvt[d]: return
                tvt[d]=True
            ct+=1
            if ct==n:
                print(f"{tx} {tnb}")
                return
        return
    for i in range(10):
        if not vt[i]:
            vt[i]=True
            nb[dt]=i
            sc(dt+1)
            vt[i]=False
n=int(sys.stdin.readline().rstrip())
sc(0)