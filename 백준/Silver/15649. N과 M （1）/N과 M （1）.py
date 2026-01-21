import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
def dfs(dt):
    if dt==m:
        op.append(' '.join(map(str,nb)))
        return
    for i in range(1,n+1):
        if not vt[i-1]:
            nb[dt]=i
            vt[i-1]=1
            dfs(dt+1)
            vt[i-1]=0
            nb[dt]=0
n,m=map(int,input().split())
vt,nb=[0]*n,[0]*m
dfs(0)
print('\n'.join(op))