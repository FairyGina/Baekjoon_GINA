import sys
def input(): return sys.stdin.readline().rstrip()
ln=int(input())+1
nb=[0]*(ln)
nb[1]=1

ct,mr=2,3
for i in range(2,ln):
    nb[i]=nb[i-1]+mr
    ct+=1
    mr+=ct
ct,score=0,0
for c in input():
    if c=='2':
        ct+=1
    else:
        score+=nb[ct]
        ct=0

score+=nb[ct]
print(score)