#include<stdio.h>
int main(){
    int t;
    scanf("%d",&t);
    while(t--){
        int n;
        scanf("%d",&n);
        while(n--){
            unsigned long long a,b;
            scanf("%llu %llu",&a,&b);
            printf("%llu %llu\n",a+b,a*b);
        }
    }
    return 0;
}