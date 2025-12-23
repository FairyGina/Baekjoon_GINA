import sys
def input(): return sys.stdin.readline().rstrip()

op=[]

dp=[]
dp.append(1)
mul=2
for i in range(44):
    dp.append(dp[i]+mul)
    mul+=1

set=set()
for i in dp:
    for j in dp:
        for k in dp:
            set.add(i+j+k)

for _ in range(int(input())):
    n=int(input())
    ans=0
    if n in set: ans=1
    op.append(ans)

print('\n'.join(map(str,op)))