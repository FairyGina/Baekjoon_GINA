import sys
def input(): return sys.stdin.readline().rstrip()
n=int(input())
dic={}
for i in range(6):
    ip=input().split()
    num=0.56*int(ip[1])+0.24*int(ip[2])+0.14*int(ip[3])+0.06*int(ip[4])+0.3*int(ip[5])
    dic[ip[0]]=num

dic=dict(sorted(dic.items(),key=lambda x:x[1],reverse=True))
avg=0
for key in dic:
    if key=="Taiwan": break
    avg+=1
ct=n//6
if avg<n%6: ct+=1
print(ct)