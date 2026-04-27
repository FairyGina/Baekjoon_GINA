#include<stdio.h>
int main(){
    int i,t,g,c,n,a[4]={0};
    scanf("%d",&t);
    while(t--){
        scanf("%d %d %d",&g,&c,&n);
        if(g==1) a[3]++;
        else if((c==1)||(c==2)) a[0]++;
        else if(c==3) a[1]++;
        else a[2]++;
    }
    for(i=0;i<4;i++) printf("%d\n",a[i]);
    return 0;
}