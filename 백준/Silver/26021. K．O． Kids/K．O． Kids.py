import sys
def input(): return sys.stdin.readline().rstrip()
ln,n=map(int,input().split())
ip=input()

ch=['L','R']

idx,cur=0,0
po=ch[cur]
while idx<ln:
    if ip[idx]!=po:
        cur+=1
        n-=1
    cur=(cur+1)%2
    po=ch[cur]
    idx+=1
        
print(max(n,0))