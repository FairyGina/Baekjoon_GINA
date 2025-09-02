import sys
def input(): return sys.stdin.readline().rstrip()
def bin(a,b,c):
    if b==0:
        return 1
    elif b==1:
        return a%c
    m=bin(a,b//2,c)
    if b%2==0: return m*m%c
    else: return m*m*a%c
q,w,e=map(int,input().split())
print(bin(q,w,e))