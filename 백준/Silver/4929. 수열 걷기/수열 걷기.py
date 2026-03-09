import sys
def input(): return sys.stdin.readline().rstrip()

op=[]

while True:
    ip=input()
    if ip=='0': break
    
    nb=list(map(int,ip.split(' ')))
    ln1=int(nb[0])
    nb1=list(map(int,nb[1:]))
    
    ip=input()
    nb=list(map(int,ip.split(' ')))
    ln2=int(nb[0])
    nb2=list(map(int,nb[1:]))
    
    mln=max(ln1,ln2)
    
    map1,map2={},{}
    num1,num2=[0]*(ln1+1),[0]*(ln2+1)
    
    for i in range(ln1):
        map1[nb1[i]]=i
        num1[i+1]=num1[i]+nb1[i]
    for i in range(ln2):
        map2[nb2[i]]=i
        num2[i+1]=num2[i]+nb2[i]
    
    ans=0
    sv1,sv2=0,0
    for i in map1:
        if i in map2:
            idx1,idx2=map1[i],map2[i]
            ans+=max(num1[map1[i]+1]-num1[sv1],num2[map2[i]+1]-num2[sv2])
            
            sv1,sv2=map1[i]+1,map2[i]+1
            
    ans+=max(num1[ln1]-num1[sv1],num2[ln2]-num2[sv2])
    
    op.append(str(ans))
print('\n'.join(op))