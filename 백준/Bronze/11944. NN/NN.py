n,m=map(int,input().split())
st=str(n)
op=[]
if n*len(st)>m:
    for _ in range(m//len(st)):
        op.append(st)
    for i in range(m%len(st)):
        op.append(st[i%len(st)])
else:
    for _ in range(n):
        op.append(st)
print(''.join(op))