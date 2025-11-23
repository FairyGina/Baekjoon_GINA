import sys
def input(): return sys.stdin.readline().rstrip()
num=0
while True:
    try:
        s=input()
        if s=="": break
        num+=1
    except:
        break
print(num)