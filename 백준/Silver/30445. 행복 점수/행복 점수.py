import sys
def input(): return sys.stdin.readline().rstrip()
a1,a2="HAPPY","SAD"
ct1,ct2=0,0
for c in input():
    if c in a1: ct1+=1
    if c in a2: ct2+=1
if ct1<1 and ct2<1: print("50.00")
else:
    res=ct1*100000//(ct1+ct2)
    if res%10>4: res+=10
    res//=10
    print(f"{res//100}.{res%100:02d}")