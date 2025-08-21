import sys
def input(): return sys.stdin.readline().rstrip()
op=[]
mul=(9,3,7)
for ti in range(1,int(input())+1):
    ip=list(input())
    ip.reverse()
    ma=''.join(ip).find("?")
    id,num,sv=0,0,0
    for i in range(len(ip)):
        if ip[i]=='?':
            sv=mul[id]
        else:
            num+=mul[id]*int(ip[i])
        id=(id+1)%3
    for i in range(10):
        if (sv*i+num)%10==0:
            ip=list(ip)
            ip[ma]=i
            ip.reverse()
            op.append(f"Scenario #{ti}:\n{''.join(map(str,ip))}\n\n")
            break
print(''.join(op))