import sys
def input(): return sys.stdin.readline().rstrip()

nb=list(map(int,input().split()))
ln=len(nb)

maxn=nb[ln-1]
maxid=ln-1
for i in range(ln-1):
    if maxn<=nb[i]:
        maxn=nb[i]
        maxid=i

if maxid!=ln-1: maxn+=1
print(maxn)