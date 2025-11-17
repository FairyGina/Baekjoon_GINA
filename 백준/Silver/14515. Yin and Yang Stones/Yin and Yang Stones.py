import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
dq=deque()
for c in input():
    dq.append(c)
    if len(dq)>2:
        arr=[dq[-3],dq[-2],dq[-1]]
        w=0
        b=0
        for c in arr:
            if c=='W': w+=1
            else: b+=1
        if w==0 or b==0: continue
        else:
            for _ in range(3):
                dq.pop()
            if w==2: dq.append('W')
            else: dq.append('B')
bl=False
if len(dq)==2 and dq[0]!=dq[1]: bl=True
print(1 if bl else 0)