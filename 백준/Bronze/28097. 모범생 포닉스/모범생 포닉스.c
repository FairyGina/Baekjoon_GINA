#include <stdio.h>
int main(){
    int t,a,r=0;
    scanf("%d",&t);
    r+=8*(t-1);
    while(t--){
        scanf("%d",&a);
        r+=a;
    }
    printf("%d %d",r/24,r%24);
    return 0;
}