import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    num=n*m
    if num%k!=0:
        print("impossible")
        return

    v=num//k
    for i in range(1,int(v**0.5)+1):
        if v%i!=0: continue
        
        i2=v//i
        if n%i==0 and m%i2==0: return f2(i,i2)
        if m%i==0 and n%i2==0: return f2(i2,i)
        
    print("impossible")

def f2(r,c):
    ap='A'
    board=[['']*m for _ in range(n)]
    for i in range(0,n,r):
        for j in range(0,m,c):
            for q in range(r):
                for w in range(c):
                    board[i+q][j+w]=ap
            ap=chr(ord(ap)+1)
    
    for i in board:
        print(''.join(i))
        
n,m,k=map(int,input().split())
f1()