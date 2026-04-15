import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
dic={}

for _ in range(n):
    ip=input()
    if ip not in dic:
        dic[ip]=1
    else: dic[ip]+=1

maxct=0
for k,v in dic.items():
    maxct=max(maxct,v)
    
print(maxct)