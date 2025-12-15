import sys
def input(): return sys.stdin.readline().rstrip()

def f1(w1,w2):
    ct=0
    for i in range(5):
        for j in range(7):
            if w1[i][j]!=w2[i][j]: ct+=1
    return ct

n=int(input())
board=[[['']*7 for _ in range(5)] for _1 in range(n)]

minct,a1,a2=sys.maxsize,-1,-1
for idx in range(n):
    for i in range(5):
        board[idx][i]=list(input())
        
for i in range(n):
    for j in range(i+1,n):
        ct=f1(board[i],board[j])
        if ct<minct:
            minct=ct
            a1,a2=i,j

print(a1+1,a2+1)