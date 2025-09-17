import sys
def input(): return sys.stdin.readline().rstrip()
n,m,r=map(int,input().split())
nb=list([] for _ in range(n+1))
vt=[0]*(n+1)
for i in range(m):
    a,b=map(int,input().split())
    nb[a].append(b)
    nb[b].append(a)
for i in range(n): nb[i].sort()
ct=0 
st=[]
st.append(r)
while st:
    tn=st.pop()
    if vt[tn]<1:
        ct+=1
        vt[tn]=ct
        for i in nb[tn]:
            st.append(i)
print('\n'.join(map(str,vt[1:])))