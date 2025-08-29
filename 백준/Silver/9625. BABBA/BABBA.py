k=int(input())
a,b=1,0
for i in range(k):
    ta,tb=b,a+b
    a,b=ta,tb
print(a,b)