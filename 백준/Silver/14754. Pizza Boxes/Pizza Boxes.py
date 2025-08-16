import sys
def input(): return sys.stdin.readline().rstrip()

n,m=map(int,input().split())
pz1=[list(map(int,input().split())) for _ in range(n)]
pz2=[list(p) for p in zip(*pz1)]
mxlt=set()

for i in range(n):
    mxlt.add(max(pz1[i]))
for i in range(m):
    mxlt.add(max(pz2[i]))
        
print(sum(map(sum,pz1))-sum(mxlt))