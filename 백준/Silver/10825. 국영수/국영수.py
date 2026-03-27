import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
score=[list(input().split()) for _ in range(n)]
for i in range(n):
    for j in range(1,4):
        score[i][j]=int(score[i][j])

score.sort(key=lambda x:(-x[1],x[2],-x[3],x[0]))
op=[]
for k in score:
    op.append(k[0])
print('\n'.join(op))