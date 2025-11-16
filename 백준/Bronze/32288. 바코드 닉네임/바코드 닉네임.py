ln=int(input())
op=[]
for c in input():
    if c<'Z': op.append(chr(ord(c)+32))
    else: op.append(chr(ord(c)-32))
    
print(''.join(op))