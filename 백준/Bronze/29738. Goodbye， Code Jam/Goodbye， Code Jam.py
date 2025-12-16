import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for i in range(1,int(input())+1):
    ip=int(input())
    
    if ip<26: ans="World Finals"
    elif ip<1001:
        ans="Round 3"
    elif ip<4501:
        ans="Round 2"
    else:
        ans="Round 1"
    op.append(f"Case #{i}: "+ans)

print('\n'.join(op))