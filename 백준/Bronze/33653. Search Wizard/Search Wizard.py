import sys
def input(): return sys.stdin.readline().rstrip()
fip=input()
input()
ip=input()
ct=0
idx=ip.find(fip,0)+1
while idx>0:
    ct+=1
    idx=ip.find(fip,idx)+1
print(ct)