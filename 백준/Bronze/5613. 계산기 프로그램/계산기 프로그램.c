#include <stdio.h>
int main(){
    long long a,res;
    scanf("%lld",&res);
    while(1){
        getchar();
        char c;
        scanf("%c",&c);
        if(c=='=') break;
        scanf("%lld",&a);
        if(c=='+') res+=a;
        else if(c=='-') res-=a;
        else if(c=='*') res*=a;
        else res/=a;
    }
    printf("%lld",res);
    return 0;
}