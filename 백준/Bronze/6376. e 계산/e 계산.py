import sys
import math
def input(): return sys.stdin.readline().rstrip()

print("n e")
print("- -----------")
e=0
for i in range(10):
    e+=1/math.factorial(i)
    if i==0 or i==1 or i==2:
        ans=str(round(e,9)).rstrip('0').rstrip('.')
        print(i,ans)
    else:
        print(i,f"{e:.9f}")