import sys
lt=int(input())
ip=input()
str,idx,ct="",lt-1,0
while idx>-1:
    tn=ip[idx]
    if ip[idx]=='0': tn="10"
    if int(tn+str)>641:
        ct+=1
        str=""
    str=ip[idx]+str
    idx-=1
if str!="": ct+=1
print(ct)