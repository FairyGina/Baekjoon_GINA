import sys
def input(): return sys.stdin.readline().rstrip()
def bs():
    l,r=0,1000000001
    while l<=r:
        m=(l+r)//2
        cn=n*m
        if cn<k:
            l=m+1
        elif cn>k:
            r=m-1
        else: return m
    return r

n,k=map(int,input().split())
nb,num=[0]*n,[0]*(n+1)

for i in range(n):
    nb[i]=int(input())
    
nb.sort()
   
for i in range(n):
    num[i+1]+=num[i]+nb[i]
    
bl=True
for i in range(n):
    if k<nb[i]*i-num[i]:
        k+=num[i]
        n=i
        bl=False
        break

if bl: k+=num[n]
print(bs())