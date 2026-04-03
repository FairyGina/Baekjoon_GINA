import sys
def input(): return sys.stdin.readline().rstrip()

def f1(n):
    if n==0:
        return 1
    elif n==1:
        return 0
    else:
        return 2

arr=[".omln","owln.","..oLn"]
board=[list(input()) for _ in range(5)]

ln=len(board[0])
for i in range(ln):
    mk=[]
    for j in range(5):
        mk.append(board[j][i])
    mk=''.join(mk)
    
    for j in range(3):
        if mk==arr[j]:
            n=f1(j)
            for k in range(5):
                board[k][i]=arr[n][k]

for i in range(5):
    print(''.join(board[i]))