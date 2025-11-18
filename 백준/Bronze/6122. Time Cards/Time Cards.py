import sys
def input(): return sys.stdin.readline().rstrip()

n,t=map(int,input().split())
save=[0]*(n+1)
time=[0]*(n+1)

for _ in range(t):
    ip=input().split()
    tt=int(ip[2])*60+int(ip[3])
    me=int(ip[0])
    if ip[1]=="START": save[me]=tt
    else: time[me]+=tt-save[me]

op=[]
for i in range(1,n+1):
    op.append(f"{time[i]//60} {time[i]%60}")

print('\n'.join(map(str,op)))