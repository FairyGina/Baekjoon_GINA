import sys
def input(): return sys.stdin.readline().rstrip()

def solve():
    nb=list(map(int,input().split()))

    ans=[]
    lm=nb[2]-nb[1]
    for i in range(3,nb[0]+1):
        if nb[i]-nb[i-1]!=lm:
            return f"The sequence {nb[1:nb[0]+1]} is not an arithmetic sequence.\n"
    
    sv=nb[nb[0]]
    for i in range(5):
        tn=sv+lm
        ans.append(tn)
        sv=tn
    
    return f"The next 5 numbers after {nb[1:nb[0]+1]} are: {ans}\n"

op=[]
for _ in range(int(input())):
    op.append(solve())

print(''.join(op))