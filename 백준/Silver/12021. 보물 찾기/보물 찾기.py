import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    a,b=map(int,input().split())

    sv1,sv2=a,b

    ct=0
    while True:
        ct+=1
        q1,q2=sv1+sv2,sv1*sv2
        tn1,tn2=q1/2,2*q2/q1
        
        if tn1==sv1 and tn2==sv2:
            break
        else:
            sv1,sv2=tn1,tn2

    print(tn1,tn2)
f1()