#include <stdio.h>
int main() {
    int t, n,max=0;
    int num[2002]={0};
    scanf("%d",&t);
    for(int i=0;i<t;i++){
      scanf("%d",&n);
      n+=1000;
      num[n]=1;
      if(n>max) max=n;
    }
    for(int i=0;i<=max;i++)
      if(num[i]==1) printf("%d ",i-1000);
    return 0;
}