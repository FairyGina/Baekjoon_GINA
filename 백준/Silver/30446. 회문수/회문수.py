import sys
import math
n=int(input())
lt=len(str(n))
ct=0
for i in range(1,lt):
    ct+=9*(10**((i-1)//2))
hf=(lt+1)//2
sta=10**(hf-1)
end=int(str(n)[:hf])
ct+=end-sta
if lt%2==0: p=int(str(end)+str(end)[::-1])
else: p=int(str(end)+str(end)[-2::-1])
if p<=n:
    ct+=1
print(ct)