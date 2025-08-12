import sys
def input(): return sys.stdin.readline().rstrip()
n,k=map(int,input().split())
nb=list(map(int,input().split()))

ct=0
for i in range(n,0,-1):
    mx,id=nb[i-1],i-1
    for j in range(i):
        if mx<nb[j]:
            mx=nb[j]
            id=j
    if id!=i-1:
        ct+=1
        if ct==k:
            print(f"{min(nb[id],nb[i-1])} {max(nb[id],nb[i-1])}")
            break
        tp=nb[id]
        nb[id]=nb[i-1]
        nb[i-1]=tp

if ct<k: print(-1)