import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
n,len=map(int,input().split())
while(len<=100):
    a=int((2*n-len*len+len)/(2*len))
    if a<0: break
    op=[]
    num=0
    for i in range(a,a+len):
        num+=i
        op.append(str(i))
    if num==n:
        n=-1
        break
    len+=1
print(' '.join(op)) if n<0 else print(-1)