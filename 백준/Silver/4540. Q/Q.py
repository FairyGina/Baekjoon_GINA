import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    m,n=map(int,input().split())
    ip=input().split()
    mk=['']*len(ip)
    st=set()
    for i in range(n):
        a,b=map(lambda x: int(x)-1,input().split())
        mk[b]=ip[a]
        st.add(ip[a])

    idx=0
    for c in ip:
        if c not in st:
            if idx>=len(ip): mk.append(c)
            while idx<len(ip):
                if not mk[idx]:
                    mk[idx]=c
                    break
                idx+=1
        
    op.append(' '.join(mk))

print('\n'.join(op))