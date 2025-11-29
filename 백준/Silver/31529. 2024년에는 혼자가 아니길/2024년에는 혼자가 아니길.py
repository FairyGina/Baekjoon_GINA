x,y=map(int,input().split())
if not(y>=x and 2*x>=y): print(-1)
else: print(1012*x-506*y)