nb=[0]*101
nb[1]=1
for i in range(2,10):
    for j in range(1,10):
        nb[i*j]=1
print(nb[int(input())])