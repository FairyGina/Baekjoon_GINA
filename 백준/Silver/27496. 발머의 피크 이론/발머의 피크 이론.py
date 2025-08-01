import sys

def input(): return sys.stdin.readline().rstrip()

n,l=map(int,input().split())
alc=list(map(int,input().split(" ")))
num=[0]*(n+1)

for i in range(n):
    num[i+1]=num[i]+alc[i]

ct=0
for i in range(l):
    if 129<=num[i]<=138: ct+=1
    
for i in range(l,n+1):
    if 129<=(num[i]-num[i-l])<=138: ct+=1

print(ct)