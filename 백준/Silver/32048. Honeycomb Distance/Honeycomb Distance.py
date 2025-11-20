import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    x,y=map(int,input().split())
    if y<0:
        y=-y
        x=-x
    
    if x>0: y+=x
    elif x<-y: y+=x-y
    op.append(abs(y))
print('\n'.join(map(str,op)))