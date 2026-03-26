n=int(input())

lm=1
while True:
    if lm*(lm+1)//2>n:
        break
    lm+=1

ans=1
for i in range(2,lm):
    if i%2!=0:
        if n%i==0: ans+=1
    else:
        if n%i==i//2: ans+=1

print(ans)