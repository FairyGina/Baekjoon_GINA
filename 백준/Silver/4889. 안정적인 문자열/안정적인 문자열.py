import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
t=0
while True:
    ip=input()
    if ip[0]=='-': break
    t+=1
    ct,st=0,[]
    for c in ip:
        if c=='{': st.append(c)
        else:
            if not st:
                ct+=1
                st.append(c)
            else: st.pop()
    if st:
        ct+=len(st)//2
    op.append(f"{t}. {ct}")
print('\n'.join(op))