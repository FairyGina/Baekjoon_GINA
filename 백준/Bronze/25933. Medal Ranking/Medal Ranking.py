import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    for i in range(3):
        if ip1[i]>ip2[i]: return True
        elif ip1[i]<ip2[i]: return False
def f2():
    s1,s2=sum(ip1),sum(ip2)
    if s1>s2: return True
    return False

op=[]
for _ in range(int(input())):
    ip=list(map(int,input().split()))
    ip1,ip2=ip[:3],ip[3:]
    bl1,bl2=f1(),f2()
    ans="none"
    if bl1:
        if bl2:
            ans="both"
        else: ans="color"
    elif bl2: ans="count"
    op.append(f"{' '.join(map(str,ip))}\n{ans}\n\n")
print(''.join(op))