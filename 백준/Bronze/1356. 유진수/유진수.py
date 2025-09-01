n=input()
lt,ans=len(n),"NO"
for c in range(1,lt):
    r1,r2=1,1
    s1,s2=(n[0:c]),n[c:lt]
    for i in s1: r1*=int(i)
    for i in s2: r2*=int(i)
    if r1==r2:
        ans="YES"
        break
print(ans)