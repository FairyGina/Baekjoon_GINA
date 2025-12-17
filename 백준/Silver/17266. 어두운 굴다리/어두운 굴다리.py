import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
m=int(input())
arr=list(map(int,input().split()))

maxct=arr[0]
for i in range(1,m):
    maxct=max(maxct,(arr[i]-arr[i-1]+1)//2)

maxct=max(maxct,n-arr[-1])
print(maxct)