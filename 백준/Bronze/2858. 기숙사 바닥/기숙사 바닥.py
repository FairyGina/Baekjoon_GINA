r,b=map(int,input().split())
p=r+b
x=1
while True:
    if p%x==0:
        y=p//x
        if 2*x+2*y-4==r:
            print(max(x,y),min(x,y))
            break
    x+=1