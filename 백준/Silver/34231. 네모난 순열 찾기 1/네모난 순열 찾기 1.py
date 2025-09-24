import sys
def input(): return sys.stdin.readline().rstrip()
def fd():
    st.clear()
    sz=rlt*clt
    for rn in range(r,r+rlt):
        for cn in range(c,c+clt):
            if board[rn][cn] in st or board[rn][cn]>sz: return 0
            st.add(board[rn][cn])
    return 1
n=int(input())
board=list(list(map(int,input().split())) for _ in range(n))
ct=0
st=set()
for rlt in range(1,n+1):
    for clt in range(1,n+1):
        for r in range(n-rlt+1):
            for c in range(n-clt+1):
                ct+=fd()
print(ct)