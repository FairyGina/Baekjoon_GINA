import sys
ip=sys.stdin.readlines()

op=[]
for line in ip:
    while "BUG" in line:
        line=line.replace("BUG","")
    op.append(line)
print(''.join(op))