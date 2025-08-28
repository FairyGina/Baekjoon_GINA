import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
t=0
while True:
    t+=1
    ip=input().split()
    a,b=int(ip[0]),int(ip[2])
    if ip[1]=="E": break
    mk=f"Case {t}: "
    if ip[1]=='>':
        bl=a>b
    elif ip[1]=='>=':
        bl=a>=b
    elif ip[1]=='<':
        bl=a<b
    elif ip[1]=='<=':
        bl=a<=b
    elif ip[1]=='==':
        bl=a==b
    else:
        bl=a!=b
    if bl==True:
        mk+="true"
    else: mk+="false"
    op.append(mk)
print('\n'.join(op))