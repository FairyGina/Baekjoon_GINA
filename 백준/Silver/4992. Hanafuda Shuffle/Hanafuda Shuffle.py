import sys
def input(): return sys.stdin.readline().rstrip()
nb=list(i for i in range(1,51))
nb.reverse()

op=[]
while True:
    n,r=map(int,input().split())
    if n==0: break
    card=nb[50-n:51]
    for _ in range(r):
        a,b=map(int,input().split())
        tc1=card[0:a-1]
        tc2=card[a-1:a+b-1]
        tc3=card[a+b-1:n]
        card=tc2+tc1+tc3
    op.append(str(card[0]))
print('\n'.join(op))