import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
n,m,cn,cm=map(int,input().split())
board=[input() for _ in range(n)]

for r in range(n):
    make=[]
    for c in range(m):
        for i in range(cm):
            make.append(board[r][c])
    for i in range(cn):
        op.append(make)

for c in op:
    print(''.join(c))