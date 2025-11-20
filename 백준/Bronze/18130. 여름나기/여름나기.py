import sys
def input(): return sys.stdin.readline().rstrip()
minid,minval=0,sys.maxsize
n,q=map(int,input().split())
for ni in range(1,n+1):
    p,k,c=map(int,input().split())
    
    tn=q//k-1
    if q%k!=0: tn+=1
    p+=tn*(tn+1)//2*c
    if minval>p:
        minval=p
        minid=ni

print(minid, minval)