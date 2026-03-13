import sys
def input(): return sys.stdin.readline().rstrip()

def f1(nb):
    for i in range(5):
        ct1,ct2=0,0
        for j in range(5):
            ct1+=board[nb][i][j]
            ct2+=board[nb][j][i]
        if ct1==0 or ct2==0: return True

    return False

def f2(nb):
    ct=0
    for i in range(5):
        ct+=board[nb][i][i]
    if ct==0: return True

    j=4
    ct=0
    for i in range(5):
        ct+=board[nb][i][j]
        j-=1
    if ct==0: return True
    
    return False

n=int(input())
board=[[[0]*5 for _ in range(5)] for _ in range(n)]

name=[]
for i in range(n):
    name.append(input())
    for j in range(5):
        ip=list(map(int,input().split()))
        for k in range(5):
            board[i][j][k]=ip[k]


bln=int(input())
ball=list(map(int,input().split()))
for b in range(bln):
    for nb in range(n):
        for i in range(5):
            for j in range(5):
                if board[nb][i][j]==ball[b]:
                    board[nb][i][j]=0

op=[]
for nb in range(n):
    if f1(nb): op.append(name[nb])
    elif f2(nb): op.append(name[nb])

print(len(op))
print('\n'.join(op))