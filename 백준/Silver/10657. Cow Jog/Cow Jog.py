import sys
def input(): return sys.stdin.readline().rstrip()

ct,sv=0,10**18+1
nb=[]

for _ in range(int(input())):
    a,b=map(int,input().split())
    nb.append(b)
    
for i in reversed(nb):
    if sv>=i:
        ct+=1
        sv=i
print(ct)