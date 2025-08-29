import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    a,b=input().split()
    op.append(f"{a} & {b} ")
    ap1,ap2=[0]*26,[0]*26
    for c in a:
        ap1[ord(c)-97]+=1
    for c in b:
        ap2[ord(c)-97]+=1
    bl=True
    for i in range(26):
        if ap1[i]!=ap2[i]:
            bl=False
            break
    if bl: op.append("are anagrams.\n")
    else: op.append("are NOT anagrams.\n")
print(''.join(op))