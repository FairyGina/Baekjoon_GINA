n,a,b=map(int,input().split())
ct=0
while True:
    ct+=1
    a,b=(a+1)//2,(b+1)//2
    if a==b: break
print(ct)