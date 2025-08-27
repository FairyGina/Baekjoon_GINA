import sys
def input(): return sys.stdin.readline().rstrip()
def fac(n):
    if n==0: return 1
    return n*fac(n-1)
def com(n):
    global l
    return fac(l-n)//(fac(n)*fac(l-2*n))
op=[]
for t in range(1,int(input())+1):
    c,v,l=map(int,input().split())
    res=0
    for k in range(l//2+1):
        res+=com(k)*v**(l-k)*c**k
    op.append(f"Case #{t}: {res%1000000007}")
print('\n'.join(op))