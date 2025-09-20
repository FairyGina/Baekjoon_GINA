import sys,heapq
def input(): return sys.stdin.readline().rstrip()
n,m,k=map(int,input().split())
pq=[]
for _ in range(n):
    heapq.heappush(pq,-int(input()))

op=[]
sv=0
while pq:
    nb=-heapq.heappop(pq)
    sv=sv//2+nb
    op.append(str(sv))
    
    nb-=m
    if nb>k: heapq.heappush(pq,-nb)
print(len(op))
print('\n'.join(op))