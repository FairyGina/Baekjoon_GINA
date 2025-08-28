import sys
def input(): return sys.stdin.readline().rstrip()
def gcd(a,b):
    return a if b==0 else gcd(b,a%b)
op=[]
for _ in range(int(input())):
    a,b=map(int,input().split())
    op.append(str(a*b//gcd(a,b)))
print('\n'.join(op))