import math
a,b=map(int,input().split())
m=math.gcd(a,b)
print(f"{a//m}/{b//m}")