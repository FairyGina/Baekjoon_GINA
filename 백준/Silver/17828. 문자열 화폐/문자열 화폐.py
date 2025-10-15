import sys
def input(): return sys.stdin.readline().rstrip()
n,x=map(int,input().split())
money=['A']*n
cost=n-1

for i in range(n):
    if cost>=x-1: break
    tp=min(x-cost,26)-1
    cost=cost+tp
    money[i]=chr(65+tp)

if cost==x-1: print(''.join(money[::-1]))
else: print('!')