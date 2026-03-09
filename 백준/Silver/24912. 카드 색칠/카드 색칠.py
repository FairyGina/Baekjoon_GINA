import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
card=list(map(int,input().split()))

st=set()
if n==1:
    card=[1]
if n>1 and card[0]==0:
    st.add(card[1])
    for j in range(1,4):
        if j not in st:
            card[0]=j
            break

for i in range(1,n-1):
    if card[i]==0:
        st.clear()
        st.add(card[i-1])
        st.add(card[i+1])
        for j in range(1,4):
            if j not in st:
                card[i]=j
                break

st.clear()
if n>1 and card[-1]==0:
    st.add(card[-2])
    for j in range(1,4):
        if j not in st:
            card[-1]=j
            break
        
for i in range(n-1):
    if card[i]==card[i+1]:
        card=[-1]
        break
    
print(' '.join(map(str,card)))