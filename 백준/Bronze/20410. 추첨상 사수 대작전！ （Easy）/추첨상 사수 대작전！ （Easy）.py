def f1():
    for i in range(0,100):
        for j in range(0,100):
            tn=(seed*i+j)%m
            if tn==x1:
                tn2=(tn*i+j)%m
                if tn2==x2:
                    print(i,j)
                    return
m,seed,x1,x2=map(int,input().split())
f1()