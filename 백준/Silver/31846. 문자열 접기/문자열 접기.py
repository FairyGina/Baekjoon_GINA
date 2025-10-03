import sys
from collections import deque
def input(): return sys.stdin.readline().rstrip()
op=[]

ln=int(input())
ip=input()
for _ in range(int(input())):
    lf,rt=map(int,input().split())
    lf-=1
    str1=ip[lf:rt]
    maxct=0
    ln=len(str1)
    for cut in range(1,ln):
        s1,s2=str1[0:cut],str1[cut:ln][::-1]
        ct=0
        ln1,ln2=len(s1),len(s2)
        while True:
            ln1-=1
            ln2-=1
            if ln1<0 or ln2<0: break
            if s1[ln1]==s2[ln2]: ct+=1
        
        if maxct<ct:
            maxct=ct
            
    op.append(str(maxct))
    
print('\n'.join(op))