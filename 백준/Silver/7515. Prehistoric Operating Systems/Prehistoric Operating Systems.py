import sys
def input(): return sys.stdin.readline().rstrip()

dp=[[0]*2 for _ in range(41)]

dp[1][0]=1
dp[1][1]=1

for i in range(2,41):
    dp[i][0]=dp[i-1][1]
    dp[i][1]=dp[i-1][1]+dp[i-1][0]

op=[]
for i in range(1,int(input())+1):
    op.append(f"Scenario {i}:\n{str(sum(dp[int(input())]))}\n\n")

print(''.join(op))