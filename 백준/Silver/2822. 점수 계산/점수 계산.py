import sys
def input(): return sys.stdin.readline().rstrip()

score=[[0]*2 for _ in range(8)]
num=0
op=[]
for i in range(8):
    score[i][1]=i+1
    score[i][0]=int(input())
    
score.sort(reverse=True)
for i in range(5):
    num+=score[i][0]
    op.append(str(score[i][1]))

op.sort()
print(num)
print(' '.join(op))