import sys
def input(): return sys.stdin.readline().rstrip()

op=[]
for ti in range(1,int(input())+1):
    n=int(input())
    name=[]
    for _ in range(n):
        name.append(input())
    
    bl=[0]*n
    for _ in range(int(input())):
        ip=input().split(" ")
        for i,nm in enumerate(name):
            for tip in ip:
                if nm==tip:
                    bl[i]=1
    
    ans=f"Test set {ti}:\n"
    for i in range(n):
        ans+=f"{name[i]} is "
        if bl[i]: ans+="present\n"
        else: ans+="absent\n"
    ans+="\n"
    op.append(ans)

print(''.join(op))