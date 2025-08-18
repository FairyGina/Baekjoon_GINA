import sys

n=int(input())
ct,nb=0,2
while True:
    if nb<4:
        ct+=1
    elif nb%2==0 or nb%3==0:
        nb+=1
        continue
    else:
        i=5
        bl=True
        while i*i<=nb:
            if nb%i==0 or nb%(i+2)==0:
                bl=False
                break
            i+=6
        if bl: ct+=1
        
    if ct==n:
        print(nb)
        break
    nb+=1