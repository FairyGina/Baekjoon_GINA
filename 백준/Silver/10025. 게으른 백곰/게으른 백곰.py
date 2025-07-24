import sys
def input(): return sys.stdin.readline().rstrip()
n,k=map(int,input().split())
k=k*2
lm=int(1e6)+1
nb=[0]*lm

mxi,mni=0,lm
for i in range(n):
    g,id=map(int,input().split())
    nb[id]=g
    if mxi<id: mxi=id
    if mni>id: mni=id

if mni+k>=lm: n=-1
else:
    num=sum(nb[mni:mni+k+1])
    n=num

for i in range(mni+k+1,mxi+1):
    num=num-nb[i-k-1]+nb[i]
    if num>n: n=num

if n==-1: n=sum(nb[mni:mxi+1])
print(n)