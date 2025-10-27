import sys
def input(): return sys.stdin.readline()

gd=[['***','* *','* *','* *','***'],
    ['  *','  *','  *','  *','  *'],
    ['***','  *','***','*  ','***'],
    ['***','  *','***','  *','***'],
    ['* *','* *','***','  *','  *'],
    ['***','*  ','***','  *','***'],
    ['***','*  ','***','* *','***'],
    ['***','  *','  *','  *','  *'],
    ['***','* *','***','* *','***'],
    ['***','* *','***','  *','***']]

bl='BEER!!'
mk,mkr=[],[]
nb=[input() for _ in range(5)]
for start in range(0,len(nb[0]),4):
    mk.clear()
    for r in range(5):
        mk.append(nb[r][start:start+3])
    #print(mk)
    if mk not in gd:
        bl='BOOM!!'
        break
    else:
        mkr.append(gd.index(mk))

if bl=='BEER!!' and int(''.join(map(str,mkr)))%6!=0: bl='BOOM!!'
print(bl)