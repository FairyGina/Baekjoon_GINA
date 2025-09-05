import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    s=input()
    left,right=[],[]
    for c in s:
        if c=='<':
            if left: right.append(left.pop())
        elif c=='>':
            if right: left.append(right.pop())
        elif c=='-':
            if left: left.pop()
        else: left.append(c)
    op.append(''.join(left)+''.join(right[::-1]))
print('\n'.join(op))