import sys
def input(): return sys.stdin.readline().rstrip()

nb=list(map(int,input().split()))
num,n=sum(nb[:4]),nb[4]

print(max(0,4*n-num))