import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
y,x=[],[]
for _ in range(int(input())):
    y.clear()
    x.clear()
    for __ in range(4):
        a,b=map(int,input().split())
        x.append(a)
        y.append(b)
    sq=set()
    for i in range(3):
        for j in range(i+1,4):
            sq.add((y[i]-y[j])**2+(x[i]-x[j])**2)
    sq=list(sq)
    if len(sq)!=2:
        op.append('0')
        continue
    ll,sl=max(sq[0],sq[1]),min(sq[0],sq[1])
    if ll==2*sl: op.append('1')
    else: op.append('0')
print('\n'.join(op))