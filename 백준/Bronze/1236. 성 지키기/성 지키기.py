import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
board=list(input() for _ in range(n))
a=0
for r in board: 
    idx=r.find('X')
    if idx<0: a+=1
b=0
for r in zip(*board):
    idx=(''.join(r)).find('X')
    if idx<0: b+=1
print(max(a,b))