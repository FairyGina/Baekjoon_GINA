import sys
def input(): return sys.stdin.readline().rstrip()
ip=input()
c=ip[0]
if c=='F': ans="Foundation"
elif c=='C': ans="Claves"
elif c=='V': ans="Veritas"
elif c=='E': ans="Exploration"
print(ans)