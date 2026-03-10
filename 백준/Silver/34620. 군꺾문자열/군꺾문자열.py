import sys
def input(): return sys.stdin.readline()

def f1():
    a,b=map(int,input().split())
    lm=10**9+1

    arr2=[]
    mul=1
    while mul<lm:
        arr2.append(mul)
        mul*=2

    if b not in arr2:
        return -1
    fdx=arr2.index(b)

    count=[0]*len(arr2)
    while a>0:
        idx=0
        while True:
            if arr2[idx]>a:
                count[idx-1]+=1
                a-=arr2[idx-1]
                break
            idx+=1
    
    op=[]
    for i in range(fdx):
        for j in range(count[i]):
            op.append('G')
        op.append('K')
    return ''.join(op)
print(f1())