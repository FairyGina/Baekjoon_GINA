import sys
def input(): return sys.stdin.readline().rstrip()
a,b,c=map(int,input().split())
money=[0,a,b,c]
nb=[0]*101

for _ in range(3):
    q,w=map(int,input().split())
    for i in range(q,w):
        nb[i]+=1

ans=0
for i in range(101):
    ans+=nb[i]*money[nb[i]]
print(ans)