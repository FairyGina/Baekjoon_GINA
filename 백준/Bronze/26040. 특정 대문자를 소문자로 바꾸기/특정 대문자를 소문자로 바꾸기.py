import sys
def input(): return sys.stdin.readline().rstrip()
a=input()
res=list(a)
b=input().split()

for c in b:
    sv=0
    while True:
        idx=a.find(c,sv)
        if idx<0: break
        res[idx]=res[idx].lower()
        sv=idx+1
print(''.join(res))