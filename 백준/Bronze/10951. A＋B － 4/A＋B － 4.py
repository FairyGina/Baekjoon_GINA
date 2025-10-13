import sys
def input(): return sys.stdin.readline().rstrip()

output=[]
while True:
    ip=input().split()
    if not ip: break
    a,b=map(int,ip)
    output.append(str(a+b))

print('\n'.join(output))