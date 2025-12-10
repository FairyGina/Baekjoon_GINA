import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    global point
    idx=-1
    
    for i in range(4):
        tarr=[]
        for j in range(pct):
            y,x=point[j][0],point[j][1]
            idx+=1
            if vt[y][x]!=' ': return "invalid grille"
            vt[y][x]=ip[idx]
            tarr.append((x,n-y-1))
        tarr.sort()
        point=tarr
    op=[]
    for i in vt:
        op.append(''.join(i))
    return ''.join(op)

n=int(input())
board=[list(input()) for _ in range(n)]
ip=input()

vt=[[' ']*n for _ in range(n)]

point=[]
pct=0
for i in range(n):
    for j in range(n):
        if board[i][j]=='.':
            pct+=1
            point.append((i,j))

if pct!=len(ip)//4: print("invalid grille")
else: print(f1())