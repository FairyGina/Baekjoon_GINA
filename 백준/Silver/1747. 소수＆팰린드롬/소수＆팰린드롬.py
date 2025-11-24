import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    n=int(input())
    for i in range(len(nb)):
        if n<=nb[i]: return nb[i]
    return -1
lm=1003002
pm=[1]*lm
pm[1]=0

for i in range(2,lm):
    for j in range(i*i,lm,i):
        pm[j]=0
nb=[]
for i in range(1,lm):
    if pm[i]:
        s1=str(i)
        ln=(len(s1))//2
        av=(len(s1))%2
        str1,str2=s1[:ln],s1[ln+av:][::-1]
        if str1==str2: nb.append(i)
print(f1())