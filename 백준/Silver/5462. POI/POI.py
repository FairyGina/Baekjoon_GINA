import sys
n,t,p=map(int,sys.stdin.readline().rstrip().split())
p-=1
hm=[[0]*t for _ in range(n+1)]
pn=[[0]*3 for _ in range(n)]
for i in range(n):
    st=list(map(int,sys.stdin.readline().rstrip().split()))
    hm[i]=st
    for j in range(t):
        if hm[i][j]==0: hm[n][j]+=1
for i in range(n):
    sc,ct=0,0
    pn[i][2]=i
    for j in range(t):
        if hm[i][j]==1:
            ct+=1
            sc+=hm[n][j]
    pn[i][0]=sc
    pn[i][1]=ct
pn.sort(key=lambda x: (-x[0],-x[1],x[2]))
for i in range(n):
    if pn[i][2]==p:
        print(f"{pn[i][0]} {i+1}")
        break