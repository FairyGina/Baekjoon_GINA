import sys
sys.setrecursionlimit(10**3+1)
def input(): return sys.stdin.readline().rstrip()
def fc(n,k):
    if k==0: return n
    return fc(n*k,k-1)
n,m=map(int,input().split())
print(fc(n,n-1)%m)