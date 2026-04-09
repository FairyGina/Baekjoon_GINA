import sys
def input(): return sys.stdin.readline().rstrip()

ln=int(input())
nb=list(map(int,input().split()))
nb.append(0)

maxln,ct,ctln=0,0,0
num=0
for i in range(1,ln+1):
    if nb[i-1]<=nb[i]:
        num+=nb[i-1]
        ctln+=1
    else:
        num+=nb[i-1]
        ctln+=1
        if maxln<ctln:
            maxln=ctln
            ct=num
            
        ctln=0
        num=0

print(maxln,ct)