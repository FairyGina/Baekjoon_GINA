import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
hei=list(map(int,input().split()))
nb=[0]*n

for i in range(n):
    ht=hei[i]
    ct=0
    for j in range(n):
        if ct==ht:
            for k in range(j,n):
                if nb[k]==0:
                    nb[k]=i+1
                    break
            break
        if nb[j]==0:
            ct+=1

print(' '.join(map(str,nb)))