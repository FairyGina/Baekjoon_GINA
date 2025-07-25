import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
n=int(input())
mine=[int(input()) for _ in range(n)]

sv,id,mid=0,0,0
bl=False

while id<n:
    if not bl:
        if sv==mine[id]:
            op.append(str(id))
            id-=1
            mine[id]=0
        elif sv>mine[id]:
            op.append(str(id))
            bl=True
    elif bl:
        if sv<=mine[id]:
            bl=False
    sv=mine[id]
    id+=1

if not bl: op.append(str(n))
print('\n'.join(op))