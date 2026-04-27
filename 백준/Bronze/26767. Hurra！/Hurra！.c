#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        if((i%7==0)&&(i%11==0)) printf("Wiwat!");
        else if(i%7==0) printf("Hurra!");
        else if(i%11==0) printf("Super!");
        else printf("%d",i);
        printf("\n");
    }
    return 0;
}