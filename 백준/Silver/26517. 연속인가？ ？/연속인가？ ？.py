import sys
x=int(input())
a,b,c,d=map(int,input().split())
res=a*x+b
if res==c*x+d:
    print(f"Yes {res}")
else: print("No")