n=int(input())
sv1,sv2=1,3
if n<2: mk=sv2
else:
    for i in range(n-1):
        mk=2*sv2+sv1
        sv1=sv2
        sv2=mk
print(mk%9901)