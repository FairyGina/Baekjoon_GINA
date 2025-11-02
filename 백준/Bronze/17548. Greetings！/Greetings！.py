p=0
ip=input()
for c in ip:
    if c=='e': p+=1
idx=ip.find('e')
res=ip[:idx]+ip[idx:idx+p]+ip[idx:idx+p]+ip[idx+p:]
print(res)