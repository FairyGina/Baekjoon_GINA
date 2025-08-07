import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
sv=n

ip=list(map(int,input().split()))
s=list(_ for _ in range(1,1002))
for i in ip:
    s.remove(i)
mn=132651
for i in s:
    for j in s:
        tj=i*j
        if tj>132651: break
        for k in s:
            tk=tj*k
            if tk>132651: break
            mn=min(mn,abs(n-tk))
            
print(mn)