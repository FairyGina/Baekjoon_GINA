import sys
def input(): return sys.stdin.readline().rstrip()
def find(n):
    if n==1: return 1
    lf,rt=0,lm
    while lf<=rt:
        m=(lf+rt)//2
        r=1+m*(m-1)*3
        if r==n: return m
        elif r>n: rt=m-1
        else: lf=m+1
    return lf
honey,bee,ct,lm=0,1,0,9*int(1e18)
print(find(int(input())))