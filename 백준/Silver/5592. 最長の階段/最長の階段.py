from collections import deque
import sys
def input(): return sys.stdin.readline().rstrip()

n,q=map(int,input().split())
nb=[]

zct=0
for _ in range(q):
    tn=int(input())
    if tn==0: zct+=1
    else: nb.append(tn)

nb.sort()
nb.append(n+2)

arr=deque()
idx=0

maxct=0
for i in range(1,n+1):
    if i!=nb[idx]:
        if zct:
            zct-=1
            arr.append(0)
        else:
            maxct=max(maxct,len(arr))
            while arr:
                tn=arr.popleft()
                if tn==0:
                    arr.append(0)
                    break
    else:
        idx+=1
        arr.append(i)

maxct=max(maxct,len(arr))
print(maxct)