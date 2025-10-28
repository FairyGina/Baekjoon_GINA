import sys
def input(): return sys.stdin.readline()

op=[]
for _ in range(int(input())):
    c={}
    for _ in range(int(input())):
        a,b=input().split()
        if b not in c: c[b]=1
        else: c[b]+=1
    
    res=1
    for i in c:
        res*=(c[i]+1)
    op.append(str(res-1))

print('\n'.join(op))