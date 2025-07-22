import sys

n=int(sys.stdin.readline().rstrip())
a,b=map(int,sys.stdin.readline().rstrip().split())
c=int(sys.stdin.readline().rstrip())

pz=[0]*n
for i in range(n):
    pz[i]=int(sys.stdin.readline().rstrip())

num=[0]*(n+1)
pz.sort(reverse=True)
for i in range(n):
    num[i+1]+=pz[i]+num[i]

mx=0
n+=1
for i in range(n):
    td=(c+num[i])//a
    if td>mx: mx=td
    a+=b
    
print(mx)