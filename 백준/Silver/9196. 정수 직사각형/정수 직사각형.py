import sys
def input(): return sys.stdin.readline().rstrip()
square=[[] for _ in range(20001)]
fdindex=[]

idx=-1
for i in range(1,151):
    for j in range(i+1,151):
        tp=i*i+j*j
        if tp not in fdindex:
            fdindex.append(tp)

fdindex.sort()

for i in range(1,151):
    for j in range(i+1,151):
        tp=i*i+j*j
        fd=fdindex.index(tp)
        square[fd].append((i,j))
    
for i in square:
    i.sort()
op=[]
while True:
    a,b=map(int,input().split())
    if a==0: break
    
    tn=a*a+b*b
    fd=fdindex.index(tn)
    ln=len(square[fd])
    
    for p in range(ln):
        if square[fd][p][0]==a:
            tp=p
            if tp+1==ln:
                fd+=1
                tp=0
            else: tp+=1
            op.append(f"{square[fd][tp][0]} {square[fd][tp][1]}")

print('\n'.join(op))