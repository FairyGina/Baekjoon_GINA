import sys
def input(): return sys.stdin.readline().rstrip()

mv=[(-1,-2),(-2,-1),(2,1),(1,2),(1,-2),(2,-1),(-2,1),(-1,2)]
set=set()

def f1():
    ans="Valid"
    ip=input()
    set.add(ip)
    sy,sx=int(ip[1])-1,int(ord(ip[0])-65)
    
    y,x=sy,sx
    for _ in range(35):
        ip=input()
        if ip in set: return "Invalid"
        set.add(ip)
        qy,qx=int(ip[1])-1,int(ord(ip[0])-65)
        
        bl=True
        for my,mx in mv:
            ty,tx=y+my,x+mx
            if ty==qy and tx==qx:
                bl=False
                break
        if bl:
            ans="Invalid"
            break
        
        y,x=qy,qx
        
    if ans=="Invalid": return ans
    ly,lx=int(ip[1])-1,int(ord(ip[0])-65)
    
    
    if f2(sy,sx,ly,lx): return "Valid"
    else: return "Invalid"

def f2(sy,sx,ly,lx):
    for my,mx in mv:
        ty,tx=ly+my,lx+mx
        if ty==sy and tx==sx: return True
    return False

print(f1())