import sys
def input(): return sys.stdin.readline().rstrip()
l,x=map(int,input().split())
num,ct=0,0
for i in range(x):
    pt=input().split()
    if pt[0]=="enter":
        if num+int(pt[1])>l:
            ct+=1
            continue
        else: num+=int(pt[1])
    else:
        num-=int(pt[1])
print(ct)