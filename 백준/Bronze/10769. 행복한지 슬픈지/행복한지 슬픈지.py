import sys
def input(): return sys.stdin.readline().rstrip()

uct,hct=0,0
ip=input()

idx=0
while True:
    idx=ip.find(":-",idx)
    if idx<0: break
    if ip[idx+2]==')': hct+=1
    elif ip[idx+2]=='(': uct+=1
    idx+=2

if uct+hct<1: print('none')
elif uct>hct: print('sad')
elif uct<hct: print('happy')
else: print('unsure')