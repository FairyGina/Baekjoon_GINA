import sys
def input(): return sys.stdin.readline().rstrip()
op=[]

n,k=map(int,input().split())
ip=list(map(int,input().split()))
cp=[[0]*3 for _ in range(n)]

for i in range(n):
    cp[i][0]=ip[i]
    cp[i][1]=i

cp.sort(key=lambda x: x[0], reverse=True)

lm=min(n,k)
for i in range(lm):
    idx=cp[i][1]+1
    op.append(str(idx))
    cp[i][2]=idx

for i in range(lm,k):
    op.append("0")

cp.sort(key=lambda x:x[1])
for i in cp:
    op.append(str(i[2]))

print('\n'.join(op))