import sys
def input(): return sys.stdin.readline().rstrip()

ln=int(input())
if ln==1:
    print(int(input()))
    exit()

nb=[int(input()) for _ in range(ln)]
dp=[[0]*2 for _ in range(ln+1)]

dp[1][0]=dp[1][1]=nb[0]
dp[2][0]=nb[1]
dp[2][1]=nb[1]+dp[1][0]

for i in range(2,ln+1):
    dp[i][0]=max(dp[i-2][0],dp[i-2][1])+nb[i-1]
    dp[i][1]=dp[i-1][0]+nb[i-1]

#print(dp)
print(max(dp[ln][0],dp[ln][1]))