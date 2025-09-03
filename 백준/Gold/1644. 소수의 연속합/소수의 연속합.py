import sys
def input(): return sys.stdin.readline().rstrip()
lm=4000001+1
n=int(input())
pn=[True]*(n+1)
pn[1]=False
for i in range(2,int(n**0.5)+1):
        for j in range(i*i,n+1,i):
            pn[j]=False
pn=list(i for i,bl in enumerate(pn) if bl)
for i in range(1,len(pn)): pn[i]+=pn[i-1]
ct=0
for i in range(1,int(n**0.5)+1):
    for j in range(len(pn)-i):
        tn=pn[j+i]-pn[j]
        if tn<n: continue
        elif tn==n:
            ct+=1
        break
print(ct)