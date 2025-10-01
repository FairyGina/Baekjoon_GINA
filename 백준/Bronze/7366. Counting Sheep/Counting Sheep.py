import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for i in range(1,int(input())+1):
    input()
    ct=0
    sheep=input().split()
    for c in sheep:
        if c=='sheep': ct+=1
    op.append(f"Case {i}: This list contains {ct} sheep.\n\n")

print(''.join(op))