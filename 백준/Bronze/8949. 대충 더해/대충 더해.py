op=[]
a,b=input().split()
a,b=a[::-1],b[::-1]
lt=min(len(a),len(b))
for i in range(lt):
    op.append(str(int(a[i])+int(b[i]))) 
for i in range(lt,len(a)):
    op.append(a[i])
for i in range(lt,len(b)):
    op.append(b[i])
op.reverse()
print(''.join(op))