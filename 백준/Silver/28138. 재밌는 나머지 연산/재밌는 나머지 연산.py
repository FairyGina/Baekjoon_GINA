import sys
def input(): return sys.stdin.readline().rstrip()

n,r=map(int,input().split())
x=n-r
nb=[]
for i in range(1,int(x**0.5)+1):
    if x%i==0:
        nb.append(i)
        nb.append(x//i)

if nb[-1]==nb[-2]: nb.pop()
nb.sort()
idx=len(nb)
for i in range(len(nb)):
    if nb[i]>r:
        idx=i
        break
    
ans=0
for i in range(idx,len(nb)):
    ans+=nb[i]

print(ans)