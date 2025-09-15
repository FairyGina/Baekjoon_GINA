import sys
def input(): return sys.stdin.readline().rstrip()
n,a,b,m=map(int,input().split())
room=list(i for i in range(n))
nb=list(i for i in range(n))

m-=1
a-=1

ct1,ct2,sq=0,0,0
if a<=b:
    ct1+=1
    sq+=1

for i in range(m):
    score=list(map(int,input().split()))
    ips=list(map(int,input().split()))
    for idx,sc in enumerate(ips):
        score[idx]-=sc
    
    for i in range(n-1):
        bl=False
        r1,r2=score[room[i]],score[room[i+1]] # r1: 좋은 방 r2: 나쁜 방
        if r1<0: # 좋은 방에 있던 사람이 음수면
            if r2<0:
                if r2-r1>3: bl=True # 나쁜 방에 있던 사람도 음수면
            else: bl=True # 나쁜 방이 양수면
        else: # 좋은 방에 있던 사람이 양수면
            if r2>=0 and r2-r1>1: bl=True # 나쁜 방에 있던 사람이 양수면 
            # 나쁜 방에 있던 사람이 음수면 안 바꿔야함
        if bl:
            nb[room[i]]=i+1
            nb[room[i+1]]=i
            
            tn=room[i+1]
            room[i+1]=room[i]
            room[i]=tn
            
            score[room[i+1]]+=2
            score[room[i]]-=2
    if abs(nb[0]-nb[a])<=b:
        ct1+=1
        sq+=1
    else:
        ct2=max(ct2,sq)
        sq=0

ct2=max(ct2,sq)
print(ct1,ct2)