import sys
def input(): return sys.stdin.readline().rstrip()
lm=[0,9,189,2889,38889,488889,5888889,68888889,788888889,8888888889,98888888889]
n=input()
lt=len(n)
ct=lm[lt-1]
n=int(n)
z=10**(lt-1)
ct+=lt*((n//z-1)*z+n%z+1)
print(ct)