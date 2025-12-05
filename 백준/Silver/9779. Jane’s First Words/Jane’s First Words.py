import sys
def input(): return sys.stdin.readline().rstrip()
def f1(ip):
    if len(ip)<4: return False
    if ip[0]!='d': return False
    
    if ip[1]!='a': return False
    
    idx=1
    while idx<len(ip):
        idx+=1
        if ip[idx]!='a': break

    if idx==len(ip): return False
    if ip[idx]!='d': return False
    
    idx+=1
    if idx==len(ip): return False
    
    if ip[idx]=='d':
        if idx+1==len(ip): return False
        
        if ip[idx+1]=='i' or ip[idx+1]=='y':
            if idx+2==len(ip): return True
            else: return False
    elif ip[idx]=='i' or ip[idx]=='y':
        if idx+1==len(ip): return True
        else: return False
    return False
op=[]
for ip in sys.stdin:
    ip=ip.rstrip()
    if f1(ip): op.append("She called me!!!\n")
    else: op.append("Cooing\n")
    
print(''.join(op))