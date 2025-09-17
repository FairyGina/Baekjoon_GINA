import sys
def input(): return sys.stdin.readline().rstrip()
for _ in range(int(input())):
    n=int(input())
    point=list(map(int,input().split()))
    vt,dq=[-1]*n,[]
    ct=0
    for i in range(n):
        if vt[i]==-1:
            vt[i]=0
            dq.clear()
            dq.append(i)
            idx,dt=i,0
            while True:
                dt+=1
                p=point[idx]-1
                if vt[p]>-1:
                    ct+=vt[p]
                    break
                elif vt[p]<-1:
                    ct+=dt
                    break
                vt[p]=dt
                dq.append(p)
                idx=p
            while dq:
                vt[dq.pop()]=-2
    print(ct)