import sys
def input(): return sys.stdin.readline().rstrip()

n,m,r=map(int,input().split())
nb=list([] for _ in range(n+1))
vt=[-1]*(n+1)
for i in range(m):
    a,b=map(int,input().split())
    nb[a].append(b)
    nb[b].append(a)
for i in range(n+1): nb[i].sort(reverse=True)

st=[]
st.append((r,0))
vt[r]
while st:
    tn,dt=st.pop()
    if vt[tn]<0:
        vt[tn]=dt
        for i in nb[tn]:
            st.append((i,dt+1))
print('\n'.join(map(str,vt[1:])))