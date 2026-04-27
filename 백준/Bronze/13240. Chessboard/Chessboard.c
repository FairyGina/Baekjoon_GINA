#include <stdio.h>
int main(){
    int n,m,i,j;
    char s='*';
    scanf("%d %d",&n,&m);
    for(i=0;i<n;i++){
        char c=s;
        for(j=0;j<m;j++){
            printf("%c",c);
            c=c!='*'?'*':'.';
        }
        printf("\n");
        s=s!='*'?'*':'.';
    }
    return 0;
}