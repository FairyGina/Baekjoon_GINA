n=1000-int(input())
nb=[500,100,50,10,5]
ct=0
for p in nb:
    ct+=n//p
    n%=p
print(ct+n)