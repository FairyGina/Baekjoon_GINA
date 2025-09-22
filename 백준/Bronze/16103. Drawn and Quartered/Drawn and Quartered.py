import sys
def input(): return sys.stdin.readline().rstrip()

n,k=map(int,input().split())
ip=input()
dv=n//4
a,b,c,d=ip[0:dv],ip[dv:2*dv],ip[2*dv:3*dv],ip[3*dv:4*dv]
if k%3==0:
    print(a+b+c+d)
elif k%3==1:
    print(a+d+b+c)
else: print(a+c+d+b)