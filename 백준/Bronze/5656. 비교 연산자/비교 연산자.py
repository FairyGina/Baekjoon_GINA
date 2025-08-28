import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
t=0
while True:
    t+=1
    ip=input().split()
    if ip[1]=="E": break
    mk=f"Case {t}: "
    if ip[1]=='>': 
        if int(ip[0])>int(ip[2]): mk+="true"
        else: mk+="false"
    elif ip[1]=='>=': 
        if int(ip[0])>=int(ip[2]): mk+="true"
        else: mk+="false"
    elif ip[1]=='<': 
        if int(ip[0])<int(ip[2]): mk+="true"
        else: mk+="false"
    elif ip[1]=='<=': 
        if int(ip[0])<=int(ip[2]): mk+="true"
        else: mk+="false"
    elif ip[1]=='==': 
        if int(ip[0])==int(ip[2]): mk+="true"
        else: mk+="false"
    else: 
        if int(ip[0])!=int(ip[2]): mk+="true"
        else: mk+="false"
    op.append(mk)
print('\n'.join(op))