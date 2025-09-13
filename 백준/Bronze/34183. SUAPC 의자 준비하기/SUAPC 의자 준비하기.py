n,m,a,b=map(int,input().split())
nd=n*3
pay=m-nd
if pay<0:
    pay=-pay
    print(pay*a+b)
else: print(0)