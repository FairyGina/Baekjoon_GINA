import sys
import bisect
def input(): return sys.stdin.readline().rstrip()
op=[]
n,m=map(int,input().split())
arr,lab=[],[]
for _ in range(n):
    name,at=input().split()
    lab.append(name)
    arr.append(int(at))
for _ in range(m):
    idx=bisect.bisect_left(arr,int(input()))
    op.append(lab[idx])
print('\n'.join(op))