import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
ct=[0]*10001
while True:
    n,m=map(int,input().split())
    if n+m==0: break
    ct[:]=[0]*10001
    for i in range(n):
        for j in map(int,input().split()):
            ct[j]+=1
    cm=max(ct)
    ct[ct.index(cm)]=0
    cm=max(ct)
    for i in range(10001):
        if ct[i]==cm:
            op.append(f"{str(i)} ")
    op.append('\n')
print(''.join(op))