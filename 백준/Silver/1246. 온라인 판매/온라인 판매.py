import sys
def input(): return sys.stdin.readline().rstrip()

n,m=map(int,input().split())
egg=[int(input()) for _ in range(m)]

egg.sort()
num=[0]*m
ct=m
for i in range(m):
    num[i]=(ct if ct<=n else n)*egg[i]
    ct-=1

ct,id=0,0
for i in range(m):
    if ct<num[i]:
        ct=num[i]
        id=egg[i]

print(f"{id} {ct}")