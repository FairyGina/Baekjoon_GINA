import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
pz=[list(map(int,input().split())) for _ in range(n)]
vt=[[True]*m for _ in range(n)]
for i in range(n):
    vt[i][pz[i].index(max(pz[i]))]=False
for i in range(m):
    mx,yid,xid=0,0,0
    for j in range(n):
        if mx<pz[j][i]:
            mx=pz[j][i]
            yid=j
            xid=i
    vt[yid][xid]=False
ct=0
for i in range(n):
    for j in range(m):
        if vt[i][j]: ct+=pz[i][j]
print(ct)