import sys

def input(): return sys.stdin.readline().rstrip()
op=[]

ti=int(input())
for _ in range(ti):
    s=list(input().split(" "))
    for tk in s:
        op.append(tk[::-1])
        op.append(" ")
    op.append('\n')

print(''.join(op))