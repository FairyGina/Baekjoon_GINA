#include <stdio.h>
int main() {
    int t,a,b,min=1001;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      scanf("%d %d",&a,&b);
      if((b>=a)&&(min>b))
        min=b;
    }
    if(min<1001)
      printf("%d",min);
    else
      printf("-1");
    return 0;
}