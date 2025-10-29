import sys
def input(): return sys.stdin.readline()

maxct=0
for _ in range(int(input())):
    ct=0
    ip=input()
    sv=0
    while True:
        fidx1=ip.find('for',sv)
        fidx2=ip.find('while',sv)
        
        maxx=max(fidx1,fidx2)
        minx=min(fidx1,fidx2)
        
        if minx<0: minx=maxx
        if minx<0: break
        else:
            ct+=1
            sv=minx+1
    maxct=max(maxct,ct)

print(maxct)