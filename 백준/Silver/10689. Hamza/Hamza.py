import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for ti in range(1,int(input())+1):
    ln=int(input())
    nb=list(map(int,input().split()))
    d={}
    
    last=-1
    idx=-1
    for n in nb:
        idx+=1
        if n not in d:
            d[n]=idx
            last=n
    
    maxct=d[last]+1
    op.append(f"Case {ti}: {maxct}\n")

print(''.join(op))