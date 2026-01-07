import sys
def input(): return sys.stdin.readline().rstrip()

lm=1000000007
n=int(input())
a,b,c=0,1,1
if n==0: c=0
for i in range(2,n+1):
    c=(a+b)%lm
    a=b
    b=c
print(c)