import sys
def input(): return sys.stdin.readline().rstrip()

a,b=input().split(" ")
ta,tb=[],[]
na,nb=[-1]*37,[-1]*37
amx,bmx,alen,blen=0,0,0,0
for c in reversed(a):
    if c>'9':
        ta.append(ord(c)-87)
    else: ta.append(int(c))
    if amx<ta[alen]:
        amx=ta[alen]
    alen+=1
for c in reversed(b):
    if c>'9':
        tb.append(ord(c)-87)
    else: tb.append(int(c))
    if bmx<tb[blen]:
        bmx=tb[blen]
    blen+=1

amx+=1
amx=max(amx,2)
bmx+=1
bmx=max(bmx,2)

for mt in range(amx,37):
    num=0
    for pw in range(alen):
        num+=mt**pw*ta[pw]
    if num<2**63: na[mt]=num
    
for mt in range(bmx,37):
    num=0
    for pw in range(blen):
        num+=mt**pw*tb[pw]
    if num<2**63: nb[mt]=num
    
ct=0
for i in range(amx,37):
    if na[i]<0: continue
    for j in range(bmx,37):
        if i!=j and na[i]==nb[j]:
            ct+=1
            a=i
            b=j

if ct==1:
    print(f"{na[a]} {a} {b}")
elif ct==0:
    print("Impossible")
else:
    print("Multiple")