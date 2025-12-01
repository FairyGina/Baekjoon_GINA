import sys
def input(): return sys.stdin.readline().rstrip()
ip=input()
op=[]

num=[[0]*(26) for _ in range(len(ip)+1)]
for i,c in enumerate(ip,start=1):
    num[i][ord(c)-97]+=1
    for j in range(26):
        num[i][j]+=num[i-1][j]

for _ in range(int(input())):
    a,b,c,d=map(int,input().split())
    num1,num2=[0]*26,[0]*26
    for i in range(26):
        num1[i]=num[b][i]-num[a-1][i]
        num2[i]=num[d][i]-num[c-1][i]
    if num1==num2: op.append('DA')
    else: op.append('NE')

print('\n'.join(op))