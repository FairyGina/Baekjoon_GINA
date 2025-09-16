import sys
def input(): return sys.stdin.readline().rstrip()
ip=input()
sv,line,ct=')',0,0
for c in ip:
    if sv=='(':
        if c=='(': line+=1
        else: ct+=line
    elif c==')':
        line=max(0,line-1)
        ct+=1
    sv=c
print(ct)