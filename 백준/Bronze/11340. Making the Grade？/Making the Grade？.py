import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    a,b,c=map(int,input().split())
    tp=9000-(15*a+20*b+25*c)
    if tp%40==0: tp//=40
    else: tp=tp//40+1
    if tp>100: tp='impossible'
    op.append(str(tp))

print('\n'.join(op))