import sys
def input(): return sys.stdin.readline().rstrip()
def find():
    for i in range(2,int(318138**0.5)):
        if bl[i]:
            for j in range(i*i,318138,i):
                bl[j]=False
op,pnb=[],[]
bl=[True]*318138
bl[0]=False
find()
idx=0
for i in range(0,318138):
    if bl[i]:
        if bl[idx]: pnb.append(i)
        idx+=1
for _ in range(int(input())):
    op.append(str(pnb[int(input())]))
print('\n'.join(op))