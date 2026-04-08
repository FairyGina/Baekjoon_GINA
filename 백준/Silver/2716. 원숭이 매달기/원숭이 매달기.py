import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
st=[]
for _ in range(int(input())):
    st.clear()
    maxct=0
    ip=input()
    for c in ip:
        if c=='[':
            st.append(c)
        else:
            maxct=max(maxct,len(st))
            st.pop()
    op.append((str(2**maxct)))
print('\n'.join(op))