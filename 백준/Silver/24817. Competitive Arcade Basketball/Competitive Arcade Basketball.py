import sys
def input(): return sys.stdin.readline().rstrip()

n,p,m=map(int,input().split())
dic={}
for _ in range(n):
    dic[input()]=0

for _ in range(m):
    name,s=input().split()
    dic[name]+=int(s)

op=[]
for k,v in dic.items():
    if v>=p:
        op.append(f"{k} wins!")

if not op:
    op.append("No winner!")
print('\n'.join(op))