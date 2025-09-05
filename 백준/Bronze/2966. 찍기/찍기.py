import sys
def input(): return sys.stdin.readline().rstrip()
a1,a2,a3="ABC","BABC","CCAABB"
l1,l2,l3,a,b,c,c1,c2,c3=3,4,6,0,0,0,0,0,0
input()
for d in input():
    if d==a1[a]: c1+=1
    if d==a2[b]: c2+=1
    if d==a3[c]: c3+=1
    a=(a+1)%l1
    b=(b+1)%l2
    c=(c+1)%l3
mx=max(c1,c2,c3)
print(mx)
if mx==c1: print("Adrian")
if mx==c2: print("Bruno")
if mx==c3: print("Goran")