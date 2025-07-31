import sys
def input(): return sys.stdin.readline().rstrip()
my=(0,-1,-1)
mx=(-1,-1,0)
n,m=map(int,input().split())
miro=[list(map(int,input().split(" "))) for _ in range(n)]
for r in range(n):
    for c in range(m):
        mct=miro[r][c]
        for v in range(3):
            ty=r+my[v]
            tx=c+mx[v]
            if 0<=ty<n and 0<=tx<m:
                tm=miro[ty][tx]+miro[r][c]
                if tm>mct: mct=tm
        miro[r][c]=mct
print(miro[n-1][m-1])