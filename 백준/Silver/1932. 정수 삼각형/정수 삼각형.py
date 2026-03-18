import sys
def input(): return sys.stdin.readline().rstrip()
n=int(input())
board=[list(map(int,input().split())) for _ in range(n)]
dp=[[0]*n for _ in range(n)]
dp[0][0]=board[0][0]

for i in range(1,n):
    ln=len(board[i])
    for j in range(1,ln-1):
        dp[i][j]=board[i][j]+max(dp[i-1][j-1],dp[i-1][j])
        
    dp[i][0]=board[i][0]+dp[i-1][0]
    dp[i][ln-1]=board[i][ln-1]+dp[i-1][ln-2]
    
print(max(dp[n-1]))