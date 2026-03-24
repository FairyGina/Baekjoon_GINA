import sys
def input(): return sys.stdin.readline().rstrip()

n=int(input())
nb=[int(input()) for _ in range(n)]
nb.append(10**9)

ct1,ct2=1,0
ft=False
for i in range(n):
    if ft:
        if nb[i]<nb[i+1]: #최저점
            ct1=ct2/nb[i]
            ct2=0
            ft=not ft
    else:
        if nb[i]>nb[i+1]: #최고점
            ct2+=nb[i]*ct1
            ct1=0
            ft=not ft

print("{:.2f}".format(100*ct1))