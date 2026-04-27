#include <stdio.h>
int main() {
    int t;
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
      int a,res=0,min=40000,max=0;
      for(int j=0;j<3;j++){
        scanf("%d",&a);
        if(a<min) min=a;
        if(a>max) max=a;
        res+=a;
      }
      printf("Scenario #%d:\n",i);
      if(max*max==(min*min+(res-max-min)*(res-max-min)))
        printf("yes\n\n");
      else printf("no\n\n");
    }
    return 0;
}