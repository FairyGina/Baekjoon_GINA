import sys
def input(): return sys.stdin.readline().rstrip()
n=int(input())
rp=[n//2,-(n//2)-1]

sv,idx=n//2,0
op=[]
op.append(sv)
for _ in range(n-1):
    sv+=rp[idx]
    idx=(idx+1)%2
    op.append(sv)

if n%2!=0:
    op[n-1]=n

print(' '.join(map(str,op)))