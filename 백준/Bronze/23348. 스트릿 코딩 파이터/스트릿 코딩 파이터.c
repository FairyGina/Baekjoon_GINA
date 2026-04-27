#include <stdio.h>
int main() {
    int l[3],n,a,max=0;
    for(int i=0;i<3;i++)
      scanf("%d",&l[i]);
    scanf("%d",&n);
    for(int i=0;i<n;i++){
      int res=0;
      for(int j=0;j<9;j++){
        scanf("%d",&a);
        res+=a*l[j%3];
      }
      if(max<res)
        max=res;
    }
  printf("%d",max);
    return 0;
}