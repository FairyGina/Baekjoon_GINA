import sys
import math
def input(): return sys.stdin.readline().rstrip()

d,h=map(float,input().split())

r=d/2+5
res=2*math.pi*r*h+math.pi*r*r

print(res)