import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

n=int(input())
mx=0
for _ in range(n):
    sq=list(map(int,input().split()))
    ct=0
    st={}
    for i in sq:
        if i in st: st[i]+=1
        else: st[i]=1
    
    st=list(sorted(st.items(),key=lambda x:(-x[1],-x[0])))
    if st[0][1]==4:
        ct+=st[0][0]*5000+50000
    elif st[0][1]==3:
        ct+=st[0][0]*1000+10000
    elif st[0][1]==2:
        if st[1][1]==2:
            ct+=st[0][0]*500+st[1][0]*500+2000
        else: ct+=st[0][0]*100+1000
    else:
        ct+=st[0][0]*100
        
    mx=max(mx,ct)

print(mx)