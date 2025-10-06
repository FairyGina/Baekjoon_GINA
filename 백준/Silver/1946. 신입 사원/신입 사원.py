import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    n=int(input())
    mb=[tuple(map(int,input().split())) for _ in range(n)]
    mb.sort()
    
    minnb=mb[0][1]
    ct=1
    for r,c in mb[1:]:
        if c<minnb:
            ct+=1
            minnb=c
    
    op.append(str(ct))
    
print('\n'.join(op))