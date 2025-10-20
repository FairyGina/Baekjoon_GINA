import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
narr=[]
narr.append(1)
dq1,dq2=deque(),deque()
dq1.append(1)
lm=int(1e20)
while dq1:
    while dq1:
        tn=dq1.popleft()
        if tn//lm!=0: continue
        
        tn*=10
        narr.append(tn)
        narr.append(tn+1)
        dq2.append(tn)
        dq2.append(tn+1)
    
    dq1=deque(dq2)
    dq2=deque()

op=[]
for _ in range(int(input())):
    n=int(input())
    for tn in narr:
        if tn%n==0:
            op.append(tn)
            break
print('\n'.join(map(str,op)))