import sys
def input(): return sys.stdin.readline().rstrip()

ap=[0]*26
ln=int(input())
ip=input()
for c in ip:
    if 'a'<=c<='z': ap[ord(c)-97]+=1

print(max(ap))