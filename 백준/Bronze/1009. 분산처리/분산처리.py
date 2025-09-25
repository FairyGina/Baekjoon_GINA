import sys
def input(): return sys.stdin.readline().rstrip()
nb=[[10], [1], [2, 4, 8, 6], [3, 9, 7, 1], [4, 6], [5], [6], [7, 9, 3, 1], [8, 4, 2, 6], [9, 1]]
op=[]
for _ in range(int(input())):
    a,b=map(int,input().split())
    a%=10
    op.append(str(nb[a][(b-1)%len(nb[a])]))
print('\n'.join(op))