import sys
def input(): return sys.stdin.readline().rstrip()

lm=10001
nb=[0]*lm
nb[0]=1

for i in range(1,lm):
    tn=nb[i-1]*i
    while tn%10==0:
        tn//=10
    nb[i]=tn

op=[]
while True:
    ip=input()
    if not ip: break
    ip=int(ip)
    ans=nb[ip]%10
    op.append(f"{ip:5} -> {ans}\n")
print(''.join(op))
