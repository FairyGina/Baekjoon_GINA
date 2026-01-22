import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for i in range(1,int(input())+1):
    a=input()
    b=input()
    op.append(f"Case {i}: {b}, {a}\n")

print(''.join(op))