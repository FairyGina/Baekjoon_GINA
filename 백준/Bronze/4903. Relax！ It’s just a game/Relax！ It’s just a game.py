import sys
import math
def input(): return sys.stdin.readline().rstrip()
tool=[""]*5
tool[1]="+"
tool[3]="="

op=[]
while True:    
    a,b=map(int,input().split())
    if a<0: break
    r1=math.comb(a+b,a)
    tool[0]=str(a)
    tool[2]=str(b)
    tool[4]=str(a+b)
    if a+b==r1: tool[3]="="
    else: tool[3]="!="
    op.append(''.join(tool))

print('\n'.join(op))