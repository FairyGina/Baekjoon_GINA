import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
ct=[0]*n

sol=input().split()
for i in range(n):
    lt=input().split()
    for j in range(m):
        if lt[j]==sol[j]: ct[i]+=1

m,id=0,0    
for i in range(n):
    if m<ct[i]:
        m=ct[i]
        id=i

print(id+1)