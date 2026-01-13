import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
set1,set2=set(map(int,input().split())),set(map(int,input().split()))

for j in set2:
    if j in set1:
        set1.remove(j)
    
ans=list(set1)
ans.sort()
print(len(ans))
print(' '.join(map(str,ans)))