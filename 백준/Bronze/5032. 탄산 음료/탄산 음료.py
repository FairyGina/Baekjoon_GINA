import sys
def input(): return sys.stdin.readline().rstrip()

e,f,c=map(int,input().split())
rct=0
e+=f

while True:
    if e//c==0: break
    
    rct+=e//c
    e=e%c+e//c
print(rct)