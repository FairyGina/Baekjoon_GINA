import sys
def input(): return sys.stdin.readline().rstrip()
lt=int(input())
ip=input()
if lt==1 or lt==2: print(1)
else:
    dp=[0]*(lt+1)
    dp[1]=dp[2]=1
    for i in range(3,lt+1):
        dp[i]=dp[i-1]+1
        two=int(ip[i-2:i])
        thr=int(ip[i-3:i])
        if two>9: dp[i]=min(dp[i],dp[i-2]+1)
        if 99<thr<642: dp[i]=min(dp[i],dp[i-3]+1)
    print(dp[lt])