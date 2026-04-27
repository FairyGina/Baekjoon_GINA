#include <stdio.h>
int main() {
    int t,r[3];
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
      int max=0,res=0;
      for(int j=0;j<3;j++){
        scanf("%d",&r[j]);
        if(max<r[j]) max=r[j];
        res+=r[j]*r[j];
        }
      printf("Case #%d: ",i);
      if(2*max*max==res) printf("YES\n");
      else printf("NO\n");
    }
    return 0;
}