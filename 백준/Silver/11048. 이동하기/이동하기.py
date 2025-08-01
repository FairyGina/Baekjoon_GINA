import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

n,m=map(int,input().split())
miro=[list(map(int,input().split(" "))) for _ in range(n)]
dp=[0]*(m+1)

for r in range(n):
    for c in range(m):
        dp[c+1]=max(dp[c],dp[c+1])+miro[r][c]
        
print(dp[m])