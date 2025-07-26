import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
n=int(input())
m=[0]*(n+2)
for i in range(1,n+1): m[i]=int(input())
for i in range(1,n+1):
    if m[i-1]<=m[i]>=m[i+1]:
        op.append(str(i))
print('\n'.join(op))