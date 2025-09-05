import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    ap1,ap2=[0]*26,[0]*26
    a,b=input().split()
    for c in a:
        ap1[ord(c)-97]+=1
    for c in b:
        ap2[ord(c)-97]+=1
    ans="Possible"
    for ap in range(26):
        if ap1[ap]!=ap2[ap]:
            ans="Impossible"
            break
    op.append(ans)
print('\n'.join(op))