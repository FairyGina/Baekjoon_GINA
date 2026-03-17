import sys
def input(): return sys.stdin.readline().rstrip()

ln=int(input())
nb=list(map(int,input().split()))

maxct=nb[0]
ct=nb[0]
for i in range(1,ln):
    maxct=max(maxct,ct)
    if ct<0 or ct+nb[i]<=0:
        maxct=max(maxct,ct)
        ct=nb[i]
    else:
        ct+=nb[i]

maxct=max(maxct,ct)
print(maxct)