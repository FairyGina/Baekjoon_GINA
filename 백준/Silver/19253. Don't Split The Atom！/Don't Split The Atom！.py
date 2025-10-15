import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    n=int(input())
    if n%2==0: op.append('A')
    else: op.append('B')
print('\n'.join(op))