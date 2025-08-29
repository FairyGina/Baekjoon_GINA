nb=[]
idx=0
while len(nb)<1001:
    idx+=1
    for _ in range(idx):
        nb.append(idx)
a,b=map(int,input().split())
a-=1
an,bn=0,0
for i in range(a):
    an+=nb[i]
for i in range(b):
    bn+=nb[i]
print(bn-an)