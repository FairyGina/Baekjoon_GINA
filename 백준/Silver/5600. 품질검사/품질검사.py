import sys
def input(): return sys.stdin.readline().rstrip()

def check(a,b):
    if nb[a]==1 and nb[b]==1: return True
    return False

a,b,c=map(int,input().split())
ln=int(input())
nb=[2]*(a+b+c+1)

vp=[list(map(int,input().split())) for _ in range(ln)]
vp.sort(key=lambda x: (-x[3], x[0],x[1],x[2]))

start=0
for i in range(ln):
    if vp[i][3]==0: break
    start+=1
    nb[vp[i][0]]=1
    nb[vp[i][1]]=1
    nb[vp[i][2]]=1

for _ in range(10):
    for i in range(start,ln):
        nb[vp[i][0]]=(0 if check(vp[i][1],vp[i][2]) else nb[vp[i][0]])
        nb[vp[i][1]]=(0 if check(vp[i][0],vp[i][2]) else nb[vp[i][1]])
        nb[vp[i][2]]=(0 if check(vp[i][0],vp[i][1]) else nb[vp[i][2]])
        
print('\n'.join(map(str,nb[1:])))