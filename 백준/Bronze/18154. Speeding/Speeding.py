import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
sa,sb=map(int,input().split())
maxct=-1
for i in range(n-1):
    a,b=map(int,input().split())
    sa,sb=a-sa,b-sb
    maxct=max(sb//sa,maxct)
    sa,sb=a,b
print(maxct)