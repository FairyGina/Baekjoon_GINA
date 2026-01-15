import sys
import heapq

def input(): return sys.stdin.readline().rstrip()

def f1():
    for i in range(1441):
        n1=-heapq.heappop(hq)
        if n1==0:
            return i
        if not hq: heapq.heappush(hq,-(n1-1))
        else:
            n2=-heapq.heappop(hq)
            heapq.heappush(hq,-(n1-1))
            if n2!=0: heapq.heappush(hq,-(n2-1))
    return -1
        
hq=[]
n=int(input())
nb=list(map(int,input().split()))

for i in nb:
    heapq.heappush(hq,-i)

print(f1())