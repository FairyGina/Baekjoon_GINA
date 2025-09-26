import sys
def input(): return sys.stdin.readline().rstrip()
s20=('1','2','3','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20')
st=set()
for _ in range(int(input())):
    a=input()
    if ' ' in a: a,x=a.split()
    if a=='add': st.add(x)
    elif a=='remove': st.discard(x)
    elif a=='check':
        if x in st: print(1)
        else: print(0)
    elif a=='toggle':
        if x in st: st.remove(x)
        else: st.add(x)
    elif a=='all':
        st=set(s20)
    else: st.clear()