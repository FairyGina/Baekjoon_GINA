import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for _ in range(int(input())):
    a,b=map(float,input().split(" "))
    op.append(f"The height of the triangle is {2*a/b:.2f} units")
print('\n'.join(op))