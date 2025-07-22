import sys
n=int(sys.stdin.readline().rstrip())
nb=['']*n
for i in range(n):
    nb[i]=sys.stdin.readline().rstrip()
r=0
for i in range(n):
    t=sys.stdin.readline().rstrip()
    if t==nb[i]: r+=1
print(r) 