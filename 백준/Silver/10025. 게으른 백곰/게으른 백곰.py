import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
n,k=map(int,input().split())
k=k*2+1
lm=10**6+1
nb=[0]*lm
num=[0]*(lm+1)
mi=0

for i in range(n):
    g,id=map(int,input().split())
    if id>lm: continue
    nb[id]=g
    if mi<id: mi=id
for i in range(lm):
    num[i+1]=num[i]+nb[i]
n=-1
for i in range(k,mi+2):
    tn=num[i]-num[i-k]
    if n<tn: n=tn
    
if n==-1: n=num[lm]
print(n)