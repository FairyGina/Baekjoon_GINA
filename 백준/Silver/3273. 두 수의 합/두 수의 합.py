import sys
def input(): return sys.stdin.readline().rstrip()
lt=int(input())
nb=map(int,input().split())
ct=0
st=set()
x=int(input())
for n in nb:
    tn=x-n
    if tn in st:
        ct+=1
    st.add(n)
print(ct)