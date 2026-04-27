#include<stdio.h>
int main(){
    int ah[1000][1000],n,a,b,i,y=0;
    scanf("%d %d %d",&n,&a,&b);
    for(i=0;i<n;i++) for(int j=0;j<n;j++) scanf("%d",&ah[i][j]);
    int g=ah[a-1][b-1];
    for(i=0;i<n;i++){
        if(y==1) break;
        y=ah[i][b-1]>g?1:0;
    }
    for(i=0;i<n;i++){
        if(y==1) break;
        y=ah[a-1][i]>g?1:0;
    } 
    y!=0?printf("ANGRY"):printf("HAPPY");
    return 0;
}