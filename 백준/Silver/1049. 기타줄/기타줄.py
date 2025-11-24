import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    n16=n1[0]*6
    if n6[0]>n16: return n1[0]*n

    ra=n//6*n6[0]
    r1=ra+(n6[0] if n%6!=0 else 0)
    r2=ra+n%6*n1[0]

    return r1 if r1<r2 else r2

n,m=map(int,input().split())
n6,n1=[0]*m,[0]*m

for i in range(m):
    a,b=map(int,input().split())
    n6[i]=a
    n1[i]=b

n6.sort()
n1.sort()

print(f1())