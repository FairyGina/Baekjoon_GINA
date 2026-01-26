n=int(input())
ip1=input()
ip2=input()
ct,bl=0,True
for i in range(n):
    if ip1[i]==ip2[i]: bl=True
    else:
        if bl:
            ct+=1
            bl=False
print(ct)