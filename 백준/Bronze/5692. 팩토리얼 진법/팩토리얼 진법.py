import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
while True:
    ip=int(input())
    if ip==0: break
    q=ip//10000
    w=ip//1000%10
    e=ip//100%10
    r=ip//10%10
    g=ip%10
    op.append(str(120*q+24*w+6*e+2*r+g))
print('\n'.join(op))