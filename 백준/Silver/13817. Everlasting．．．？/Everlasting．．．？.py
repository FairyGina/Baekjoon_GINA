import sys
def input(): return sys.stdin.readline().rstrip()
def fd(n):
    num=0
    st=set()
    while True:
        if n==pf[n]:
            num+=n
            if n in st: num+=n
            return num
        if not pf[n] in st: num-=pf[n]
        st.add(pf[n])
        n//=pf[n]
nlm=10**6+1
pf=[0]*nlm
for i in range(2,nlm):
    if pf[i]==0: pf[i]=i
    for j in range(i*i,nlm,i):
        if pf[j]<1: pf[j]=i
op=[]
while True:
    a,b=map(int,input().split())
    if a==0: break
    if fd(a)>fd(b): op.append('a')
    else: op.append('b')
print('\n'.join(op))