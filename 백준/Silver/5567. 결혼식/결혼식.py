import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
n=int(input())
nb=list([] for _ in range(n+1))
for _ in range(int(input())):
    a,b=map(int,input().split())
    nb[a].append(b)
    nb[b].append(a)
st=set()
for i in nb[1]:
    st.add(i)
    for j in nb[i]:
        st.add(j)
if 1 in st: st.remove(1)
print(len(st))