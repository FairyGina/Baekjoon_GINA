from collections import deque

import sys
def input(): return sys.stdin.readline().rstrip()

n,m=map(int,input().split())
score=list(map(int,input().split()))

ans=0
zero=1

dic={}
for i in range(n):
    dic[i]=score[i]

dic=sorted(dic.items(),key=lambda x:x[1],reverse=True)
dq=deque(dic)

for i in range(m):
    if not dq: break
    x,y=dq[0]
    if y>0:
        ans+=y
        dq.popleft()
    else:
        dq.pop()
    
    if not dq: break
    x,y=dq[-1]
    dq.pop()

print(ans)