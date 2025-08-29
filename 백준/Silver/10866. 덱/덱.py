import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
op=[]
dq=deque()
for _ in range(int(input())):
    ip=input().split()
    tn=-1
    if ip[0]=="push_front":
        dq.appendleft(int(ip[1]))
        continue
    elif ip[0]=="push_back":
        dq.append(int(ip[1]))
        continue
    elif ip[0]=="pop_front":
        if dq: tn=dq.popleft()
    elif ip[0]=="pop_back":
        if dq: tn=dq.pop()
    elif ip[0]=="size":
        tn=len(dq)
    elif ip[0]=="empty":
        tn=0 if dq else 1
    elif ip[0]=="front":
        if dq: tn=dq[0]
    elif dq: tn=dq[len(dq)-1]
    op.append(tn)
print('\n'.join(map(str,op)))