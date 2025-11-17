n=int(input())

op=[]
for _ in range(n-1):
    op.append(1)
    op.append(-1)

op.append(-1)
op.append(1)
print(' '.join(map(str,op)))