#include <stdio.h>
int main() {
    float k,res;
    scanf("%f",&k);
    if(k/100<75) printf("100.00");
    else if(k/100>1975) printf("2000.00");
    else printf("%.2f",k/100+25);
    return 0;
}