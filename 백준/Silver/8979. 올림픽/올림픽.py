import sys
def input(): return sys.stdin.readline().rstrip()

n,k=map(int,input().split())
nb=[list(map(int,input().split())) for _ in range(n)]

nb.sort(key=lambda x: (-x[1], -x[2], -x[3]))
test=[0]*(n+1)

rank,ct=1,0
a,b,c=nb[0][1],nb[0][2],nb[0][3]
for i in range(n):
    if a!=nb[i][1] or b!=nb[i][2] or c!=nb[i][3]:
        a=nb[i][1]
        b=nb[i][2]
        c=nb[i][3]
        rank+=ct
        ct=1
    else: ct+=1
    test[nb[i][0]]=rank

print(test[k])