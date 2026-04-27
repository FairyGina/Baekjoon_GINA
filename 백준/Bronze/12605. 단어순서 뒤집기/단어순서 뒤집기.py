import sys
def input(): return sys.stdin.readline().rstrip()
op=[]

ti=int(input())
for i in range(ti):
    op.append(f"Case #{i+1}: ")
    lt=list(input().split())
    for j in reversed(lt):
        op.append(f"{j} ")
    op.append('\n')

print(''.join(op))