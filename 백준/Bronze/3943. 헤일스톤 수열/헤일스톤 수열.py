import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    n=int(input())
    mx=1
    while n!=1:
        if mx<n: mx=n
        if n%2==0: n//=2
        else: n=3*n+1
    op.append(str(mx))
print('\n'.join(op))