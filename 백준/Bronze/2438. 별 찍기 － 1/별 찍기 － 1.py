op=[]
n=int(input())
star=''
for i in range(1,n+1):
    star+='*'
    op.append(star)

print('\n'.join(op))