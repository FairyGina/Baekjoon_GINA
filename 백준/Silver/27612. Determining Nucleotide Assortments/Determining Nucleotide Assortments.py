import sys
def input(): return sys.stdin.readline().rstrip()

ap="ATGC"
dic={}
for i in range(4):
    dic[ap[i]]=i

op=[]

str=input()
ln=len(str)


num=[[0]*4 for _ in range(ln+1)]
for i in range(ln):
    for j in range(4):
        num[i+1][j]=num[i][j]
    num[i+1][dic[str[i]]]+=1

for _ in range(int(input())):
    dic={}
    a,b=map(int,input().split())
    for i in range(4):
        dic[ap[i]]=num[b][i]-num[a-1][i]
    
    dic=sorted(dic.items(),key=lambda x:(-x[1],x[0] != 'A',-ord(x[0])))
    arr=[]
    for i in range(4):
        arr.append(dic[i][0])
    op.append(''.join(arr))

print('\n'.join(op))