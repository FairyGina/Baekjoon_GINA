import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    ip=input()
    gct,bct=0,0
    for c in ip:
        if c=='g'or c=='G': gct+=1
        elif c=='b'or c=='B': bct+=1
    if gct<bct: op.append(f"{ip} is A BADDY\n")
    elif gct>bct: op.append(f"{ip} is GOOD\n")
    else: op.append(f"{ip} is NEUTRAL\n")

print(''.join(op))