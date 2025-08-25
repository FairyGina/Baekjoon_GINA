import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
ti=int(input())+1
for t in range(1,ti):
    ip=input()
    lt=len(ip)
    
    bct=0
    for i in ip:
        if i=='B':
            bct+=1
    
    lf,rt=map(int,input().split())
    le,re=lf//lt*lt,rt//lt*lt
    if lf%lt!=0: le+=lt
    ct=(re-le)//lt*bct
    
    for i in range(lf-1,le-1):
        if ip[i%lt]=='B':
            ct+=1
    for i in range(re-1,rt):
        if ip[i%lt]=='B':
            ct+=1
    op.append(f"Case #{t}: {ct}")
print('\n'.join(op))