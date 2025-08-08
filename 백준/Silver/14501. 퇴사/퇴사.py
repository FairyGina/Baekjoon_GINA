import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
time,pay=[0]*n,[0]*n
dp=[[0]*2 for _ in range(n+1)]
sv=[0]*(n+1)
for i in range(n):
    time[i],pay[i]=map(int,input().split())

for id in range(n):
    dp[id][0]=dp[id-1][1]
    dp[id][1]=max(dp[id][1],dp[id][0])
    if time[id]+id>n: continue
    dp[time[id]+id][1]=max(dp[time[id]+id][1],dp[id][1]+pay[id])
print(max(dp[n-1][1],dp[n][1]))