import sys
def input(): return sys.stdin.readline().rstrip()

nb=[-1]*101
ct=0
for i in range(int(input())):
    a,b=map(int,input().split())
    if nb[a]>=0 and nb[a]!=b:
        ct+=1
    nb[a]=b
print(ct)