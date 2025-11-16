import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    input()
    n=int(input())
    num=0
    for __ in range(n):
        num+=int(input())
    op.append("YES" if num%n==0 else "NO")
    
print('\n'.join(op))