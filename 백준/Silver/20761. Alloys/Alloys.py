import sys
pay=float(input())
m=min(pay,1)
pay=m**2/4
if float(pay)>0.5: pay=0.5
print(format(pay,".6f"))