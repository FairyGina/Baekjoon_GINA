import sys
def input(): return sys.stdin.readline().rstrip()

ip=input()
idx,maxct=0,0
while idx!=len(ip):
    fd=ip.index('1',idx)
    maxct=max(maxct,fd-idx)
    idx=fd+1

print((maxct+1)//2)