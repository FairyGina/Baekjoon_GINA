#include <stdio.h>
int main(){
    unsigned long long n,a,res=0;
    scanf("%llu",&n);
    for(int i=0;i<n*n;i++){
        scanf("%llu",&a);
        res+=a;
    }
    printf("%llu",res);
    return 0;
}