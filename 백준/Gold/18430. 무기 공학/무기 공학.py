import sys
def input(): return sys.stdin.readline().rstrip()
mg=[[(0,0),(0,1),(1,0)],[(0,1),(0,0),(1,1)],[(1,1),(1,0),(0,1)],[(1,0),(0,0),(1,1)]]
maxct=0
def dfs(ct,dt):
    global maxct,mg
    if dt==lm:
        if maxct<ct:
            maxct=ct
        return
    y,x=dt//(m-1),dt%(m-1)
    dfs(ct,dt+1)
    for idx,mgvalue in enumerate(mg):
        bl=False
        for my,mx in mgvalue:
            if vt[y+my][x+mx]:
                bl=True
                break
        if bl: continue
        for my,mx in mgvalue:
            vt[y+my][x+mx]=1
        dfs(ct+numboard[y][x][idx],dt+1)
        for my,mx in mgvalue:
            vt[y+my][x+mx]=0
n,m=map(int,input().split())
board=[list(map(int,input().split())) for _ in range(n)]
numboard=[[[0]*4 for _ in range(m-1)] for __ in range(n-1)]
for r in range(n-1):
    for c in range(m-1):
        for idx,move in enumerate(mg):
            for my,mx in mg[idx]:
                numboard[r][c][idx]+=board[r+my][c+mx]
            numboard[r][c][idx]+=board[r+mg[idx][0][0]][c+mg[idx][0][1]]
lm=(n-1)*(m-1)
vt=[[0]*m for _ in range(n)]
dfs(0,0)
print(maxct)