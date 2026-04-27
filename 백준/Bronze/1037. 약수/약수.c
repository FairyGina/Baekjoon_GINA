#include <stdio.h>
int main() {
    unsigned int n,m,max=0,min=1000000;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
      scanf("%d",&m);
      if(max<m) max=m;
      if(min>m) min=m;
    }
    printf("%d",max*min);
    return 0;
}