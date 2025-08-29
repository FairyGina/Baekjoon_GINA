import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
t=0
while True:
    pizza=list(map(int,input().split()))
    if pizza[0]==0: break
    t+=1
    ans=f"Pizza {t} "
    if 4*pizza[0]**2>=pizza[1]**2+pizza[2]**2: ans+="fits on the table."
    else: ans+="does not fit on the table."
    op.append(ans)
print('\n'.join(op))