op=[]
for ti in range(1,int(input())+1):
    ln=int(input())
    ip1=input()
    ip2=input()
    ct=0
    for i in range(ln):
        if ip1[i]!=ip2[i]: ct+=1
    op.append(f"Case {ti}: {ct}\n")

print(''.join(op))