import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
my=(1,2,2,1,-1,-2,-2,-1)
mx=(-2,-1,1,2,-2,-1,1,2)
dq=deque()
vt=[[False]*8 for _ in range(8)]

def bfs():
    dt=0
    while dq:
        lt=len(dq)//2
        for _ in range(lt):
            y,x=dq.popleft(),dq.popleft()
            if y==tary and x==tarx:
                return dt
            for i in range(8):
                ty,tx=y+my[i],x+mx[i]
                if 0<=ty<8 and 0<=tx<8 and not vt[ty][tx]:
                    vt[ty][tx]=True
                    dq.append(ty)
                    dq.append(tx)
        dt+=1

op=[]
while True:
    line=input()
    if not line: break
    
    vt[:]=[[False]*8 for _ in range(8)]
    dq.clear()
    xx,yy=line.split()
    dq.append(int(xx[1])-1)
    dq.append(ord(xx[0])-97)
    tary=int(yy[1])-1
    tarx=ord(yy[0])-97
    op.append(f"To get from {xx} to {yy} takes {bfs()} knight moves.")

print('\n'.join(op))