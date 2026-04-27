#include <stdio.h>
int main() {
    int a,b,r=1;
    scanf("%d %d",&a,&b);
    for(int i=2;i<10001;i++){
        if((a%i==0)&&(b%i==0)){
            r*=i,a/=i,b/=i;
            i=1;
        } 
        else if((i>a)||(i>b)) break;
    }
    printf("%d\n%d",r,r*a*b);
    return 0;
}