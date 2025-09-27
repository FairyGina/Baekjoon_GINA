import sys
def input(): return sys.stdin.readline().rstrip()

def solve():
    ip=input()
    ln=len(ip)
    for r in range(ln-1):
        for c in range(r+1,ln):
            lf,rt=r,c
            ct=0
            bl=True
            while lf<rt:
                if ip[lf]!=ip[rt]:
                    bl=False
                    break
                else: ct+=1
                lf+=1
                rt-=1
            if bl and (c-r)%2!=0:
                return "Or not."
    return "Odd."

print(solve())