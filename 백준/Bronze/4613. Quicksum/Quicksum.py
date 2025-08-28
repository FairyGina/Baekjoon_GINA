import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
while True:
    ip=input()
    if ip=='#': break
    idx=0
    num=0
    for c in ip:
        idx+=1
        if c==' ': continue
        num+=idx*(ord(c)-64)
    op.append(str(num))
print('\n'.join(op))