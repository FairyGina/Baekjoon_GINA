import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
nb=list(map(int,input().split()))
p=int(input())

ct=0
for i in nb:
    ct+=i//p+(0 if i%p==0 else 1)

print(p*ct)