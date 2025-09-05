import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
def pan(s):
    bl=False
    for c in s:
        if c=='R': bl=not bl
        else:
            if not dq:
                return "error"
            if bl: dq.pop()
            else: dq.popleft()
    
    if bl: dq.reverse()
    return '['+','.join(dq)+']'
op=[]
for _ in range(int(input())):
    s=input()
    lt=int(input())
    nb=input()
    if lt==0:
        dq=deque()
    else: dq=deque(nb[1:len(nb)-1].split(','))
    op.append(pan(s))
print('\n'.join(op))