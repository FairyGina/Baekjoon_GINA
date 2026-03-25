n=int(input())
ans=1
if n==3:
    ans=3
elif n>3:
    ans=8+3*(n-4)
print(ans)