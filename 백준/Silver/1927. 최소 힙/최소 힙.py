import sys,heapq
def input(): return sys.stdin.readline().rstrip()
op,hq=[],[]
for _ in range(int(input())):
    n=int(input())
    if n>0: heapq.heappush(hq,n)
    elif hq: op.append(str(heapq.heappop(hq)))
    else: op.append('0')

print('\n'.join(op))