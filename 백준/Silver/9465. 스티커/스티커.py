import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    ln=int(input())
    dp=[[0]*(ln+1) for i in range(2)]
    sti=[list(map(int,input().split())) for i in range(2)]
    if ln==1:
        op.append(str(max(sti[0][0],sti[1][0])))
        continue
    elif ln==2:
        op.append(str(max(sti[0][0]+sti[1][1],sti[0][1]+sti[1][0])))
        continue
    
    dp[0][1]=sti[0][0]
    dp[1][1]=sti[1][0]
    dp[0][2]=sti[0][1]+sti[1][0]
    dp[1][2]=sti[1][1]+sti[0][0]
    
    for i in range(3,ln+1):
        tm=max(dp[0][i-2],dp[1][i-2])
        dp[0][i]=sti[0][i-1]+max(dp[1][i-1],tm)
        dp[1][i]=sti[1][i-1]+max(dp[0][i-1],tm)
        
    op.append(str(max(dp[0][ln],dp[1][ln])))
print('\n'.join(op))