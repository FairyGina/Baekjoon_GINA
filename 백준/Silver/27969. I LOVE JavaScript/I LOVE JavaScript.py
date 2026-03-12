import sys
def input(): return sys.stdin.readline().rstrip()
ip=list(input().split())
ans=0

save=[]
top=-1

st1,st2=[],[]
for i in range(len(ip)):
    if ip[i]=='[':
        save.append([])
        top+=1
        
    elif ip[i]==']':
        top-=1
        
        tn=save.pop()
        ct1,ct2=0,0
        for t in tn:
            if '0'<=t[0]<='9':
                ct1+=8
            else:
                ct2+=len(t)+12
        ans+=ct1+ct2+8
        
    else:
        save[top].append(ip[i])
    
print(ans)