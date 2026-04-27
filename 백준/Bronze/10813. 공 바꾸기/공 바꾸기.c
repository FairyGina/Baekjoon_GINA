#include <stdio.h>
int main(){
    int k, n, m, s[101];
    for(k=1;k<101;k++)
        s[k]=k;
    scanf("%d %d",&n,&m);
    for(k=0;k<m;k++){
        int i,j;
        scanf("%d %d",&i,&j);
        int t=s[i];
        s[i]=s[j];
        s[j]=t;
    }
    for(k=1;k<=n;k++)
        printf("%d ",s[k]);
    return 0;
}