def solution(n, w, num):
    h=n//w
    if n%w!=0:
        h+=1
    box=[[0]*w for _ in range(h)]
    
    nb=0
    for i in range(h-1,-1,-1):
        if i%2!=0:
            for j in range(w):
                nb+=1
                if nb>n: break
                box[i][j]=nb
        else:
            for j in range(w-1,-1,-1):
                nb+=1
                if nb>n: break
                box[i][j]=nb
    
    #print(*box)
    fh,fw=0,0
    for i in range(h):
        for j in range(w):
            if box[i][j]==num:
                fh=i
                fw=j
                break
    
    ct=fh+1
    #print(ct)
    
    if n%w!=0:
        if box[0][fw]==0: ct-=1
    
    #print(ct)
    answer=ct
    return answer