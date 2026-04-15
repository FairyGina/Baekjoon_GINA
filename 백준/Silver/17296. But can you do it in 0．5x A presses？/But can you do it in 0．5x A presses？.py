import sys
import math
def input(): return sys.stdin.readline().rstrip()

n=int(input())
nb=list(map(float,input().split()))

ans=0
for n in nb:
    if ans==0:
        if n>0:
            ans+=math.ceil(n)
    else: ans+=math.floor(n)
print(ans)