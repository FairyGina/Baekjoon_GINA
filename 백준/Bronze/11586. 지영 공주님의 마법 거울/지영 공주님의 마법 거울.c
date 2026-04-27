#include <stdio.h>
int main(){
    int n,a,i,j;
    char m[101][101];
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%s",m[i]);
    }
    scanf("%d",&a);
    if(a==1)
        for(i=0;i<n;i++)
            printf("%s\n",m[i]);
    else if(a==2)
        for(i=0;i<n;i++){
            for(j=n-1;j>-1;j--)
                printf("%c",m[i][j]);
            printf("\n");
        }
    else
        for(i=n-1;i>=0;i--)
            printf("%s\n",m[i]);
    return 0;
}