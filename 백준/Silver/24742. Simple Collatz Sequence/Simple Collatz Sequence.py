import sys
def input(): return sys.stdin.readline().rstrip()

lm=40001
a,b=1,1
n=int(input())
if n==1 or n==2:
    print(1)
else:
    for i in range(2,n):
        c=a+b
        a=b
        b=c
    print(c%1000007)