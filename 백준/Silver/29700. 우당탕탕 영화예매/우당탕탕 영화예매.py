import sys
def input(): return sys.stdin.readline().rstrip()
n,m,k=map(int,input().split())
mv=list(input() for _ in range(n))
ct=0
fd='0'*k
for m in mv:
    idx=0
    fdx=m.find(fd,idx)
    while fdx>-1:
        ct+=1
        idx=fdx+1
        fdx=m.find(fd,idx)
print(ct)