import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
ip=sys.stdin.readlines()

for i in ip:
    for j in i.split():
        op.append(int(j[::-1]))
op=op[1:]
op.sort()
print('\n'.join(map(str,op)))