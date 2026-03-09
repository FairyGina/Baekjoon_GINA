import sys
def input(): return sys.stdin.readline().rstrip()
minct=sys.maxsize
def dfs(dt,num):
    global minct
    
    if dt==n:
        minct=min(minct,num)
        return
    
    for i in range(n):
        if not vt[i]:
            num1=num+max(price[i],1)
            vt[i]=1
            seq[dt]=i
            
            for j in range(n):
                price[j]-=info[i][j]

            dfs(dt+1,num1)
            
            vt[i]=0
            seq[dt]=-1
            
            for j in range(n):
                price[j]+=info[i][j]


op=[]

n=int(input())
vt=[0]*n
seq=[-1]*n

price=list(map(int,input().split()))
info=[[0]*n for _ in range(n)]

for i in range(n):
    ln=int(input())
    for j in range(ln):
        a,b=map(int,input().split())
        info[i][a-1]=b

dfs(0,0)
print(minct)