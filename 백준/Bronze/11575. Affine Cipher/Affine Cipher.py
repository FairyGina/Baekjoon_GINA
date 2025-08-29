import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    cm=[]
    a,b=map(int,input().split())
    b-=65
    ip=input()
    for c in ip:
        cm.append(chr((a*ord(c)+b)%26+65))
    op.append(''.join(cm))
print('\n'.join(op))