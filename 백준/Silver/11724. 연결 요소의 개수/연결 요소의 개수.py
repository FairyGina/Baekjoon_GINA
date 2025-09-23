import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
nb=list([] for _ in range(n+1))
vt=[1]*(n+1)
for i in range(m):
    a,b=map(int,input().split())
    nb[a].append(b)
    nb[b].append(a)
ct=0
for i in range(1,n+1):
    if vt[i]:
        ct+=1
        dq=[[i]]
        while dq:
            for j in dq.pop():
                if vt[j]:
                    vt[j]=0
                    dq.append(nb[j])
print(ct)