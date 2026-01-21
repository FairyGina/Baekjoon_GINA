import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
nb=[list(input().split()) for _ in range(m)]
for i in range(m):
    nb[i][0]=int(nb[i][0])
    nb[i][1]=int(nb[i][1])

nb.sort(key=lambda x:(x[1],x[0]))
op=[]
for i in range(m):
    op.append(nb[i][2])
print(''.join(op))