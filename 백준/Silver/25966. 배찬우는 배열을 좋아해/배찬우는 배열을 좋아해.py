import sys
def input(): return sys.stdin.readline().rstrip()

n,m,q=map(int,input().split())
id_nb=[i for i in range(n)]
board=[input().split() for _ in range(n)]

for _ in range(q):
    order=list(map(int,input().split()))
    if order[0]==0:
        board[id_nb[order[1]]][order[2]]=str(order[3])
    else:
        tp=id_nb[order[1]]
        id_nb[order[1]]=id_nb[order[2]]
        id_nb[order[2]]=tp

op=[]
for idx in id_nb:
    op.append(' '.join(board[idx]))

print('\n'.join(op))