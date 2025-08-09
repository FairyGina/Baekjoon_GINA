import sys
def input(): return sys.stdin.readline().rstrip()
a=int(input())
if a>3: a-=24
print(-a+int(input()))