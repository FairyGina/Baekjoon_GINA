from collections import deque
def bfs():
    a,b,n,m=map(int,input().split())
    mv=[1,a,b,-1,-a,-b,0,0]
    lm,ct=10**5+1,0
    dq,tdq,vt=deque(),deque(),[False]*lm
    dq.append(n)
    vt[n]=True
    while dq:
        ct+=1
        tdq.clear()
        while dq:
            n=dq.popleft()
            mv[6],mv[7]=n*a-n,n*b-n
            for i in range(8):
                p=n+mv[i]
                if 0<=p<lm and not vt[p]:
                    if p==m: return ct
                    tdq.append(p)
                    vt[p]=True
        dq=deque(tdq)
    return 0
print(bfs())