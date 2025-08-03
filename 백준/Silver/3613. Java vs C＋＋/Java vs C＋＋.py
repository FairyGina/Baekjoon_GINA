import sys

def input(): return sys.stdin.readline().rstrip()
def output(s):
    op=[]
    if '_' in s:
        if s[0]=='_' or s[len(s)-1]=='_': return "Error!"
        ap=False
        for i in s:
            if 'A'<=i<='Z': return "Error!"
            elif ap:
                if i=='_': return "Error!"
                op.append(chr(ord(i)-32))
                ap=False
            else:
                if i=='_': ap=True
                else: op.append(i)
    else:
        if 'A'<=s[0][0]<='Z': return "Error!"
        for i in s:
            if 'A'<=i<='Z':
                op.append(f"_{chr(ord(i)+32)}")
            else: op.append(i)
    return ''.join(op)

print(output(input()))