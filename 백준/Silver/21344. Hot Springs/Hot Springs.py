import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
n=int(input())
nb=list(map(int,input().split()))
nb.sort()
idx=(n-1)//2
lm=n-idx
if n%2==0: lm-=1
op.append(nb[idx])
for i in range(1,lm):
    op.append(nb[idx+i])
    op.append(nb[idx-i])
if n%2==0: op.append(nb[n-1])
print(' '.join(map(str,op)))