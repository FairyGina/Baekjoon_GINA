import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
ip=input()
ln=len(ip)

for _ in range(n-1):
    tip=input()
    mk=[]
    for i in range(ln):
        if ip[i]!=tip[i]:
            mk.append('?')
        else: mk.append(ip[i])
    ip=''.join(mk)

print(''.join(ip))