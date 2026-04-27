#include <stdio.h>
int main() {
    int a,t,n;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      int res=0;
      scanf("%d",&n);
      for(int j=0;j<n;j++){
        int max=0;
        for(int i=0;i<3;i++){
          scanf("%d",&a);
          if(a>max)
            max=a;
        }
        if(max>0)
          res+=max;
      }
      printf("%d\n",res);
    }
    return 0;
}