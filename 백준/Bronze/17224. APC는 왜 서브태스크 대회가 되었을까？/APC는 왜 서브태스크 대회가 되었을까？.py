import sys
def input(): return sys.stdin.readline().rstrip()

n,l,k=map(int,input().split())
nb=[0]*n
arr=[list(map(int,input().split())) for _ in range(n)]
arr.sort(key=lambda x: (x[1], x[0]))

nb=[0]*n
ct=0
for i in range(n):
    if k<1 or l<arr[i][1]: break
    if nb[i]==1: continue
    nb[i]=1
    k-=1
    ct+=140
    
for i in range(n):
    if k<1: break
    if l<arr[i][0] or nb[i]==1: continue
    k-=1
    ct+=100

print(ct)