import sys
def input(): return sys.stdin.readline().rstrip()

a,b,c=map(int,input().split())
ct=4*(a-2015)
if b<3: ct+=1
elif b<6: ct+=2
elif b<9: ct+=3
elif b<12: ct+=4
else: ct+=5

print(ct)