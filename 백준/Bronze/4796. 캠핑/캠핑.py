import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
ti=0
while True:
    ti+=1
    p,l,v=map(int,input().split())
    if p==0: break
    ct=v//l*p + min(p,v%l)

    op.append(f"Case {ti}: {ct}\n")

print(''.join(op))