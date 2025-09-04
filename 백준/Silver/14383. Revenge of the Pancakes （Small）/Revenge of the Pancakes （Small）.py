import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for i in range(1,int(input())+1):
    s=input()
    s=list(True if i=='+' else False for i in s)
    s.append(True)
    c,idx,ct=s[0],0,0
    for j in range(1,len(s)):
        if c!=s[j]:
            s[idx:j]=[s[j]]*(j-idx)
            c=s[j]
            idx=j
            ct+=1
    op.append(f"Case #{i}: {ct}")
print('\n'.join(op))