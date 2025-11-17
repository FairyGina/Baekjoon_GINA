import sys
def input(): return sys.stdin.readline().rstrip()
socks=[]
pants=[]
shirt=[]

op=[]
for _ in range(int(input())):
    socks.clear()
    pants.clear()
    shirt.clear()
    n=int(input())
    for __ in range(n):
        cl=input()
        
        if cl[-7:]=="(shirt)":
            shirt.append(cl[:-8])
        elif cl[-7:]=="(pants)":
            pants.append(cl[:-8])
        else:
            socks.append(cl[:-8])
    
    ln=min(len(socks),len(pants),len(shirt))
    for __ in range(ln):
        op.append(f"{shirt.pop()}, {pants.pop()}, {socks.pop()}\n")
    op.append('\n')
    
print(''.join(op))