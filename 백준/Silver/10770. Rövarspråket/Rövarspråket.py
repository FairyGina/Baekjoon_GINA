import sys
def input(): return sys.stdin.readline().rstrip()
ap="abcdefghijklmnopqrstuvwxyz"
im=(0,4,8,14,20)
op=[]
for c in input():
    op.append(c)
    q=ord(c)-97
    if q in im: continue
    lf,rt=q-1,q+1
    while True:
        if lf in im:
            op.append(chr(lf+97))
            break
        if rt in im:
            op.append(chr(rt+97))
            break
        lf-=1
        rt+=1
    q=min(q+1,25)
    if q in im: q+=1
    op.append(chr(q+97))
print(''.join(op))