import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
for q in range(2,101):
    qnb=q*q*q
    for i in range(2,q):
        inb=i*i*i
        for j in range(i+1,q):
            jnb=j*j*j
            for k in range(j+1,q):
                knb=k*k*k
                if (inb+jnb+knb)==qnb:
                    op.append(f"Cube = {q}, Triple = ({i},{j},{k})")
                
print('\n'.join(op))