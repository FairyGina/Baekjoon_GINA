import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
ans=1
for _ in range(n):
    a,b=map(int,input().split())
    ct=abs(b-a)
    if (b<0 and a>0) or (b>0 and a<0): ct-=1
    if a<b:
        if ans<0 and ans+ct>=0: ans+=(ct+1)
        else: ans+=ct
    else:
        if ans>0 and ans-ct<=0: ans-=(ct+1)
        else: ans-=ct
print(ans)