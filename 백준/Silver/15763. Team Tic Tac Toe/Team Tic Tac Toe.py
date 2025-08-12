import sys
def input(): return sys.stdin.readline().rstrip()
def p():
    global hs,cow3,cow2
    if len(hs)<2:
        cow3.add(hs.pop())
    elif len(hs)<3:
        c1=hs.pop()
        c2=hs.pop()
        if ord(c1)<ord(c2): cow2.add(c1+c2)
        else: cow2.add(c2+c1)
    else: hs.clear()
        
board=[input() for _ in range(3)]
cow3,cow2=set(),set()

hs=set()
for i in range(3):
    hs.add(board[i][0])
    hs.add(board[i][1])
    hs.add(board[i][2])
    p()
        
for i in range(3):
    hs.add(board[0][i])
    hs.add(board[1][i])
    hs.add(board[2][i])
    p()

hs.add(board[0][0])
hs.add(board[1][1])
hs.add(board[2][2])
p()

hs.add(board[0][2])
hs.add(board[1][1])
hs.add(board[2][0])
p()

print(len(cow3))
print(len(cow2))