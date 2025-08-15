import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
wt=map(int,input().split())
ag,res=0,0
for i in wt:
    if i<1:
        ag-=1
    else:
        ag+=1
    res+=ag
print(res)