import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    op.append(2*int(input())-1)
print('\n'.join(map(str,op)))