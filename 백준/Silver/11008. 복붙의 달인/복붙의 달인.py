import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    ip,c=input().split()
    sv,ct,lt=0,0,len(c)
    while True:
        idx=ip.find(c,sv)
        if idx<0:
            ct+=len(ip)-sv
            break
        else: ct+=idx-sv+1
        sv=idx+lt
    op.append(str(ct))
print('\n'.join(op))