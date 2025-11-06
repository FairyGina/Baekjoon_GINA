import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
ip=input()
k=int(input())

if ip=='annyong':
    if k%2==0:
        if k+1<=n: print(k+1)
        else: print(k-1)
    else: print(k)
else:
    if k%2!=0:
        if k+1<=n: print(k+1)
        else: print(k-1)
    else: print(k)