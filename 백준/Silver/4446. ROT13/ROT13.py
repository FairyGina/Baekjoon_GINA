import sys
def input(): return sys.stdin.readline().rstrip()
ap1,ap2="aiyeou","bkxznhdcwgpvjqtsrlmf"
dic1={'a': 0, 'i': 1, 'y': 2, 'e': 3, 'o': 4, 'u': 5}
dic2={'b': 0, 'k': 1, 'x': 2, 'z': 3, 'n': 4, 'h': 5, 'd': 6, 'c': 7, 'w': 8, 'g': 9, 'p': 10, 'v': 11, 'j': 12, 'q': 13, 't': 14, 's': 15, 'r': 16, 'l': 17, 'm': 18, 'f': 19}
op=""
for ip in sys.stdin:
    ip=ip.rstrip()
    for a in ip:
        if 'a'<=a<='z': bl=False
        elif 'A'<=a<='Z':
            a=chr(ord(a)+32)
            bl=True
        else:
            op+=a
            continue
        if a in dic1:
            a=ap1[(dic1[a]+3)%6]
            if bl: a=chr(ord(a)-32)
        else:
            a=ap2[(dic2[a]+10)%20]
            if bl: a=chr(ord(a)-32)
        op+=a
    op+='\n'
print(op.strip())