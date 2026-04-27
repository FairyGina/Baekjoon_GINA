#include <stdio.h>
int main() {
    int t,n;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      int res=0;
      scanf("%d",&n);
      for(int j=1;j<=n;j++)
        if(j%2!=0)
          res+=j;
      printf("%d\n",res);
      }
    return 0;
}