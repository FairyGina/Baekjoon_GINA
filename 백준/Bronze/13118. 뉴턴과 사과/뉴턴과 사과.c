#include <stdio.h>
int main() {
    long long i,a[3],h[4]; 
    for(i=0;i<4;i++)
      scanf("%lld",&h[i]);
    for(i=0;i<3;i++)
      scanf("%lld",&a[i]);
    for(i=0;i<5;i++){
      if(i==4)
        printf("0");
      else if(a[0]==h[i]){
        printf("%lld",i+1);
        break;
      }
    }
    return 0;
}