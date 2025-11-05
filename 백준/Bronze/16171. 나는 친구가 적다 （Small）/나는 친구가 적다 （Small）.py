import sys
def input(): return sys.stdin.readline().rstrip()

ip=input()
mk=[]
for c in ip:
    if '0'<=c<='9': continue
    mk.append(c)
mk=''.join(mk)

ip=input()
if mk.find(ip)>-1: print(1)
else: print(0)