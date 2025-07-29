import sys
def input():return sys.stdin.readline().rstrip()
op=[]
t=int(input())
for i in range(1,t+1):
    r=0
    n=input()
    for c in n:
        r=(r+int(c))%9
    r=(9-r)%9
    if r==0:
        ans=n[0]+str(r)+n[1:]
    else:
        for j in range(len(n)):
            if r<int(n[j]):
                ans=n[:j]+str(r)+n[j:]
                break
        else: ans=n+str(r)
    op.append(f"Case #{i}: {str(ans)}\n")
print(''.join(op))