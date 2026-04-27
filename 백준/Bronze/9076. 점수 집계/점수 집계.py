import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    nb=list(map(int,input().split()))
    nb.sort()
    if nb[4]-nb[1]>=4:
        op.append('KIN')
    else: op.append(str(sum(nb)-nb[0]-nb[4]))

print('\n'.join(op))