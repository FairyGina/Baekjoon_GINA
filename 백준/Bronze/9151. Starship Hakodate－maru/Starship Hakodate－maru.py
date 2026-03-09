import sys
def input(): return sys.stdin.readline().rstrip()
n=-1
nb1,nb2=[],[]

while True:
    n+=1
    tn=n*n*n
    if tn>151200: break
    nb1.append(tn)

n=-1
while True:
    n+=1
    tn=n*(n+1)*(n+2)//6
    if tn>151200: break
    nb2.append(tn)

op=[]
while True:
    ip=int(input())
    if ip==0: break
    
    maxct=0
    for i in range(len(nb1)):
        sv=0
        for j in range(len(nb2)):
            tn=nb1[i]+nb2[j]
            if tn>ip:
                break
            else: sv=tn
        maxct=max(maxct,sv)
    op.append(str(maxct))

print('\n'.join(op))