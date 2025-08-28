import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
while True:
    ip=input()
    if ip=='0': break
    fac,pl,ct=1,1,0
    for i in range(len(ip)-1,-1,-1):
        fac*=pl
        pl+=1
        ct+=fac*int(ip[i])
    op.append(str(ct))
print('\n'.join(op))