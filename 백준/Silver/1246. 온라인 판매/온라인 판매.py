import sys
def input(): return sys.stdin.readline().rstrip()

n,m=map(int,input().split())
egg=[int(input()) for _ in range(m)]
egg.sort()
mx,num,id,ct=0,0,0,m
for i in range(m):
    num=(ct if ct<=n else n)*egg[i]
    if mx<num:
        mx=num
        id=egg[i]
    ct-=1

print(f"{id} {mx}")