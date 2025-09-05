import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    s=input()
    left,right=[],[]
    for c in s:
        if c=='<' and left:
            right.append(left.pop())
        elif c=='>' and right:
            left.append(right.pop())
        elif c=='-'and left:
            left.pop()
        elif 'a'<=c<='z' or 'A'<=c<='Z' or '0'<=c<='9': left.append(c)
    op.append(''.join(left)+''.join(right[::-1]))
print('\n'.join(op))