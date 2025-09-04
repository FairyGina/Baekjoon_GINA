import sys
def input(): return sys.stdin.readline().rstrip()
mo="aeiouAEIOU"
op=[]
for ip in sys.stdin:
    ip=list(ip.rstrip().split())
    o=[]
    for c in ip:
        if c[0] in mo: o.append(c)
    for idx,c in enumerate(ip):
        if c[0] in mo:
            ip[idx]=o.pop()
    op.append(' '.join(ip))
print('\n'.join(op))