import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
lm=1000000000

sv1=[0]*12

dp1=[0]*12

for i in range(2,11):
    sv1[i]=1

for _ in range(1,n):
    for j in range(1,11):
        dp1[j-1]+=sv1[j]
        dp1[j+1]+=sv1[j]
    sv1=dp1.copy()
    dp1=[0]*12


print(sum(sv1[1:11])%lm)