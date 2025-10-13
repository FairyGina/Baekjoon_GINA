import sys
def input(): return sys.stdin.readline().rstrip()

output=[]
for _ in range(int(input())):
    a,b=map(int,input().split())
    output.append(str(a+b))

print('\n'.join(output))