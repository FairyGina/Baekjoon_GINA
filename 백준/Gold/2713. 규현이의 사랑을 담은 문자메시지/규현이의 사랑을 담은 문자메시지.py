from collections import deque

import sys
def input(): return sys.stdin.readline()

mv=[(0,1),(1,0),(0,-1),(-1,0)]

def f1(ipn): # 2진수 변환
    mk=[]
    while ipn>1:
        mk.append(ipn%2)
        ipn//=2
    
    mk.append(ipn)

    return ''.join(map(str,mk[::-1])).zfill(5)

def f2(ch): # 변환
    if ch==' ':
        return 0
    else: return ord(ch)-64

def f3(): # 2진수 문자열 총 생성
    mk=[]
    for c in ip:
        mk.append(f1(f2(c)))
    
    return ''.join(mk)

def f4(): # board 채우기
    global y,x,idx
    str1=f3()

    for c in str1:
        f5(c)
    for _ in range(len(str1),n*m):
        f5('0')
    
    op.append(f6())

def f5(c): # 보드 세부 코드
    global y,x,idx
    ty,tx=y+mv[idx][0],x+mv[idx][1]
    
    if 0<=ty<n and 0<=tx<m and board[ty][tx]=="-1":
        board[ty][tx]=c
    else:
        idx=(idx+1)%4
        ty,tx=y+mv[idx][0],x+mv[idx][1]
        board[ty][tx]=c
    y=ty
    x=tx
    
def f6(): # 보드 한줄로 출력
    mk=[]
    for i in board:
        mk.append(''.join(i))
    return ''.join(mk)

t=int(input())
op=[]
for _ in range(t):
    ip=input()
    ct=0
    mkstr=[]
    arr=[]
    for i in range(len(ip)):
        if ip[i]==' ':
            ct+=1
            arr.append(''.join(mkstr))
            mkstr.clear()
        else:
            mkstr.append(ip[i])
        if ct==2:
            if ip[len(ip)-1]=='\n':
                arr.append(ip[i+1:len(ip)-1])
            else: arr.append(ip[i+1:])
            break
            
    n=int(arr[0])
    m=int(arr[1])

    ip=arr[2]

    n=int(n)
    m=int(m)
    board=[["-1"]*m for _ in range(n)]

    idx=0
    y,x=0,-1
    f4()

print('\n'.join(op))