import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
idx=0
while True:
    a,b=input(),input()
    if a=="END": break
    idx+=1
    op.append(f"Case {idx}: ")
    if sorted(a)==sorted(b): op.append("same\n")
    else: op.append("different\n")
print(''.join(op))