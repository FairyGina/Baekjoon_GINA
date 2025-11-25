import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
arr=list(map(int,input().split()))
op=[]
for nb in arr:
    a=1
    if nb<250: a=4
    elif nb<275: a=3
    elif nb<300: a=2
    op.append(a)

print(' '.join(map(str,op)))