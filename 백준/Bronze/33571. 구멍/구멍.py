import sys
def input(): return sys.stdin.readline().rstrip()

ip=input()

ct=0
for c in ip:
    if c=='A' or c=='a': ct+=1
    elif c=='B':ct+=2
    if c=='b': ct+=1
    elif c=='D' or c=='d': ct+=1
    elif c=='e' or c=='g': ct+=1
    elif c=='O' or c=='o': ct+=1
    elif c=='P' or c=='p': ct+=1
    elif c=='Q' or c=='q': ct+=1
    elif c=='R' or c=='@': ct+=1

print(ct)