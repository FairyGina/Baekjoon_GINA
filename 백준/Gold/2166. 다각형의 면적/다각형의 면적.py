import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
xarr,yarr=[],[]
for _ in range(n):
    x,y=map(int,input().split())
    xarr.append(x)
    yarr.append(y)

xarr.append(xarr[0])
yarr.append(yarr[0])

num=0
for i in range(n):
    num+=xarr[i]*yarr[i+1]-yarr[i]*xarr[i+1]
    
print(abs(num)*0.5)