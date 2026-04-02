import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for _ in range(int(input())):
    ap=input().split()
    op.append(ap[0])
    op.append('\n')
    
    lap=len(ap[0])
    for __ in range(int(ap[1])):
        ip=input().split()
        lip=len(ip)
        if lip!=lap: continue
        bl=True
        for i in range(lip):
            if ip[i][0]!=ap[0][i]:
                bl=False
                break
        
        if bl:
            op.append(' '.join(ip))
            op.append('\n')

print(''.join(op))