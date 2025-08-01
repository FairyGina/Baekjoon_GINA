import sys
def input(): return sys.stdin.readline().rstrip()
n=int(input())
res=(2*n+1)**2
for i in range(-n,n+1):
    if i==0: continue
    k=1-i
    bmin=max(-n,k-n)
    bmax=min(n,k+n)
    res+=max(0,bmax-bmin+1)

print(res)