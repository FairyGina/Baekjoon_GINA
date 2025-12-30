import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
rop=[]
for _ in range(n):
    rop.append(int(input()))
    
rop.sort(reverse=True)
maxct=0

for i in range(n-1,-1,-1):
    maxct=max(maxct,rop[i]*(i+1))

print(maxct)