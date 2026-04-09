import sys
def input(): return sys.stdin.readline().rstrip()

ln=int(input())
nb=[]
for _ in range(ln): nb.append(int(input()))
nb.sort()
ans=-1
for i in range(ln-2):
    a1,a2,a3=nb[i],nb[i+1],nb[i+2]
    if a1+a2>a3:
        ans=max(ans,a1+a2+a3)

print(ans)