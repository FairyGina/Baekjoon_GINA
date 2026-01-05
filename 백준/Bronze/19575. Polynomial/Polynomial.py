import sys
def input(): return sys.stdin.readline().rstrip()
n,x=map(int,input().split())
lm=10**9+7
ct=0

for i in range(n):
    a,b=map(int,input().split())
    ct=((ct+a)%lm*x)%lm
a,b=map(int,input().split())
ct=(ct+a)%lm
print(ct)