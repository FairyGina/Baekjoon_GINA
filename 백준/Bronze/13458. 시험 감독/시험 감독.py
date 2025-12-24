import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
nb=list(map(int,input().split()))
b,c=map(int,input().split())

bl=True
if b<=c: bl=False

ct=0
for i in nb:
    i-=b
    ct+=1
    if i<=0: continue
    ct+=i//c
    ct+=0 if i%c==0 else 1

print(ct)