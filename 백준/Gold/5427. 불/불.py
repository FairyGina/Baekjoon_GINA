from collections import deque

import sys
def input(): return sys.stdin.readline().rstrip()

mv=[(-1,0),(1,0),(0,-1),(0,1)]

dq=deque()
save=deque()
fire=deque()

def bfs():
    m,n=map(int,input().split())
    board=[list(input()) for _ in range(n)]
    sec=0
    
    dq.clear()
    save.clear()
    fire.clear()
    for i in range(n):
        for j in range(m):
            if board[i][j]=='*':
                fire.append((i,j))
            elif board[i][j]=='@':
                dq.append((i,j))
    while dq:
        sec+=1
        
        while dq:
            y,x=dq.popleft()
            if board[y][x]=='*': continue
            
            for my,mx in mv:
                ty,tx=y+my,x+mx
                if 0>ty or ty>=n or 0>tx or tx>=m:
                    return str(sec)
                
                if board[ty][tx]=='.':
                    board[ty][tx]='q'
                    save.append((ty,tx))

        while save:
            dq.append(save.pop())
        
        while fire:
            y,x=fire.popleft()
            for my,mx in mv:
                ty,tx=y+my,x+mx
                if 0<=ty<n and 0<=tx<m and (board[ty][tx]=='q' or board[ty][tx]=='.'):
                    board[ty][tx]='*'
                    save.append((ty,tx))
        
        while save:
            fire.append(save.pop())
            
    return "IMPOSSIBLE"

op=[]
for _ in range(int(input())):
    op.append(bfs())

print('\n'.join(op))