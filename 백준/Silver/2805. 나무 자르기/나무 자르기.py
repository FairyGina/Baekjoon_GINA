import sys
def input(): return sys.stdin.readline().rstrip()
def bs(tr):
    lf,rt=0,n
    while lf<rt:
        mid=(lf+rt)//2
        if tree[mid]>tr: lf=mid+1
        else: rt=mid
    return lf
    
def fd():
    lf,rt=0,tree[0]
    ans=0
    while lf<=rt:
        mid=(lf+rt)//2
        idx=bs(mid)
        res=num[idx]-idx*mid
        if res>=m:
            lf=mid+1
            ans=mid
        else: rt=mid-1
    return ans
n,m=map(int,input().split())
tree=list(map(int,input().split()))
tree.sort(reverse=True)
num=[0]*(n+1)
for i in range(n):
    num[i+1]=tree[i]+num[i]
print(fd())