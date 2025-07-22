import sys

op=[]
x1,x2=map(int,sys.stdin.readline().rstrip().split())
a,b,c,d,e=map(int,sys.stdin.readline().rstrip().split())

res=a/3*x2*x2*x2+(b-d)/2*x2*x2+(c-e)*x2
res-=a/3*x1*x1*x1+(b-d)/2*x1*x1+(c-e)*x1

print(int(res))