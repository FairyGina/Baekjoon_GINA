import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
dq=deque()
board=list(input() for _ in range(6))
sv,ct1,ct2=-1,0,0
for i in range(0,6,2):
    ap=[0]*26
    for c in board[i]: ap[ord(c)-65]+=1
    for c in board[i+1]: ap[ord(c)-65]+=1
    color=ap.index(max(ap))
    if color==sv:
        ap[color]=0
        sv=-1
    else: sv=color
    ct1+=18-max(ap)
sv=-1
for c in zip(*board):
    dq.append(c)
for _ in range(3):
    ap=[0]*26
    for c in dq.popleft(): ap[ord(c)-65]+=1
    for c in dq.popleft(): ap[ord(c)-65]+=1
    for c in dq.popleft(): ap[ord(c)-65]+=1
    color=ap.index(max(ap))
    if color==sv:
        ap[color]=0
        sv=-1
    else: sv=color
    ct2+=18-max(ap)
    sv=ap.index(max(ap))
print(min(ct1,ct2))