#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    if(n/10==n%10) printf("1");
    else printf("0");
    return 0;
}