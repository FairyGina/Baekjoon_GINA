import sys
op=""
while True:
    t=int(sys.stdin.readline().rstrip())
    if(t==-1): break
    sv=0
    lt=0
    for _ in range(t):
        o,m=map(int,sys.stdin.readline().rstrip().split())
        lt+=o*(m-sv)
        sv=m
    op+=f"{lt} miles\n"
print(op)