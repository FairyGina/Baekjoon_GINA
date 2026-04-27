import sys
def input(): return sys.stdin.readline().rstrip()

def f1(start,count):
    for i in range(n1):
        if nb1[i]!=nb2[start]: return False
        start+=count
    return True

n1=int(input())
nb1=list(map(int,input().split()))

n2=int(input())
nb2=list(map(int,input().split()))

count=0
op=[]
while True:
    count+=1
    length=(n1-1)*count+1
    if length>n2: break

    for start in range(n2-length+1):
        if f1(start,count): op.append(count)

if not op: print(-1)
else: print(op[0]-1,op[len(op)-1]-1)