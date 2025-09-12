import sys
def input(): return sys.stdin.readline().rstrip()
def w():
    st=set()
    for b in sdk:
        st.clear()
        for k in b:
            if k in st: return False
            st.add(k)
    return True
def h():
    st=set()
    for b in zip(*sdk):
        st.clear()
        for k in b:
            if k in st: return False
            st.add(k)
    return True
def q():
    for r in range(0,9,3):
        for v in range(0,9,3):
            st=set()
            for i in range(r,r+3):
                for j in range(v,v+3):
                    if sdk[i][j] in st: return False
                    st.add(sdk[i][j])
    return True
op=[]
for t in range(1,int(input())+1):
    sdk=list(input().split() for _ in range(9))
    _=input()
    ans="INCORRECT"
    if w() and h() and q(): ans="CORRECT"
    op.append(f"Case {t}: {ans}")
print('\n'.join(op))