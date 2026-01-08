import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    nb=[0]*1001
    for _ in range(int(input())):
        nb[int(input())]+=1
    
    maxct,maxid=0,-1
    for i in range(1001):
        if maxct<nb[i]:
            maxct=nb[i]
            maxid=i
    
    op.append(str(maxid))

print('\n'.join(op))