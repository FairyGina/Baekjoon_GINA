#include <stdio.h>
int main(){
    int n,m,k,b[101];
    scanf("%d %d",&n,&m);
    for(k=1;k<=n;k++)
        b[k]=k;
    for(k=0;k<m;k++){
        int i,j;
        scanf("%d %d",&i,&j);
        while(1){
            int t=b[i];
            b[i]=b[j];
            b[j]=t;
            i++,j--;
            if(i>=j) break;
        }
    }
    for(k=1;k<=n;k++)
        printf("%d ",b[k]);
    return 0;
}