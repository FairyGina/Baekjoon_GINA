import sys
def input(): return sys.stdin.readline().rstrip()

def f1():
    for i in range(n+1):
        num=num1[i]+(num2[i+a]-num2[i])
        if num>b: return i-1
        i+=1
    return n

n,b,a=map(int,input().split())
nb=list(map(int,input().split()))
num1,num2=[0]*(n+a+1),[0]*(n+a+1)

nb.sort()

for i in range(n):
    num1[i+a+1]=nb[i]+num1[i+a]
for i in range(n):
    num2[i+a+1]=nb[i]/2+num2[i+a]


print(f1())