import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    n,a,d=map(int,input().split())
    op.append(str(n*a+d*(n*(n-1)//2)))

print('\n'.join(op))