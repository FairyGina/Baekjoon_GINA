import sys
def input(): return sys.stdin.readline().rstrip()
n=int(input())
nb=[0]*n
for i in range(n):
    nb[i]=int(input())
num=0
for _ in range(int(input())):
    num+=nb[int(input())-1]
print(num)