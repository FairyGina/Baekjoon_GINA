import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    ln=int(input())
    score=list(map(int,input().split()))
    score.sort()
    num,mxc,mnc=0,-1,101
    for i in score:
        num+=i
        mxc=max(mxc,i)
        mnc=min(mnc,i)
    r1=(mxc+mnc)/2
    r2=num/ln
    if abs(r1-r2)<1: op.append('Yes')
    else: op.append('No')
print('\n'.join(op))