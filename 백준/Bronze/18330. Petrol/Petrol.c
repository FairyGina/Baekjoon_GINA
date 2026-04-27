#include <stdio.h>
int main() {
    int n,k;
    scanf("%d %d",&n,&k);
    k+=60;
    if(n<=k) printf("%d",n*1500);
    else printf("%d",k*1500+(n-k)*3000);
    return 0;
}