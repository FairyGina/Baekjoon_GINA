import sys
def input(): return sys.stdin.readline().rstrip()

ct=0
for _ in range(int(input())):
    ip=input()
    if "01" in ip or "OI" in ip: ct+=1
print(ct)