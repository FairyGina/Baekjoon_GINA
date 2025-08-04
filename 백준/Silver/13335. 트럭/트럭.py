import sys
def input(): return sys.stdin.readline().rstrip()

n,w,l=map(int,input().split(" "))
truck=list(map(int,input().split(" ")))
ct=[0]*n

time,front,back,num,lt=0,0,0,0,0
while front<n:
    time+=1
    if ct[front]==time:
        num-=truck[front]
        front+=1
    if back<n and (num+truck[back])<=l:
        num+=truck[back]
        ct[back]=time+w
        back+=1
    elif front<n:
        time=ct[front]-1
print(time)