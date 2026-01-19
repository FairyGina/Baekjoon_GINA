import sys
def input(): return sys.stdin.readline().rstrip()

def f1(ip,arr):
    for i in ip:
        arr[ord(i)-48]+=1

def f2(arr1,arr2,ip,a1,a2):
    for i in range(len(ip)-1):
        id1,id2=ord(ip[i])-48,ord(ip[i+1])-48
        
        tn1=id1+a1
        tn2=id2+a2
        
        if not (0<=tn1<=9 and 0<=tn2<=9): continue
        if i==0 and tn1==0: continue
        
        arr1[id1]-=1
        arr1[id2]-=1
        arr1[tn1]+=1
        arr1[tn2]+=1
        
        if f3(arr1,arr2): return True
        
        arr1[id1]+=1
        arr1[id2]+=1
        arr1[tn1]-=1
        arr1[tn2]-=1
        
    return False

def f3(arr1,arr2):
    for i in range(10):
        if (arr1[i]==0 and arr2[i]>0) or (arr2[i]==0 and arr1[i]>0):
            return False
    return True

def f4():
    bl=False
    if f2(nb1,nb2,iparr[0],-1,1): bl=True
    elif f2(nb1,nb2,iparr[0],1,-1): bl=True
    elif f2(nb2,nb1,iparr[1],-1,1): bl=True
    elif f2(nb2,nb1,iparr[1],1,-1): bl=True
    
    return "almost friends" if bl else "nothing"

for _ in range(3):
    iparr=input().split()
    nb1,nb2=[0]*10,[0]*10
    
    f1(iparr[0],nb1)
    f1(iparr[1],nb2)
    
    if f3(nb1,nb2): print("friends")
    else: print(f4())