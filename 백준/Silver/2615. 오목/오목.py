import sys
from collections import deque

def input(): return sys.stdin.readline().rstrip()
def om(r):
    if q.pop()==r: return False
    for _ in range(5):
        if q.pop()!=r: return False
    if q.pop()==r: return False
    return True

def qwer(r):
    global ar,ac
    for row in range(21):
        for col in range(15):
            for i in range(7):
                q.append(board[row][col+i])
            if om(r): return row,col+1
            
    for row in range(15):
        for col in range(21):
            for i in range(7):
                q.append(board[row+i][col])
            if om(r): return row+1,col
            
    for row in range(15):
        for col in range(15):
            for i in range(7):
                q.append(board[row+i][col+i])
            if om(r): return row+1,col+1
            
    for row in range(6,21):
        for col in range(15):
            for i in range(7):
                q.append(board[row-i][col+i])
            if om(r): return row-1,col+1
    
    return -1,-1

q=deque()
board=[[-1]+list(map(int,input().split(" ")))+[-1] for _ in range(19)]
board=[[-1]*21]+board+[[-1]*21]

a,b=qwer(1)
if a!=-1:
    print(f"1\n{a} {b}")
else:
    a,b=qwer(2)
    if a!=-1:
        print(f"2\n{a} {b}")
    else: print(0)