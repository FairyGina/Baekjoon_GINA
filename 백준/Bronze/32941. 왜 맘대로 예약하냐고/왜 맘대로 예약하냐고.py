import sys
def input(): return sys.stdin.readline().rstrip()

res='YES'
t,x=map(int,input().split())
k=int(input())
for i in range(k):
    n=int(input())
    info=list(map(int,input().split()))
    if x not in info:
        res='NO'
        break

print(res)