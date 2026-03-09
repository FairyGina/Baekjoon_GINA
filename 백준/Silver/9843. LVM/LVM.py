import sys
def input(): return sys.stdin.readline().rstrip()

st=[]
orderlist=[]
r=0

for _ in range(int(input())):
    ip=input()
    orderlist.append(ip)

seq=0
while True:
    ip=orderlist[seq].split(' ')
    orderlist.append(ip)
    ord=ip[0]
    
    if ord=="PUSH":
        st.append(int(ip[1]))
    elif ord=="STORE":
        r=st.pop()
    elif ord=="LOAD":
        st.append(r)
    elif ord=="PLUS":
        tn=st.pop()
        st[-1]+=tn
    elif ord=="TIMES":
        tn=st.pop()
        st[-1]*=tn
    elif ord=="IFZERO":
        tn=st.pop()
        if tn==0:
            seq=int(ip[1])-1
    else:
        break
    seq+=1
            
print(st.pop())