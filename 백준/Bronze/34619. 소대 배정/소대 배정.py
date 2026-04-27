
import sys
def input(): return sys.stdin.readline().rstrip()

a,b,n,k=map(int,input().split())
r1,r2=1,1
ct=1
for i in range(1,k):
    if ct==n:
        ct=0
        r2+=1
        if r2>b:
            r2=1
            r1+=1
    ct+=1

print(r1,r2)