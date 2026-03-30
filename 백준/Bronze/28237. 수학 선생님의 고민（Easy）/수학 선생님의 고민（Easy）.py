def f1(n):
    b,c=n+1,-(n+2)
    lm1,lm2=int(n**0.5)+1,int(abs(c)**0.5)+1
    
    for q in range(1,lm1):
        if n%q!=0: continue
        e=n//q
        for w in range(1,lm2):
            if c%w!=0: continue
            r=c//w
            if q*r+w*e==b:
                return (q,w,e,r)
            if q*e+w*r==b:
                return (q,r,w,e)
            
            w1,r1=-w,-r
            if q*r1+w1*e==b:
                return (q,w1,e,r1)
            if q*e+w1*r1==b:
                return (q,r1,w1,e)

    return [-1]

arr=f1(int(input()))
print(' '.join(map(str,arr)))