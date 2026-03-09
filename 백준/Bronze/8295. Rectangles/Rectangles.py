import sys
def input(): return sys.stdin.readline().rstrip()

n,m,p=map(int,input().split())
ans=0
for i in range(1,n+1):
    for j in range(1,m+1):
        if 2*(i+j)<p: continue
        ans+=(n-i+1)*(m-j+1)

print(ans)