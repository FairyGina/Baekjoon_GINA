import sys
op=[]
for ip in sys.stdin:
    if not ip: break
    ct,nb=[0]*4,[0]*124
    for c in ip:
        nb[ord(c)]+=1
    ct[0]=sum(nb[97:123])
    ct[1]=sum(nb[65:91])
    ct[2]=sum(nb[48:59])
    ct[3]=nb[32]
    op.append(' '.join(map(str,ct)))
print('\n'.join(op))