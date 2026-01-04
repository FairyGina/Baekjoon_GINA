import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
ip=input()
for c in ip:
    tc=chr((ord(c)-65+23)%26+65)
    op.append(tc)
print(''.join(op))