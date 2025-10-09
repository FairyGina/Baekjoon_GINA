import sys
def input(): return sys.stdin.readline().rstrip()

op=[]

n=int(input())
start=(n+2)//2
for i in range(n):
    if i%2==0: start+=i
    else: start-=i
    op.append(str(start))

print(' '.join(op))