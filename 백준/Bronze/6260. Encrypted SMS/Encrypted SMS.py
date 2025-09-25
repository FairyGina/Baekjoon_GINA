import sys
def input(): return sys.stdin.readline().rstrip()
a1=["ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"]
a2=["abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"]
op=[]
while True:
    ip=input()
    if ip=='#': break
    for i,c in enumerate(ip,start=1):
        if 'A'<=c<='Z':
            for j,a in enumerate(a1):
                if c in a1[j]:
                    lt=len(a1[j])
                    op.append(a1[j][(a1[j].index(c)-i+lt)%lt])
                    break
        else:
            for j,a in enumerate(a2):
                if c in a2[j]:
                    lt=len(a2[j])
                    op.append(a2[j][(a2[j].index(c)-i+lt)%lt])
                    break
    op.append('\n')
print(''.join(op))