import sys
def input(): return sys.stdin.readline().rstrip()

nb=list(map(int,input().split()))
sv=nb[0]
bl=True
for n in nb[1:]:
    if sv>n:
        bl=False
        break
    sv=n

print("Good" if bl else "Bad")