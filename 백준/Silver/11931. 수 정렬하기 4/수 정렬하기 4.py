import sys
def input(): return sys.stdin.readline().rstrip()

nb=[]
for _ in range(int(input())):
    nb.append(int(input()))

nb.sort(reverse=True)
print('\n'.join(map(str,nb)))