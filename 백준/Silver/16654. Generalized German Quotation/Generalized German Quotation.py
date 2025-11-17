import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

def mkip(ip):
    mk=[]
    if len(ip)%2!=0: return "Keine Loesung"
    for i in range(0,len(ip),2):
        if ip[i]!=ip[i+1]: return "Keine Loesung"
        mk.append(ip[i])
    return ''.join(mk)

def mkans(ip):
    ip=mkip(ip)
    if ip[0]=='K': return ip
    
    dq1=deque()
    dq2=deque()
    op=[]
    
    for c in ip:
        if c=='<':
            if not dq2:
                dq1.append(c)
                op.append('[')
            else:
                dq2.pop()
                op.append(']')
        else:
            if not dq1:
                dq2.append(c)
                op.append('[')
            else:
                dq1.pop()
                op.append(']')
    
    if not dq1 and not dq2: return ''.join(op)
    else: return "Keine Loesung"

ip=input()
print(mkans(ip))