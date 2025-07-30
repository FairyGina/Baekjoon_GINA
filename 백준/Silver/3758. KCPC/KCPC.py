import sys
def input(): return sys.stdin.readline().rstrip()
op=[]

for ti in range(int(input())):
    n,k,t,m=map(int,input().split())
    t-=1
    team=[[0]*4 for _ in range(n)]
    tsc=[[0]*k for _ in range(n)]
    for i in range(n):
        team[i][3]=i
    for mi in range(m):
        i,j,s=map(int,input().split())
        i-=1
        j-=1
        if s>tsc[i][j]:
            tsc[i][j]=s
            
        team[i][1]+=1
        team[i][2]=mi
        
    for i in range(n):
        for j in tsc[i]:
            team[i][0]+=j
    team.sort(key=lambda x:(-x[0],x[1],x[2]))
    for i in range(n):
        if t==team[i][3]:
            op.append(str(i+1))
    
print('\n'.join(op))