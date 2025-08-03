import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
nb=[0]*6

for _ in range(int(input())):
    nb[0],nb[1],n=map(int,input().split())
    nb[2]=nb[1]-nb[0]
    nb[3]=-nb[0]
    nb[4]=-nb[1]
    nb[5]=-nb[2]
    
    op.append(str((nb[(n-1)%6])%(int(1e9+7))))
print('\n'.join(op))