mv=[(0,1),(1,0),(0,-1),(-1,0)]
n,m=map(int,input().split())
vt=[[0]*m for _ in range(n)]
vt[0][0]=1

y,x,idx,ct=0,0,0,-1
for _ in range(n*m):
    ty,tx=y+mv[idx][0],x+mv[idx][1]
    if 0<=ty<n and 0<=tx<m and vt[ty][tx]<1:
        vt[ty][tx]=1
        y,x=ty,tx
    else:
        ct+=1
        idx=(idx+1)%4
        ty,tx=y+mv[idx][0],x+mv[idx][1]
        if 0<=ty<n and 0<=tx<m and vt[ty][tx]<1:
            vt[ty][tx]=1
            y,x=ty,tx
        else: break
print(ct)