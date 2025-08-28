import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for t in range(1,int(input())+1):
    score=list(map(int,input().split()))
    score.remove(score[0])
    score.sort(reverse=True)
    lg=0
    for i in range(len(score)-1):
        lg=max(lg,score[i]-score[i+1])
    op.append(f"Class {t}\nMax {score[0]}, Min {score[len(score)-1]}, Largest gap {lg}\n")
print(''.join(op))