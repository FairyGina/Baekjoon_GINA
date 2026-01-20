import sys
def input(): return sys.stdin.readline().rstrip()
def f1(arr):
    mct,ct=0,0
    for i in arr:
        if mct<i:
            ct+=1
            mct=i
    return ct
nb=[]
for i in range(int(input())):
    nb.append(int(input()))
ct=0
print(f1(nb))
print(f1(nb[::-1]))