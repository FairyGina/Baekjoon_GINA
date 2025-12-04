import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for ti in range(1,int(input())+1):
    ct=0
    act,bct=0,0

    m=int(input())
    while ct!=m:
        nb=list(map(int,input().split()))
        ct+=len(nb)//2
        for i in range(0,len(nb),2):
            a,b=nb[i],nb[i+1]
            if a-b==-1:
                if a==1:
                    act+=6
                else: act+=a+b
            elif b-a==-1:
                if b==1:
                    bct+=6
                else: bct+=a+b
            else:
                if a>b: act+=a
                elif a<b: bct+=b
    
    op.append(f"Game {ti}: Tessa {act} Danny {bct}\n")

print(''.join(op))