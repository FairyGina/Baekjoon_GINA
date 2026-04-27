#include <stdio.h>
int main() {
    int t, n,d;
    scanf("%d",&t);
    for(int i=1;i<=t;i++){
      scanf("%d %d",&n,&d);
      if((n/d==0)&&(n%d==0)) printf("Case %d: 0\n",i);
      else if(n/d==0) printf("Case %d: %d/%d\n",i,n%d,d);
      else if(n%d==0) printf("Case %d: %d\n",i,n/d);
      else printf("Case %d: %d %d/%d\n",i,n/d,n%d,d);
    }
    return 0;
}