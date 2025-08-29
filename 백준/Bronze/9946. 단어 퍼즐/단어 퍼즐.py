import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
idx=0
while True:
    a,b=input(),input()
    if a=="END": break
    idx+=1
    op.append(f"Case {idx}: ")
    ap=[0]*26
    bl=True
    for i in range(97,123):
        if a.count(chr(i))!=b.count(chr(i)):
            bl=False
            break
    if bl: op.append("same\n")
    else: op.append("different\n")
print(''.join(op))