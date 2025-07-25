import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
n=input()
n=int(input())
hm=[[False]*(n) for _ in range(n)]
ans=[0]*n
ct=0
for i in range(n):
    t=input()
    lt=list(map(int,input().split()))
    t=int(input())
    if t==1:
        for j in lt:
            hm[i][j-1]=True
    else:
        for j in range(n):
            hm[i][j]=True
        for j in lt:
            hm[i][j-1]=False
for i in range(n):
    for j in range(n):
        if i!=j:
            if hm[j][i]: ans[i]+=1
        elif not hm[j][i]:
            ans[i]+=1
    if ans[i]==n: ct+=1

for i in range(n):
    if ans[i]==n:   
        op.append(f"{i+1}")
        
if not op:
    op.append("swi")
print(' '.join(op))