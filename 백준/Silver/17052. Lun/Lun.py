import sys
def input(): return sys.stdin.readline().rstrip()

arr=[5,6,7,8,9]

ln=int(input())
ip=input()

bl=0
if ln%2!=0: bl=1

num=0
idx=-1
for i in range(ln):
    n=ip[i]
    if n=='x':
        idx=i%2
        continue
    
    tn=int(n)
    if i%2==bl: tn+=int(n)
    if tn>9:
        tn=tn//10+tn%10
    num+=tn
num=num*9%10
if idx==bl:
    if num%2!=0:
        num=arr[num//2]
    else: num//=2
print(num)