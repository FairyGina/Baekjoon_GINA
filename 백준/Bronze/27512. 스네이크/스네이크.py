a,b=map(int,input().split())
ans=a*b
if a%2!=0 and b%2!=0:ans-=1
print(ans)