#include <stdio.h>
int main(){
    int p[100][100]={0,};
    int i,j,t,res=0;
    scanf("%d",&t);
    while(t--){
        int x,y;
        scanf("%d %d",&x,&y);
        for(i=x;i<x+10;i++)
            for(j=y;j<y+10;j++)
                p[i][j]=1;
    }
    for(i=0;i<100;i++)
        for(j=0;j<100;j++)
            if(p[i][j]==1) res++;    
    printf("%d",res);
    return 0;
}