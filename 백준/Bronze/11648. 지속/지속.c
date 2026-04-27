#include <stdio.h>
int t(int n){
    int res=1;
    while(1){
        if(n==0) break;
        res*=n%10;
        n/=10;
    }
    return res;
}
int main(){
    int n,i=0,res=0;
    scanf("%d",&n);
    while(1){
        if(n<10) break;
        n=t(n);
        i++;
    }
    printf("%d",i);
    return 0;
}