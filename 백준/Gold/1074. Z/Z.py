import sys
def input(): return sys.stdin.readline().rstrip()

n,r,c=map(int,input().split())
ln=2**n
nb=[0]*5
nb[4]=ln*ln

ystart,yend,xstart,xend=0,ln,0,ln
while ln>0:
    nb[2]=(nb[0]+nb[4])//2
    nb[1]=(nb[0]+nb[2])//2
    nb[3]=(nb[2]+nb[4])//2
    
    ylm,xlm=(ystart+yend)//2,(xstart+xend)//2
    for i in range(4):
        y,x=nb[i],nb[i+1]
        
        if y<nb[2] and ystart<=r<ylm:
            if not i%2 and xstart<=c<xlm:
                yend=(ystart+yend)//2
                xend=(xstart+xend)//2
                break
            elif i%2 and xlm<=c<xend:
                yend=(ystart+yend)//2
                xstart=(xstart+xend)//2
                break
        
        if y>=nb[2] and ylm<=r<yend:
            if not i%2 and xstart<=c<xlm:
                ystart=(ystart+yend)//2
                xend=(xstart+xend)//2
                break
            elif i%2 and xlm<=c<xend:
                ystart=(ystart+yend)//2
                xstart=(xstart+xend)//2
                break

    nb[0]=y
    nb[4]=x
    ln//=2
print(nb[0])