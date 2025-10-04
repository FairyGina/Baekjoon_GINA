import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
nb=[list(map(int,input().split())) for _ in range(n)]

res,rid=-1,-1
for color in range(1,6):
    maxct,ct=0,0
    for i in range(n):
        if nb[i][0]==color:
            ct+=1
        elif nb[i][1]==color:
            ct+=1
        else:
            maxct=max(maxct,ct)
            ct=0
    maxct=max(maxct,ct)
    if res<maxct:
        res=maxct
        rid=color
        
print(res, rid)