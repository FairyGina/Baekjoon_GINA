import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    maxct=0
    nb=list(map(int,input().split()))
    for i in nb:
        maxct=max(maxct,i)
    return maxct

r,c=map(int,input().split())
m1=f1()
m2=f1()

if m1==m2: print("possible")
else: print("impossible")