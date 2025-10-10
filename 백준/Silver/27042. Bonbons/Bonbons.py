n=int(input())
res=1
for i in range(1,n+1):
    if i==n: break
    if i==res: res=1
    else: res+=2

print(res)