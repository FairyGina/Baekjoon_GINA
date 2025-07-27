import sys
def input(): return sys.stdin.readline().rstrip()
t=int(input())
sv=int(input())
r=0
for _ in range(t):
    ip=int(input())
    if sv<ip:
        tn=ip-sv
    else:
        tn=sv-ip
    r+=min(360-tn,tn)
    sv=ip

print(r)