import sys
def input(): return sys.stdin.readline().rstrip()
n=int(input())
mt=list(map(int,input().split()))

bot,top,mx=mt[0],0,0
for m in range(1,n):
    if mt[m-1]<mt[m]: top=mt[m]
    else:
        mx=max(mx,top-bot)
        bot=mt[m]
        top=mt[m]
mx=max(mx,top-bot)
print(mx)