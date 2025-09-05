import sys
def input(): return sys.stdin.readline().rstrip()
left,right=list(input()),[]
for _ in range(int(input())):
    n=list(input().split())
    if n[0]=='L' and left: right.append(left.pop())
    elif n[0]=='D' and right: left.append(right.pop())
    elif n[0]=='B' and left: left.pop()
    elif n[0]=='P': left.append(n[1])
print(''.join(left)+''.join(right[::-1]))