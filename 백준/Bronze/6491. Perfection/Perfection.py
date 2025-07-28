import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
data=list((map(int,sys.stdin.read().split())))
for d in data:
    if d==0: break
    op.append(f"{str(d)} ")
    if d==1:
        op.append("DEFICIENT\n")
        continue
    r=1
    i=2
    while i*i<=d:
        if d%i==0:
            r+=(d/i)
            r+=i
        i+=1
        
    if r<d:
        op.append("DEFICIENT\n")
    elif r>d:
        op.append("ABUNDANT\n")
    else:
        op.append("PERFECT\n")
print(''.join(op))