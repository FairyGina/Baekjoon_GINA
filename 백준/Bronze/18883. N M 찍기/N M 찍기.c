#include <stdio.h>
int main(){
    int n,m,r=1;
    scanf("%d %d",&n,&m);
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            printf("%d",r);
            r++;
            if(j==m-1) break;
            else printf(" ");
        }
        printf("\n");
    }
    return 0;
}