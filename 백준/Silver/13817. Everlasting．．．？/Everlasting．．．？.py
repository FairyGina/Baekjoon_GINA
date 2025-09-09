import sys
def input(): return sys.stdin.readline().rstrip()
def fd(n):
    x,p=n,2
    st=set()
    while p*p<=x:
        if x%p==0:
            st.add(p)
            x//=p
        else: p+=1
    if x>1: st.add(x)
    p=max(st)
    st.remove(p)
    return p-sum(st)
op=[]
while True:
    a,b=map(int,input().split())
    if a==0: break
    if fd(a)>fd(b): op.append('a')
    else: op.append('b')
print('\n'.join(op))