import sys

n=int(input())
if n<4:
    print(n+1)
    
else:
    ct=2
    nb=4
    while True:
        bl=True
        i=2
        while i*i<=nb:
            if nb%i==0:
                bl=False
                break
            i+=1
        if bl: ct+=1
        if ct==n:
            print(nb)
            break
        nb+=1