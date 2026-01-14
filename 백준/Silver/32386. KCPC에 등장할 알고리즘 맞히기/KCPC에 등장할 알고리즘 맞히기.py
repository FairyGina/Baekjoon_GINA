import sys
def input(): return sys.stdin.readline().rstrip()

hm={}
n=int(input())
for i in range(n):
    ip=input().split(" ")
    for c in ip[2:]:
        if c not in hm:
            hm[c]=1
        else: hm[c]+=1

maxct,ans,bl=-1,"",False
for key,val in hm.items():
    if val>maxct:
        maxct=val
        ans=key
        bl=True
    elif val==maxct:
        bl=False

print(ans if bl else -1)
