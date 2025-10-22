import sys
def input(): return sys.stdin.readline().rstrip()

n,k,l=map(int,input().split())
num=0
op=[]
for _ in range(n):
    nb=list(map(int,input().split()))
    bl=True
    for i in nb:
        if i<l:
            bl=False
            break
    if bl and sum(nb)>=k:
        num+=1
        op.append(' '.join(map(str,nb)))

print(num)
print(' '.join(map(str,op)))