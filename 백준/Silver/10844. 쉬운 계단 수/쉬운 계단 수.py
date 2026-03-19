import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
lm=1000000000

sv=[0]*12
dp=[0]*12

for i in range(2,11):
    sv[i]=1

for _ in range(1,n):
    for j in range(1,11):
        dp[j]=sv[j-1]+sv[j+1]
    sv=dp.copy()
    dp=[0]*12

print(sum(sv[1:11])%lm)