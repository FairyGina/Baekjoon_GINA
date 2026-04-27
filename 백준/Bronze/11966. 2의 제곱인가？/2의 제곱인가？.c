#include <stdio.h>
int main(){
    unsigned long long n;
    scanf("%llu",&n);
    while(n>1){
        if(n%2==0) n/=2;
        else break;
    }
    if(n==1) printf("1");
    else printf("0");
    return 0;
}