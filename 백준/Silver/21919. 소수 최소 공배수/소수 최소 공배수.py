import sys
def input(): return sys.stdin.readline().rstrip()

def ps(n):
    if n==1:
        return False
    if n==2 or n==3: return True
    for i in range(2,int(n**0.5)+1):
        if n%i*i==0: return False
    return True


ln=int(input())
nb=list(map(int,input().split()))

st=set()
ans=1
for n in nb:
    if n in st: continue
    st.add(n)
    if ps(n):
        ans*=n

if ans==1: ans-=2
print(ans)