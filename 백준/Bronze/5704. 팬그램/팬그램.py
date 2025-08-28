import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
while True:
    ip=input()
    if ip=='*': break
    ip=ip.replace(' ','')
    ap=[0]*26
    for c in ip:
        ap[ord(c)-97]=1
    try: idx=ap.index(0)
    except ValueError: idx=-1
    if idx<0: op.append('Y')
    else: op.append('N')
print('\n'.join(op))