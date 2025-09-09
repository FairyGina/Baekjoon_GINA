import sys
def input(): return sys.stdin.readline().rstrip()
nlm=10**6+1
pf,fd=[0]*nlm,[0]*nlm
for i in range(2,nlm):
    if pf[i]==0: pf[i]=i
    for j in range(i*i,nlm,i):
        if pf[j]<1: pf[j]=i
for i in range(2,nlm):
    n,num=i,0
    st=set()
    while True:
        if n==pf[n]:
            fd[i]=num+n
            if n in st: fd[i]+=n
            break
        if not pf[n] in st: num-=pf[n]
        st.add(pf[n])
        n//=pf[n]
op=[]
while True:
    a,b=map(int,input().split())
    if a==0: break
    if fd[a]>fd[b]: op.append('a')
    else: op.append('b')
print('\n'.join(op))