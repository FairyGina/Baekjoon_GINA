import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
num=0
for i in list(map(int,input().split())): num+=i
for i in list(map(int,input().split())): num+=i
print(num)