import sys
def input(): return sys.stdin.readline().rstrip()

hm1,hm2={},{}

a1,a2,a3,a4="EI","NS","TF","JP"

idx=0
for i in a1:
    for j in a2:
        for k in a3:
            for h in a4:
                mk=[i,j,k,h]
                mks=''.join(mk)
                hm1[mks]=idx
                hm2[idx]=mks
                idx+=1
        
score=[[0]*16 for _ in range(16)]
for i in range(16):
    for j in range(16):
        a1,a2=hm2[i],hm2[j]
        
        tsc=0
        for k in range(4):
            if a1[k]!=a2[k]: tsc+=1
        
        score[i][j]=tsc

op=[]
for _ in range(int(input())):
    hm3={}
    ln=int(input())
    arr=input().split()
    for a in arr:
        if a in hm3: hm3[a]+=1
        else: hm3[a]=1
    
    mkarr=[]
    for k,v in hm3.items():
        for j in range(min(3,v)):
            mkarr.append(hm1[k])
    
    mkarr.sort()
    mklen=len(mkarr)
    
    minct=16
    for i in range(mklen):
        for j in range(i+1,mklen):
            for k in range(j+1,mklen):
                ct=score[mkarr[i]][mkarr[j]]+score[mkarr[j]][mkarr[k]]+score[mkarr[i]][mkarr[k]]
                minct=min(minct,ct)
        
    op.append(str(minct))
print('\n'.join(op))