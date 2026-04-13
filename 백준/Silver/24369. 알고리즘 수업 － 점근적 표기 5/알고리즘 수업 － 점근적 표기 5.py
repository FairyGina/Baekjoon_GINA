import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    a,b,c=map(int,input().split())
    g=int(input())
    n=int(input())

    r1=(a-g)*n*n+b*n+c
    r2=-b*b
    if r1<0: return 0
    if n*2*(a-g)<-b and r2<-c*4*(a-g): return 0
    return 1
    
print(f1())