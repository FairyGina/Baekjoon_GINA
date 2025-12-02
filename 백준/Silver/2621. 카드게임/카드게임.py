import sys
def input(): return sys.stdin.readline().rstrip()
color,number={},{}

for _ in range(5):
    c,n=input().split()
    if c not in color: color[c]=1
    else:
        ct=color[c]
        color[c]=ct+1
        
    if n not in number: number[n]=1
    else:
        ct=number[n]
        number[n]=ct+1
color=sorted(color.items(),key=lambda x:(-x[1],x[0]))
number=sorted(number.items(),key=lambda x:(-x[1],-int(x[0])))

arr=sorted(number)
nlen=len(number)
clen=len(color)
inb=int(number[0][0])
ans=inb+100 #9

if clen<2: ans=max(ans,inb+600) #4
if nlen==5 and inb==int(number[4][0])+4:
    if clen<2: ans=max(ans,inb+900) #1
    else: ans=max(ans,inb+500) #5
if number[0][1]==4: ans=max(ans,800+inb) #2
elif number[0][1]==3:
    if number[1][1]==2:
        ans=max(ans,inb*10+int(number[1][0])+700) #3
    else: ans=max(ans,inb+400) #6
elif number[0][1]==2:
    if number[1][1]==2:
        ans=max(ans,inb*10+int(number[1][0])+300) #7
    else: ans=max(ans,inb+200) #8
    
print(ans)