#include <stdio.h>
int main() {
    int n,i,f;
    scanf("%d",&n);
    for(int j=0;j<n;j++){
      scanf("%d %d",&i,&f);
      if((i<2)&&(f<3)) printf("Yes\n");
      else if((i<3)&&(f<2)) printf("Yes\n"); 
      else printf("No\n");
    }
    return 0;
}