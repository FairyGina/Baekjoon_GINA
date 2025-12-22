import sys
def input(): return sys.stdin.readline().rstrip()

ip1=input()
hm={'L':0,'O':0,'V':0,'E':0}

for c in ip1:
    if c in hm:
        hm[c]+=1

name=[]
n=int(input())
for _ in range(n):
    name.append(input())

name.sort()

ans,maxct="",-1
for nm in name:
    thm=hm.copy()
    for c in nm:
        if c in thm:
            thm[c]+=1
    ct=(thm['L']+thm['O'])*(thm['L']+thm['V'])*(thm['L']+thm['E'])*(thm['O']+thm['V'])*(thm['O']+thm['E'])*(thm['V']+thm['E'])
    ct%=100
    if maxct<ct:
        maxct=ct
        ans=nm

print(ans)