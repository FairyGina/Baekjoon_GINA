import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
def find(ip):
    global l
    lt,rt=0,l-1
    while lt<=rt:
        m=(lt+rt)//2
        if ip==arr[m][0]: return arr[m][1]
        elif ip<arr[m][0]:
            rt=m-1
        else: lt=m+1
    return arr[lt][1]
n,m=map(int,input().split())
arr=[]
ho=set()
for i in range(n):
    name,at=input().split()
    if at not in ho:
        ho.add(at)
        ta=[]
        ta.append(int(at))
        ta.append(name)
        arr.append(ta)
l=len(ho)
arr.sort(key=lambda x:x[0])
for _ in range(m):
    op.append(find(int(input())))
print('\n'.join(op))