import sys
def input(): return sys.stdin.readline().rstrip()
op=[]

t=int(input())
for _ in range(t):
    lt=int(input())
    lis=map(int,input().split())
    odd,pair=0,0
    for i in lis:
        if i%2!=0: odd+=1
        else: pair+=1
        
    mn,mx=min(odd,pair),max(odd,pair)
    if mx%2==1 and mx>mn:
        op.append("amsminn")
    else: op.append("heeda0528")

print('\n'.join(op))