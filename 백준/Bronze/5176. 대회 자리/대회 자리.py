import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    p,m=map(int,input().split())
    st,ct=[False]*(m+1),0
    for i in range(p):
        n=int(input())
        if st[n]: ct+=1
        else: st[n]=True
    op.append(str(ct))
print('\n'.join(op))