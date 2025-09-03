import sys
def input(): return sys.stdin.readline().rstrip()
n,m,a,b=map(int,input().split())
dp=[100001]*(n+1)
bl=[True]*(n+1)
bl[0]=False
mx=-1
for i in range(m):
    q,w=map(int,input().split())
    bl[q:w+1]=[False]*(w-q+1)
if bl[a]:
    dp[a]=1
    mx=a+1
if bl[b]:
    dp[b]=1
    mx=max(mx,b+1)
bl[0:mx]=[False]*mx
bl=list(i for i,b in enumerate(bl) if b)
for idx in bl:
    dp[idx]=min(dp[idx-a]+1,dp[idx-b]+1)
res=dp[n]
if res>100000: res=-1
print(res)