import sys
def input(): return sys.stdin.readline().rstrip()
n,w,l=map(int,input().split(" "))
truck=list(map(int,input().split(" ")))
wei=[0]*1000
ct=[0]*1000
id,time,front,back,num,lt=0,1,0,0,0,0
bl=True
while bl:
    time+=1
    if lt<w and id<n and (num+truck[id])<=l:
        back+=1
        wei[back-1]=truck[id]
        num+=truck[id]
        lt+=1
        id+=1
    for i in range(front,back):
        ct[i]+=1
    for i in range(front,back):
        if ct[i]==w:
            num-=truck[front]
            front+=1
            lt-=1
            if id==n and lt<1: bl=False
        else: break
print(time)