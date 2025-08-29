import sys
def input(): return sys.stdin.readline().rstrip()
vote=list([0]*5 for _ in range(3))
vote[0][4]=1
vote[1][4]=2
vote[2][4]=3
n=int(input())
for i in range(n):
    ip=map(int,input().split())
    for idx,e in enumerate(ip):
        vote[idx][0]+=e
        vote[idx][e]+=1
vote.sort(key=lambda x:(-x[0],-x[3],-x[2]))
nb=vote[0][4]
bl=True
for i in range(3):
    if vote[0][i]!=vote[1][i]:
        bl=False
if bl: nb=0
print(nb,vote[0][0])