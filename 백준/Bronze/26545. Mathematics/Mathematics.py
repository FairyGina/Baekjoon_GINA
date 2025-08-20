import sys
def input(): return sys.stdin.readline().rstrip()
num=0
for i in range(int(input())):
    num+=int(input())
print(num)