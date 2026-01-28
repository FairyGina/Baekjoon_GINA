import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    for i in range(8,-1,-1):
        tct=(ct+a*score[i])//dv
        if tct>sc: return ap[i]
    return "impossible"

score=[450,400,350,300,250,200,150,100,0]
ap=['A+','A0','B+','B0','C+','C0','D+','D0','F']
n,sc=input().split()

i1,i2=map(int,sc.split('.'))
sc=i1*100+i2

ct,dv=0,0
for i in range(int(n)-1):
    a,b=input().split()
    dv+=int(a)
    idx=ap.index(b)
    ct+=score[idx]*int(a)

a=int(input())
dv+=a

print(f1())