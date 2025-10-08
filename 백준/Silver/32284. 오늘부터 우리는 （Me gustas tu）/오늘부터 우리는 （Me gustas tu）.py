import sys
def input(): return sys.stdin.readline().rstrip()

n,m=map(int,input().split())
a,b=map(int,input().split())

board=[['N']*m for _ in range(n)]
for r in range(a):
    for c in range(m):
        board[r][c]='S'

for c in range(b):
    board[a][c]='E'
    
for c in range(b,m):
    board[a][c]='W'

op=[]
for stb in board:
    op.append(''.join(stb))

print('\n'.join(op))