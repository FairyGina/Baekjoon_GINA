import sys
def input(): return sys.stdin.readline().rstrip()
card=list(i for i in range(21))
tp=[]
for _ in range(10):
    a,b=map(int,input().split())
    for i in range(a,b+1):
        tp.append(card[i])
    for i in range(a,b+1):
        card[i]=tp.pop()
print(' '.join(map(str,card[1:])))