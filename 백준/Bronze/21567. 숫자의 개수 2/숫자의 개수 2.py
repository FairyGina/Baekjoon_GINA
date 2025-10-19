import sys
def input(): return sys.stdin.readline().rstrip()

nb=[0]*10
a=int(input())
b=int(input())
c=int(input())

res=str(a*b*c)
for i in res:
    nb[int(i)]+=1

print('\n'.join(map(str,nb)))