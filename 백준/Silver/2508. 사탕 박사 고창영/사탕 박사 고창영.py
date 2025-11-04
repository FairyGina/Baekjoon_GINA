import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    _=input()
    n,m=map(int,input().split())
    cd=list(input() for _ in range(n))
    res=0
    for i in range(n):
        for j in range(m):
            if cd[i][j]=='o':
                if 0<i<n-1:
                    if cd[i-1][j]=='v' and cd[i+1][j]=='^':
                        res+=1
                        continue
                if 0<j<m-1:
                    if cd[i][j-1]=='>' and cd[i][j+1]=='<': res+=1
    op.append(str(res))
print('\n'.join(op))