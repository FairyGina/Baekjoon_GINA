import sys
def input(): return sys.stdin.readline().rstrip()

sv=0
ln=int(input())
nb=[]
num=0
for i in range(ln):
    nip=int(input())
    nb.append(nip)
    num+=(nip if i%2==0 else -nip)

sv=num//2
op=[]
op.append(str(sv))
for i in range(ln-1):
    tn=nb[i]-sv
    op.append(str(tn))
    sv=tn
print('\n'.join(op))