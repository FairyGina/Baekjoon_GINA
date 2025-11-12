import sys
def input(): return sys.stdin.readline().rstrip()
idx=1
while True:
    a=input()
    if a[0]=="0": break
    print(f"Case {idx}: Sorting... done!")
    idx+=1