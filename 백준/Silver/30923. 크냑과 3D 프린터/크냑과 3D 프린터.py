import sys
def input(): return sys.stdin.readline().rstrip()
n=int(input())
nb=list(map(int,input().split()))
ct=2*(n+sum(nb))+nb[0]+nb[n-1]
for i in range(n-1): ct+=abs(nb[i]-nb[i+1])
print(ct)