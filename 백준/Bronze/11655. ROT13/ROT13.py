op=[]
ap1,ap2,nb="ABCDEFGHIJKLMNOPQRSTUVWXYZ","abcdefghijklmnopqrstuvwxyz","0123456789"
ip=input()
for i in ip:
    ti=ord(i)
    if ti==32: c=' '
    elif 47<ti<58: c=nb[(ti-48)%10]
    elif 64<ti<91: c=ap1[(ti-65+13)%26]
    else: c=ap2[(ti-97+13)%26]
    op.append(c)
print(''.join(op))