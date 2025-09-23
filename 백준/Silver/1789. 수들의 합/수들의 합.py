import sys
def input(): return sys.stdin.readline().rstrip()
def bs(s):
    lf,rt=0,2*s+1
    while lf<=rt:
        m=(lf+rt)//2
        tn=m*(m+1)
        if tn<s: lf=m+1
        elif tn>s: rt=m-1
        else: return m
    return rt
print(bs(2*int(input())))