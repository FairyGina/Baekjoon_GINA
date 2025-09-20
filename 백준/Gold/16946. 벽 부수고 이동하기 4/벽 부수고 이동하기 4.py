import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()

mv=((-1,0),(1,0),(0,-1),(0,1))
n,m=map(int,input().split())
board=list(list(map(int,input())) for _ in range(n))
score=[[[0]*m for _ in range(n)] for _1 in range(2)]

dq,nq=deque(),[]
ct=0
for r in range(n):
    for c in range(m):
        if not board[r][c] and not score[0][r][c]:
            ct+=1
            dq.append((r,c))
            nq.append((r,c))
            dt=0
            while dq:
                y,x=dq.popleft()
                for my,mx in mv:
                    ty,tx=y+my,x+mx
                    if 0<=ty<n and 0<=tx<m and not board[ty][tx] and not score[0][ty][tx]:
                        dt+=1
                        score[0][ty][tx]=1
                        dq.append((ty,tx))
                        nq.append((ty,tx))
            
            while nq:
                y,x=nq.pop()
                score[0][y][x]=max(dt,1)
                score[1][y][x]=ct

st=set()
for r in range(n):
    for c in range(m):
        if board[r][c]:
            st.clear()
            ct=1
            for my,mx in mv:
                ty,tx=r+my,c+mx
                if 0<=ty<n and 0<=tx<m and score[1][ty][tx] not in st:
                    st.add(score[1][ty][tx])
                    ct+=score[0][ty][tx]
            board[r][c]=ct%10

op=[]
for r in board:
    op.append(''.join(map(str,r)))
print('\n'.join(map(str,op)))