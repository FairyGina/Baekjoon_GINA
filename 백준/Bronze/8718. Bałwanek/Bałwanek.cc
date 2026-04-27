#include <stdio.h>
int main() {
    int x,k;
    scanf("%d %d",&x,&k);
    if(x>=7*k) printf("%d",7000*k);
    else if(2*x>=7*k) printf("%d",3500*k);
    else if(4*x>=7*k) printf("%d",1750*k);
    else printf("0");
    return 0;
}