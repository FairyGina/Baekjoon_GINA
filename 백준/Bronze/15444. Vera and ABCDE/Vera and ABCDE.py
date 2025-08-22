import sys
def input(): return sys.stdin.readline().rstrip()

a5={'A':["***"
        ,"*.*"
        ,"***"
        ,"*.*"
        ,"*.*"],
    'B':["***"
        ,"*.*"
        ,"***"
        ,"*.*"
        ,"***"],
    'C':["***"
        ,"*.."
        ,"*.."
        ,"*.."
        ,"***"],
    'D':["***"
        ,"*.*"
        ,"*.*"
        ,"*.*"
        ,"***"],
    'E':["***"
        ,"*.."
        ,"***"
        ,"*.."
        ,"***"]}
lt=int(input())
op=["" for _ in range(5)]
for ti in range(lt):
    s=input()
    for i in s:
        idx=-1
        for j in a5[i]:
            idx+=1
            op[idx]+=j
print('\n'.join(op))