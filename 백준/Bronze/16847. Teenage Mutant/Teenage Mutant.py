import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for ti in range(1,int(input())+1):
    n,k=map(int,input().split())
    ip=input()
    vt=[1]*k
    for j in range(n):
        tip=input()
        for idx,tn in enumerate(tip):
            if ip[idx]==tn:
                vt[idx]=0
    
    op.append(f"Data Set {ti}:\n{sum(vt)}/{k}\n\n")

print(''.join(op))