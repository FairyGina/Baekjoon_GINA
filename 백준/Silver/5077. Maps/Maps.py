import sys
def input(): return sys.stdin.readline().rstrip()

def f1(y,x):
    for i in range(fr):
        for j in range(fc):
            if arr[y+i][x+j]!=farr[i][j]: return 0
    
    return 1

op=[]
for _ in range(int(input())):
    fr,fc=map(int,input().split())
    farr=[list(input()) for _ in range(fr)]
    r,c=map(int,input().split())
    arr=[list(input()) for _ in range(r)]
    
    ct=0
    for i in range(r-fr+1):
        for j in range(c-fc+1):
            ct+=f1(i,j)
    op.append(str(ct))

print('\n'.join(op))