import sys
def input(): return sys.stdin.readline().rstrip()
cho,n=int(input()),int(input())
a1,a2=list(map(int,input().split())),list(map(int,input().split()))
a1.sort()
if cho==1: a2.sort()
else: a2.sort(reverse=True)
num=0
for i in range(n):
    num+=max(a1[i],a2[i])
    
print(num)