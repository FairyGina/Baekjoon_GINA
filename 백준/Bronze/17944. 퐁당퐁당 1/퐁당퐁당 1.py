import sys
def input(): return sys.stdin.readline().rstrip()

n,t=map(int,input().split())
t-=1
lm=2*n
ct=1
bl=-1
for _ in range(t):
    if ct==1:
        bl=1
    elif ct==lm:
        bl=-1
    ct+=bl

print(ct)