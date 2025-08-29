import sys
def input(): return sys.stdin.readline().rstrip()
ip=input()
sv,bl,ct='',False,0
for c in ip:
    ct+=5
    if sv!=c: ct+=5
    sv=c
print(ct)