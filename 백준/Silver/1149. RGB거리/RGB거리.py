import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
board=[list(map(int,input().split())) for _ in range(n)]

dp=[[0]*3 for _ in range(n+1)]
for i in range(n):
    dp[i+1][0]=board[i][0]+min(dp[i][1],dp[i][2])
    dp[i+1][1]=board[i][1]+min(dp[i][0],dp[i][2])
    dp[i+1][2]=board[i][2]+min(dp[i][0],dp[i][1])

print(min(dp[n][0],dp[n][1],dp[n][2]))