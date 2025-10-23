import sys
def input(): return sys.stdin.readline().rstrip()

ln=int(input())
nb=list(map(int,input().split()))

num=nb[0]
for i in range(ln-1):
    if nb[i+1]-nb[i]==1:
        continue
    else: num+=nb[i+1]

print(num)