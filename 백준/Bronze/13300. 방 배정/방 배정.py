import sys
def input(): return sys.stdin.readline().rstrip()
cl=list([0]*2 for _ in range(7))
n,k=map(int,input().split())
for i in range(n):
    a,b=map(int,input().split())
    cl[b][a]+=1
n=0
for i in range(1,7):
    n+=cl[i][0]//k
    if cl[i][0]%k!=0: n+=1
    n+=cl[i][1]//k
    if cl[i][1]%k!=0: n+=1
print(n)