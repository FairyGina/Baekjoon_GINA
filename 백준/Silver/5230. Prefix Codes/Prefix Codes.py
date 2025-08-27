import sys
def input(): return sys.stdin.readline().rstrip()
t=int(input())
def bin(k,str):
    global ip,lt,dic
    if k>=lt: return
    if ip[k]!="*": dic[str]=ip[k]
    bin(2*k+1,str+"0")
    bin(2*k+2,str+"1")
op=[]
for _ in range(t):
    dic={}
    inp=list(input().split())
    n,ip=int(inp[0])+2,inp[1]
    lt=len(ip)
    bin(0,"")
    for i in range(2,n):
        str,ans,idx="","",0
        while idx<len(inp[i]):
            str+=inp[i][idx]
            idx+=1
            if str in dic:
                ans+=dic[str]
                str=""
        op.append(ans)
        op.append(' ')
    op.append('\n')
print(''.join(op))