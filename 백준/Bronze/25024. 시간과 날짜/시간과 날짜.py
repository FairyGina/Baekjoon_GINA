import sys
def input(): return sys.stdin.readline().rstrip()

top=[]
for _ in range(int(input())):
    a,b=map(int,input().split())
    op=[]
    if 0<=a<24 and 0<=b<60: op.append('Yes ')
    else: op.append('No ')
    if 0<a<13:
        if a==1 or a==3 or a==5 or a==7 or a==8 or a==10 or a==12:
            if 0<b<32: op.append('Yes')
            else: op.append('No')
        elif a==2:
            if 0<b<30: op.append('Yes')
            else: op.append('No')
        else:
            if 0<b<31: op.append('Yes')
            else: op.append('No')
    else: op.append('No')
    top.append(''.join(op))

print('\n'.join(top))