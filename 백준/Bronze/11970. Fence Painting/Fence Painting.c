#include <stdio.h>
int main() {
    int a[4],max=0,min=100,res;
    for(int i=0;i<4;i++){
      scanf("%d",&a[i]);
      if(a[i]>max)
        max=a[i];
      if(a[i]<min)
        min=a[i];
      }
    res=max-min;
    if(a[1]<a[2]) res=res-a[2]+a[1];
    if(a[0]>a[3]) res=res-a[0]+a[3];
    printf("%d",res);
    return 0;
}