import sys
def input(): return sys.stdin.readline().rstrip()
n,m=map(int,input().split())
pic=[]
for _ in range(n):
    dom=[]
    ip=input()
    for i in ip:
        dom.append(i+i)
    pic.append(''.join(dom))
bl=True
for i in range(n):
    if input()!=pic[i]:
        bl=False
        break
if bl: print("Eyfa")
else: print("Not Eyfa")