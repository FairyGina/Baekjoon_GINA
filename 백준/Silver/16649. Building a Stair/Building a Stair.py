import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
if n==2:
    print(-1)
    exit(0)

ln=n//2
if n%2!=0: ln+=1

print(ln)
board=[['.']*ln for _ in range(ln)]

for i in range(ln):
    board[i][0]='o'
    board[ln-1][i]='o'

if n%2==0: board[ln-2][1]='o'
for r in board:
    print(''.join(r))