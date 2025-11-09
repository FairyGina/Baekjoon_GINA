import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
t=int(input())
for tn in range(1,t+1):
    ch1=int(input())-1
    card1=[list(map(int,input().split())) for _ in range(4)]
    ch2=int(input())-1
    card2=[list(map(int,input().split())) for _ in range(4)]
    
    ct,res=0,-1
    for i in range(4):
        for j in range(4):
            if card1[ch1][i]==card2[ch2][j]:
                res=card1[ch1][i]
                ct+=1
    
    if ct<1: op.append(f"Case #{tn}: Volunteer cheated!")
    elif ct<2: op.append(f"Case #{tn}: {res}")
    else: op.append(f"Case #{tn}: Bad magician!")
    
print('\n'.join(op))