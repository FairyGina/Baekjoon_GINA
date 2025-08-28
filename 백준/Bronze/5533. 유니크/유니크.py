import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
n=int(input())
game=[]
score=[0]*n
for i in range(n):
    game.append(list(map(int,input().split())))
for gr in zip(*game):
    ct=[-1]*101
    for g in gr:
        if ct[g]<0: ct[g]=g
        else: ct[g]=0
    idx=-1
    for g in gr:
        idx+=1
        score[idx]+=ct[g]
print('\n'.join(map(str,score)))