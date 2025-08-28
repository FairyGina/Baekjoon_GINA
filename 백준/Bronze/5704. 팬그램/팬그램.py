import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
pn=set(chr(i) for i in range(97,123))
while True:
    ip=set(input())
    if ip=={'*'}: break
    if ' ' in ip: ip.remove(' ')
    if ip==pn: op.append('Y')
    else: op.append('N')
print('\n'.join(op))