import sys
def input(): return sys.stdin.readline().rstrip()
dic=[]
for i in range(int(input())):
    a,b=map(int,input().split())
    dic.append((a,b))
dic=sorted(dic)
ct,p1,p2=0,-1,-1
for k,v in dic:
    if p2<=k:
        p1,p2=k,v
        ct+=1
    elif p2>v:
        p2=v
print(ct)