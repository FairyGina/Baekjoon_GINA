import sys
def input(): return sys.stdin.readline().rstrip()
def bfs():
    mv=((-1,0),(1,0),(0,-1),(0,1))
    n,m,k=map(int,input().split())
    if n==1 and m==1: return 1
    miro=list(input() for _ in range(n))
    vt=list([[True]*m for _ in range(n)] for __ in range(k+1))
    rvt=list([11]*m for _ in range(n))
    dq,tq=[],[]
    dq.append((0,0,0))
    dt=1
    while dq:
        dt+=1
        tq.clear()
        while dq:
            y,x,d=dq.pop()
            for my,mx in mv:
                ty,tx=y+my,x+mx
                if ty==n-1 and tx==m-1: return dt
                if 0<=ty<n and 0<=tx<m:
                    nd=d
                    if miro[ty][tx]=='1': nd=d+1
                    if rvt[ty][tx]<=nd: continue
                    if miro[ty][tx]=='1':
                        if nd>k: continue
                        if vt[nd][ty][tx]:
                            vt[nd][ty][tx]=False
                    else: vt[nd][ty][tx]=False
                    tq.append((ty,tx,nd))
                    if rvt[ty][tx]>nd: rvt[ty][tx]=nd
        dq=list(tq)
    return -1
print(bfs())