#include <stdio.h>
#include<math.h>
int main() {
    float n;
    while(1){
      scanf("%f",&n);
      if(n==0) break;
      else printf("%.2f\n",1+n+pow(n,2)+pow(n,3)+pow(n,4));
    }
    return 0;
}