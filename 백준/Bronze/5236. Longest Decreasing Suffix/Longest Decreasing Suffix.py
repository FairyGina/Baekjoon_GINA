import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    ip=input()
    ans=""
    ln=len(ip)-1
    s1=[]
    while ln>=0:
        if ip[ln]<ip[ln-1]:
            s1.append(ip[ln])
        else:
            s1.append(ip[ln])
            break
        ln-=1
    op.append(f"The longest decreasing suffix of {ip} is {''.join(reversed(s1))}")

print('\n'.join(op))