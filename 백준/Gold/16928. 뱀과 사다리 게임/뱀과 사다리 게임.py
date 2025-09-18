import sys
def input(): return sys.stdin.readline().rstrip()
def bfs():
    board=list([0]*10 for _ in range(10))
    n,m=map(int,input().split())
    for _ in range(n):
        a,b=map(lambda x:int(x)-1,input().split())
        board[a//10][a%10]=b
    for _ in range(m):
        a,b=map(lambda x:int(x)-1,input().split())
        board[a//10][a%10]=b
    board[0][0]=-1
    dq,tq=[],[]
    dq.append(0)
    me,ct=0,0
    while dq:
        tq.clear()
        while dq:
            me=dq.pop()
            lm=min(99,me+6)
            if me==99: return ct
            for i in range(lm,lm-6,-1):
                y,x=i//10,i%10
                if board[y][x]<0: continue
                if board[y][x]<1: tq.append(i)
                else: tq.append(board[y][x])
                board[y][x]=-1
        dq=list(tq)
        ct+=1
print(bfs())