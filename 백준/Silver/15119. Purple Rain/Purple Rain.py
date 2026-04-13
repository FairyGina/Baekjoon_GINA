import sys
def input(): return sys.stdin.readline().rstrip()

ip=input()
ln=len(ip)
ct=[[0]*3 for _ in range(ln+1)]

for i in range(ln):
    tidx=0
    if ip[i]=='R': tidx+=1
    ct[i+1][0]=ct[i][0]
    ct[i+1][1]=ct[i][1]
    ct[i+1][tidx]+=1
    ct[i+1][2]=ct[i+1][0]-ct[i+1][1] # b-r
r1,r2,rid1,rid2=0,0,0,0

for i in range(1,ln+1):
    if ct[i][2]>r2:
        r2=ct[i][2]
        rid2=i
    if ct[i][2]<r1:
        r1=ct[i][2]
        rid1=i
print(min(rid1,rid2)+1,max(rid1,rid2))