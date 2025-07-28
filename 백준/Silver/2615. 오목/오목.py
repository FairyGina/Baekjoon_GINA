import sys
my=(0,1,1,-1)
mx=(1,0,1,1)

def om(nb):
    for row in range(21):
        for col in range(21):
            for m in range(4):
                ct=0
                if board[row][col]==nb: continue
                for i in range(1,6):
                    r=row+i*my[m]
                    c=col+i*mx[m]
                    if 0<=r<21 and 0<=c<21 and board[r][c]==nb:
                        ct+=1
                    else: break
                r=row+6*my[m]
                c=col+6*mx[m]
                if ct==5:
                    if 0<=r<21 and 0<=c<21:
                        if board[r][c]!=nb: return row+my[m],col+mx[m]
                    else: return row+my[m],col+mx[m]
    return -1,-1
                    
board=[[-1]+list(map(int,input().split(" ")))+[-1] for _ in range(19)]
board=[[-1]*21]+board+[[-1]*21]

a,b=om(1)
if a!=-1:
    print(f"1\n{a} {b}")
else:
    a,b=om(2)
    if a!=-1:
        print(f"2\n{a} {b}")
    else: print(0)